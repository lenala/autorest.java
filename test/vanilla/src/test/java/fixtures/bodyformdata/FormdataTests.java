package fixtures.bodyformdata;

import com.microsoft.rest.v2.http.HttpPipeline;
import com.microsoft.rest.v2.policy.PortPolicy;
import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

import fixtures.bodyformdata.implementation.AutoRestSwaggerBATFormDataServiceImpl;
import rx.exceptions.Exceptions;
import rx.functions.Func1;

public class FormdataTests {
    private static AutoRestSwaggerBATFormDataService client;

    @BeforeClass
    public static void setup() {
        client = new AutoRestSwaggerBATFormDataServiceImpl(HttpPipeline.build(new PortPolicy.Factory(3000)));
    }

    @Ignore("Multipart form data not currently supported")
    @Test
    public void uploadFileMultipart() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        InputStream stream = classLoader.getResourceAsStream("upload.txt");
        byte[] bytes = IOUtils.toByteArray(stream);
        stream.close();
        InputStream result = client.formdatas().uploadFile(bytes, "sample.png");
        try {
            Assert.assertEquals(new String(bytes), IOUtils.toString(result));
        } finally {
            result.close();
        }
    }

    @Test
    public void uploadFileViaBody() throws Exception {
        // FIXME: generate FileRegion overload and pass the resource that way
        ClassLoader classLoader = getClass().getClassLoader();
        try (InputStream stream = classLoader.getResourceAsStream("upload.txt")) {
            byte[] bytes = IOUtils.toByteArray(stream);
            stream.close();
            byte[] actual = client.formdatas().uploadFileViaBodyAsync(bytes)
                    .map(new Func1<InputStream, byte[]>() {
                        @Override
                        public byte[] call(InputStream inputStreamServiceResponse) {
                            try {
                                return IOUtils.toByteArray(inputStreamServiceResponse);
                            } catch (IOException e) {
                                throw Exceptions.propagate(e);
                            }
                        }
                    }).toBlocking().value();
            Assert.assertEquals(new String(bytes), IOUtils.toString(actual));
        }
    }
}

package bsu.collocvium;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.when;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RestAssuredTest {

    @LocalServerPort
    private int port;

    @Test
    void testConcatenate() {
        String response = get("http://localhost:" + port + "/concatenate?s1=bla&s2=alb").thenReturn()
                .getBody().print();
        assert response.equals("blaalb");
    }

    @Test
    void testCopyString() {
        String response = get("http://localhost:" + port + "/copyString?s=bla&n=3").thenReturn()
                .getBody().print();
        assert response.equals("blablabla");
    }
}
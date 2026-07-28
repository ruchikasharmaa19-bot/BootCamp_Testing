package RestAssuredBDD;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CompletePutPostTest {
    private static final String BASE_URL = "https://jsonplaceholder.typicode.com";
    private JSONObject testUser;
    private int createdUserId;

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = BASE_URL;
        // Common test data
        testUser = new JSONObject();
        testUser.put("name", "Test User");
        testUser.put("email", "manishyadav92124@gmail.com");
        testUser.put("username", "manish");
    }
    @Test(priority = 1)
    public void testPostRequestComplete() {

        System.out.println("\n========== POST REQUEST - TRADITIONAL ==========");

        JSONObject user = new JSONObject(testUser.toString());
        user.put("id", 1);

        Response response =
                RestAssured
                        .given()
                        .header("Content-Type", "application/json")
                        .body(user.toString())
                        .post("/users");

        response.prettyPrint();
        response.then().statusCode(201);

        Assert.assertEquals(response.getStatusCode(), 201);

        JSONObject responseJson =
                new JSONObject(response.getBody().asString());

        if (responseJson.has("id")) {
            createdUserId = responseJson.getInt("id");
            System.out.println("Created User ID : " + createdUserId);
        }
    }
}
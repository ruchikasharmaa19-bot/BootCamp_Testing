package RestAssuredBDD;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PostRequest {

    private static final String BASE_URL = "https://jsonplaceholder.typicode.com";

    private JSONObject testUser;
    private int createdUserId;

    @BeforeClass
    public void setup() {

        RestAssured.baseURI = BASE_URL;

        testUser = new JSONObject();
        testUser.put("name", "Test User");
        testUser.put("email", "ruchikasharmaa19@gmail.com");
        testUser.put("username", "Ruchika");
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
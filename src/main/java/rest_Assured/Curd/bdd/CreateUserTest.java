package rest_Assured.Curd.bdd;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;

public class CreateUserTest 
{
@Test

public void CreateUserBdd()
{
	//JSONObject obj=new JSONObject();
	//obj.put("name", "morpheus");
	//obj.put("job", "leader");
	File obj=new File(".\\src\\test\\resources\\data.json");
	given()
		.body(obj)
		.contentType(ContentType.JSON)
	.when()
		.post("https://reqres.in/api/users")
	.then()
	.log().all();
}
}

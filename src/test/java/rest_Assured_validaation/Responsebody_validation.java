package rest_Assured_validaation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojoclasses.UserLibrary;

import static io.restassured.RestAssured.*;

public class Responsebody_validation {
@Test
public void valid()
{
	String exp="morpheous";
	UserLibrary u=new UserLibrary("morpheous", "leader");
	baseURI="https://reqres.in";
	Response res = given()
	.body(u)
	.contentType(ContentType.JSON)
	.when()
	.post("/api/users");
	String act=res.jsonPath().get("name");
	System.out.println(act);
	res.then().log().all();
	Assert.assertEquals(exp,act);
}
}

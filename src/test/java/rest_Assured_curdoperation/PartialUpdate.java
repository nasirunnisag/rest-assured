package rest_Assured_curdoperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PartialUpdate {
@Test
public void pupdate()
{
	JSONObject obj=new JSONObject();
	obj.put("name","teacher");
	RequestSpecification req = RestAssured.given();
	req.body(obj);
	req.contentType(ContentType.JSON);
	Response res = req.patch("https://reqres.in/api/users/2");
	ValidatableResponse then = res.then();
	then.log().all();
}
}

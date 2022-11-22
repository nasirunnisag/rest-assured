package rest_Assured_curdoperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class UpdateUser {
@Test
public void updateUser()
{
	JSONObject o=new JSONObject();
	o.put("name", "morpheus");
	o.put("job", "zion resident");
	RequestSpecification a = RestAssured.given();
	a.body(o);
	a.contentType(ContentType.JSON);
	Response a1 = a.put("https://reqres.in/api/users/2");
	ValidatableResponse b = a1.then();
	b.log().all();
}
}


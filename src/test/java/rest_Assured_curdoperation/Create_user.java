package rest_Assured_curdoperation;

import org.json.simple.JSONObject;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class Create_user {
@Test
public void createUser()
{
	JSONObject o=new JSONObject();
	o.put("name", "morpheus");
	o.put("job", "leader");
	RequestSpecification g = RestAssured.given();
	g.body(o);
	g.contentType(ContentType.JSON);
	Response a = g.post("https://reqres.in/api/users");
	System.out.println(a.getStatusCode());
	ValidatableResponse t = a.then();
	t.log().all();
}
}

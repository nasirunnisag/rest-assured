package rest_Assured_curdoperation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetSingleData {
	@Test
	public void get1Data()
	{
Response res = RestAssured.get("https://reqres.in/api/users/2");
ValidatableResponse then = res.then();
then.log().all();
	}
}

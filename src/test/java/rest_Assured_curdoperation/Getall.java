package rest_Assured_curdoperation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class Getall {
@Test
public void getall()
{
	Response a = RestAssured.get("https://reqres.in/api/users?page=2");
	ValidatableResponse b = a.then();
	b.log().all();
}
}

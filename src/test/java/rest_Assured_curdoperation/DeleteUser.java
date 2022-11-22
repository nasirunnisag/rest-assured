package rest_Assured_curdoperation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteUser {
@Test
public void deleteuser()
{
Response delete = RestAssured.delete("https://reqres.in/api/users/2");
delete.then().log().all();
}
}

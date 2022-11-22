package response.validation;

import static io.restassured.RestAssured.*;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class GetAlrespval {
	@Test
	public void respvalgetALL()
	{
		baseURI="https://reqres.in";
		String exp="morpheous";
		Response res = when()
		.get("/api/users");
		/*List<Object> act = res.jsonPath().get("data");
		for(Object d:act)
		{
			String data = d.toString();
			if(data.contains(exp))
			{
				System.out.println(data);
			}
			else
			{
				System.out.println("no");
			}
		}*/
		
	}

}

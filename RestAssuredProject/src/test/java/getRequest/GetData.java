package getRequest;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import junit.framework.Assert;

public class GetData {
	
	
		
	
	@Test(priority=1)
	public void testResponseCode() {
		
		int code=get("http://samples.openweathermap.org/data/2.5/weather?zip"
				+ "=94040,us&appid=b6907d289e10d714a6e88b30761fae22").getStatusCode();
		
		System.out.println(code);
		Assert.assertEquals(code, 200);
		
	
	
	}
	@Test(priority=2)
	public void testBody() {
		
		String data=get("http://samples.openweathermap.org/data/2.5/weather?zip"
				+ "=94040,us&appid=b6907d289e10d714a6e88b30761fae22").asString();
		Long time = get("http://samples.openweathermap.org/data/2.5/weather?zip"
				+ "=94040,us&appid=b6907d289e10d714a6e88b30761fae22").getTime();
		
		System.out.println(data);
		
		
	
	
	}

}

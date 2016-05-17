package com.demorestws.project.web;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;

import com.demorestws.project.DemoRestWsApplication;
import com.demorestws.project.constant.UserUriConstants;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(DemoRestWsApplication.class)
public class UserControllerTest {
	@Ignore
	@Test
	public void shouldAddUserAndReturnAddedUser() throws Exception {
		String userJsonRequest = "{" + "\"firstname\": \"Myname\"," + " \"lastname\": \"lastname\","
				+ "\"dob\": \"2015-12-28T12:24:24.786Z\"," + "\"housenumber\": \"5\"," + "\"postcode\": \"123\","
				+ "\"email\": \"email\"," + "\"password\": \"password\"}";

		Response response = given().body(userJsonRequest).contentType("application/json").expect().statusCode(200)
				.when().post("http://10.0.10.45:8080/DemoRestWs/" + UserUriConstants.REGISTER_USER);
		// response.prettyPrint();
		JsonPath jsonPath = new JsonPath(response.asString());
		assertThat(jsonPath.getString("firstname"), equalTo("Myname"));
		assertThat(jsonPath.getString("lastname"), equalTo("lastname"));
		assertThat(jsonPath.getString("dob"), equalTo("1451305464786"));
		assertThat(jsonPath.getString("housenumber"), equalTo("5"));
		assertThat(jsonPath.getString("postcode"), equalTo("123"));
		assertThat(jsonPath.getString("email"), equalTo("email"));
		assertThat(jsonPath.getString("password"), equalTo("password"));
	}

	/*
	 * testing get request
	 * 
	 * @Test public void greeting(){ expect().body(equalTo(
	 * "Hello World form geeting"
	 * )).when().get("http://10.0.10.45:8080/DemoRestWs/hello"); }
	 */

}

package com.demorestws.project;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.demorestws.project.DemoRestWsApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoRestWsApplication.class)
@WebAppConfiguration
public class DemoRestWsApplicationTests {

	@Test
	public void contextLoads() {
	}

}

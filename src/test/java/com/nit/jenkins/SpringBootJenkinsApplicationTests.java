package com.nit.jenkins;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootJenkinsApplicationTests {
	public static Logger logger=LoggerFactory.getLogger(SpringBootJenkinsApplicationTests.class);
	@Test
	public contextLoads() {
		logger.info("Test case executing....");
		logger.info("Test case executing AGAIN....");
		assertEquals(true, true);
	}

}


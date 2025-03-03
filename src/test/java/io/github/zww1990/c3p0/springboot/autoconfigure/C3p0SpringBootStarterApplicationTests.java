package io.github.zww1990.c3p0.springboot.autoconfigure;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.time.LocalDateTime;

@SpringBootTest
public class C3p0SpringBootStarterApplicationTests {
	@Autowired
	private ApplicationContext context;

	@Test
	public void testContextLoads() {
		System.err.println(this.context.getBeanDefinitionCount());
	}

	@Test
	public void testC3p0DataSourceAutoConfigure() {
	    try {
			C3p0DataSourceAutoConfigure configure = context.getBean(C3p0DataSourceAutoConfigure.class);
			System.err.println(configure.getClass());
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	@Test
	public void testJdbcTemplate() {
	    try {
			JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
			System.err.println(jdbcTemplate.queryForObject("select now()", LocalDateTime.class));
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}

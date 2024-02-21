package io.gitlab.zww1990.c3p0.springboot.autoconfigure;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@Slf4j
public class C3p0SpringBootStarterApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(C3p0SpringBootStarterApplication.class, args);
		log.info("Get Bean Definition Count = {}", context.getBeanDefinitionCount());
	}

}

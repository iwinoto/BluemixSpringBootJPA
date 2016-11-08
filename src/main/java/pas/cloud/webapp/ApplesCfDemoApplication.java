package pas.cloud.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.MessageSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
// Code for embedded Tomcat deployment
/* 
public class ApplesCfDemoApplication {

	public static void main(String[] args)
	{
    	SpringApplication.run(ApplesCfDemoApplication.class, args);
	}
}
*/
// Code for deployment or WAR to WLP
@SpringBootApplication(exclude = MessageSourceAutoConfiguration.class)
public class ApplesCfDemoApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ApplesCfDemoApplication.class);
	}
}

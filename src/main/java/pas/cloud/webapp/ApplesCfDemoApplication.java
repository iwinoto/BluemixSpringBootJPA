package pas.cloud.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.MessageSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication(exclude = MessageSourceAutoConfiguration.class)
public class ServletInitializer extends SpringBootServletInitializer {

	/*
public class ApplesCfDemoApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(ApplesCfDemoApplication.class, args);
    }
}
*/
	
	   @Override
	   protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	      return application.sources(ApplesCfDemoApplication.class);
	   }
	}

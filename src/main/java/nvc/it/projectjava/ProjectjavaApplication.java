package nvc.it.projectjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class ProjectjavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectjavaApplication.class, args);
	}

}

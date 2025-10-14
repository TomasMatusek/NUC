package online.ultimate_homelab.nuc_web_app_spring_service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class NucWebAppSpringServiceApplication {

	@Value("${MY_ENVIRONMENT_VARIABLE:default-value}")
    private String myEnvVar;

	public static void main(String[] args) {
		SpringApplication.run(NucWebAppSpringServiceApplication.class, args);
	}

	@RestController
    class NucWebAppController {
		@GetMapping(path = "/")
		public String test() {
			return "Hello World from Spring service: " + myEnvVar;
		}
	}
}

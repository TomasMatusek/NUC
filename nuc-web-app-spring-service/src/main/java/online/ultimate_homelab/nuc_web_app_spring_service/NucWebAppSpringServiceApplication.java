package online.ultimate_homelab.nuc_web_app_spring_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class NucWebAppSpringServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NucWebAppSpringServiceApplication.class, args);
	}

	@RestController
    static class NucWebAppController {
		@GetMapping(path = "/")
		public String test() {
			return "Hello World from Spring service";
		}
	}
}

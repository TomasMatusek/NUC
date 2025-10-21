package online.ultimate_homelab.nuc_web_app_spring_service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class NucController {

    @Value("${POSTGRES_USER:default-value}")
    private String postgresUser;

    @GetMapping("/")
    public String test() {
        return "Hello World from Spring service: " + postgresUser;
    }
}
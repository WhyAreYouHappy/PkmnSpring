package wruh.pkmn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Обязательная аннотация!
public class PkmnApplication {
    public static void main(String[] args) {
        SpringApplication.run(PkmnApplication.class, args); // Обязательный метод
    }
}

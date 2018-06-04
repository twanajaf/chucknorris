package guru.springframework.cucknorris;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class ChuckNorrisApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChuckNorrisApplication.class, args);
	}

}

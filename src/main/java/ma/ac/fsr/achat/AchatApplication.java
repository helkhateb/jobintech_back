package ma.ac.fsr.achat;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "${app.name}",
				version = "${app.version}",
				description = "${app.description}"
		)
)
public class AchatApplication {

	public static void main(String[] args) {
		SpringApplication.run(AchatApplication.class, args);
	}

}

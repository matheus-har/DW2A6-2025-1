package ifspcjo.dw2a6.assistenciaTecnica;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "ifspcjo.dw2a6.assistenciaTecnica.resources")
@EnableJpaRepositories("ifspcjo.dw2a6.assistenciaTecnica.repositorio")
public class AssistenciaTecnicaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssistenciaTecnicaApplication.class, args);
	}

}

package br.edu.ifspcjo.ads.dw2a6.ifitness.resources;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifspcjo.ads.dw2a6.ifitness.model.Gender;
import br.edu.ifspcjo.ads.dw2a6.ifitness.model.User;

@RestController
public class UserResource {
	
	@GetMapping("/users")
	public List<User> list(){
		User user1 = new User();
		user1.setId(1L);
		user1.setName("Fernando");
		user1.setEmail("fernandoduarte@ifsp.edu.br");
		user1.setPassword("1234");
		user1.setBirthDate(LocalDate.of(1975, 11, 16));
		user1.setGender(Gender.MASCULINO);
		
		User user2 = new User();
		user2.setId(1L);
		user2.setName("Paulo");
		user2.setEmail("paulo@ifsp.edu.br");
		user2.setPassword("1234");
		user2.setBirthDate(LocalDate.of(1980, 1, 1));
		user2.setGender(Gender.MASCULINO);
		
		User user3 = new User();
		
		return Arrays.asList(user1, user2, user3);
	}

}

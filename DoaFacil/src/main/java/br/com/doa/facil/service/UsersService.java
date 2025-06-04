package br.com.doa.facil.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.com.doa.facil.model.Users;
import br.com.doa.facil.repository.UsersRepository;

@Service
public class UsersService {

	@Autowired
	private UsersRepository usersRepository;

	public Users save(Users user) {
		return usersRepository.save(user);
	}

	public Users update(Long id, Users user) {
		Users usersSaved = usersRepository.findById(id)
				.orElseThrow(() -> new EmptyResultDataAccessException(1));
		BeanUtils.copyProperties(user, usersSaved, "id");
		return usersRepository.save(usersSaved);
	}

}

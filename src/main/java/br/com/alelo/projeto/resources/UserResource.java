package br.com.alelo.projeto.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alelo.projeto.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
//	private UserService service;
	
	public ResponseEntity<User> findAll() {
		User usuario1 = new User(1L, "Maria", "estudante");
		return ResponseEntity.ok().body(usuario1);
	}

}

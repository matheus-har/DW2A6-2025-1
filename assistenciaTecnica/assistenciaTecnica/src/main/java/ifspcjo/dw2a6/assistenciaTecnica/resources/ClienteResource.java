package ifspcjo.dw2a6.assistenciaTecnica.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ifspcjo.dw2a6.assistenciaTecnica.model.Cliente;
import ifspcjo.dw2a6.assistenciaTecnica.repositorio.Repositorios;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/cliente")
public class ClienteResource {
	
	@Autowired
	private Repositorios repositorios;
	
	@GetMapping
	public List<Cliente> list(){
		return repositorios.findAll();
	}
	
	@PostMapping
	public Cliente create(@Valid @RequestBody Cliente cliente, HttpServletResponse response) {
		return repositorios.save(cliente);
	}
	
	@GetMapping("/{codigo}")
	public ResponseEntity<Cliente> findById(@PathVariable Long codigo){
		Optional<Cliente> cliente = repositorios.findById(codigo);
		if(cliente.isPresent()) {
			return ResponseEntity.ok(cliente.get());
		}
		return ResponseEntity.notFound().build();
	}
}

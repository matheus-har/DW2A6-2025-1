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

import ifspcjo.dw2a6.assistenciaTecnica.model.OrdemServico;
import ifspcjo.dw2a6.assistenciaTecnica.repositorio.OrdemServicoRepositorio;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/ordemServico")
public class OrdemServicoResource {
	
	@Autowired
	private OrdemServicoRepositorio ordemServicoRepositorio;
	
	@GetMapping
	public List<OrdemServico> list(){
		return ordemServicoRepositorio.findAll();
	}
	
	@PostMapping
	public OrdemServico create(@Valid @RequestBody OrdemServico ordemServico, HttpServletResponse response) {
		return ordemServicoRepositorio.save(ordemServico);
	}
	
	@GetMapping("/{codigo}")
	public ResponseEntity<OrdemServico> findById(@PathVariable Long codigo){
		Optional<OrdemServico> cliente = ordemServicoRepositorio.findById(codigo);
		if(cliente.isPresent()) {
			return ResponseEntity.ok(cliente.get());
		}
		return ResponseEntity.notFound().build();
	}

}

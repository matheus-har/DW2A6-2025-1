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

import ifspcjo.dw2a6.assistenciaTecnica.model.FormaPagamento;
import ifspcjo.dw2a6.assistenciaTecnica.repositorio.FormaPagamentoRepositorio;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/formaPagamento")
public class FormaPagamentoResource {
	
	@Autowired
	private FormaPagamentoRepositorio formaPagamentoRepositorio;
	
	@GetMapping
	public List<FormaPagamento> list(){
		return formaPagamentoRepositorio.findAll();
	}
	
	@PostMapping
	public FormaPagamento create(@Valid @RequestBody FormaPagamento formaPagamento, HttpServletResponse response) {
		return formaPagamentoRepositorio.save(formaPagamento);
	}
	
	@GetMapping("/{codigo}")
	public ResponseEntity<FormaPagamento> findById(@PathVariable Long codigo){
		Optional<FormaPagamento> cliente = formaPagamentoRepositorio.findById(codigo);
		if(cliente.isPresent()) {
			return ResponseEntity.ok(cliente.get());
		}
		return ResponseEntity.notFound().build();
	}

}

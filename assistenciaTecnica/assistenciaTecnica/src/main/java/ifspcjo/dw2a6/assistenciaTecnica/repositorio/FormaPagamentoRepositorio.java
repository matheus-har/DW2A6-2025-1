package ifspcjo.dw2a6.assistenciaTecnica.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ifspcjo.dw2a6.assistenciaTecnica.model.FormaPagamento;

@Repository
public interface FormaPagamentoRepositorio extends JpaRepository<FormaPagamento, Long>{

}

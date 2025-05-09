package ifspcjo.dw2a6.assistenciaTecnica.model;

public enum Status {
	
	EM_APROVACAO("Em Aprovação"),
	APROVADA("Aprovada"),
	EM_ANDAMENTO("Em Andamento"),
	FINALIZADA("Finalizada");
	
	private String status;
	
	private Status(String status) {
		this.status = status;
	}
	
	public String getDescription() {
		return status;
	}
}

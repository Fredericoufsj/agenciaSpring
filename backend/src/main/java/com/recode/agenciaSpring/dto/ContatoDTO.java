package com.recode.agenciaSpring.dto;

public class ContatoDTO {
	
	private Long id;	
	private String email;
	private String mensagem;
	
	
	public ContatoDTO() {
		
	}


	public ContatoDTO(Long id, String email, String mensagem) {
		this.id = id;
		this.email = email;
		this.mensagem = mensagem;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMensagem() {
		return mensagem;
	}


	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	
	

}

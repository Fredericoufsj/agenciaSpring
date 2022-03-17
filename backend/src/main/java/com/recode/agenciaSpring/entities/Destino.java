package com.recode.agenciaSpring.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.crypto.Data;

@Entity
@Table(name = "tb_Destino")
public class Destino {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	private String destino;
	@Temporal(TemporalType.DATE)
	private Date ida;
	@Temporal(TemporalType.DATE)
	private Data volta;
	
	public Destino() {
		
	}

	public Destino(Long id, String destino, Date ida, Data volta) {
		this.id = id;
		this.destino = destino;
		this.ida = ida;
		this.volta = volta;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Date getIda() {
		return ida;
	}

	public void setIda(Date ida) {
		this.ida = ida;
	}

	public Data getVolta() {
		return volta;
	}

	public void setVolta(Data volta) {
		this.volta = volta;
	}
	
	
	

}

package com.gerenciamentodeusuarioapirest.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="TB_PERFIL")
public class Perfil implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

}
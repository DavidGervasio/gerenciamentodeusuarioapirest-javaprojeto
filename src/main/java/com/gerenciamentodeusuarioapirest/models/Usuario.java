package com.gerenciamentodeusuarioapirest.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "TB_USUARIO")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private long cpf;

	@NonNull
	private String nome;

	private Date dataDeNascimento;

	private String sexo;

	@NonNull
	private String cargo;

	@ManyToMany
	private List<Perfil> perfis;

}
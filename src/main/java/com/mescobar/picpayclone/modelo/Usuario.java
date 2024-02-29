package com.mescobar.picpayclone.modelo;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "USUARIOS")
public class Usuario extends EntidadeBase {

	@Column(name = "USU_LOGIN", nullable = false)
	private String login;

	@Column(name = "USU_SENHA", nullable = false)
	private String senha;

	@Column(name = "USU_EMAIL", nullable = false)
	private String email;

	@Column(name = "USU_NOME_COMPLETO", nullable = false)
	private String nomeCompleto;

	@Column(name = "USU_CPF", nullable = false)
	private String cpf;

	@Column(name = "USU_DATA_NASCIMENTO", nullable = false)
	private LocalDate dataNascimento;

	@Column(name = "USU_NUMERO_TELEFONE", nullable = false)
	private String numeroTelefone;

	@OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY, cascade = CascadeType.MERGE, orphanRemoval = true)
	private List<CartaoCredito> cartoesCredito;

	@Column(name = "USU_SALDO", nullable = false)
	private Double saldo;

	@Column(name = "USU_ATIVO", nullable = false)
	private Boolean ativo;
}

package com.mescobar.picpayclone.modelo;

import com.mescobar.picpayclone.modelo.enums.BandeiraCartao;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name="")
public class CartaoCredito extends EntidadeBase{

	@Column(name="CC_NUMERO", nullable = false)
	private String numero;
	
	@Enumerated(EnumType.STRING)
	@Column(name="CC_BANDEIRA", nullable = false)
	private BandeiraCartao bandeira;
	
	@Column(name="CC_TOKEN")
	private String numeroToken;
	
	@ManyToOne(cascade = {CascadeType.MERGE})
	@JoinColumn(name="CC_USUARIO_ID", nullable = false)
	private Usuario usuario;
}

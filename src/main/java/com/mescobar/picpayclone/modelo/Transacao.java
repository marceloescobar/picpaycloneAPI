package com.mescobar.picpayclone.modelo;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
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
@Table(name = "TRANSACOES")
public class Transacao extends EntidadeBase {

	@Column(name = "TR_CODIGO", nullable = false)
	private String codigo;

	@ManyToOne(cascade = { CascadeType.MERGE })
	@JoinColumn(name = "TR_USUARIO_ORIGEM", nullable = false)
	private Usuario origem;

	@ManyToOne(cascade = { CascadeType.MERGE }, fetch = FetchType.EAGER)
	@JoinColumn(name = "TR_USUARIO_DESTINO", nullable = false)
	private Usuario destino;

	@Column(name = "TR_DATA_HORA", nullable = false)
	private LocalDateTime dataHora;

	@Column(name = "TR_VALOR", nullable = false)
	private Double valor;
}

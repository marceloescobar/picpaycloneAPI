package com.mescobar.picpayclone.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@JsonInclude(Include.NON_NULL)
public class TransacaoDTO {

	@NotBlank
	private String codigo;
	
	@NotNull
	private UsuarioDTO origem;
	
	@NotNull
	private UsuarioDTO destino;
	
	@NotNull
	private LocalDateTime dataHora;
	
	@NotNull
	private Double valor;
	
	private CartaoCreditoDTO cartaoCredito;
	
	private Boolean isCartaoCredito = false;
	
}

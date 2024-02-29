package com.mescobar.picpayclone.dto;

import com.mescobar.picpayclone.modelo.enums.BandeiraCartao;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CartaoCreditoDTO {
	@NotBlank
	private BandeiraCartao bandeira;
	
	@NotBlank
	private String codigoSeguranca;
	
	@NotBlank
	private String dataExpiracao;
	
	@NotBlank
	private String nomeTitular;
	
	private String numero;
	
	private String numeroToken;
	
	@NotNull
	private UsuarioDTO usuario;
	
	private Boolean isSalva = false;
}

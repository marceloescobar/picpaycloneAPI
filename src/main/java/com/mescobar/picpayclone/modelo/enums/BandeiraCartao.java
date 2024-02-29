package com.mescobar.picpayclone.modelo.enums;

public enum BandeiraCartao {
	VISA("Visa"), MASTERCARD("Master Card"), ELO("Elo");

	BandeiraCartao(String descricao) {
		this.descricao = descricao;
	}

	private String descricao;

	public String getDescricao() {
		return descricao;
	}

}

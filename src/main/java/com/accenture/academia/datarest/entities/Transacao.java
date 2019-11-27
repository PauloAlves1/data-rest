package com.accenture.academia.datarest.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedBy;

import com.accenture.academia.datarest.enums.TipoTransacao;

@Entity
@Table(name = "transacao")
public class Transacao implements Serializable {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "descricao", nullable = false)
	private String descricao;
	
	@Column(name = "is_ativo", nullable = false)
	private Boolean ativo;
	
	@Enumerated(EnumType.ORDINAL)
	private TipoTransacao tipoTransacao;
	
	@Column(name = "vlr_Transacao", nullable = false, precision = 2)
	private Float valorTrasacao;
	
	@Column(name = "dt_transacao", nullable = false)
	@CreatedBy
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataTimeTransferencia;
	
	@Column(name = "conta", nullable = false)
	private String conta;



public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getDescricao() {
	return descricao;
}

public void setDescricao(String descricao) {
	this.descricao = descricao;
}

public Boolean getAtivo() {
	return ativo;
}

public void setAtivo(Boolean ativo) {
	this.ativo = ativo;
}

public Float getValorTrasacao() {
	return valorTrasacao;
}

public void setValorTrasacao(Float valorTrasacao) {
	this.valorTrasacao = valorTrasacao;
}

public Date getDataTimeTransferencia() {
	return dataTimeTransferencia;
}

public void setDataTimeTransferencia(Date dataTimeTransferencia) {
	this.dataTimeTransferencia = dataTimeTransferencia;
}

public String getConta() {
	return conta;
}

public void setConta(String conta) {
	this.conta = conta;
}

public Transacao(long id, String descricao, Boolean ativo, Float valorTrasacao, Date dataTimeTransferencia,
		String conta) {
	super();
	this.id = id;
	this.descricao = descricao;
	this.ativo = ativo;
	this.valorTrasacao = valorTrasacao;
	this.dataTimeTransferencia = dataTimeTransferencia;
	this.conta = conta;
}

}

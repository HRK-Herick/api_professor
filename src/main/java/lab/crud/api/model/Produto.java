package lab.crud.api.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Produto {

	private Integer id;
	private String nome;
	private String descricao;
	private BigDecimal preco;
	private LocalDate dataCriacao;
	
	public Produto() {
		
	}
	
	public Integer getId() {
		return this.id;
	}
	
	//Alt + SHIFT +S(SOURCE/FONTE/CODIGO)
	
	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public LocalDate getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", preco=" + preco
				+ ", dataCriacao=" + dataCriacao + "]";
	}
	
	
	
}

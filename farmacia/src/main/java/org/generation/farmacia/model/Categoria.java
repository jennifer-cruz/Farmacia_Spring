package org.generation.farmacia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_categorias")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull(message = "O nome da categoria é obrigatório")
	private String nomeCategoria;

	@NotNull(message = "A cor Identificadora é obrigatório")
	private String corId;
	
	
@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
@JsonIgnoreProperties("categoria")
private List<Produto> produto;


	public Long getId() {
		return id;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}

	public String getCorId() {
		return corId;
	}

	public void setCorId(String corId) {
		this.corId = corId;
	}

}

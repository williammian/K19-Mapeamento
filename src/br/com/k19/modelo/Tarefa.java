package br.com.k19.modelo;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Tarefa {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String titulo;
	
	@Lob
	private String descricao;
	
	@Convert(converter = TarefaStatusConverter.class)
	private TarefaStatus tarefaStatus;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public TarefaStatus getTarefaStatus() {
		return tarefaStatus;
	}

	public void setTarefaStatus(TarefaStatus tarefaStatus) {
		this.tarefaStatus = tarefaStatus;
	}
	
}

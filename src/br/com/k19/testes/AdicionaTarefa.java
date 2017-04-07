package br.com.k19.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.k19.modelo.Tarefa;
import br.com.k19.modelo.TarefaStatus;

public class AdicionaTarefa {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("K21_mapeamento_pu");
		
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		Tarefa tarefa1 = new Tarefa();
		tarefa1.setTitulo("Erro ao cadastrar cliente");
		tarefa1.setDescricao("Erro de chave única ao cadastrar o cliente");
		tarefa1.setTarefaStatus(TarefaStatus.ABERTA);
		
		manager.persist(tarefa1);
		
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
	}
	
}

package br.com.k19.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.k19.modelo.Departamento;
import br.com.k19.modelo.Funcionario;

public class AdicionaDepartamentoFuncionario {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("K21_mapeamento_pu");
		
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		Funcionario f1 = new Funcionario();
		f1.setNome("Roberto Fonseca");
		
		Departamento d = new Departamento();
		d.setNome("Financeiro");
		d.getFuncionarios().add(f1);
		
		manager.persist(f1);
		manager.persist(d);
		
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
	}
	
}

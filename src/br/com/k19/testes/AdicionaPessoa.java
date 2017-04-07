package br.com.k19.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.k19.modelo.Pessoa;
import br.com.k19.modelo.PessoaFisica;
import br.com.k19.modelo.PessoaJuridica;

public class AdicionaPessoa {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("K21_mapeamento_pu");
		
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		Pessoa p1 = new Pessoa();
		p1.setNome("Mateus");
		
		PessoaFisica p2 = new PessoaFisica();
		p2.setNome("Marcos");
		p2.setCpf("1234");
		
		PessoaJuridica p3 = new PessoaJuridica();
		p3.setNome("Empresa XPTO");
		p3.setCnpj("556678");
		
		manager.persist(p1);
		manager.persist(p2);
		manager.persist(p3);
		
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
	}
	
}

package br.com.k19.testes;

import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.k19.modelo.Candidato;
import br.com.k19.modelo.Endereco;

public class AdicionaCandidatoEndereco {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("K21_mapeamento_pu");
		
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		Endereco e = new Endereco();
		e.setEstado("SP");
		e.setCidade("São Paulo");
		e.setLogradouro("Rua Ipiranga");
		e.setNumero(1571);
		
		Candidato c = new Candidato();
		c.setNome("José Santana");
		c.setNascimento(new GregorianCalendar(1984, 5, 6));
		c.setEndereco(e);
		
		manager.persist(c);
		
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
	}
	
}

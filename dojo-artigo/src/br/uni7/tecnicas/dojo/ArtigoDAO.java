package br.uni7.tecnicas.dojo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ArtigoDAO {
	private EntityManagerFactory factory;

	public ArtigoDAO() {
		factory = Persistence.createEntityManagerFactory("uni7-pu");
	}

	public void salvar(Artigo artigo) {
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();

		em.persist(artigo);

		em.getTransaction().commit();
		em.close();
	}

	public List<Artigo> buscarTodos() {
		List<Artigo> artigos = new ArrayList<>();

		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();

		Query query = em.createQuery("select a from Artigo a");
		artigos = query.getResultList();
		
		em.getTransaction().commit();
		em.close();
		
		return artigos;
	}
}

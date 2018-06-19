import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.uni7.jpa.Usuario;
import br.edu.uni7.jpa.Vaga;
import br.edu.uni7.jpa.Veiculo;

public class DatabaseGen {
	public static void main(String[] args) {
		Properties config = new Properties();
		config.put("hibernate.hbm2ddl.auto", "create");

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("uni7-pu", config);
		EntityManager em = factory.createEntityManager();

		em.getTransaction().begin();

		Usuario usuario = new Usuario(null, "Davi", "davi", "cumpadre");
		em.persist(usuario);

		Usuario u2 = new Usuario(null, "X", "x", "123");
		em.persist(u2);

		Veiculo v1 = new Veiculo(null, "abc-1234", "camaro", "gm");
		Vaga vaga1 = new Vaga(null, "A-123");
		v1.setVaga(vaga1);

		em.persist(v1);
		em.persist(vaga1);
		
		em.getTransaction().commit();

		em.close();
		factory.close();
	}
}

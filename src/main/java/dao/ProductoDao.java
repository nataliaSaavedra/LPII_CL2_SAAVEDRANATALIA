package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import interfaces.IProductoDao;
import model.Producto;

public class ProductoDao implements IProductoDao {

	@Override
	public List<Producto> listarProductos() {
		EntityManagerFactory fabr = Persistence.createEntityManagerFactory("PERSISTENCE");
		EntityManager em = fabr.createEntityManager();
		List<Producto> productos = new ArrayList<Producto>();
		try {
			productos = em.createQuery("Select P From Producto P", Producto.class).getResultList();
		} catch(Exception ex) {
			System.out.println("No se encontraron productos" + ex.getMessage());
		}
		em.close();
		return productos;
	}

	@Override
	public void registrarProducto(Producto producto) {
		EntityManagerFactory fabr = Persistence.createEntityManagerFactory("PERSISTENCE");
		EntityManager em = fabr.createEntityManager();
		em.getTransaction().begin();
		em.persist(producto);
		em.getTransaction().commit();
		em.close();
	}

}

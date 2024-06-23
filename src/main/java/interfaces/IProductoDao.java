package interfaces;

import java.util.List;

import model.Producto;

public interface IProductoDao {
	List<Producto> listarProductos();
	void registrarProducto(Producto producto);
}

package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductoDao;
import model.Producto;

/**
 * Servlet implementation class ProductoController
 */
@WebServlet("/ProductoController")
public class ProductoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProductoDao productoDao = new ProductoDao();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("productos", productoDao.listarProductos());
		RequestDispatcher rd = request.getRequestDispatcher("productos.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("txtNombre");
		Double precioC = Double.parseDouble(request.getParameter("txtPrecio"));
		Double precioV = Double.parseDouble(request.getParameter("txtPrecioVen"));
		String estado = request.getParameter("cboEstado");
		String descripcion = request.getParameter("txtDescripcion");
		
		Producto producto = new Producto();
		producto.setNombrecl2(nombre);	
		producto.setPreciocompcl2(precioC);	
		producto.setPrecioventacl2(precioV);
		producto.setEstadocl2(estado);	
		producto.setDescripcl2(descripcion);
		
		productoDao.registrarProducto(producto);
		request.setAttribute("productos", productoDao.listarProductos());
		RequestDispatcher rd = request.getRequestDispatcher("productos.jsp");
		rd.forward(request, response);
	}

}

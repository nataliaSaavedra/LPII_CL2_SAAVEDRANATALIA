package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_PRODUCTOCL2")
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer idproductocl2;
	@Column
	private String nombrecl2;
	@Column
	private Double precioventacl2;
	@Column
	private Double preciocompcl2;
	@Column
	private String estadocl2;
	
	public Integer getIdproductocl2() {
		return idproductocl2;
	}
	public void setIdproductocl2(Integer idproductocl2) {
		this.idproductocl2 = idproductocl2;
	}
	public String getNombrecl2() {
		return nombrecl2;
	}
	public void setNombrecl2(String nombrecl2) {
		this.nombrecl2 = nombrecl2;
	}
	public Double getPrecioventacl2() {
		return precioventacl2;
	}
	public void setPrecioventacl2(Double precioventacl2) {
		this.precioventacl2 = precioventacl2;
	}
	public Double getPreciocompcl2() {
		return preciocompcl2;
	}
	public void setPreciocompcl2(Double preciocompcl2) {
		this.preciocompcl2 = preciocompcl2;
	}
	public String getEstadocl2() {
		return estadocl2;
	}
	public void setEstadocl2(String estadocl2) {
		this.estadocl2 = estadocl2;
	}
	public String getDescripcl2() {
		return descripcl2;
	}
	public void setDescripcl2(String descripcl2) {
		this.descripcl2 = descripcl2;
	}
	private String descripcl2;
}

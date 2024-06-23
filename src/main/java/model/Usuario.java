package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_USUARIOCL2")
public class Usuario {
	@Id
	@Column
	private Integer idusuariocl2;
	@Column
	private String usuariocl2;
	@Column
	private String passwordcl2;
	
	public Integer getIdusuariocl2() {
		return idusuariocl2;
	}
	public void setIdusuariocl2(Integer idusuariocl2) {
		this.idusuariocl2 = idusuariocl2;
	}
	public String getUsuariocl2() {
		return usuariocl2;
	}
	public void setUsuariocl2(String usuariocl2) {
		this.usuariocl2 = usuariocl2;
	}
	public String getPasswordcl2() {
		return passwordcl2;
	}
	public void setPasswordcl2(String passwordcl2) {
		this.passwordcl2 = passwordcl2;
	}
}

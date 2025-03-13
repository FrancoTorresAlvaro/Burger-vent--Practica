package com.burguerVent.negocio.modelo;

public class Productos {
	
	private String nombre;
	private float precio;
	private int idProduc;
	public Productos(String nombre, float precio, int idProduc) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.idProduc = idProduc;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public int getIdProduc() {
		return idProduc;
	}
	public void setIdProduc(int idProduc) {
		this.idProduc = idProduc;
	}
	
	
}

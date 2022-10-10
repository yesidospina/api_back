package com.api.solutions.entity;
import javax.persistence.*;

//Notación para indicar que es una entidad
@Entity
//Tabla que corresponde a esta entidad
@Table(name = "Persona")

public class Persona {
    
    //Llave primaria de la tabla
    @Id
    //Se le indica que el campo ID es Autonumerico
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombres;
    private String apellidos;
    private String tipoDocumento;
    private int numeroDocumento;
    private int numeroConduccion;


    public Persona() {
    }

    /*
    Constructor con parametros
     */
    public Persona(String nombres, String apellidos, String tipoDocumento, int numeroDocumento, int numeroConduccion) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.numeroConduccion = numeroConduccion;
    }

    public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombres() {
		return nombres;
	}


	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getTipoDocumento() {
		return tipoDocumento;
	}


	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}


	public int getNumeroDocumento() {
		return numeroDocumento;
	}


	public void setNumeroDocumento(int numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}


	public int getNumeroConduccion() {
		return numeroConduccion;
	}


	public void setNumeroConduccion(int numeroConduccion) {
		this.numeroConduccion = numeroConduccion;
	}
}

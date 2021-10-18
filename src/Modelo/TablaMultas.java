package Modelo;
//created on 16-10-2021 at 8:11:22
//class 'TablaMultas'

import java.sql.Timestamp;

public class TablaMultas{
// variables for TablaMultas

	private int id;
	private String nombre;
	private String concepto_pago;
	private String precio;
	private String created_by;
	private Timestamp created_at;
	private Timestamp updated_at;


// setters and getters for TablaMultas

    public TablaMultas() {
    }

    public TablaMultas(int id, String nombre, String concepto_pago, String precio, String created_by, Timestamp created_at, Timestamp updated_at) {
        this.id = id;
        this.nombre = nombre;
        this.concepto_pago = concepto_pago;
        this.precio = precio;
        this.created_by = created_by;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getConcepto_pago() {
        return concepto_pago;
    }

    public void setConcepto_pago(String concepto_pago) {
        this.concepto_pago = concepto_pago;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }


}
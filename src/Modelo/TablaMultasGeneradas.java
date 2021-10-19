package Modelo;
//created on 16-10-2021 at 8:11:22
//class 'TablaMultasGeneradas'

import java.sql.Timestamp;

public class TablaMultasGeneradas{
// variables for TablaMultasGeneradas

	private int id;
	private String folio;
	private String nombres;
	private String apellido_pat;
	private String apellido_mat;
	private String domicilio;
	private String placa_vehiculo;
	private String marca_vehiculo;
	private String nserie_vehiculo;
	private String modelo_vehiculo;
	private String limite_pago;
	private String created_by;
	private Timestamp created_at;
	private Timestamp updated_at;
	private int id_multa;
	//private String KEY; no nos sirve el key

    public TablaMultasGeneradas() {
    }

    public TablaMultasGeneradas(int id, String folio, String nombres, String apellido_pat, String apellido_mat, String domicilio, String placa_vehiculo, String marca_vehiculo, String nserie_vehiculo, String modelo_vehiculo, String limite_pago, String created_by, Timestamp created_at, Timestamp updated_at, int id_multa) {
        this.id = id;
        this.folio = folio;
        this.nombres = nombres;
        this.apellido_pat = apellido_pat;
        this.apellido_mat = apellido_mat;
        this.domicilio = domicilio;
        this.placa_vehiculo = placa_vehiculo;
        this.marca_vehiculo = marca_vehiculo;
        this.nserie_vehiculo = nserie_vehiculo;
        this.modelo_vehiculo = modelo_vehiculo;
        this.limite_pago = limite_pago;
        this.created_by = created_by;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.id_multa = id_multa;
    }

        

// setters and getters for TablaMultasGeneradas

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido_pat() {
        return apellido_pat;
    }

    public void setApellido_pat(String apellido_pat) {
        this.apellido_pat = apellido_pat;
    }

    public String getApellido_mat() {
        return apellido_mat;
    }

    public void setApellido_mat(String apellido_mat) {
        this.apellido_mat = apellido_mat;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getPlaca_vehiculo() {
        return placa_vehiculo;
    }

    public void setPlaca_vehiculo(String placa_vehiculo) {
        this.placa_vehiculo = placa_vehiculo;
    }

    public String getMarca_vehiculo() {
        return marca_vehiculo;
    }

    public void setMarca_vehiculo(String marca_vehiculo) {
        this.marca_vehiculo = marca_vehiculo;
    }

    public String getNserie_vehiculo() {
        return nserie_vehiculo;
    }

    public void setNserie_vehiculo(String nserie_vehiculo) {
        this.nserie_vehiculo = nserie_vehiculo;
    }

    public String getModelo_vehiculo() {
        return modelo_vehiculo;
    }

    public void setModelo_vehiculo(String modelo_vehiculo) {
        this.modelo_vehiculo = modelo_vehiculo;
    }

    public String getLimite_pago() {
        return limite_pago;
    }

    public void setLimite_pago(String limite_pago) {
        this.limite_pago = limite_pago;
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

    public int getId_multa() {
        return id_multa;
    }

    public void setId_multa(int id_multa) {
        this.id_multa = id_multa;
    }

    @Override
    public String toString() {
        return "TablaMultasGeneradas{" + "id=" + id + ", folio=" + folio + ", nombres=" + nombres + ", apellido_pat=" + apellido_pat + ", apellido_mat=" + apellido_mat + ", domicilio=" + domicilio + ", placa_vehiculo=" + placa_vehiculo + ", marca_vehiculo=" + marca_vehiculo + ", nserie_vehiculo=" + nserie_vehiculo + ", modelo_vehiculo=" + modelo_vehiculo + ", limite_pago=" + limite_pago + ", created_by=" + created_by + ", created_at=" + created_at + ", updated_at=" + updated_at + ", id_multa=" + id_multa + '}';
    }



}
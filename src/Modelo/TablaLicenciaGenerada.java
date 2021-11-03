package Modelo;
//created on 16-10-2021 at 8:11:22
//class 'TablaLicenciaGenerada'

import java.sql.Timestamp;

public class TablaLicenciaGenerada{
// variables for TablaLicenciaGenerada

	private int id;
	private String nombres;
	private String apellido_pat;
	private String apellido_mat;
	private String edad;
	private String domicilio;
	private String fecha_nac;
	private String cp;
	private String lugar;
	private String celular;
	private String crated_by;
        private String concepto;
	private Timestamp created_at;
	private Timestamp updated_at;
	private int id_tipo_licencia;
//	private String KEY;

    public TablaLicenciaGenerada() {
    }

        
        
    public TablaLicenciaGenerada(int id, String nombres, String apellido_pat, String apellido_mat, String edad, String domicilio, String fecha_nac, String cp, String lugar, String celular, String crated_by, Timestamp created_at, Timestamp updated_at, int id_tipo_licencia) {
        this.id = id;
        this.nombres = nombres;
        this.apellido_pat = apellido_pat;
        this.apellido_mat = apellido_mat;
        this.edad = edad;
        this.domicilio = domicilio;
        this.fecha_nac = fecha_nac;
        this.cp = cp;
        this.lugar = lugar;
        this.celular = celular;
        this.crated_by = crated_by;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.id_tipo_licencia = id_tipo_licencia;
    }


// setters and getters for TablaLicenciaGenerada

// setter method for 'id'

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

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCrated_by() {
        return crated_by;
    }

    public void setCrated_by(String crated_by) {
        this.crated_by = crated_by;
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

    public int getId_tipo_licencia() {
        return id_tipo_licencia;
    }

    public void setId_tipo_licencia(int id_tipo_licencia) {
        this.id_tipo_licencia = id_tipo_licencia;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }    

    @Override
    public String toString() {
        return "TablaLicenciaGenerada{" + "id=" + id + ", nombres=" + nombres + ", apellido_pat=" + apellido_pat + ", apellido_mat=" + apellido_mat + ", edad=" + edad + ", domicilio=" + domicilio + ", fecha_nac=" + fecha_nac + ", cp=" + cp + ", lugar=" + lugar + ", celular=" + celular + ", crated_by=" + crated_by + ", created_at=" + created_at + ", updated_at=" + updated_at + ", id_tipo_licencia=" + id_tipo_licencia + '}';
    }


}
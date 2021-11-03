package Modelo;
//created on 16-10-2021 at 8:11:22
//class 'TablaTipoLicencia'

import java.sql.Timestamp;

public class TablaTipoLicencia{
// variables for TablaTipoLicencia

	private int id;
	private String concepto_cobro;
        private String tipo_licencia;
	private String costo;
	private String created_by;
	private Timestamp created_at;
	private Timestamp updated_at;

    public TablaTipoLicencia() {
    }

    public TablaTipoLicencia(int id, String concepto_cobro, String costo, String created_by, Timestamp created_at, Timestamp updated_at) {
        this.id = id;
        this.concepto_cobro = concepto_cobro;
        this.costo = costo;
        this.created_by = created_by;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }


// setters and getters for TablaTipoLicencia

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConcepto_cobro() {
        return concepto_cobro;
    }

    public void setConcepto_cobro(String concepto_cobro) {
        this.concepto_cobro = concepto_cobro;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
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
    

    public String getTipo_licencia() {
        return tipo_licencia;
    }

    public void setTipo_licencia(String tipo_licencia) {
        this.tipo_licencia = tipo_licencia;
    }    

    @Override
    public String toString() {
        return "TablaTipoLicencia{" + "id=" + id + ", concepto_cobro=" + concepto_cobro + ", costo=" + costo + ", created_by=" + created_by + ", created_at=" + created_at + ", updated_at=" + updated_at + '}';
    }


}
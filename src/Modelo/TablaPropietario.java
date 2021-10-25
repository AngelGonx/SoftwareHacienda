package Modelo;
//created on 16-10-2021 at 8:11:22
//class 'TablaPropietario'

import java.sql.Timestamp;

public class TablaPropietario{
// variables for TablaPropietario
	private int id;
	private String nombres;
	private String apellido_pat;
	private String apellido_mat;
	private String sexo;
	private String edad;
	private String domicilio;
	private String lugar;
        private String marca;
        private String modelo;
        private String serie;
        private String age;
        private String tenencia;
        private String placas;
        private String fecha;
        private String transmision;
	private String created_by;
	private String updated_by;
	private Timestamp created_at;
	private Timestamp updated_at;

    public TablaPropietario() {
    }

    public TablaPropietario(int id, String nombres, String apellido_pat, String apellido_mat, String sexo, String edad, String domicilio, String lugar, String marca, String modelo, String serie,String age, String tenencia, String placas, String transmision,String fecha, String created_by, String updated_by, Timestamp created_at, Timestamp updated_at) {
        this.id = id;
        this.nombres = nombres;
        this.apellido_pat = apellido_pat;
        this.apellido_mat = apellido_mat;
        this.sexo = sexo;
        this.edad = edad;
        this.domicilio = domicilio;
        this.lugar = lugar;
        this.marca = marca;
        this.modelo = modelo;
        this.serie = serie;
        this.age = age;
        this.tenencia = tenencia;
        this.placas = placas;
        this.transmision = transmision;
        this.created_by = created_by;
        this.updated_by = updated_by;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.fecha = fecha;
    }
	


// setters and getters for TablaPropietario

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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getTenencia() {
        return tenencia;
    }

    public void setTenencia(String tenencia) {
        this.tenencia = tenencia;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public String getUpdated_by() {
        return updated_by;
    }

    public void setUpdated_by(String updated_by) {
        this.updated_by = updated_by;
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

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    @Override
    public String toString() {
        return "TablaPropietario{" + "id=" + id + ", nombres=" + nombres + ", apellido_pat=" + apellido_pat + ", apellido_mat=" + apellido_mat + ", sexo=" + sexo + ", edad=" + edad + ", domicilio=" + domicilio + ", lugar=" + lugar + ", marca=" + marca + ", modelo=" + modelo + ", serie=" + serie + ", age=" + age + ", tenencia=" + tenencia + ", placas=" + placas + ", fecha=" + fecha + ", transmision=" + transmision + ", created_by=" + created_by + ", updated_by=" + updated_by + ", created_at=" + created_at + ", updated_at=" + updated_at + '}';
    }

   
    
 
    
    


}
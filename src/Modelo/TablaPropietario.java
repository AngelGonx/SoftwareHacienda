package Modelo
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
	private String created_by;
	private String updated_by;
	private Timestamp created_at;
	private Timestamp updated_at;
	private int id_vehiculo;
	private String KEY;

public TablaPropietario(){
}
	
public TablaPropietario(int id,String nombres,String apellido_pat,String apellido_mat,String sexo,String edad,String domicilio,String lugar,String created_by,String updated_by,Timestamp created_at,Timestamp updated_at,int id_vehiculo,String KEY,){
	this.id;
	this.nombres;
	this.apellido_pat;
	this.apellido_mat;
	this.sexo;
	this.edad;
	this.domicilio;
	this.lugar;
	this.created_by;
	this.updated_by;
	this.created_at;
	this.updated_at;
	this.id_vehiculo;
	this.KEY;
}

// setters and getters for TablaPropietario

// setter method for 'id'
public void setid(int id){
    this.id = id;
}

// getter method for 'id'
public int getid(int id){
    return this.id = id;
}
// setter method for 'nombres'
public void setnombres(String nombres){
    this.nombres = nombres;
}

// getter method for 'nombres'
public String getnombres(String nombres){
    return this.nombres = nombres;
}
// setter method for 'apellido_pat'
public void setapellido_pat(String apellido_pat){
    this.apellido_pat = apellido_pat;
}

// getter method for 'apellido_pat'
public String getapellido_pat(String apellido_pat){
    return this.apellido_pat = apellido_pat;
}
// setter method for 'apellido_mat'
public void setapellido_mat(String apellido_mat){
    this.apellido_mat = apellido_mat;
}

// getter method for 'apellido_mat'
public String getapellido_mat(String apellido_mat){
    return this.apellido_mat = apellido_mat;
}
// setter method for 'sexo'
public void setsexo(String sexo){
    this.sexo = sexo;
}

// getter method for 'sexo'
public String getsexo(String sexo){
    return this.sexo = sexo;
}
// setter method for 'edad'
public void setedad(String edad){
    this.edad = edad;
}

// getter method for 'edad'
public String getedad(String edad){
    return this.edad = edad;
}
// setter method for 'domicilio'
public void setdomicilio(String domicilio){
    this.domicilio = domicilio;
}

// getter method for 'domicilio'
public String getdomicilio(String domicilio){
    return this.domicilio = domicilio;
}
// setter method for 'lugar'
public void setlugar(String lugar){
    this.lugar = lugar;
}

// getter method for 'lugar'
public String getlugar(String lugar){
    return this.lugar = lugar;
}
// setter method for 'created_by'
public void setcreated_by(String created_by){
    this.created_by = created_by;
}

// getter method for 'created_by'
public String getcreated_by(String created_by){
    return this.created_by = created_by;
}
// setter method for 'updated_by'
public void setupdated_by(String updated_by){
    this.updated_by = updated_by;
}

// getter method for 'updated_by'
public String getupdated_by(String updated_by){
    return this.updated_by = updated_by;
}
// setter method for 'created_at'
public void setcreated_at(String created_at){
    this.created_at = created_at;
}

// getter method for 'created_at'
public Timestamp getcreated_at(String created_at){
    return this.created_at = created_at;
}
// setter method for 'updated_at'
public void setupdated_at(String updated_at){
    this.updated_at = updated_at;
}

// getter method for 'updated_at'
public Timestamp getupdated_at(String updated_at){
    return this.updated_at = updated_at;
}
// setter method for 'id_vehiculo'
public void setid_vehiculo(int id_vehiculo){
    this.id_vehiculo = id_vehiculo;
}

// getter method for 'id_vehiculo'
public int getid_vehiculo(int id_vehiculo){
    return this.id_vehiculo = id_vehiculo;
}
// setter method for 'KEY'
public void setKEY(String KEY){
    this.KEY = KEY;
}

// getter method for 'KEY'
public String getKEY(String KEY){
    return this.KEY = KEY;
}

}

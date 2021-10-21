package Modelo
//created on 16-10-2021 at 8:11:22
//class 'TablaTipoLicencia'
import java.sql.Timestamp;

public class TablaTipoLicencia{
// variables for TablaTipoLicencia

	private int id;
	private String concepto_cobro;
	private String costo;
	private String created_by;
	private Timestamp created_at;
	private Timestamp updated_at;

public TablaTipoLicencia(){
}

public TablaTipoLicencia(int id,String concepto_cobro,String costo,String created_by,Timestamp created_at,Timestamp updated_at,){
	this.id = id;
	this.concepto_cobro = concepto_cobro;
	this.costo = costo;
	this.created_by = created_by;
	this.created_at = created_at;
	this.updated_at = updated_at;
}

// setters and getters for TablaTipoLicencia

// setter method for 'id'
public void setid(int id){
    this.id = id;
}

// getter method for 'id'
public int getid(int id){
    return this.id = id;
}
// setter method for 'concepto_cobro'
public void setconcepto_cobro(String concepto_cobro){
    this.concepto_cobro = concepto_cobro;
}

// getter method for 'concepto_cobro'
public String getconcepto_cobro(String concepto_cobro){
    return this.concepto_cobro = concepto_cobro;
}
// setter method for 'costo'
public void setcosto(String costo){
    this.costo = costo;
}

// getter method for 'costo'
public String getcosto(String costo){
    return this.costo = costo;
}
// setter method for 'created_by'
public void setcreated_by(String created_by){
    this.created_by = created_by;
}

// getter method for 'created_by'
public String getcreated_by(String created_by){
    return this.created_by = created_by;
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

}

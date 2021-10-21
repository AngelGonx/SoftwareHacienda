package Modelo
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

public TablaMultas(){
}

public TablaMultas(int id,String nombre,String concepto_pago,String precio,String created_by,Timestamp created_at,Timestamp updated_at,){
	this.id;
	this.nombre;
	this.concepto_pago;
	this.precio;
	this.created_by;
	this.created_at;
	this.updated_at;
}

// setters and getters for TablaMultas

// setter method for 'id'
public void setid(int id){
    this.id = id;
}

// getter method for 'id'
public int getid(int id){
    return this.id = id;
}
// setter method for 'nombre'
public void setnombre(String nombre){
    this.nombre = nombre;
}

// getter method for 'nombre'
public String getnombre(String nombre){
    return this.nombre = nombre;
}
// setter method for 'concepto_pago'
public void setconcepto_pago(String concepto_pago){
    this.concepto_pago = concepto_pago;
}

// getter method for 'concepto_pago'
public String getconcepto_pago(String concepto_pago){
    return this.concepto_pago = concepto_pago;
}
// setter method for 'precio'
public void setprecio(String precio){
    this.precio = precio;
}

// getter method for 'precio'
public String getprecio(String precio){
    return this.precio = precio;
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

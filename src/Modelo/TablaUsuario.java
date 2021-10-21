package Modelo
//created on 16-10-2021 at 8:11:22
//class 'TablaUsuario'

import java.sql.Timestamp;


public class TablaUsuario{
// variables for TablaUsuario

	private int id;
	private String name;
	private String username;
	private String password;
	private Timestamp created_at;
	private Timestamp update_at;

public TablaUsuario(){
}

public TablaUsuario(int id,String name,String username,String password,Timestamp created_at,Timestamp update_at,){
	this.id = id;
	this.name = name;
	this.username = username;
	this.password = password;
	this.created_at = created_at;
	this.update_at = update_at;
}


// setters and getters for TablaUsuario

// setter method for 'id'
public void setid(int id){
    this.id = id;
}

// getter method for 'id'
public int getid(int id){
    return this.id = id;
}
// setter method for 'name'
public void setname(String name){
    this.name = name;
}

// getter method for 'name'
public String getname(String name){
    return this.name = name;
}
// setter method for 'username'
public void setusername(String username){
    this.username = username;
}

// getter method for 'username'
public String getusername(String username){
    return this.username = username;
}
// setter method for 'password'
public void setpassword(String password){
    this.password = password;
}

// getter method for 'password'
public String getpassword(String password){
    return this.password = password;
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

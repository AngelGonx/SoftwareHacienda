package Modelo;
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


// setters and getters for TablaUsuario

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(Timestamp update_at) {
        this.update_at = update_at;
    }



@Override
public String toString() {
        return "TablaUsuario{" + "id=" + id + ", name=" + name + ", username=" + username + ", password=" + password + ", created_at=" + created_at + ", update_at=" + update_at + '}';
}



}
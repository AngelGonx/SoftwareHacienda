/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.TablaLicenciaGenerada;
import Modelo.TablaMultas;
import Modelo.TablaMultasGeneradas;
import Modelo.TablaUsuario;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joseluiscaamal
 */
public class ControladorBaseDeDatos {

    private static Connection Conexion; //Abro la conexión

    ControladorUtilerias cut = new ControladorUtilerias();

    /*  ----------------------------------------------------------------------------------
    Nombre: Clase conex()
    Función: Apertura La Conexión con la BD/ Utilizado para la consulta de tablas
    Aut@r: José Luis Caamal Ic
    Parametros: 
    ----------------------------------------------------------------------------------
    Nota: Para la url de la conexión usar el driver compatible con SQL 5.5 o 8.0
    ----------------------------------------------------------------------------------
    Crecenciales de DB
     */
    public Connection openConnection() {

        try {
            //Como obtener la información desde un archivo properties
            String db_nam = cut.obtenerClave("nombreBD");
            String use = cut.obtenerClave("user");
            String pas = cut.obtenerClave("password");
            //For MySql 5.5
            //Class.forName("com.mysql.jdbc.Driver");
            //For MySql 8.0
            Class.forName("com.mysql.cj.jdbc.Driver");
            Conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + db_nam + "?zeroDateTimeBehavior=convertToNull&serverTimezone=UTC", use, pas);
            System.out.println("Se ha iniciado la conexión con el servidor de forma exitosa");
        } catch (ClassNotFoundException | SQLException | IOException ex) {
            Logger.getLogger(ControladorBaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Conexion;
    }

    /*  ----------------------------------------------------------------------------------
    Nombre: Clase closeConnection
    Función: Cierra La Conexión con la BD
    Aut@r: José Luis Caamal Ic
    Parametros: 
    ----------------------------------------------------------------------------------
     */
    public void closeConnection() {
        try {
            Conexion.close();
            System.out.println("Se ha finalizado la conexión con el servidor");
        } catch (SQLException ex) {
            Logger.getLogger(ControladorBaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /*Nombre: Clase Guardar Usuarios
    Función:Inserta los usuarios a la tabla_usuarios
    Aut@r: José Luis Caamal Ic
    Parametros: */
    public int guardarUsuarios(TablaUsuario usuario) {
        int validacionExitosa = 1;

        try {
            String Query = "INSERT INTO  tabla_usuario VALUES(default,"
                    + "\"" + usuario.getName() + "\", "
                    + "\"" + usuario.getUsername() + "\", "
                    + "\"" + usuario.getPassword() + "\", "
                    + "\"" + usuario.getCreated_at() + "\", "
                    + "\"" + usuario.getUpdate_at() + "\")";
            //Inica el statement de la conexión
            System.out.println(Query);
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
            //JOptionPane.showMessageDialog(null, "Datos almacenados de forma exitosa");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            //JOptionPane.showMessageDialog(null, "Error en el almacenamiento de datos");
            Logger.getLogger(ControladorBaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
            validacionExitosa = 0;
        }
        return validacionExitosa;
    }

    /*Nombre: Clase Consulta Usuario Valido
    Función:Consulta el usuario y lo valida
    Aut@r: José Luis Caamal Ic
    Parametros: */
    public TablaUsuario obtenerUsuario(TablaUsuario tbu) {
        TablaUsuario tbuAux = new TablaUsuario();
        String Query = "SELECT * FROM tabla_usuario WHERE username = '" + tbu.getUsername() + "' and password = '" + tbu.getPassword() + "'";
        System.out.println(Query);
        try {
            Statement st;
            st = Conexion.createStatement();
            java.sql.ResultSet resultSet;
            resultSet = st.executeQuery(Query);
            while (resultSet.next()) {
                tbuAux.setUsername(resultSet.getString("username"));
                tbuAux.setPassword(resultSet.getString("password"));
                tbuAux.setId(resultSet.getInt("id"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorBaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }

        return tbuAux;
    }

    /*Nombre: Clase crearMulta
    Función: Crea las multas a los automovilistas
    Aut@r: José Luis Caamal Ic
    Parametros: */
    public int crearMulta(TablaMultas tm) {
        int operacionExitosa = 0;
        try {
            String Query = "INSERT INTO  tabla_multas VALUES("
                    + "\"" + tm.getId() + "\", "
                    + "\"" + tm.getNombre() + "\", "
                    + "\"" + tm.getConcepto_pago() + "\", "
                    + "\"" + tm.getPrecio() + "\", "
                    + "\"" + tm.getCreated_by() + "\", "
                    + "\"" + tm.getCreated_at() + "\","
                    + "\"" + tm.getUpdated_at() + "\")";
            //Inica el statement de la conexión
            System.out.println(Query);
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
            operacionExitosa = 1;
            //JOptionPane.showMessageDialog(null, "Datos almacenados de forma exitosa");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            //JOptionPane.showMessageDialog(null, "Error en el almacenamiento de datos");
            Logger.getLogger(ControladorBaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
            operacionExitosa = 0;
        }

        return operacionExitosa;
    }

    /*Nombre: Clase actualizaMulta
    Función: Actualiza las multas a los automovilistas
    Aut@r: José Luis Caamal Ic
    Parametros: */
    public int actualizaMulta(TablaMultas tm) {
        int operacionExitosa = 0;
        try {
            //Inica el statement de la conexión
            String Query = ("UPDATE tabla_multas "
                    + "SET "
                    + "nombre = '" + tm.getNombre() + "', "
                    + "precio = '" + tm.getPrecio() + "' "
                    + "WHERE id = '" + tm.getId() + "'");
            System.out.println(Query);
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
            operacionExitosa = 1;
            //JOptionPane.showMessageDialog(null, "Datos almacenados de forma exitosa");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            //JOptionPane.showMessageDialog(null, "Error en el almacenamiento de datos");
            Logger.getLogger(ControladorBaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
            operacionExitosa = 0;
        }

        return operacionExitosa;
    }

    /*Nombre: Clase Consulta Multa
    Función:Consulta la multa y la valida
    Aut@r: José Luis Caamal Ic
    Parametros: */
    public TablaMultas obtenerMulta(TablaMultas tm) {
        TablaMultas tmAux = new TablaMultas();
        String Query = "SELECT * FROM tabla_usuario WHERE id = '" + tm.getId() + "'";
        System.out.println(Query);
        try {
            Statement st;
            st = Conexion.createStatement();
            java.sql.ResultSet resultSet;
            resultSet = st.executeQuery(Query);
            while (resultSet.next()) {
                tmAux.setId(resultSet.getInt("id"));
                tmAux.setNombre(resultSet.getString("nombre"));
                tmAux.setPrecio(resultSet.getString("precio"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorBaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tmAux;
    }

    /*Nombre: Clase modeloMultas
    Función: Obtiene el modelo de las multas y las pinta en la tabla
    Aut@r: José Luis Caamal Ic
    Parametros: */

    public DefaultTableModel modeloMultas(String columna[]) {
        DefaultTableModel modeloRetorno;
        modeloRetorno = new DefaultTableModel(null, columna);
        try {
            String Query = "SELECT * FROM tabla_multas";

            System.out.println("Contenido en ejecución: " + Query);

            PreparedStatement us = Conexion.prepareStatement(Query);
            ResultSet res = us.executeQuery();
            Object objDatos[] = new Object[columna.length]; //Siempre debe cconexoincidir con el numero de columnas!

            while (res.next()) {
                for (int i = 0; i < columna.length; i++) {
                    objDatos[i] = res.getObject(i + 1);
                    //System.out.println(objDatos[i]);
                }
                modeloRetorno.addRow(objDatos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorBaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.toString());
        }

        return modeloRetorno;
    }

    /*Nombre: Clase Consulta Numero Factura
    Función:Consulta el actual numero Factura
    Aut@r: José Luis Caamal Ic
    Parametros: */
    public int obtenerNumeroFactura() {
        int total = 0;
        String Query = "SELECT count(*) as total FROM tabla_multas_generadas";
        System.out.println(Query);
        try {
            Statement st;
            st = Conexion.createStatement();
            java.sql.ResultSet resultSet;
            resultSet = st.executeQuery(Query);
            while (resultSet.next()) {
                total = resultSet.getInt("total");
                total = total + 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorBaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }

//    Función: Inserta a la base de datos un nuevo formato de multa.
//    Aut@r: Ángel González Rincón  
    public int formatoMulta(TablaMultasGeneradas tmg) {
        int operacionExitosa = 0;
        try {
            String Query = "INSERT INTO  tabla_multas_generadas VALUES("
                    + "\"" + tmg.getId()+ "\", "
                    + "\"" + tmg.getFolio()+ "\", "
                    + "\"" + tmg.getNombres()+ "\", "
                    + "\"" + tmg.getApellido_pat()+ "\", "
                    + "\"" + tmg.getApellido_mat()+ "\", "
                    + "\"" + tmg.getDomicilio()+ "\","
                    + "\"" + tmg.getPlaca_vehiculo()+ "\","
                    + "\"" + tmg.getMarca_vehiculo()+ "\","
                    + "\"" + tmg.getNserie_vehiculo()+ "\","
                    + "\"" + tmg.getModelo_vehiculo()+ "\","
                    + "\"" + tmg.getLimite_pago()+ "\","
                    + "\"" + tmg.getCreated_by()+ "\","
                    + "\"" + tmg.getCreated_at()+ "\","
                    + "\"" + tmg.getUpdated_at()+ "\","
                    + "\"" + tmg.getId_multa()+ "\")";
            //Inica el statement de la conexión
            System.out.println(Query);
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
            operacionExitosa = 1;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(ControladorBaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
            operacionExitosa = 0;
        }
        return operacionExitosa;
    }
    
    /*Nombre: Clase crearLicenciaGenerada
    Función: Crea las licencias nuevas para los automovilistas
    Aut@r: José Luis Caamal Ic
    Parametros: */
    public int crearLicenciaGenerada(TablaLicenciaGenerada tlg) {
        int operacionExitosa = 0;
        try {
            String Query = "INSERT INTO  tabla_licencia_generada VALUES("
                    + "default, "
                    + "\"" + tlg.getNombres()+ "\", "
                    + "\"" + tlg.getApellido_pat()+ "\", "
                    + "\"" + tlg.getApellido_mat()+ "\", "
                    + "\"" + tlg.getEdad() + "\", "
                    + "\"" + tlg.getDomicilio()+ "\","
                    + "\"" + tlg.getFecha_nac()+ "\","
                    + "\"" + tlg.getCp()+ "\","
                    + "\"" + tlg.getLugar()+ "\","
                    + "\"" + tlg.getCelular()+ "\","
                    + "\"" + tlg.getCrated_by()+ "\","
                    + "\"" + tlg.getCreated_at()+ "\","
                    + "\"" + tlg.getUpdated_at()+ "\","
                    + "\"" + tlg.getId_tipo_licencia()+ "\")";
            //Inica el statement de la conexión
            System.out.println(Query);
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
            operacionExitosa = 1;
            //JOptionPane.showMessageDialog(null, "Datos almacenados de forma exitosa");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            //JOptionPane.showMessageDialog(null, "Error en el almacenamiento de datos");
            Logger.getLogger(ControladorBaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
            operacionExitosa = 0;
        }

        return operacionExitosa;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.TablaLicenciaGenerada;
import Modelo.TablaMultas;
import Modelo.TablaMultasGeneradas;
import Modelo.TablaPropietario;
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
    
    /*Nombre: Clase crearVehiculoPropietario
    Función: Crea los vehiculos y sus placas nuevas para los automovilistas
    Aut@r: José Luis Caamal Ic
    Parametros: */
    public int crearVehiculoPropietario(TablaPropietario tp) {
        int operacionExitosa = 0;
        try {
            String Query = "INSERT INTO  tabla_propietario VALUES("
                    + "default, "
                    + "\"" + tp.getNombres()+ "\", "
                    + "\"" + tp.getApellido_pat()+ "\", "
                    + "\"" + tp.getApellido_mat()+ "\", "
                    + "\"" + tp.getSexo()+ "\", "
                    + "\"" + tp.getEdad() + "\", "
                    + "\"" + tp.getDomicilio()+ "\","
                    + "\"" + tp.getLugar()+ "\","
                    + "\"" + tp.getMarca()+ "\","
                    + "\"" + tp.getModelo()+ "\","
                    + "\"" + tp.getSerie()+ "\","
                    + "\"" + tp.getAge()+ "\","
                    + "\"" + tp.getTenencia()+ "\","
                    + "\"" + tp.getPlacas()+ "\", "
                    + "\"" + tp.getTransmision()+ "\", "
                    + "\"" + tp.getFecha()+ "\", "
                    + "\"" + tp.getCreated_by()+ "\","
                    + "\"" + tp.getUpdated_by()+ "\","
                    + "\"" + tp.getCreated_at()+ "\","
                    + "\"" + tp.getUpdated_at()+ "\")";
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
    
    
    /*Nombre: Clase modeloVehiculoPropietario
    Función: Obtiene el modelo de los vehiculos y propietarios y las pinta en la tabla
    Aut@r: José Luis Caamal Ic
    Parametros: */

    public DefaultTableModel modeloVehiculoPropietario(String columna[]) {
        DefaultTableModel modeloRetorno;
        modeloRetorno = new DefaultTableModel(null, columna);
        try {
            String Query = "SELECT id,nombres,apellido_pat,apellido_mat,marca,modelo,placas,created_by,created_at FROM tabla_propietario";
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
    
     /*Nombre: Clase Consulta obtenerVehiculoPropietario
    Función:Consulta la tabla propietario y la valida
    Aut@r: José Luis Caamal Ic
    Parametros: */
    public TablaPropietario obtenerVehiculoPropietario(int id) {
        TablaPropietario tpAux = new TablaPropietario();
        String Query = "SELECT * FROM tabla_propietario WHERE id = '" + id + "'";
        System.out.println(Query);
        try {
            Statement st;
            st = Conexion.createStatement();
            java.sql.ResultSet resultSet;
            resultSet = st.executeQuery(Query);
            while (resultSet.next()) {
                tpAux.setId(resultSet.getInt("id"));
                tpAux.setNombres(resultSet.getString("nombres"));
                tpAux.setApellido_pat(resultSet.getString("apellido_pat"));
                tpAux.setApellido_mat(resultSet.getString("apellido_mat"));
                tpAux.setSexo(resultSet.getString("sexo"));
                tpAux.setEdad(resultSet.getString("edad"));
                tpAux.setDomicilio(resultSet.getString("domicilio"));
                tpAux.setLugar(resultSet.getString("lugar"));
                tpAux.setMarca(resultSet.getString("marca"));
                tpAux.setModelo(resultSet.getString("modelo"));
                tpAux.setSerie(resultSet.getString("serie"));
                tpAux.setAge(resultSet.getString("age"));
                tpAux.setTenencia(resultSet.getString("tenencia"));
                tpAux.setPlacas(resultSet.getString("placas"));
                tpAux.setTransmision(resultSet.getString("transmision"));
                tpAux.setFecha(resultSet.getString("fecha"));
                tpAux.setCreated_by(resultSet.getString("created_by"));
                tpAux.setUpdated_by(resultSet.getString("updated_by"));
                tpAux.setCreated_at(resultSet.getTimestamp("created_at"));
                tpAux.setUpdated_at(resultSet.getTimestamp("updated_at"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorBaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tpAux;
    }
    
    /*  ----------------------------------------------------------------------------------
    Nombre: Clase updateDatosVehiculoPropietario
    Función: Actualiza los valores en la tabla correspondiente.
    Aut@r: José Luis Caamal Ic
    Parametros: Table: tabla_pacientes
                Columns:
    Date: 27/06/2020
    ----------------------------------------------------------------------------------
*/
    public int updateDatosVehiculoPropietario(TablaPropietario tbp) {
        try {
            //int response;
            String sql = ("UPDATE  tabla_propietario "
                    + "SET "
                    + "nombres = '" + tbp.getNombres() + "', "
                    + "apellido_pat = '" + tbp.getApellido_pat()+ "', "
                    + "apellido_mat = '" + tbp.getApellido_mat() + "', "
                    + "sexo = '" + tbp.getSexo()+ "', "
                    + "edad = '" + tbp.getEdad() + "', "
                    + "domicilio = '" + tbp.getDomicilio() + "', "
                    + "lugar = '" + tbp.getLugar()+ "', "
                    + "marca = '" + tbp.getMarca()+ "', "
                    + "modelo = '" + tbp.getModelo()+ "', "
                    + "serie = '" + tbp.getSerie()+ "', "
                    + "age = '" + tbp.getAge()+ "', "
                    + "tenencia = '" + tbp.getTenencia()+ "', "
                    + "placas = '" + tbp.getPlacas()+ "', "
                    + "transmision = '" + tbp.getTransmision()+ "', "
                    + "fecha = '" + tbp.getFecha()+ "', "
                    + "updated_by = '" + tbp.getUpdated_by()+ "', "
                    + "updated_at = '" + tbp.getUpdated_at()+ "' "
                    + "WHERE id = '"+tbp.getId()+"'");
            System.out.println("consulta updateDatosUsuario "+sql);
            Statement st = Conexion.createStatement();
            st.executeUpdate(sql);	
            //System.out.println(" Response: "+ response);
            //JOptionPane.showMessageDialog(null, "Datos almacenados de forma exitosa");
            return 1;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            //JOptionPane.showMessageDialog(null, "Error en el almacenamiento de datos");
            Logger.getLogger(ControladorBaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    /*  ----------------------------------------------------------------------------------
    Nombre: Clase eliminarFila
    Función: Elimina los valores en la tabla correspondiente.
    Aut@r: José Luis Caamal Ic
    Parametros: Table: tabla_pacientes
                Columns:
    Date: 27/06/2020
    ----------------------------------------------------------------------------------
*/

    public int eliminarFila( String ID) {
        int operacionExitosa = 0;
        try {
            String Query = "DELETE FROM tabla_propietario WHERE ID = \"" + ID + "\"";
            System.out.println("SQL Elimina: "+Query);
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
            operacionExitosa = 1;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(ControladorBaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
//            JOptionPane.showMessageDialog(null, "Error borrando el registro especificado");return 0;
            operacionExitosa = 0;
        }
        return operacionExitosa;
    }
    
    /*Nombre: Clase modeloVehiculoPropietario
    Función: Obtiene el modelo de los vehiculos y propietarios y las pinta en la tabla
    Aut@r: José Luis Caamal Ic
    Parametros: */

    public DefaultTableModel modeloVehiculoPropietarioBusqueda(String columna[], String campoBusqueda) {
        DefaultTableModel modeloRetorno;
        modeloRetorno = new DefaultTableModel(null, columna);
        try {
            String Query = "SELECT id,nombres,apellido_pat,apellido_mat,marca,modelo,placas,created_by,created_at FROM tabla_propietario "
                    + "where nombres like '%" +campoBusqueda+"%' or id like '%" +campoBusqueda+"%' or placas like '%" +campoBusqueda+"%' or marca like '%" +campoBusqueda+"%' "
                    + "or modelo like '%" +campoBusqueda+"%' or apellido_pat like '%" +campoBusqueda+"%'  or apellido_mat like '%" +campoBusqueda+"%'";
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
    
    /*Nombre: Clase Consulta obtenerNFacturaLicencia
    Función:Consulta la tabla propietario y la obtiene la ultima factura
    Aut@r: José Luis Caamal Ic
    Parametros: 
    date: 26/10/2021*/
    public int obtenerNFacturaLicencia() {
        int tpAux = 0;
        String Query = "SELECT max(id) as idmax FROM tabla_licencia_generada";
        System.out.println(Query);
        try {
            Statement st;
            st = Conexion.createStatement();
            java.sql.ResultSet resultSet;
            resultSet = st.executeQuery(Query);
            while (resultSet.next()) {
                tpAux = resultSet.getInt("idmax");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorBaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tpAux;
    }

}

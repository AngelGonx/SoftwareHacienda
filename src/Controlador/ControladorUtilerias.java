/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Properties;

/**
 *
 * @author joseluiscaamal
 */
public class ControladorUtilerias {
    /*
        Obtengo los parametros en la bd para evitar ir cambiando a cada rato la contraseña
        y asegurarnos que nadie pueda utilizarlo.
        Author: José Luis Caamal Ic
        Date: 07/05/2021
    */
    public String obtenerClave(String clave) throws FileNotFoundException, IOException{
        String respClave = "";
        Properties propiedades = new Properties();
        
        propiedades.load(new FileReader("src/Controlador/PropiedadesBaseDeDatos.properties"));
        //C:\Users\joseluis.caamal\Documents\GitProjects\SoftwareGasoValidaciones\src\Controlador\propiedades.properties
        respClave = propiedades.getProperty(clave);
        System.out.println("La clave especificada es: " +  respClave);
        return respClave;
    }
    
        
    /*
    Inicia:
    Se encripta la contraseña
    Nota: Siempre hay que obtener la validación desde aquí:
    @Author: Jose Caamal 27/06/2020
    */
    public String obtenerMD5(String input) {
       try {
                MessageDigest md = MessageDigest.getInstance("MD5");
                byte[] messageDigest = md.digest(input.getBytes());
                BigInteger number = new BigInteger(1, messageDigest);
                String hashtext = number.toString(16);

                while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
       return hashtext;
            }
       catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
       }
    }
    
    /*
    Formateo la fecha para recibirla y guardarla en MySQL
    @Author: Jose Caamal 15/07/2020
    */
    public String convertirFecha(Date fecha){
        SimpleDateFormat plantilla;
        //fecha = new java.util.Date();  
        plantilla = new SimpleDateFormat("yyyy/MM/dd H:mm:ss"); //Obtengo Horas y 
        String tiempo = plantilla.format(fecha);
        return tiempo;
    }
    //Formateo de fecha Ángel González
    public String convertirFechaDict(Date fecha){
        SimpleDateFormat plantilla;
        //fecha = new java.util.Date();  
        plantilla = new SimpleDateFormat("dd/MM/yyyy"); //Obtengo Horas y 
        String tiempo = plantilla.format(fecha);
        
        return tiempo;
    }

    public Date fechaFormato(String fecha)
    {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = new Date();
        try {
            fechaDate = formato.parse(fecha);
        } 
        catch (ParseException ex) 
        {
            System.out.println(ex);
        }
        return fechaDate;
    } 
}

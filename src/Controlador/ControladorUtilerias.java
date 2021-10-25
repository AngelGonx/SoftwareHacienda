/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Properties;
import javax.swing.JOptionPane;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFFooter;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
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
    
    /*
    Crea el tipo de documento contrato o solicitud
    Jose Luis Caamal Ic
    31/08/2020
    */
    public void creaDocContrato(/*String name,
            String nameSalida,
            String carpetaSalida,
            String direccion, */
            String[] datosPalabra,
            Object[] datosReemplazo, int tipoDocumento, String folioDocumento) 
            throws InvalidFormatException, IOException{
        
        /*El nombre de la carpeta de salida debe ser fijo*/
        String carpetaSalida = "C:\\Formatos\\";
        
        File archivoFinalFormato = new File(carpetaSalida);
        if (archivoFinalFormato.mkdirs()) {//Se crea la carpeta
                System.out.println("Directorio C:\\Formatos\\ creado.");
        } else {
                System.out.println("Directorio C:\\Formatos\\ ya existe.");
        }    
        /*El nombre de la carpeta de salida debe ser fijo*/
        String nameSalida = ".docx"; //Pretendo recibir folio y fecha //06/08/2020
        String extensiónSalida = ".docx";
        //Direccion del machote en el proyecto
        String direccion = "src\\Controlador\\Formatos\\";
        //Nombre del documento que se usara para reemplazar
        String name = "Formato";
        if(tipoDocumento == 1)
            name = "FormatoMulta.docx";
        if(tipoDocumento == 2)
            name = "FormatoLicencia.docx";
        //Obtengo el machote para no afectar y crear una copia en la cual se va trabajar
        System.out.println(direccion+name);
        XWPFDocument doc = new XWPFDocument(OPCPackage.open(direccion+name));
        //XWPFDocument docTempAux = doc;
        //String nameCarpeta =
        //Folio´+ "-"+(String) datosReemplazo[0];
        nameSalida = folioDocumento+"-"+tipoDocumento; //Genera el nombre único
        carpetaSalida = carpetaSalida+"\\"+folioDocumento+"\\"; //Creo la carpeta
        nameSalida = nameSalida + extensiónSalida;
        
        File archivoFinal = new File(carpetaSalida);
//        
//        if (!archivoFinal.exists()) {
            if (archivoFinal.mkdirs()) {//Se crea la carpeta
                System.out.println("Directorio "+carpetaSalida+" creado.");
            } else {
                System.out.println("Directorio "+carpetaSalida+" ya existe.");
            }
                
                FileOutputStream salida = new FileOutputStream(carpetaSalida+nameSalida);
                doc.write(salida); //Copio el documento en la salida
                doc.close();
                System.out.println("Lo que escribí:"+carpetaSalida+nameSalida);
                salida.close();
                crearDocumentoContrato( datosPalabra,datosReemplazo, carpetaSalida, nameSalida, tipoDocumento);
//                if(tipoDocumento == 4) //Crea el documento solo si es igual a 4.
//                    crearDictamenBomba(carpetaSalida, folioDocumento, tipoDocumento,datosReemplazo);
//                System.out.println("Error al crear directorio");
//                crearDocumentoContrato( datosPalabra,datosReemplazo, carpetaSalida, nameSalida, tipoDocumento);
            
//        }
//        else{
//            int dialogButton = JOptionPane.YES_NO_OPTION;
//            JOptionPane.showMessageDialog(null,"El directorio ya existe, verifica en la siguiente dirección: "+carpetaSalida);
//            int dialogResult = JOptionPane.showConfirmDialog (null, "¿Desea abrir el archivo generado?","Warning",dialogButton);
//            if(dialogResult == JOptionPane.YES_OPTION){
//              // Saving code here
//              nameSalida = lbtc.tipoDocumentoGenerar(tipoDocumento, nameSalida);
//              lbtc.openWord(carpetaSalida+nameSalida);
//            }
//        }
    }
    
    public void crearDocumentoContrato(String[] datosPalabra,
            Object[] datosReemplazo, String direccion, String nameArchive, int tipoDoc) 
            throws InvalidFormatException, IOException{
   
         //Obtengo el documento creado para no afectar el de la raíz
        //doc = new XWPFDocument(OPCPackage.open(direccion+name));
        XWPFDocument doc = new XWPFDocument(OPCPackage.open(direccion+nameArchive));
        System.out.println(doc.toString());
        for(int i = 0;i<datosReemplazo.length; i++ ){
//            if(datosReemplazo[i].equals("")||datosReemplazo[i]==null){
//                datosReemplazo[i] = "";
//            }
            for (XWPFParagraph p : doc.getParagraphs()) {
                List<XWPFRun> runs = p.getRuns();
                if (runs != null) {
                    for (XWPFRun r : runs) {
                        String text = r.getText(0);
                        System.out.println(text);
                        System.out.println(datosPalabra[i]);
                        System.out.println(datosReemplazo[i]);
                        if (text != null && text.contains(datosPalabra[i])) {
                            text = text.replace(datosPalabra[i], (String) datosReemplazo[i]);
                            r.setText(text, 0);
                            r.setBold(r.isBold());
                        }
                    }
                }
            }
            for (XWPFTable tbl : doc.getTables()) {
               for (XWPFTableRow row : tbl.getRows()) {
                  for (XWPFTableCell cell : row.getTableCells()) {
                     for (XWPFParagraph p : cell.getParagraphs()) {
                        for (XWPFRun r : p.getRuns()) {
                          String text = r.getText(0);
                          if (text != null && text.contains(datosPalabra[i])) {
                            text = text.replace(datosPalabra[i], (String) datosReemplazo[i]);
                            r.setText(text,0);
                            r.setBold(true);
                          }
                        }
                     }
                  }
               }
            }
//            doc.write(new FileOutputStream(direccion+nameArchive));
//            doc.close();
            
        }
        
//            FileOutputStream salida = new FileOutputStream(direccion+nameArchive);
//            System.out.println("Lo que escribí:"+direccion+nameArchive);
//            doc.write(salida);
//            doc.close();
//            salida.close();
           String nombreNuevo = "";
            if(tipoDoc == 1)
                nombreNuevo = "FormatoMulta"+nameArchive+".docx";
            if(tipoDoc == 2)
                nombreNuevo = "FormatoLicencia"+nameArchive+".docx";
            try (FileOutputStream fileOut = new FileOutputStream(direccion+nombreNuevo)) {
                doc.write(fileOut);
                doc.close();
            }
            //Files.delete(Paths.get(direccion+nameArchive));
            //Files.move(Paths.get(direccion+nameArchive+".docx"), Paths.get(direccion+nameArchive+".docx"));
            if(tipoDoc != 4 && tipoDoc != 3){ //Evita abrir los archivos de bombas 14/07/2021
                int dialogButton = JOptionPane.YES_NO_OPTION;
                JOptionPane.showMessageDialog(null,"El archivo se creo con éxito en la siguiente dirección: "+direccion+nombreNuevo);
                int dialogResult = JOptionPane.showConfirmDialog (null, "¿Desea abrir el archivo generado?","Warning",dialogButton);
                if(dialogResult == JOptionPane.YES_OPTION){
                  // Saving code here
                  //nameArchive archivoGenerado sin permiso :v
                  int elimine = deleteDocumento(direccion+nameArchive);
                  if(elimine == 1){
                    openWord(direccion+nombreNuevo);
                  }
                  else{
                      System.out.println("La dirección:"+direccion+nameArchive+". No Existe.");
                  }
                }else{
                    System.out.println("Independientemente de la documentación, se eliminan los archivos extras.");
                    //lbtc.deleteDocumento(direccion+nameArchive);
                }
            }
            deleteDocumento(direccion+nameArchive);
//            direccion_local = direccion;
    
    }
    
    //Elimina el archivo deseado en la dirección deseada
    //@direccionArchivo C:/Formatos
    //@Jose Luis Caamal Ic
    public int deleteDocumento(String direccionArchivo){
     int valida = 0;
        try {
               //File objetofile = new File (direccionArchivo);
               Files.delete(Paths.get(direccionArchivo));
               //Desktop.getDesktop().open(objetofile);
               valida = 1;
        }catch (IOException ex) {

               System.out.println(ex);
               valida = 0;
        }
       return valida;
    }
    
            //Abre el archivo deseado en la dirección deseada
    //@direccionArchivo C:/Formatos
    //@Jose Luis Caamal Ic
    public void openWord(String direccionArchivo){

     try {

            File objetofile = new File (direccionArchivo);
            Desktop.getDesktop().open(objetofile);

     }catch (IOException ex) {

            System.out.println(ex);

     }

    }
}

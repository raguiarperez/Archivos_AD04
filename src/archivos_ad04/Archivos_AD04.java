/*
4)crear o directorio 'subdir'  na ruta '/home/oracle/NetBeansProjects/arquivos/arquivosdir/' 
creada anteriormente crear o arquivo Products2.txt no directorio mencionado anteriormente (subdir) sempre e cando dito arquivo non exista. 
 */
package archivos_ad04;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author dam2
 */
public class Archivos_AD04 {

   public static void crearDirFile () throws IOException {
        
        File archivo;
        archivo = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir/subdir/Products2.txt");
        
        File direcotrio = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir/subdir");
       
        if (!direcotrio.exists()){
            
            direcotrio.mkdirs();
            archivo.createNewFile(); 
        }
        else if(!archivo.exists()){
            archivo.createNewFile();
        }
    }
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        Archivos_AD04.crearDirFile();
    }
}

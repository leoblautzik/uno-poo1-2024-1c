package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo {

    public static void main (String [] arg) {
        File f = null;
    	FileReader fr = null;
        BufferedReader br = null;

        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            f = new File("./carpetita/archivo.txt");
        	fr = new FileReader (f);
            br = new BufferedReader(fr);
            // Lectura del fichero
            String linea = br.readLine();
            while((linea != null)){
                System.out.println(linea);
                linea = br.readLine();
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }finally{
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try{                    
                if(fr != null){   
                    fr.close();     
                }                  
            }catch (Exception e2){ 
                e2.printStackTrace();
            }
        }
    }
}

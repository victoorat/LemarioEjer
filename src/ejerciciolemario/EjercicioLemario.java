/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciolemario;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author victoranovertrujillo
 */
public class EjercicioLemario {

    public void cargaFicheroLemario(){
        File fichero = new File("src/ejerciciolemario/lemario-20101017.txt");
        try {
        FileReader fr = new FileReader(fichero);
        BufferedReader br = new BufferedReader(fr);
        String linea;
        int cont =0;
        java.util.Scanner scanner = new Scanner(System.in);
        
        System.out.println("introduce Palabra");
        String pasa = scanner.next();
        
        
        while ((linea = br.readLine()) != null){ //lee una linea del archivo
            if(linea.indexOf(pasa) !=-1){
                System.out.println("se encontró la palabra" + linea);
            }
            //System.out.println(linea);
            
    } 
        }
        catch (FileNotFoundException ex){
            Logger.getLogger(EjercicioLemario.class.getName()).log(Level.SEVERE, null, ex);
    
}       catch (IOException ex) {
            Logger.getLogger(EjercicioLemario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     *  @param args the command line arguments
     */
    public static void main(String[] args) {
        new EjercicioLemario().cargaFicheroLemario();
    }
    
}

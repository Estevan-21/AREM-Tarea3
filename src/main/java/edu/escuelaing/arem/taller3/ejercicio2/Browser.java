/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.taller3.ejercicio2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 *
 * @author estudiante
 */
public class Browser {
    public static URL site;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        System.out.println("Por favor ingrese la url ");
        String url = br.readLine();
        site = new URL(url);           
        browser();      
    }
    
    public static void browser() throws IOException{        
        try (BufferedReader reader= new BufferedReader(new InputStreamReader(site.openStream()))) {
        String inputLine = null;
        String data="";
        while ((inputLine = reader.readLine()) != null) {          
            data+=inputLine;
            System.out.println(inputLine);
        }    
        write(data);
        } catch (IOException x) {
            System.err.println(x);
        }                
    }
        
    public static void write(String data) throws IOException{        
        File fichero = new File("resultado.html");
        BufferedWriter bw = new BufferedWriter(new FileWriter("resultado.html"));
        bw.write(data);
        bw.close();
    }
    
    
}

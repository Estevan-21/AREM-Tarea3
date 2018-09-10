/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.taller3.ejercicio451;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 *
 * @author estevan
 */
public class Client {
    
     public static void main(String[] args) throws Exception {
                        
        /**
        * Lee la primera pagina del web server donde se insertarían los números        
        */
        URL url1 = new URL("https://shrouded-island-73032.herokuapp.com/index.html");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(url1.openStream()))) {

            String inputLine = null;
            while ((inputLine = reader.readLine()) != null) {
                System.out.println(inputLine);            
            }   
        } catch (IOException x) {
            System.err.println(x);
        }
        
        
        /**
        * Lee la segunda pagina del web server con un ejemplo de haber insertado la lista que contiene los números 1 2 3  
        */        
        URL url2 = new URL("https://fast-hamlet-11078.herokuapp.com/results?num=1+2+3");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(url2.openStream()))) {

            String inputLine = null;
            while ((inputLine = reader.readLine()) != null) {
                System.out.println(inputLine);            
            }   
        } catch (IOException x) {
            System.err.println(x);
        }
}
    
}

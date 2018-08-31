package edu.escuelaing.arem.taller3.ejercicio1;

import java.net.MalformedURLException;
import java.net.URL;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author estudiante
 */
public class MetodosUrl {  
        
    
    public static void main(String[] args) throws Exception {     
        URL site = new URL("http://Ejercicio1.escuelaing.edu.co:80/24/08/18/index.html?x=20&y=3");         
        System.out.println("Protocol: "+site.getProtocol());
        System.out.println("Atority "+site.getAuthority());        
        System.out.println("Host: "+site.getHost());
        System.out.println("Port: "+site.getPort());
        System.out.println("Path: "+site.getPath());
        System.out.println("Query: "+site.getQuery());
        System.out.println("File: "+site.getFile());
        System.out.println("Ref: "+site.getRef());
    }
    
    
    
}

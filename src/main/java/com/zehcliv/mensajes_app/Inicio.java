/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zehcliv.mensajes_app;

import java.sql.Connection;
import java.util.Scanner;

/**
 *
 * @author JHEYSHON
 */
public class Inicio {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        
        do{
            System.out.println("------------------------");
            System.out.println(" Aplicacion de mensajes");
            System.out.println(" 1. crear mensaje");
            System.out.println(" 2. listar mensajes");
            System.out.println(" 3. editar mensaje");
            System.out.println(" 4. eliminar mensaje");
            System.out.println(" 5. salir");
            //leemos la opcion del usuario
            opcion=sc.nextInt();
            
        }while(opcion!=5);
               
    }
}

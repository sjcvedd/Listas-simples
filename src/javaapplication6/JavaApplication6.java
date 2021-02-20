/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Scanner;

class Nodo {
    String nombre,cedula, apellido,estadoCivil;
    int edad;
    Nodo siguiente;
    
    Nodo(String nombre,String cedula, String apellido, String estadoCivil, int edad){
        this.nombre=nombre;
        this.apellido=apellido;
        this.cedula=cedula;
        this.estadoCivil = estadoCivil;
        this.edad = edad;
    }
}

class listaSimple{
    Nodo L, aux;
    void ingresar(String nombre,String cedula, String apellido, String estadoCivil, int edad){
        if (L == null) {
            L = new Nodo(nombre,cedula, apellido, estadoCivil, edad);
        }else{
            aux = L;
            while (aux.siguiente != null)
                aux = aux.siguiente;
            aux.siguiente = new Nodo(nombre,cedula, apellido, estadoCivil, edad);
        }
    }
}

public class JavaApplication6 {
    public static void main(String[] args) {
        listaSimple li = new listaSimple();
        Scanner scan = new Scanner(System.in);
        int resp= 1;
        String nombre, apellido, cedula, estadoCivil;
        int edad;
        while (resp != 0){
            System.out.println("ingrese el nombre: ");
            nombre = scan.nextLine();
            System.out.println("ingrese el apellido: ");
            apellido = scan.nextLine();
            System.out.println("ingrese el cedula: ");
            cedula = scan.nextLine();
            System.out.println("ingrese el estadoCivil: ");
            estadoCivil = scan.nextLine();
            System.out.println("ingrese el edad: ");
            edad = scan.nextInt();
            li.ingresar(nombre, cedula, apellido, estadoCivil, edad);
            System.out.println("Si desea terminar ingrese 0: ");
            resp = scan.nextInt();
        }
        System.out.println("");
    }
    
}

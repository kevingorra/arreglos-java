package org.example;

import clases.Escuderia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Escuderia[] escuderias = new Escuderia[10];
        int[] numeros= new int[10];
        String[] nombres=new String[5];

        Scanner lea =new Scanner(System.in);


        for(int i=0; i < nombres.length;i++){

            System.out.println("Digite el nombre"+(i+1));
            nombres[i]= lea.next();
        }for(int i=0; i < nombres.length;i++){
            System.out.println(nombres[i]);
        }




    }
}
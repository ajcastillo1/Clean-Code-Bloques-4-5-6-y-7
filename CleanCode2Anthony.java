/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cleancode2anthony;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author alumnom
 */
public class CleanCode2Anthony {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nombre;
        String color;
        double base;
        double altura;
        
        //Pedir datos y manejo de errorestr
        try {
        System.out.println("Introduce el nombre de la figura triangular");
        nombre = scan.nextLine();
        System.out.println("Introduce el color de la figura triangular");
        color = scan.nextLine();
        System.out.println("Introduce la base de la figura triangular");
        base = scan.nextDouble();
        System.out.println("Introduce la altura de la figura triangular");
        altura = scan.nextDouble();
        OperacionesFigura triangulo1 = new Triangulo(nombre, color, base, altura);
        OperacionesFigura triangulo2 = new Triangulo("Triangulo", "rojo", 10.0, 2.0);

        List<OperacionesFigura> listaTriangulos = new ArrayList<>();
        listaTriangulos.add(triangulo1);
        listaTriangulos.add(triangulo2);

        System.out.println("--------------------------------");
        calcularArea(listaTriangulos);
        
        
        }catch (InputMismatchException ex){
            System.out.println("El valor introducido no es correcto");
        }
        
        

        

    }

        public static void calcularArea(List<OperacionesFigura> listaOperacionesFiguras) {
        for (OperacionesFigura triangulo : listaOperacionesFiguras) {
        System.out.println("Area es:  " + triangulo.calcularArea());
        System.out.println("Nombre es: " + triangulo.figura().getNombre());
        System.out.println("Color es: " + triangulo.figura().getColor());
        }
         
     }
}
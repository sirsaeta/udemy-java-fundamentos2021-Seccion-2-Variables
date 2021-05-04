package com.udemy.java.fundamentos.variables;

public class Main {

    public static void main(String[] args) {
        //Definimos la variable
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);

        double miVariableFlotante = 10.2;
        System.out.println(miVariableFlotante);
        //Modificamos el valor de la variable
        miVariableEntera = 5;
        System.out.println(miVariableEntera);
        System.out.println(miVariableEntera+miVariableFlotante);

        String miVariableString = "Saludos Saeta";
        System.out.println(miVariableString);
        System.out.println(miVariableString+miVariableEntera);
        miVariableString = "Adios Saeta";
        System.out.println(miVariableString);

        //var - Inferencia de tipos en java
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);
        var miVariableCadena2 = "Nueva Cadena";
        System.out.println(miVariableCadena2);
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
    }
}

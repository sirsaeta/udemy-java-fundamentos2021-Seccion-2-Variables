package com.udemy.java.fundamentos.variables;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Variables();
        Inferencia();
        NameVar();
        ConcatenateCharacters();
        ReservedWords();
        SpecialCharacter();
        ScannerVar();
    }

    public static void Variables() {
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
    }

    public static void Inferencia() {
        //var - Inferencia de tipos en java
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);
        var miVariableCadena2 = "Nueva Cadena";
        System.out.println(miVariableCadena2);
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
    }

    public static void NameVar() {
        //Valores permitidos en el nombre de variables
        var miVariable = 1;
        var _miVariable = 1;
        var $miVariable = 1;
        //var áVariable = 1;// no se recomienda utilizar pero se puede
        //var #miVariable = 1; no se puede utilizar caracteres especiales
        // var 1miVariable = 1; no se permite iniciar con numero
        System.out.println("miVariable = " + miVariable);
        System.out.println("_miVariable = " + _miVariable);
        System.out.println("$miVariable = " + $miVariable);
    }

    public static void ConcatenateCharacters() {
        //Concatenar caracteres
        var nombre = "Juan";
        var titulo = "Ingeniero";
        var union = titulo + " " + nombre;
        System.out.println("union = " + union);
        var i = 3;
        var j = 4;
        System.out.println(i + j);//se realiza la suma de numeros
        System.out.println(i + j + nombre);//primero realiza la suma por estar a la izquierda y luego concatena
    }

    public static void ReservedWords() {
        var usuario = "Juan";
        var i = 3;
        var j = 4;
        //Cuidado con las palabras reservadas
        System.out.println(usuario + i + j);//si la primera es una cadena el resto
        System.out.println(usuario + (i + j));//los parentesis modifica la prioridad primero sumando y luego concatena
    }

    public static void SpecialCharacter() {
        //Caracteres especiales
        var nombre = "Karla";
        System.out.println("Nueva Linea: \n" + nombre);
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("Retroceso: \b" + nombre);
        System.out.println("Retroceso: \b\b" + nombre);
        System.out.println("Comilla simple: '" + nombre + "'");
        System.out.println("Comilla doble: \"" + nombre + "\"");
    }

    public static void ScannerVar() {
        System.out.println("Escribe tu nombre:");
        Scanner consola = new Scanner(System.in);
        var usuario = consola.nextLine();
        System.out.println("usuario = " + usuario);
        System.out.println("Escribe el titulo: ");
        var titulo = consola.nextLine();
        System.out.println("Resultado: " + titulo + " " + usuario);
    }
}

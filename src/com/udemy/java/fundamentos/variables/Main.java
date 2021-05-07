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

        //Valores permitidos en el nombre de variables
        //var miVariable = 1;
        //var _miVariable = 1;
        //var $miVariable = 1;
        //var áVariable = 1;// no se recomienda utilizar pero se puede
        //var #miVariable = 1; no se puede utilizar caracteres especiales
        // var 1miVariable = 1; no se permite iniciar con numero

        //Concatenar caracteres
        var usuario = "Juan";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);

        //Cuidado con las palabras reservadas
        var i = 3;
        var j = 4;
        System.out.println(i + j);//se realiza la suma de numeros
        System.out.println(i + j + usuario);//primero realiza la suma por estar a la izquierda y luego concatena
        System.out.println(usuario + i + j);//si la primera es una cadena el resto
        System.out.println(usuario + (i + j));//los parentesis modifica la prioridad primero sumando y luego concatena

        //Caracteres especiales
        var nombre = "Karla";
        System.out.println("Nueva Linea: \n" + nombre);
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("Retroceso: \b" + nombre);
        System.out.println("Retroceso: \b\b" + nombre);
        System.out.println("Comilla simple: '" + nombre + "'");
        System.out.println("Comilla doble: \"" + nombre + "\"");

    }
}

package org.example;
public class Primitivos {
    static void main(String[] args) {
        imprimirTiposPrimitivos();
    }

    private static void imprimirTiposPrimitivos () {
        //Inteiros
        byte a = -128;
        short b = 23887;
        int c = 2357;
        long d = 85839467;

        //Ponto Flutuante
        float e = 23.4f;
        double f = 23.465;

        //Character
        char g = 'A';

        //Boleano
        boolean h = true;

        //Printer
        System.out.println("byte: " + a);
        System.out.println("short: " + b);
        System.out.println("int: " + c);
        System.out.println("long: " + d);
        System.out.println("float: " + e);
        System.out.println("double: " + f);
        System.out.println("char: " + g);
        System.out.println("boolean: " + h);
    }
}

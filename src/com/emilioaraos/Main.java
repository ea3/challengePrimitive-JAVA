package com.emilioaraos;

public class Main {

    public static void main(String[] args) {
        byte byteVariable = 10;
        short shortVariable = 100;
        int integerVariable= 890;
        long longVariable = (50000 + (10*(byteVariable+ shortVariable+ integerVariable)));
        System.out.println("El Resultado es: "+ longVariable);
        //No need to cast, long accepts the other values.
    }
}

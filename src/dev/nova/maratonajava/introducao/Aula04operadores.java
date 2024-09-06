package dev.nova.maratonajava.introducao;

public class Aula04operadores {
    public static void main(String[] args) {
        // + - / * aritimeticos
        double num1 = 10;
        double num2 =20;
        double resultado = num2/num1;
        System.out.println(resultado);

        // % relacional
        double resto= num2%num1;
        System.out.println(resto);

        // < > <= >= == != lógicos

        boolean ismaior = num1 > num2;
        System.out.println(ismaior);

        // && (AND) || (or) !(not) loigco

        // = += -= *= /= %=
        //++ --
    }
}

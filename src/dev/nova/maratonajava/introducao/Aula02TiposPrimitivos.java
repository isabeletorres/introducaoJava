package dev.nova.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
            //int, double, float, char, byte, short, long e boolean
        int age = 10; //inteiro mas não muito grande
        long numeroGrande = 100000; // inteiro, porém, muito grande
        double salarioDouble = 2000; //decimal grande
        float salarioFloat = 2500.0F; // decimal, mas nao muito grande
        byte idadeByte = 10; //até 128
        short idadeShort = 10; //valores pequenos, mas não tão pequenos
        boolean verdadeiro = true;
        boolean Falso = false;
        char caractere = 'M'; //palavras, número etc..
        System.out.println("A idade é "+age);
    }
}

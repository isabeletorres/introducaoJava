package dev.nova.maratonajava.introducao;

public class Aula05condicionais {
    public static void main(String[] args) {
        int idade = 10;
        String categoria;

        if (idade<15){
            categoria = "CATEGORIA INFANTIL";
        } else if (idade>=15 && idade <18 ) {
            categoria = "CATEGORIA JUVENIL";
        } else {
            categoria = "CATEGORIA ADULTO";
        }
        System.out.println(categoria);
        //(condição) ? verdadeiro : falso
    }
}

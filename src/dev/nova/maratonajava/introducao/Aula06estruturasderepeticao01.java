package dev.nova.maratonajava.introducao;

public class Aula06estruturasderepeticao01 {
    public static void main(String[] args) {
        // while, do while e for
        int count = 0;
        while (count<10){
            count++;
            System.out.println(count);
        }

        count = 0;
        do{
            count++;
            System.out.println("Dentro do do-while"+ count);


        } while (count<10);

        for (int i=0;i<11; i++){
            System.out.println("for "+ i);
        }
    }
}

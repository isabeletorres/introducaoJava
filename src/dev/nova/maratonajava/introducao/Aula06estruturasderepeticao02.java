package dev.nova.maratonajava.introducao;

public class Aula06estruturasderepeticao02 {
    public static void main(String[] args) {
        int num = 8;
        for (int i=0; i<11; i++){
            int resul = num* i;
            System.out.println(num +" x "+ i + " = "+ resul);
        }
        int num2 = 4;
        int cont = 0;
        while (cont<11){
            int resul = num2* cont;
            System.out.println(num2 +" x "+ cont + " = "+ resul);
            cont++;
        }
        int num3 = 6;
        cont =0;
        do {
            int resul = num3* cont;
            System.out.println(num3 +" x "+ cont + " = "+ resul);
            cont++;
        } while (cont<11);
    }
}

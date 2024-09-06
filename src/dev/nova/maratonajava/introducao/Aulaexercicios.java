package dev.nova.maratonajava.introducao;

public class Aulaexercicios {
    public static void main(String[] args) {
        double salarioAnual =25000;
        double valorImpostos;

        if (salarioAnual< 34712){
            valorImpostos = salarioAnual * 0.097;
        } else if (salarioAnual>=34712 && salarioAnual<68507){
            valorImpostos = salarioAnual * 0.37;
        } else {
            valorImpostos = salarioAnual * 0.495;
        }
        System.out.println(valorImpostos);
    }
}

package exercicio03;

import org.w3c.dom.ls.LSOutput;

import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        DecimalFormat fm = new DecimalFormat("0.000");
        Scanner entrada = new Scanner(System.in);
        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto();

        System.out.println("Informe as coordenadas do ponto 1: ");
        p1.x = entrada.nextInt();
        p1.y = entrada.nextInt();
        System.out.println("Informe as coordenadas do ponto 2: ");
        p2.x = entrada.nextInt();
        p2.y = entrada.nextInt();

        //impressão da distância entre os dois pontos
        System.out.println();
        System.out.println("Distância de p1 para p2: " + fm.format(p1.calcularDist(p2)));
        System.out.println("Distância de p2 para p1: " + fm.format(p2.calcularDist(p1)));

        //impressão da distância de cada ponto até a origem
        System.out.println();
        System.out.println("Distância do p1 até a origem: " + fm.format(p1.calcularDistOrigem()));
        System.out.println("Distância do p2 até a origem: " + fm.format(p2.calcularDistOrigem()));

        //impressão do ponto que está mais próximo da origem
        System.out.println();
        Ponto aux = p1.retornarPontoMaisPróximo(p1, p2);
        System.out.println(aux.retornarFormato());
    }


}

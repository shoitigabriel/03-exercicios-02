package exercicio01;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Jogador jogador = new Jogador();

        System.out.print("Nome do jogador: ");
        jogador.nome = entrada.next();

for (int i = 0 ; i < jogador.pontuacao.length; i++){
        System.out.print("Pontuação na rodada "+(i+1) + ": ");
        jogador.pontuacao[i] = entrada.nextInt();
    }
        System.out.println();
        System.out.println("Nome do jogador: "+ jogador.nome);
        System.out.println("Pontuação total: "+ jogador.calcularPontuacao());
    }
    }

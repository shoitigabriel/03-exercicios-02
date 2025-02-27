package exercicio01;

public class Jogador {

    String nome;
    int[] pontuacao = new int[3];

public int calcularPontuacao(){
    int pontuacaoTotal=0;
    for(int i : pontuacao){
pontuacaoTotal+=i;
    }
    return pontuacaoTotal;
    }
}





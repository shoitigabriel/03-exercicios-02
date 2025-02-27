package exercicio03;

public class Ponto {

    int x;
    int y;

    public double calcularDist(Ponto p){
        double distancia;
        distancia = Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
        return distancia;
    }

    public double calcularDistOrigem(){
        double distancia;
        Ponto origem = new Ponto();
        //origem.x = 0;
        //origem.y = 0;
        distancia = calcularDist(origem);
        return distancia;
        //return calcularDist(origem);
    }
// método para retornar os dados do ponto
    public String retornarFormato(){
        return "(" + x + "," + y + ")";
    }
// método para retornar o ponto mais próximo
    public Ponto retornarPontoMaisPróximo(Ponto p1, Ponto p2){
        double dp1 = p1.calcularDistOrigem();
        double dp2 = p2.calcularDistOrigem();
        if(dp1< dp2){
            return p1;
        }
        return p2;
    }
}

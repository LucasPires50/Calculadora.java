package Operacoes;

public class OperaçoesAvançadas {

    public double potencia(double base, double expoente) {

        double resultado = 1;

        for (int i = 0; i < expoente; i++) {

            resultado = base * resultado;

        }
        return resultado;
    }

    public double porcentagem(double valor, double percentual) {

        double resultado = (valor * percentual) / 100;
        return resultado;
    }

    public double raizQuadrada(double raiz) {

        double resultado = Math.sqrt(raiz);
        return resultado;
    }

    public double seno(double a) {

        double resultado = Math.sin(a);
        return resultado;
    }
    
    public double coseno(double a){
        double resultado = Math.cos(a);
        return resultado;
    }
    
    public double tangente (double a){
        double resultado = Math.tan(a);
        return resultado;
    }

}

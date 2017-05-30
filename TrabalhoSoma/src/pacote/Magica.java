package pacote;

public class Magica {

    public float soma(float valorA, float valorB) {
        return valorA + valorB;
    }

    public float subtracao(float valorA, float valorB) {
        return soma(valorA, -valorB);
    }

    public float multiplicacao(float valorA, float valorB) {

        float resultado = 0;
        float resultado1 = 0;
        float cont = 0;

        do {
            if (cont > valorB) {
                break;
            }
            cont = soma(cont, 1);
            resultado = soma(valorA, 0);
            resultado1 = soma(resultado, resultado1);

        } while (cont != valorB);

        return resultado1;
    }

    public float divisao(float valorA, float valorB) {
        float cont = 0;
        boolean ehNegativo = false;
        if (valorB == 0) {
            float result = Float.NaN;
            cont = result;
        } else {

            if (valorA < 0 && valorB >= 0 || valorA >= 0 && valorB < 0) {
                ehNegativo = true;
            }

            if (valorA < 0) {
                valorA = -valorA;
            }
            if (valorB < 0) {
                valorB = -valorB;
            }
            while (valorA >= valorB) {
                valorA = subtracao(valorA, valorB);
                cont = soma(cont, 1);
            }
            valorA = multiplicacao(valorA, 10);
            while (valorA >= valorB) {
                valorA = subtracao(valorA, valorB);
                cont = soma(cont, 0.1f);
            }
            valorA = multiplicacao(valorA, 10);
            while (valorA >= valorB) {
                valorA = subtracao(valorA, valorB);
                cont = soma(cont, 0.01f);
            }
            valorA = multiplicacao(valorA, 10);
            while (valorA >= valorB) {
                valorA = subtracao(valorA, valorB);
                cont = soma(cont, 0.001f);
            }

            if (ehNegativo) {
                cont = -cont;
            }
        }
        return cont;
    }

    public float potencia(float valorA, float valorB) {
        float resultado = 1;
        float cont = 0;

        do {
            if (cont > valorB) {
                break;
            }
            cont = soma(cont, 1);
            resultado = multiplicacao(valorA, resultado);
        } while (cont != valorB);

        return resultado;
    }

}

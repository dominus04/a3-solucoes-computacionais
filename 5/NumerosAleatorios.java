import java.lang.Math;

public class NumerosAleatorios{

    public static void main(String[] args) {
        
        int[] numeros = new int[100];
        int qtdPares = 0, qtdImpares = 0, soma = 0;
        String strNumeros = "";


        for(int i = 0; i < 100; i++){
            numeros[i] = (int) (Math.random() * 1000);
            strNumeros += numeros[i];
            soma += numeros[i];
            if(i != 99)
                strNumeros += ", ";
            if(numeros[i] % 2 == 0 && numeros[i] != 0)
                qtdPares ++;
            else if(numeros[i] % 2 != 0 && numeros[i] != 0)
                qtdImpares ++;
        }

        System.out.printf("Soma dos números: %d\nNúmeros pares: %d\nNúmeros ímpares: %d\nNúmeros gerados: %s", soma, qtdPares, qtdImpares, strNumeros);

    }

}
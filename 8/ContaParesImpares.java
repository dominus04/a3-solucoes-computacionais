import java.util.Scanner;

public class ContaParesImpares {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma sequência de números inteiros, para encerrar a sequência digite -1");

        int escolha = 0, qtdImpares = 0, qtdPares = 0, num;

        while(escolha != -1){
            num = in.nextInt();
            if(num == -1)
                break;
            if (num % 2 == 0 && num != 0)
                qtdPares++;
            else if(num % 2 != 0 && num != 0)
                qtdImpares++;
        }

        System.out.printf("Quantidade de números pares digitados: %d\nQuantidade de números impares digitados: %d", qtdPares, qtdImpares);

        in.close();

    }
}
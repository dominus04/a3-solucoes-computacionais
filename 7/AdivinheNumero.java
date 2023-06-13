import java.util.Scanner;
import java.lang.Math;

public class AdivinheNumero {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int numero = (int)(Math.random()*99)+1; 

        int chute = -1;

        while(chute != numero){
            System.out.print("Tente advinhar o número: ");
            chute = in.nextInt();
            if(chute != numero)
                System.out.println("O número ainda não é esse, tente novamente.");
            else
                break;
        }

        System.out.println("Parabéns você advinhou!!!");

        in.close();

    }

}
import java.util.Scanner;

public class ConversorDeTemperatura {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Escolha 1 para converter de Cº para Fº e 2 para converter de Fº para Cº: ");

        int escolha = in.nextInt();

        System.out.print(escolha == 1 ? "Digite a temperatura em Cº: " : "Digite a temperatura em Fº: ");

        float temperatura = in.nextFloat();

        if(escolha == 1)
            System.out.printf("A temperatura %.1fCº equivale a %.1fFº", temperatura, (temperatura * 1.8) + 32);
        else
            System.out.printf(("A temperatura %.1fFº equivale a %.1fCº"), temperatura, (temperatura - 32)/1.8 );

            in.close();
    }

}
import java.util.Scanner;


public class CalculoDeArea{

    public static void main (String []args){

        Scanner in = new Scanner(System.in);

        System.out.print("Digite a altura da parede em cm: ");
        float hp = in.nextFloat();
        System.out.print("Digite a largura da parede em cm: ");
        float lp = in.nextFloat();
        System.out.print("Digite a altura do azuleijo em cm: ");
        float ha = in.nextFloat();
        System.out.print("Digite a largura do azuleijo em cm: ");
        float la = in.nextFloat();

        float areaParede = hp * lp;
        float areaAzuleijo = ha * la;
        double quantidadeAzuleijos = Math.ceil((double) areaParede/areaAzuleijo);

        System.out.printf("Serão necessários %.0f azuleijos", quantidadeAzuleijos);

        in.close();
    }

}
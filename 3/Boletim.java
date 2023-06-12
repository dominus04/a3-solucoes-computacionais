import java.util.Scanner;

public class Boletim {
    
    public static void main(String []args){

        Scanner in = new Scanner(System.in);
        
        System.out.print("Digite o nome do aluno:");
        String nome = in.nextLine();

        float totalNotas = 0;
        for(int i = 0;i < 5; i++){
            System.out.printf("Digite a %dº nota: ", i+1);
            totalNotas += in.nextFloat();
        }

        float mediaNotas = totalNotas/5;

        if(mediaNotas >= 60){
            System.out.printf("O aluno %s foi aprovado com nota %.2f.", nome, mediaNotas);
        }else if(mediaNotas >= 40){
            System.out.printf("O aluno %s ficou em recuperação com nota %.2f.", nome, mediaNotas);
        }else{
            System.out.printf("O aluno %s foi reprovado com nota %.2f.", nome, mediaNotas);
        }

        in.close();
    }

}

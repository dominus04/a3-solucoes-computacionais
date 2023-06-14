import java.util.Scanner;

public class MediaNotas {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Digite a quatidade de alunos da turma: ");

        int alunos = in.nextInt();

        float[] notas = new float[alunos];
        float total = 0;

        for(int i = 0; i < alunos;i++){
            System.out.printf("Digite a nota do %dº aluno: ", i+1);
            notas[i] = in.nextFloat();
            total += notas[i];
        }

        System.out.printf("A média de foi de %.2f pontos.", total/alunos);

        in.close();

    }
}
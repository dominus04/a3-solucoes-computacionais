import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Urna {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        String[][] cadastrosCandidatos = new String[2][5];
        int[] votos = new int[5];
        int quantidadeVotos = 0;
        
        for(int i = 0; i<5;i++){
            System.out.printf("Digite o nome e o número do %dº candidato separados por vírgula: ", i+1);
            String[] res = (in.nextLine()).split(",");
            cadastrosCandidatos[0][i] = res[0].trim();
            cadastrosCandidatos[1][i] = res[1].trim();
            votos[i] = 0;
        }

        int voto = 0;
        while(voto != -1){
            System.out.println("Relação de candidatos:");
            for(int i = 0; i < 5; i++) {
                System.out.printf("%s-%s\n", cadastrosCandidatos[1][i], cadastrosCandidatos[0][i]);
            }
            System.out.print("Digite o numero do seu candidado ou -1 para finalizar a votação: ");
            voto = in.nextInt();
            if(voto != -1){
                int candidato = Arrays.asList(cadastrosCandidatos[1]).indexOf(String.valueOf(voto));
                if(candidato == -1){
                    System.out.println("Candidato não existente, repita o voto.");
                }else{
                    votos[candidato] += 1;
                    quantidadeVotos++;
                }
            }
        }

        for(int i = 0; i<5;i++){
            System.out.printf("%s - %d\n", cadastrosCandidatos[0][i], votos[i]);
        }

        int[] votosOrdenados = votos;
        Arrays.sort(votosOrdenados);

        System.out.println(Arrays.toString(votosOrdenados));

        in.close();

    }
}

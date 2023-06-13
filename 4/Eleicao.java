import java.util.Scanner;

public class Eleicao {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        Urna urna = new Urna();

        for(int i = 0; i < 5; i++){
            System.out.printf("Digite o nome do %dº candidato: ", i + 1);
            String nome = in.nextLine().trim();
            System.out.printf("Digite o número do %dº candidato: ", i + 1);
            String numero = in.nextLine().trim();
            if(!urna.adicionaCandidato(nome, numero))
                i--;
        }

        String voto = "0";

        while(!voto.equals("-1")){
            urna.exibeCandidatos();
            voto = in.nextLine().trim();
            if(voto.equals("-1")){
                break;
            }
            urna.votar(voto);
        }

        Candidato vencedor = urna.computaVotos();
        if(vencedor != null){
            vencedor.anunciaVitoria();
            in.close();
            System.exit(1);
        }

        Urna urnaSegundoTurno = urna.urnaSegundoTurno();

        voto = "0";

        while(!voto.equals("-1")){
            urnaSegundoTurno.exibeCandidatos();
            voto = in.nextLine().trim();
            if(voto.equals("-1")){
                break;
            }
            urnaSegundoTurno.votar(voto);
        }

        vencedor = urnaSegundoTurno.computaVotos();
        if(vencedor != null){
            vencedor.anunciaVitoria();
            in.close();
            System.exit(1);
        }


    }
}

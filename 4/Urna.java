import java.util.HashMap;
import java.util.Map;

public class Urna {
    
    private HashMap<String, Candidato> candidatos = new HashMap<String, Candidato>();
    private int votos = 0;

    public boolean adicionaCandidato(String nome, String numero){
        if(!candidatos.containsKey(numero)){
            this.candidatos.put(numero, new Candidato(nome, numero));
            return true;
        }else{
            System.out.println("Não pode existir mais de um candidato com mesmo número.");
            return false;
        }
    }

    public void votar(String numero){
        if(this.candidatos.containsKey(numero)){
            this.candidatos.get(numero).adicionaVoto();
            votos ++;
            limpaTelaUrna();
        }else
            System.out.println("O numero digitado não pertence a nenhum candidato");
    }
    
    public void exibeCandidatos(){
        candidatos.forEach(
            (numero, candidato)->System.out.printf("%s - %s\n", candidato.getNumero(), candidato.getNome())
        );
        System.out.print("\nDigite o número do candidato escolhido ou -1 para encerrar a votação: ");
    }
    
    public void exibeResultado(){
        limpaTelaUrna();
        System.out.printf("Foram contabilizados %d votos:\n\n", this.votos);
        candidatos.forEach((numero, candidato)->System.out.println(candidato.toString()));
    }    
        
    public Candidato computaVotos(){
        Candidato vencedor = new Candidato(null, null);
        for (Map.Entry<String, Candidato> candidato : this.candidatos.entrySet()) {
            if(candidato.getValue().contaVotos() > vencedor.contaVotos())
                vencedor = candidato.getValue();
        }

        if(vencedor.contaVotos() >= (float) this.votos/2){
            exibeResultado();
            return vencedor;
        }else{
            exibeResultado();
            return null;
        }
    }

    public Urna urnaSegundoTurno(){

        System.out.println("\nUm segundo turno será necessário, os candidatos agora são:\n");

        Urna urnaSegundoTurno = new Urna();

        Candidato candidatoAux = new Candidato(null, null);
        Candidato candidatoAux2 = new Candidato(null, null);

        for(int i = 0; i < 2; i++){
            for (Map.Entry<String, Candidato> candidato : this.candidatos.entrySet()) {
                if(candidato.getValue().contaVotos() > candidatoAux.contaVotos())
                    candidatoAux = candidato.getValue();
                if(candidatoAux.getNumero() != null && candidato.getValue().getNumero() != candidatoAux.getNumero() && candidato.getValue().contaVotos() > candidatoAux2.contaVotos())
                    candidatoAux2 = candidato.getValue();
            }
        }

        urnaSegundoTurno.adicionaCandidato(candidatoAux.getNome(), candidatoAux.getNumero());
        if(candidatoAux2.getNumero() != null)
        urnaSegundoTurno.adicionaCandidato(candidatoAux2.getNome(), candidatoAux2.getNumero());

        return urnaSegundoTurno;
    }

    private void limpaTelaUrna(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
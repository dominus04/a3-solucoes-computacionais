public class Candidato {
    
    private String nome;
    private String numero;
    private int votos = 0;

    public Candidato(String nome, String numero){
        this.nome = nome;
        this.numero = numero;
    }

    public void adicionaVoto(){
        this.votos += 1;
    }

    public int contaVotos(){
        return this.votos;
    }

    public String getNome(){
        return this.nome;
    }

    public String getNumero(){
        return this.numero;
    }

    public void anunciaVitoria(){
        System.out.printf("\nO candidato de número %s, %s foi o vencedor com %d votos.", this.numero, this.nome, this.votos);
    }

    @Override
    public String toString(){
        return"O candidato de número " + this.numero + ", " + this.nome + " obteve " + this.votos + " votos.";
    }

}

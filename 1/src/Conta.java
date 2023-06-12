import java.text.SimpleDateFormat;
import java.util.Date;

public class Conta {
    
    private String titular;
    private int numero;
    private String agencia;
    private double saldo;
    private String dataDeAbertura;

    public Conta(String titular, int numero, String agencia){
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = 0;

        Date today = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        this.dataDeAbertura = formatter.format(today);
    }

    public void deposita(double valor){
        this.saldo += valor;
    }

    public void saca(double valor){
        if(valor <= this.saldo){
            this.saldo -= valor;
            System.out.println("Você sacou.");
        }else{
            System.out.println("O valor solicitado é maior do que o seu saldo.");
        }
    }

    public double calculaRendimento(){
        return this.saldo * 0.1;
    } 

    public String recuperaDadosParaImpressao(){
        String dados = String.format("Titular: %s \nNúmero: %d \nAgência: %s \nSaldo: %.2f \nData de Abertura: %s", this.titular, this.numero, this.agencia, this.saldo, this.dataDeAbertura);
        return dados;
    }

}

public class TesteConta {
    public static void main(String[] args) throws Exception {
        
        Conta conta1 = new Conta("Igor de Melo Alves", 12345, "1");
        conta1.deposita(250);

        Conta conta2 = new Conta("Eugênio Sodré", 54321, "1");
        conta2.deposita(100);

        System.out.println(conta1.recuperaDadosParaImpressao());
        System.out.println(conta2.recuperaDadosParaImpressao());

        conta1.saca(100);
        conta2.saca(250);

        System.out.println(conta1.recuperaDadosParaImpressao());
        System.out.println(conta2.recuperaDadosParaImpressao());
        
    }
}

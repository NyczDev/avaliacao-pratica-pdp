public class BoletoProcessador implements ProcessadorPagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.printf("Gerando boleto no valor de R$ %.2f...\n", valor);
        System.out.println("Boleto gerado com sucesso!");
    }
}
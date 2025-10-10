public class CartaoCreditoProcessador implements ProcessadorPagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.printf("Processando R$ %.2f no cartão de crédito...\n", valor);
        System.out.println("Pagamento com Cartão de Crédito aprovado!");
    }
}
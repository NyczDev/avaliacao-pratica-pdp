// Escolhi o padrão Factory Method para desacoplar o serviço de pagamento (PagamentoService)
// da criação dos objetos de pagamento concretos (PIX, Cartão de Crédito, Boleto).
public class Main {
    public static void main(String[] args) {
        // o service que comanda a operação do pagamento
        PagamentoService servico = new PagamentoService();
        double valorDaCompraPIX = 100.00;
        double valorDaCompraCartaoCredito = 255.50;
        double valorDaCompraBoleto = 200.00;
        
        System.out.println("--- Um cliente escolheu pagar com PIX ---");
        // instanciamento Factory de PIX
        PagamentoFactory pixFactory = new PixFactory();
        servico.realizarPagamento(pixFactory, valorDaCompraPIX);
        
        System.out.println("\n--- Um segundo cliente escolheu pagar com Cartão de Crédito ---");
        // instanciamento Factory de cartão de crédito
        PagamentoFactory cartaoFactory = new CartaoCreditoFactory();
        servico.realizarPagamento(cartaoFactory, valorDaCompraCartaoCredito);
        
        System.out.println("\n--- Um terceiro cliente escolheu pagar com Boleto ---");
        // instanciamento Factory de boleto
        PagamentoFactory boletoFactory = new BoletoFactory();
        servico.realizarPagamento(boletoFactory, valorDaCompraBoleto);
    }
}
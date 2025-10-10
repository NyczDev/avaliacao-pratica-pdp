public class PixProcessador implements ProcessadorPagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.printf("Gerando QR Code para pagamento PIX de R$ %.2f...\n", valor);
        System.out.println("PIX gerado com sucesso! Aguardando pagamento.");
    }
}

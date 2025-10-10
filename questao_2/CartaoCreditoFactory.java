public class CartaoCreditoFactory extends PagamentoFactory {

    @Override
    public ProcessadorPagamento criarProcessador() {
        return new CartaoCreditoProcessador();
    }
}

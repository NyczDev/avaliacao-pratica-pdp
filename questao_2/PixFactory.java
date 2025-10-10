public class PixFactory extends PagamentoFactory {
    
    @Override
    public ProcessadorPagamento criarProcessador() {
        return new PixProcessador();
    }
}

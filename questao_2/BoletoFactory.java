public class BoletoFactory extends PagamentoFactory {
    
    @Override
    public ProcessadorPagamento criarProcessador() {
        return new BoletoProcessador();
    }
}

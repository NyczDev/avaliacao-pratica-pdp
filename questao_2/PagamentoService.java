
public class PagamentoService {
    public void realizarPagamento(PagamentoFactory factory, double valor) {
        ProcessadorPagamento processador = factory.criarProcessador();
        processador.processarPagamento(valor);
    }
}

public class EstatisticasDecorator extends RelatorioDecorator {

    public EstatisticasDecorator(Relatorio relatorio) {
        super(relatorio);
    }

    /**
     * Sobrescreve o método gerar() para adicionar o novo comportamento.
     * Primeiro, ele chama o método gerar() do objeto que está decorando
     * (o relatório base ou outro decorador) e, em seguida, adiciona
     * sua própria funcionalidade ao resultado.
     */
    @Override
    public String gerar() {
        String conteudoBase = super.gerar();
        String novasEstatisticas = adicionarEstatisticas();
        return conteudoBase + "\n" + novasEstatisticas;
    }


    // Método privado que contém a nova lógica/funcionalidade.

    private String adicionarEstatisticas() {
        // Lógica para gerar estatísticas de faturamento
        return "[+] Estatísticas de faturamento: R$ 15.750,00";
    }
}
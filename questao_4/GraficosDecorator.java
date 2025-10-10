public class GraficosDecorator extends RelatorioDecorator {

    public GraficosDecorator(Relatorio relatorio) {
        super(relatorio);
    }

    @Override
    public String gerar() {
        String conteudoBase = super.gerar();
        String novosGraficos = adicionarGraficos();
        return conteudoBase + "\n" + novosGraficos;
    }

    private String adicionarGraficos() {
        return """
               [+] Gráfico de Vendas:
                   |
                10 |    /\\
                 5 |   /  \\
                 0 |__/____\\___
                     JAN FEV MAR
               """;
    }
}
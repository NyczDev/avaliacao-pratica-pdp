public class PDFDecorator extends RelatorioDecorator {

    public PDFDecorator(Relatorio relatorio) {
        super(relatorio);
    }

    @Override
    public String gerar() {
        // Pega todo o conteúdo gerado pela cadeia de decoradores
        String conteudoBase = super.gerar();
        // Aplica a formatação final
        return formatarParaPDF(conteudoBase);
    }

    private String formatarParaPDF(String conteudo) {
        return "--- [CABEÇALHO DO ARQUIVO PDF] ---\n" +
               conteudo +
               "\n--- [RODAPÉ DO ARQUIVO PDF] ---";
    }
}
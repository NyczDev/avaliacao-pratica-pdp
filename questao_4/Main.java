public class Main {
    public static void main(String[] args) {
        // Começamos com o objeto base
        Relatorio relatorio = new RelatorioBase();
        System.out.println("--- Relatório Simples ---");
        System.out.println(relatorio.gerar());
        System.out.println("========================\n");

        // Decoramos o objeto base com estatísticas.
        relatorio = new EstatisticasDecorator(relatorio);
        System.out.println("--- Relatório com Estatísticas ---");
        System.out.println(relatorio.gerar());
        System.out.println("========================\n");

        // Decoramos o objeto base com gráficos.
        relatorio = new GraficosDecorator(relatorio);
        System.out.println("--- Relatório com Estatísticas e Gráficos ---");
        System.out.println(relatorio.gerar());
        System.out.println("========================\n");

        // Aplicamos a formatação PDF.
        relatorio = new PDFDecorator(relatorio);
        System.out.println("--- Relatório completo formatado em PDF ---");
        System.out.println(relatorio.gerar());
        System.out.println("========================\n");

        // Demonstração da flexibilidade: um relatório base direto para PDF,
        // sem as decorações intermediárias.
        Relatorio relatorioApenasPDF = new PDFDecorator(new RelatorioBase());
        System.out.println("--- Relatório Simples em PDF ---");
        System.out.println(relatorioApenasPDF.gerar());
        System.out.println("========================\n");
    }
}
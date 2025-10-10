public abstract class RelatorioDecorator implements Relatorio {
    protected Relatorio relatorioDecorado;

    public RelatorioDecorator(Relatorio relatorio) {
        this.relatorioDecorado = relatorio;
    }

    /**
     * Delegação da chamada.
     * Por padrão, o decorador simplesmente repassa a chamada para o objeto
     * que ele contém. As subclasses irão adicionar comportamento antes ou depois
     * desta chamada.
     */
    @Override
    public String gerar() {
        return relatorioDecorado.gerar();
    }
}
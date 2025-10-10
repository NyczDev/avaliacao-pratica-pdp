

/**
 * Declara o método de fábrica, que retorna um objeto do tipo Produto.
 * A responsabilidade é delegada para suas subclasses.
 */
public abstract class TransporteFactory {
    public abstract Transporte criarTransporte();

    public void realizarEntrega() {
        Transporte transporte = criarTransporte();
        double tarifa = transporte.calcularTarifa();
        System.out.printf("A tarifa da entrega é: R$ %.2f\n", tarifa);
    }
}
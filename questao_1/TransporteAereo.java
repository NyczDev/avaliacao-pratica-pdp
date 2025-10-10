
/**
 * Implementação para a modalidade de transporte aéreo.
 * O cálculo da tarifa é baseado no peso da carga.
 */
public class TransporteAereo implements Transporte {

    private final double taxaBase = 100.0;
    private final double custoPorKg = 10.5;
    private final double pesoCarga = 50.0; // Peso mockado

    @Override
    public double calcularTarifa() {
        System.out.printf("Peso da Carga: %.2f kg, Custo por KG: R$ %.2f, Taxa Base: R$ %.2f\n", pesoCarga, custoPorKg, taxaBase);
        return taxaBase + (custoPorKg * pesoCarga);
    }
}

/**
 * Implementação para a modalidade de transporte terrestre.
 * O cálculo da tarifa é baseado na distância.
 */
public class TransporteTerrestre implements Transporte {

    private final double custoPorKm = 1.5;
    private final int distancia = 150; // distancia mockada

    @Override
    public double calcularTarifa() {
        System.out.printf("Distância: %d km, Custo por KM: R$ %.2f\n", distancia, custoPorKm);
        return custoPorKm * distancia;
    }
}
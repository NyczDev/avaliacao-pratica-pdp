
/**
 * Implementação para a modalidade de transporte marítimo.
 * O cálculo da tarifa é baseado em uma taxa fixa de contêiner.
 */
public class TransporteMaritimo implements Transporte {

    private final double taxaConteiner = 750.0;

    @Override
    public double calcularTarifa() {
        System.out.printf("Taxa fixa por contêiner: R$ %.2f\n", taxaConteiner);
        return taxaConteiner;
    }
}
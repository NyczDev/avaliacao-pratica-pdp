/**
 * Padrão Factory Method.
 * O cliente decide qual fábrica usar e daí trabalha apenas com a
 * interface abstrata Transporte, sem conhecer os detalhes das implementações concretas.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Sistema de Cálculo de Tarifas de Logística ---");

        // Transporte terrestre
        TransporteFactory terrestreFactory = new TerrestreFactory();
        System.out.println("\nEntrega terrestre:");
        terrestreFactory.realizarEntrega();

        // Transporte aéreo
        TransporteFactory aereoFactory = new AereoFactory();
        System.out.println("\nEntrega aérea:");
        aereoFactory.realizarEntrega();

        // Transporte marítimo
        TransporteFactory maritimoFactory = new MaritimoFactory();
        System.out.println("\nEntrega marítima:");
        maritimoFactory.realizarEntrega();
    }
}
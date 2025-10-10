public class AereoFactory extends TransporteFactory {
    @Override
    public Transporte criarTransporte() {
        return new TransporteAereo();
    }
}
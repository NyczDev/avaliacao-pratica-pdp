public class TerrestreFactory extends TransporteFactory {
    @Override
    public Transporte criarTransporte() {
        return new TransporteTerrestre();
    }
}
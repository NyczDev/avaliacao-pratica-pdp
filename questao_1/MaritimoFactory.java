public class MaritimoFactory extends TransporteFactory {
    @Override
    public Transporte criarTransporte() {
        return new TransporteMaritimo();
    }
}
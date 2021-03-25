package patterns.factory_method.transportes;

public class Camion implements Transporte {

    int recorridoTotal;

    @Override
    public void entregar(int recorrido) {
        recorridoTotal = recorrido;
        System.out.println("Entrega CAMION \nSe estiman " + obtenerTiempoEntrega() + " horas para " + recorrido + " km de recorrido.");
    }

    @Override
    public float obtenerTiempoEntrega() {
        float kilometrosPorhora = 90;
        float timepoPeaje = 2;
        float climaChoto = 1;
        return recorridoTotal / kilometrosPorhora + timepoPeaje + climaChoto;
    }
}

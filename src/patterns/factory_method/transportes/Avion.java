package patterns.factory_method.transportes;

public class Avion implements Transporte {

    int recorridoTotal;

    @Override
    public void entregar(int recorrido) {
        recorridoTotal = recorrido;
        System.out.println("Entrega AVION \nSe estiman " + obtenerTiempoEntrega() + " horas para " + recorrido + " km de recorrido.");
    }

    @Override
    public float obtenerTiempoEntrega() {
        float kilometrosPorhora = 1200;
        return recorridoTotal / kilometrosPorhora;
    }
}

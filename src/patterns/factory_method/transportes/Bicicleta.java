package patterns.factory_method.transportes;

public class Bicicleta implements Transporte {

    int recorridoTotal;

    @Override
    public void entregar(int recorrido) {
        recorridoTotal = recorrido;
        System.out.println("Entrega BICICLETA \nSe estiman " + obtenerTiempoEntrega() + " horas para " + recorrido + " km de recorrido.");
    }

    @Override
    public float obtenerTiempoEntrega() {
        float kilometrosPorhora = 20;
        return recorridoTotal / kilometrosPorhora;
    }
}

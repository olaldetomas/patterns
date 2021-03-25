package patterns.factory_method.transportes;

public abstract class Envio {

    public void enviarPaquete(int recorrido) {
        Transporte transporte = creatTransporte();
        transporte.entregar(recorrido);
    }

    abstract Transporte creatTransporte();

}

package patterns.factory_method.transportes;

public class EnvioAvion extends Envio {

    @Override
    Transporte creatTransporte() {
        return new Avion();
    }

}

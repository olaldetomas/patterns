package patterns.factory_method.transportes;

public class EnvioCamion extends Envio {

    @Override
    Transporte creatTransporte() {
        return new Camion();
    }
}

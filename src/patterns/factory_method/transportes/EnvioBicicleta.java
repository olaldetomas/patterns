package patterns.factory_method.transportes;

public class EnvioBicicleta extends Envio {

    @Override
    Transporte creatTransporte() {
        return new Bicicleta();
    }
}

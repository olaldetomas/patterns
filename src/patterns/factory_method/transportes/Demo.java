package patterns.factory_method.transportes;

public class Demo {

    public static Envio envio;

    public static void main(String[] args) {
        determinarTipoEnvio();
        envio.creatTransporte();
        envio.enviarPaquete(120);
    }

    public static void determinarTipoEnvio() {

        //envio = new EnvioBicicleta();
        //envio = new EnvioCamion();
        envio = new EnvioAvion();

    }
}

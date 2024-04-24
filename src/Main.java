// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        App app;
        Cliente cliente = new Cliente(true, false);
        Factory factory = getFactory(cliente);
        app = new App(factory);
        app.startengine();

    }

    private static Factory getFactory(Cliente cliente) {
        if (cliente.isClientePremium()) {
            return new Mercedes(cliente);
        } else {
            return new Volks(cliente);
        }
    }






}
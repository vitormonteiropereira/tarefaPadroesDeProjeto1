public class Volks extends Factory {
    private Cliente cliente;


    public Volks(Cliente cliente) {
        this.cliente = cliente;
    }
    @Override
    public Carro criaCarro() {
        if (!cliente.isTamanhoFamilia()){
        return new CarroVolks(200, "Gasoline", "Blue");
        }
        else {
            return null;
        }
    }

    @Override
    public Onibus criaOnibus() {
        if (cliente.isTamanhoFamilia()){
        return new OnibusVolks(500, "Diesel", "White");
        }
        else return null;
    }
}
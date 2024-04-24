public class Mercedes extends Factory {


    private Cliente cliente;


    public Mercedes(Cliente cliente) {
        this.cliente = cliente;
    }


    @Override
    public Carro criaCarro() {
        if (!cliente.isTamanhoFamilia()){
        return new CarroMercedes(300, "Gasoline", "Red");
    }
        else {
        return null;
        }
    }

    @Override
    public Onibus criaOnibus() {
        if (cliente.isTamanhoFamilia()){
        return new OnibusMercedes(600, "Diesel", "Black");
        }
        else {
            return null;
        }
    }







}
public class App {

    private Carro carro;
    private Onibus onibus;


    public App(Factory factory){
        carro = factory.criaCarro();
        onibus = factory.criaOnibus();
    }

    public void startengine(){
        if (carro !=null){
            carro.startEngine();
        }
        else {
            onibus.startEngine();
        }

    }


}

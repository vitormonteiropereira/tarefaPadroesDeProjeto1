public class Cliente {
    private boolean clientePremium;
    private boolean tamanhoFamilia;

    public Cliente(boolean clientePremium, boolean tamanhoFamilia) {
        this.clientePremium = clientePremium;
        this.tamanhoFamilia = tamanhoFamilia;
    }

    public boolean isClientePremium() {
        return clientePremium;
    }

    public boolean isTamanhoFamilia() {
        return tamanhoFamilia;
    }
}




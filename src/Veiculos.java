public class Veiculos {
    private String individuo;
    private String placa;
    private double gas;

    public Veiculos(){
    }

    public Veiculos(String individuo, String placa, double gasInicial) {
        this.individuo = individuo;
        this.placa = placa;
        setGas(gasInicial);
    }

    // Métodos de Ação Adiciona e Gasta
    public void adicionarGas(double valor) {
        if (valor > 0) {
            this.gas += valor;
        }
    }

    public void gastaGas(double valor) {
        if (valor > 0 && this.gas >= valor) {
            this.gas -= valor; // Subtrair
        } else {
            System.out.println("Combustível insuficiente, valor acima da atual quantidade");
        }
    }

    // Getters e Setters
    public String getIndividuo() {
        return individuo;
    }

    public void setIndividuo(String individuo) {
        this.individuo = individuo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getGas() {
        return gas;
    }

    private void setGas(double gas) {
        if (gas >= 0) { // Proteção contra valores negativos
            this.gas = gas;
        } else {
            System.out.println("Não é permitido valor de gasolina negativo");
        }
    }
}
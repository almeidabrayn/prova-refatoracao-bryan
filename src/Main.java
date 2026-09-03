public class Main {
    public static void main(String[] args) {
        Veiculos v1 = new Veiculos("Carlos", "ABC-1234", 10.0);

        //teste de métodos
        v1.adicionarGas(50);
        v1.gastaGas(30); // Erro foi concertado

        // Usando os getters para ler os valores de forma segura
        System.out.println("Dono: " + v1.getIndividuo() +
                " | Placa: " + v1.getPlaca() +
                " | Gasolina: " + v1.getGas());
    }
}
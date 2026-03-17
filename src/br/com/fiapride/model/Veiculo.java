package br.com.fiapride.model;

public class Veiculo {
    private String responsavel;
    private String placa;
    private double gasolina;

    public Veiculo() {
    }

    public Veiculo(String responsavel, String placa, double gasolina) {
        setResponsavel(responsavel);
        setPlaca(placa);
        setGasolina(gasolina);
    }

    public String getResponsavel() {
        return responsavel;
    }

    public String getPlaca() {
        return placa;
    }

    public double getGasolina() {
        return gasolina;
    }

    private void setGasolina(double gasolina) {
        if (gasolina < 0){
            System.out.println("Nível de gasolina zerado!");
            this.gasolina = 0;
        } else if (gasolina >= 70) {
            System.out.println("Tanque cheio!");
            this.gasolina = 70;
        } else {
            this.gasolina = gasolina;
        }
    }

    private void setPlaca(String placa) {
        if (placa != null && placa.length() == 7) {
            this.placa = placa;
        } else {
            System.out.println("Placa deve ter 7 caracteres!\n" +
                    "Definindo placa padrão 'ABC1234'.");
            this.placa = "ABC1234";
        }
    }

    private void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public void abastecerCarro (double aditivo){
        double nivelAtual = this.getGasolina() + aditivo;
        setGasolina(nivelAtual);
    }

    public void gastarGasolina (double gasto){
        double nivelAtual = this.getGasolina() - gasto;
        if(nivelAtual < 0){
            nivelAtual = 0;
        }
        setGasolina(nivelAtual);
    }

    public String exibirVeiculo() {
        String resposta = "\n--- Informações do veículo ---\n" +
                "Titular: "+getResponsavel() +"\n" +
                "Placa: "+ getPlaca() +"\n" +
                "Nível de gasolina: " + getGasolina();
        return resposta;
    }
}

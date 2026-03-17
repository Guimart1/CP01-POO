package br.com.fiapride.main;
import java.util.Scanner;
import br.com.fiapride.model.Veiculo;

public class Principal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Veiculo v1 = new Veiculo("Carlos", "ABC1234", -10);
        v1.abastecerCarro(50);
        v1.gastarGasolina(100);
        System.out.println(v1.exibirVeiculo());
    }
}
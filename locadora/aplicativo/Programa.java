package locadora.aplicativo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import locadora.model_entities.AluguelDeCarro;
import locadora.model_entities.Veiculo;

public class Programa {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("ENTRE COM OS DADOS DO ALUGUEL");
        System.out.print("Modelo do carro: ");
        String carModel = input.nextLine();
        System.out.print("Retirada: (dd/MM/yyyy hh:mm): ");
        LocalDateTime inicio = LocalDateTime.parse(input.nextLine(), fmt);
        System.out.print("Retorno: (dd/MM/yyyy hh:mm): ");
        LocalDateTime fim = LocalDateTime.parse(input.nextLine(), fmt);

        AluguelDeCarro ac = new AluguelDeCarro(inicio, fim, new Veiculo(carModel));

        input.close();

    }
}

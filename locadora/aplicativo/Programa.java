package locadora.aplicativo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import locadora.model_entities.AluguelDeCarro;
import locadora.model_entities.Veiculo;
import locadora.servico.ServicoAluguel;
import locadora.servico.Tax;

public class Programa {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("ENTRE COM OS DADOS DO ALUGUEL");
        System.out.print("Modelo do carro: ");
        String modelo = input.nextLine();
        System.out.print("Retirada: (dd/MM/yyyy hh:mm): ");
        LocalDateTime inicio = LocalDateTime.parse(input.nextLine(), fmt);
        System.out.print("Retorno: (dd/MM/yyyy hh:mm): ");
        LocalDateTime fim = LocalDateTime.parse(input.nextLine(), fmt);

        AluguelDeCarro ac = new AluguelDeCarro(inicio, fim, new Veiculo(modelo));

        System.out.println("Informe o preço por hora: ");
        double porHora = input.nextDouble();
        System.out.println("Informe o preço por dia: ");
        double porDia = input.nextDouble();

        ServicoAluguel servicoAluguel = new ServicoAluguel(porDia, porHora, new Tax());
        servicoAluguel.processoFatura(ac);

        System.out.println("FATURA: ");
        System.out.println("PAGAMENTO BASICO: " + ac.getFatura().getPagPadrao());
        System.out.println("IMPOSTO: " + ac.getFatura().getTax());
        System.out.println("TOTAL: " + ac.getFatura().getPagTotal());
        
        
        
        input.close();

    }
}

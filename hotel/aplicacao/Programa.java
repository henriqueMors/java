package hotel.aplicacao;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import hotel.model_entities.Reserva;

public class Programa {
    
    public static void main(String[] args) throws ParseException {
        
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Númeo do quarto: ");
        int number = sc.nextInt();
        System.out.print("Data do Check-in (d/MM/yyyy): ");
        Date checkIn = sdf.parse(sc.next());
        System.out.print("Data do Check-out (d/MM/yyyy): ");
        Date checkOut = sdf.parse(sc.next());

        if (!checkOut.after(checkIn)) {
            System.out.println("Erro na reserva: Verifique data de check-out.");
        }
        else {
            Reserva reserva = new Reserva(number, checkIn, checkOut);
            System.out.println("Reserva: " + reserva);

            System.out.println();
            System.out.println("Insira nova data de reseva: ");

            System.out.print("Data do Check-in (d/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Data do Check-out (d/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            reserva.updateDates(checkIn, checkOut);
            System.out.println("Reserva: " + reserva);
        }

        sc.close();
}

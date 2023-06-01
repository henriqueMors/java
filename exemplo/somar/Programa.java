package exemplo.somar;

public class Programa {
    public int valor1;
    public int valor2;
    
    public int soma() {
        return valor1 + valor2;
    }

    public void parOuImpar() {
        if (soma() % 2 == 0){
        System.out.println("Par");
    }
        else {
            System.out.println("Impar");
    }

}

}

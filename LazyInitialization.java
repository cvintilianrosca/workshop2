import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LazyInitialization {

    private int number;

    // ne-statice -> ele depind de un obiect, de o instanta
    // statice -> depind de clasa

    // In momentul executiei unui program java ->
    // 1. Etapa -> se incarca toate clasele in memorie -> se initilizeaza
    // si field-urile lor statice
    // 2. Etapa -> Main-ul si se ruleaza logica din metoda main

    public LazyInitialization(final int number) {
        System.out.println("Ana are mere din constructor");
        this.number = number;
    }

    public void processNumber100Times() {

        // abia atunci se duce intr-o baza de date si le ia de-acolo

        int sum = 0;

        for (int i = 0; i < 100; i++) {
            sum += number;
        }

    }

    public void processNumber100000Times() {

        int sum = 0;

        for (int i = 0; i < 10000000; i++) {
            sum += number;
        }
    }

    public void processNumber100000000000Times() {
        long sum = 0;

        for (long i = 0; i < 10000000L; i++) {
            sum += number;
        }
    }
}

class Main {

    public static void main(String[] args) {
        LazyInitialization lazyInitialization = new LazyInitialization(100);
    }
}

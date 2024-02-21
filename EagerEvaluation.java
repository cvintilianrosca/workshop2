public class EagerEvaluation {

    private int number;

    private long sumforFirst100 = 0;
    private long sumforFirst1000000 = 0;
    private long sumforFirst10000000000 = 0;


    public long getNumber() {
        return sumforFirst100;
    }

    public long getSumforFirst100() {
        return sumforFirst1000000;
    }

    public long getSumforFirst1000000() {
        return sumforFirst1000000;
    }

    public long getSumforFirst10000000000() {
        return sumforFirst10000000000;
    }

    // 2 etape:
    // 1. etapa -> click pe un icon pe Desktop
    // 2. etapa -> aplicatia ta s-a startat
    // Inginerii -> totul se plateste
    // sacrifici timpul in care se starteaza aplicatia
    // sacrifici timpul rularii
    public EagerEvaluation(final int number) {
        this.number = number;

        System.out.println("Is processing the number 100 times ");
        sumforFirst100 = processNumber100Times();

        System.out.println("Is processing the number 100000 times ");
        sumforFirst1000000 = processNumber100000Times();

        System.out.println("Is processing the number 100000000000 times ");
        sumforFirst10000000000 = processNumber100000000000Times();

        System.out.println("Object initialization has finished!");
    }

    public int processNumber100Times() {

        int sum = 0;

        for (int i = 0; i < 100; i++) {
            sum += number;
        }

        return sum;

    }

    public int processNumber100000Times() {

        int sum = 0;

        for (int i = 0; i < 10000000; i++) {
            sum += number;
        }

        return sum;
    }

    public long processNumber100000000000Times() {
        long sum = 0;

        for (long i = 0; i < 1000000000000000L; i++) {
            sum += number;
        }

        return sum;
    }

}


class Main1 {

    public static void main(String[] args) {

        final EagerEvaluation eagerEvaluation = new EagerEvaluation(1000000);

        System.out.println(eagerEvaluation.getSumforFirst100());
        System.out.println(eagerEvaluation.getSumforFirst1000000());
        System.out.println(eagerEvaluation.getSumforFirst10000000000());

    }
}

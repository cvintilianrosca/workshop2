public class CachingExample {

    private int number;

    private long cachedSum = -1;

    private int previousNumber = 0;


    public CachingExample(final int number) {
        this.number = number;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(final int number) {
        this.number = number;
    }
    public void processNumber100Times() {

        if (previousNumber == number) {
            System.out.println("The sum is cached sum: " + cachedSum);
            return;
        }

        long sum = 0;
        for (long i = 0; i < 10000000000L; i++) {
            sum += number;
        }


        cachedSum = sum;
        previousNumber = number;

        System.out.println("The sum is " + sum);

    }

    public void processNumber100000Times() {

        int sum = 0;

        for (int i = 0; i < 10000000; i++) {
            sum += number;
        }
    }

    public void processNumber100000000000Times() {
        long sum = 0;

        for (long i = 0; i < 1000000000000000000L; i++) {
            sum += number;
        }
    }

}

class Main2 {

    public static void main(String[] args) {

        final CachingExample cachingExample = new CachingExample(100);

        System.out.println("First call");
        cachingExample.processNumber100Times();

        System.out.println("Second call");
        cachingExample.processNumber100Times();

        System.out.println("Third call");
        cachingExample.processNumber100Times();


        cachingExample.setNumber(5);

        System.out.println("Fourth call");
        cachingExample.processNumber100Times();

        System.out.println("Fifth call");
        cachingExample.processNumber100Times();

        System.out.println("Sixth call");
        cachingExample.processNumber100Times();

    }
}

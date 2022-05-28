class MultiThreadSort implements Runnable {
    static int[] numbers = {0, 7, 5, 3, 9, 4};
    public static void main(String[] s) {
        Thread[] threads = new Thread[numbers.length/2];

        for(int i = 0; i < numbers.length/2; i++) {
            System.out.println(numbers[i]);
        }

        for(int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new MultiThreadSort());
            threads[i].start();
        }
        // threads[0] = new Thread(new MultiThreadSort());
        // threads[0].start();
    }

    @Override
    public void run() {
        for(int i = 0; i < numbers.length-1; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
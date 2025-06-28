package Test;

public class StringBufferAndBuilder {

//        StringBuilder vs StringBuffer Performance
//        Write a program that demonstrates the performance difference between String concatenation,
//        StringBuilder, and StringBuffer for multiple string operations.
        private static final int ITERATIONS = 100000; // Number of times to append
        public static void main(String[] args) {

            // Test StringBuilder performance
            long startTimeBuilder = System.nanoTime();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < ITERATIONS; i++) {
                sb.append("a");
            }
            long endTimeBuilder = System.nanoTime();
            long durationBuilder = (endTimeBuilder - startTimeBuilder) / 1_000_000; // Convert to milliseconds
            System.out.println("StringBuilder time: " + durationBuilder + " ms");

            // Test StringBuffer performance
            long startTimeBuffer = System.nanoTime();
            StringBuffer sbuf = new StringBuffer();
            for (int i = 0; i < ITERATIONS; i++) {
                sbuf.append("a");
            }
            long endTimeBuffer = System.nanoTime();
            long durationBuffer = (endTimeBuffer - startTimeBuffer) / 1_000_000; // Convert to milliseconds
            System.out.println("StringBuffer time: " + durationBuffer + " ms");
        }

    }

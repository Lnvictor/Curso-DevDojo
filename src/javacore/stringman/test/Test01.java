package javacore.stringman.test;

public class Test01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(100_000_000);

        long initial = System.currentTimeMillis();

        for (int i = 0; i < 100_000_000; i++) {
            sb.append(i+1);
        }

        long finall = System.currentTimeMillis();

        System.out.println(finall - initial);
    }
}

package Java2.HW_5;

import java.util.Arrays;

public class Homework_5 {

    private static class NewThread extends Thread {
        float[] a0;

        NewThread (float[] arr) {
            super();
            a0 = arr;
            start();
        }

        @Override
        public void run (){
            arrCount(a0);
        }
    }

    static final int size = 10000000;
    static final int h = size / 2;
    float[] arr = new float[size];
    float[] a1 = new float[h];

    float[] a2 = new float[h];


    public void oneThread () {
        Arrays.fill(arr, 1);
        long a = System.currentTimeMillis();

        arrCount(arr);

        System.out.println(System.currentTimeMillis()-a);
    }

    public void doubleThread () {
        Arrays.fill(arr, 1);

        long a = System.currentTimeMillis();

        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);
        NewThread firstArPart = new NewThread(a1);
        NewThread secondArPart = new NewThread(a2);
        try {
            firstArPart.join();
            secondArPart.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);

        System.out.println(System.currentTimeMillis()-a);
    }

    public static void arrCount (float[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

    public static void main(String[] args) {
        Homework_5 Ex = new Homework_5();
        Ex.oneThread();
        Ex.doubleThread();
    }

}

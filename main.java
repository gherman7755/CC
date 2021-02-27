package com.company;

import java.util.Arrays;
import java.lang.*;

public class Main {

    public static void main(String[] args){
        // n - range from 0 to n
        // multiple - for increasing range
        // repeats - how much time do you want n to increase
        // algo - number of algorithm from 1 - 5.
        elapsed(10, 10, 5, 3);
        // if you want check if algorithms work
        // just uncomment next code and change algo1 to which you want

        /*
        boolean[] array = algo1(100);
        for(int i = 0; i < 100; i++){
            if(array[i]){
                System.out.print(i + " ");
            }
        }
        */
    }

    public static boolean[] algo1(int n){
        boolean[] c = new boolean[n];
        Arrays.fill(c, true);

        c[1] = false;
        n--;

        int i = 2;
        int j;

        while (i <= n){
            if(c[i]){
                j = 2 * i;
                while(j <= n){
                    c[j] = false;
                    j += i;
                }
            }
            i++;
        }

        return c;
    }

    public static boolean[] algo2(int n){
        boolean[] c = new boolean[n];
        Arrays.fill(c, true);

        c[1] = false;
        n--;

        int i = 2;
        int j;

        while (i <= n){
            j = 2 * i;
            while (j <= n){
                c[j] = false;
                j += i;
            }
            i++;
        }
        return c;
    }

    public static boolean[] algo3(int n){
        boolean[] c = new boolean[n];
        Arrays.fill(c, true);

        c[1] = false;
        n--;

        int i = 2;
        int j;

        while(i <= n){
            if(c[i]){
                j = i + 1;
                while(j <= n){
                    if(j % i == 0){ // there was a mistake in word file - "if(i % j)..."
                        c[j] = false;
                    }
                    j++;
                }
            }
            i++;
        }
        return c;
    }

    public static boolean[] algo4(int n){
        boolean[] c = new boolean[n];
        Arrays.fill(c, true);

        c[1] = false;
        n--;

        int i = 2;
        int j;

        while(i <= n){
            j = 2; // here also was mistake - "j = 1"
            while(j < i){
                if(i % j == 0){ // and here - "if(j % i == 0)"
                    c[i] = false;
                }
                j++;
            }
            i++;
        }
        return c;
    }

    public static boolean[] algo5(int n){
        boolean[] c = new boolean[n];
        Arrays.fill(c, true);

        c[1] = false;
        n--;

        int i = 2;
        int j;

        while(i <= n){
            j = 2;
            while(j <= Math.sqrt(i)){
                if(i % j == 0){ // and here was the same mistake
                    c[i] = false;
                }
                j++;
            }
            i++;
        }
        return c;
    }

    public static long elapsed(int n, int multiple, int repeats, int algo){
        switch (algo){
            case 1:
                for(int i = 0; i < repeats; i++){
                    long start = System.nanoTime();
                    algo1(n);
                    long end = System.nanoTime();
                    float result = (end - start) / 1000000.0f;
                    System.out.println("Time elapsed: " + result + " ms.");

                    n *= multiple;
                }
                break;

            case 2:
                for(int i = 0; i < repeats; i++){
                    long start = System.nanoTime();
                    algo2(n);
                    long end = System.nanoTime();
                    float result = (end - start) / 1000000.0f;
                    System.out.println("Time elapsed: " + result + " ms.");

                    n *= multiple;
                }
                break;

            case 3:
                for(int i = 0; i < repeats; i++){
                    long start = System.nanoTime();
                    algo3(n);
                    long end = System.nanoTime();
                    float result = (end - start) / 1000000.0f;
                    System.out.println("Time elapsed: " + result + " ms.");

                    n *= multiple;
                }
                break;

            case 4:
                for(int i = 0; i < repeats; i++){
                    long start = System.nanoTime();
                    algo4(n);
                    long end = System.nanoTime();
                    float result = (end - start) / 1000000.0f;
                    System.out.println("Time elapsed: " + result + " ms.");

                    n *= multiple;
                }
                break;

            case 5:
                for(int i = 0; i < repeats; i++){
                long start = System.nanoTime();
                algo5(n);
                long end = System.nanoTime();
                float result = (end - start) / 1000000.0f;
                System.out.println("Time elapsed: " + result + " ms.");

                n *= multiple;
            }
                break;

            default:
                System.out.println("No, no, no! Don't try to break my code!!!");
                break;
        }

        return 0;
    }
}

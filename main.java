package com.company;

import java.util.Arrays;
import java.lang.*;


public class Main {

    public static void main(String[] args) {
        long start = System.nanoTime();
        boolean[] a = algo1(1000000);
        long end = System.nanoTime();
        System.out.println("Time elapsed: " + (end - start) / 1000000 + " ms.");

        start = System.nanoTime();
        boolean[] b = algo2(1000000);
        end = System.nanoTime();
        System.out.println("Time elapsed: " + (end - start) / 1000000 + " ms.");

        start = System.nanoTime();
        boolean[] c = algo3(1000000);
        end = System.nanoTime();
        System.out.println("Time elapsed: " + (end - start) / 1000000 + " ms.");

        start = System.nanoTime();
        boolean[] d = algo4(1000000);
        end = System.nanoTime();
        System.out.println("Time elapsed: " + (end - start) / 1000000 + " ms.");

        start = System.nanoTime();
        boolean[] e = algo5(1000000);
        end = System.nanoTime();
        System.out.println("Time elapsed: " + (end - start) / 1000000 + " ms.");
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
                    if(j % i == 0){
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
            j = 2;
            while(j < i){
                if(i % j == 0){
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
                if(i % j == 0){
                    c[i] = false;
                }
                j++;
            }
            i++;
        }
        return c;
    }
}

package com.nyankosama.algorithm;

/**
 * Created by i@nyankosama.com on 2014/10/30.
 */
public class SelectionSort implements Sortable{

    @Override
    public void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i+1; j < N; j++) {
                if (less(a[j], a[min])) min = j;
            }
            exch(a, i, min);
        }
    }
}

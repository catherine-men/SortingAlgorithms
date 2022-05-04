
package project8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Project8 {
  
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = scan.nextInt();
        Random rand = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) 
             arr[i] = rand.nextInt(1001);
        
        long start = System.currentTimeMillis();
        SortingAlgorithms.BubbleSort(arr.clone());
        long elapsed = System.currentTimeMillis() - start;
        
        long start2 = System.currentTimeMillis();
        SortingAlgorithms.BubbleSortCS(arr.clone());
        long elapsed2 = System.currentTimeMillis() - start2;
        
        long start3 = System.currentTimeMillis();
        SortingAlgorithms.gnomeSort(arr.clone());
        long elapsed3 = System.currentTimeMillis() - start3;
        
        long start4 = System.currentTimeMillis();
        SortingAlgorithms.SelectionSort(arr.clone());
        long elapsed4 = System.currentTimeMillis() - start4;
        
        long start5 = System.currentTimeMillis();
        Arrays.sort(arr);
        SortingAlgorithms.InsertionSort(arr.clone());
        long elapsed5 = System.currentTimeMillis() - start5;
        
        long start6 = System.currentTimeMillis();
        SortingAlgorithms.mergeSort(arr.clone());
        long elapsed6 = System.currentTimeMillis() - start6;
        
        long start7 = System.currentTimeMillis();
        Arrays.sort(arr.clone());
        long elapsed7 = System.currentTimeMillis() - start6;
        
        long start8 = System.currentTimeMillis();
        SortingAlgorithms.quickSort(arr.clone(),0, arr.length-1);
        long elapsed8 = System.currentTimeMillis() - start8;
        
        System.out.println("Bubble Sort: " + elapsed + " (ms.)");
        System.out.println("Bubble Sort (SC): " + elapsed2 + " (ms.)");
        System.out.println("Gnome Sort: " + elapsed3 + " (ms.)");
        System.out.println("Selection Sort: " + elapsed4 + " (ms.)");
        System.out.println("Insertion Sort: " + elapsed5 + " (ms.)");
        System.out.println("Merge Sort: " + elapsed6 + " (ms.)");
        System.out.println("Java Sort: " + elapsed7 + " (ms.)");
        System.out.println("Quick Sort: " + elapsed8 + " (ms.)");
    }
}

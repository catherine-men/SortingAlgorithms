
package project8;

public class SortingAlgorithms {
    
public static void BubbleSort(int[] array)
    {
        for(int i = 0; i < array.length-1; i++)
            for(int j = 0; j < array.length-i-1; j++)
                if(array[j] > array[j+1])
                    {
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
    }
public static void BubbleSortCS(int[] array)
    {
        for(int i = 0; i < array.length-1; i++)
        {
            boolean swap = false;
            for(int j = 0; j < array.length-i-1; j++)
            {
                if(array[j] > array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swap = true;
                }
            }
            if(!swap)
            break;
        }
    }
public static void SelectionSort(int[] arr) 
    {
        for (int i = 0; i < arr.length - 1; i++)
            {
                int index = i;
                        
                for (int j = i + 1; j < arr.length; j++)
                    if (arr[j] < arr[index])
                        index = j;
                
                int smallerNumber = arr[index];
                arr[index] = arr[i];
                arr[i] = smallerNumber;
            }
    }
public static void InsertionSort(int arr[])
    {
        int i, key, J;
        for (i = 1; i < arr.length; i++)
        {
        key = arr[i];
        J = i - 1;
        
        while (J >= 0 && arr[J] > key)
        {
            arr[J + 1] = arr[J];
            J = J - 1;
        }
        arr[J + 1] = key;
        }
    }   
public static void mergeSort(int[] array) {
    
    if (array.length < 2)
    return;
    
   int mid = array.length / 2;
    int[] l = new int[mid];
    int[] r = new int[array.length - mid];
    
   for (int i = 0; i < mid; i++)
    l[i] = array[i];
    
   for (int i = mid; i < array.length; i++)
    r[i - mid] = array[i];
    
mergeSort(l);
mergeSort(r);

merge(array, l, r, mid, array.length - mid);
}
public static void merge(int[] array, int[] l, int[] r, int left, int right) {
    
    int i = 0, j = 0, k = 0;

    while (i < left && j < right) {
            if (l[i] <= r[j]) {
                array[k] = l[i];
                i++;
            }
            else {
                array[k] = r[j];
                j++;
            }
            k++;
        }
            while (i < left)
                array[k++] = l[i++];
            while (j < right)
                array[k++] = r[j++];
    }
static void swap(int[] arr, int i, int j)
{
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
static int partition(int[] arr, int low, int high)
{
    int pivot = arr[high]; 
      
    int i = (low - 1); 
  
    for(int j = low; j <= high - 1; j++)
    {
          
        if (arr[j] < pivot) 
        {
              
            i++; 
            swap(arr, i, j);
        }
    }
    swap(arr, i + 1, high);
    return (i + 1);
}
static void quickSort(int[] arr, int low, int high)
{
    if (low < high) 
    {
        int pi = partition(arr, low, high);
  
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
}
    public static void gnomeSort(int[] a)
    {
    int i=1;
    int j=2;
 
    while(i < a.length) {
        if ( a[i-1] <= a[i] ) {
            i = j; j++;
        } else {
        int tmp = a[i-1];
        a[i-1] = a[i];
        a[i--] = tmp;
         i = (i==0) ? j++ : i;
        }
      } 
    }
}


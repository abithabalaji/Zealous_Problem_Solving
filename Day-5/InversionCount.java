package Day-5;

public class Inversioncount {
    public static int countInversions(int [] array){
        return mergesort(array,0,array.length-1);
    }
    private static int mergesort(int[] array,int left,int right){
        int count =0;
        if(left < right){
            int mid=(left+right)/2;
            
            count += mergeSort(array, left, mid);
            count += mergeSort(array, mid + 1, right);
            
        }
    }
    
       

    
    


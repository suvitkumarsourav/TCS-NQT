public class SelectionSort{
    public static void selectionSort(int[]array,int n){
        for(int i=0;i<n-1;i++){
            int minimum=i;
            for(int j=i+1;j<n;j++){
               
                if(array[j]<array[minimum])
                {
                minimum=j;
            }
        }
        
        //swapping
        int temp = array[i];
        array[i] = array[minimum];
        array[minimum] =temp;
    }
}

    public static void main(String[] args){
       int[] array={13,46,24,52,20,9};
       int n=array.length;
       System.err.println("Before array is :");
       for(int i=0;i<n;i++){
        System.err.println(array[i] + "");
       }
       selectionSort(array,n);
       System.err.println("After array is :");
       for(int i=0;i<n;i++){
        System.err.println(array[i] +"");
       }
    }
 }

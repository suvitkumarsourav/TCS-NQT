public class BubbleSort {
    public static void bubble(int[]array){
        int n=array.length;
        for(int i=0;i<n-1;i++)
            for(int j=0;j<n-i-1;j++)
             if(array[j]>array[j+1])
            {
                //swapping here
                int temp=array[j];
                array[j]=array[j+1];
                array[j+1]=temp;
            }
             
        }
        public static void printArray(int[] array) 
        {
         int n=array.length;
         for(int i=0;i<n;i++)
            System.out.println(array[i] +" ");
        }
        public static void main(String args[]) {
            int[] array={64,34,25,12,22,11,90};
            bubble(array);
            System.out.println("Sorted array is :");
            printArray(array);
        }


}

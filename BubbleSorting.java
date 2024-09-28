public class BubbleSorting {
    public static void bubbleSort(int[] array){
        int n= array.length;
        for(int i=0;i<n-1;i++)
        for(int j=0;j<n-i-1;j++)
        if(array[j]>array[j+1]){
            int temp=array[j];
            array[j]=array[j+1];
            array[j+1]=temp;
         }
    }
        public  static void printArray(int[] array){
            int n=array.length;
            for (int i =0 ; i < n; i++) {
                System.out.println(array[i] + " ");
            }
        }
        public static void main(String[] args) {
            //calling the bubble sort
            int[] array={45,55,10,20,47,90,11};
            bubbleSort(array);
            System.out.println("THE SORTED ARRAY ELEMENT IS :");
            printArray(array);

        }
    
}

class SortArray{
  public static void main(String args[]){
    int[] arr={5,2,6,3,2};
    int[] arr1={5,6,1,3,2,10};
    int[] arr2={0,6,1,20,2,10};
   
   System.out.print("Array before Sort=="); 
   PrintArray(arr);
   System.out.println(); 
   PrintArray(arr1);
   System.out.println(); 
   PrintArray(arr2);
   System.out.println(); 
   System.out.print("Array from bubbleSort=="); 
   bubblesort(arr);
   PrintArray(arr);
   System.out.println(); 
   System.out.print("Array from selectionSort=="); 
   selectionsort(arr1);
   PrintArray(arr1);
   System.out.println(); 
   System.out.print("Array from insertionSort=="); 
   insertionsort(arr2);
   PrintArray(arr2);
 }
  
 //PRINT ARRAY
static void PrintArray(int arr[]){
 for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
  }
}

//BUBBLE SORT
static void bubblesort (int arr[]){
 for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr.length-1;j++){
       if(arr[j]>arr[j+1]){
         int temp=arr[j];
         arr[j]=arr[j+1];
         arr[j+1]=temp;
       }
    }
  }
}

//SELECTION SORT
static void selectionsort (int arr[]){
 for(int i=0;i<arr.length;i++){
    int smallest=i;

    for(int j=i+1;j<arr.length;j++){
       if(arr[j]<arr[smallest]){
         smallest=j;
       }
    }
    int temp=arr[i];
    arr[i]=arr[smallest];
    arr[smallest]=temp;
  }
 }

//INSERTION SORT
static void insertionsort (int arr[]){
 for(int i=1;i<arr.length;i++){
    int key=arr[i];
    int j=i-1;
   
    while(j>=0&&key<arr[j]){
      arr[j+1]=arr[j];
      j--;
    }
    arr[j+1]=key;
 }
}

}




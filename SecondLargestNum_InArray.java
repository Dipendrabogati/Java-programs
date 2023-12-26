class SecondLargest{
  public static void main(String args[]){
    int[] arr={5,2,6,3,8,55,2,100,100};
    System.out.println("Given Array=="); 
    PrintArray(arr);
    int secondLargest=findsecondLargest(arr);
    System.out.println("Second Largest number=="+secondLargest); 
    int secondSmallest=findsecondSmallest(arr);
    System.out.println("Second smallest number=="+secondSmallest);
 }

  //PRINT ARRAY
static void PrintArray(int arr[]){
 for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
  }
 System.out.println();
}

//SECOND LARGEST
 static int findsecondLargest(int[] arr){
   int secLar=arr[0];
   int largest=arr[0];
   for(int i=0;i<arr.length;i++){
      if(largest<arr[i]){
        largest=arr[i];
      }  
   }
   
   for(int i=0;i<arr.length;i++){
      if(secLar<arr[i]&&arr[i]<largest){
       secLar=arr[i];
      }  
   }
  return secLar;
 }

 //SECOND SMALLEST
 static int findsecondSmallest(int[] arr){
   int secSmallest=arr[0];
   int smallest=arr[0];
   for(int i=0;i<arr.length;i++){
      if(smallest>arr[i]){
        smallest=arr[i];
      }  
   }
   
   for(int i=0;i<arr.length;i++){
      if(secSmallest>arr[i]&&arr[i]>smallest){
       secSmallest=arr[i];
      }  
   }
  return secSmallest;
 }
}
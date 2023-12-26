class BinarySearch{
  public static void main(String args[]){
    int[] arr={5,2,6,3,8,55,2};
    int searchItem=8;
    
   System.out.print("Array=="); 
   PrintArray(arr);
   System.out.println(); 
   System.out.println("Search Item=="+ searchItem);
   int index =binarySearch(arr,0,arr.length-1,searchItem);
    if (index != -1) {
            System.out.println("Search Item found at index==" + index);
        } else {
            System.out.println("Search Item not found.");
        }
 }

  //PRINT ARRAY
static void PrintArray(int arr[]){
 for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
  }
}
 //BINARY SEARCH
 static int binarySearch(int arr[],int start,int end,int searchItem){
  
 if(start<=end){
   int mid=start+ (end-start)/2;
   if(arr[mid]==searchItem){
    return mid;
   }
   if(arr[mid]>searchItem){
    return binarySearch(arr,start,mid-1,searchItem);
   }
   if(arr[mid]<searchItem){
    return binarySearch(arr,mid+1,end,searchItem);
   }
 } 
 return -1;
}

}
import java.util.Scanner;


class Array{
  public static void main(String args[]){
  Scanner scanner = new Scanner(System.in);
  int arr[]=new int[5];
  System.out.println("Enter Array Element :  "); 
  
   for(int i=0;i<5;i++){
     arr[i]=scanner.nextInt();
  }   
 
  for(int a : arr)
    System.out.print(a + "  ");
  
 }
}
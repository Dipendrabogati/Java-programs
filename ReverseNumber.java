class Third{
  public static void main(String args[]){
   int number=Integer.parseInt(args[0]);
   int remainder=0,reversenum=0;
   
   while(number>0){
    
    remainder=number%10;
    reversenum=reversenum*10 + remainder;
    number=number/10;
   }
     
    System.out.print("reveresed number is = "+ reversenum);
 }
}
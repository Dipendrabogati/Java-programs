class Second{
  public static void main(String args[]){
   int startnumber=Integer.parseInt(args[0]),endnumber=Integer.parseInt(args[1]);
   int i,j,count=0;
   for(i=startnumber;i<=endnumber;i++){
     count=0;
      for(j=2;j<i;j++){
        if(i%j==0){
         count=count+1;
        }
      }
      if(count==0){
        System.out.print(i+" ");
      }
   }
  
 }
}
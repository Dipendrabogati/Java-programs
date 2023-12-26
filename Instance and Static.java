class Third{
   static int a=3;
Third(){
  a=5;
  System.out.println( "Constructor=="+a);
}


{
  System.out.println( "Instance=="+a);
}
static{
  System.out.println( "Static=="+a);
}


  public static void main(String args[]){
  
   new Third();
 }
}
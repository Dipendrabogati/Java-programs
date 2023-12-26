 class StaticKeyword{
   static String name="Dipendra";

  StaticKeyword(String name){
    this.name=name;
 }
 StaticKeyword(){
    
 }
  void show(){
   // name="Dipak";
    System.out.println("Given name is  "+name);
  }
}


class Ass44{
 public static void main(String args[]){
   StaticKeyword s1=new StaticKeyword("Dipak");
   StaticKeyword s2=new StaticKeyword();
   s1.show();
   s2.show(); 
 }
}

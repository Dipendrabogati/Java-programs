class ThisKeyword{
   int a=8; int b=10;
 ThisKeyword(int a,int b){
   this.a=a;
   b=b;
   System.out.println("value of a="+a+"  value of b="+b);
 }
 void print(){
   System.out.println("value of a="+a+"  value of b="+b);
 }
public static void main(String []arg){
   ThisKeyword d=new ThisKeyword(2,4);
    d.print();
}

} 
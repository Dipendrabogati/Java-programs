class Forth{
  public static void main(String args[]){
   int number=Integer.parseInt(args[0]);
   String name=args[1];
   
   Alfa object=new Alfa();
  
   object.doreverse(number);
   object.doreverse(name);
   
 }
}
class Alfa{
   int remainder=0,reversenum=0;

   boolean isequal=false;
  void doreverse(int number){
    int n=number;
    while(number>0){
    
    remainder=number%10;
    reversenum=reversenum*10 + remainder;
    number=number/10;
   }

    System.out.println("given number= "+n);
    System.out.println("reverse number= "+reversenum);
   if(n==reversenum){
     System.out.println("given number is palimdrome " );
   }else{System.out.println("given number isnot palimdrome " );}
  }
   
  void doreverse(String myname){
    String name=myname;
     String revname="";
     for(int i=0;i<name.length();i++){
       char ch=name.charAt(i);
       revname=ch+revname;
    }
    
    System.out.println("given string= "+name);
    System.out.println("reverse string= "+revname);
    isequal=name.equals(revname);
    if(isequal){
    
    System.out.println("Typed string is palindrome");
    }else{
        System.out.println("Typed string is not  palindrome");
     }
    
  }
}
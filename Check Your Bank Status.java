import java.util.Scanner;

class Bank{
   static int pass;
   static int password=543;
   static String name="Dipendra Bogati";
   static int balance=10000;

    // CHECK BALANCE
    static void checkBalance(){
      System.out.println("Enter your password");
      Scanner scan=new Scanner(System.in); 
       pass=scan.nextInt();
      if(pass==password){
         System.out.println("Your available balanance is "+balance);
      }
      else{
         System.out.println("You entered wrong Password");  
      }
    }
   
    //DEPOSIT
    static void depositMoney(){
      System.out.println("Enter your password");
      Scanner scan=new Scanner(System.in); 
       pass=scan.nextInt();
      if(pass==password){
         System.out.println("Enter amount you want to deposit");
         int  newAmount=scan.nextInt();
         balance=balance+newAmount;
         System.out.println("Now your balanance is "+balance);
      }
      else{
         System.out.println("You entered wrong Password");  
      }
    }
    
   //SEE DETAIL
    static void seeDetail(){
      System.out.println("Enter your password");
      Scanner scan=new Scanner(System.in); 
       pass=scan.nextInt();
      if(pass==password){         
         System.out.println("Name "+name);
         System.out.println("Your available balanance is "+balance);
      }
      else{
         System.out.println("You entered wrong Password");  
      }
    }

    //WITHDRAW
    static void withdrawMoney(){
      System.out.println("Enter your password");
      Scanner scan=new Scanner(System.in); 
       pass=scan.nextInt();
      if(pass==password){
         System.out.println("Enter amount you want to withdraw");
         int  newAmount=scan.nextInt();
         balance=balance-newAmount;
         System.out.println("Now your balanance is "+balance);
      }
      else{
         System.out.println("You entered wrong Password");  
      }
    }
    
   //CHANGE PIN
    static void changePin(){
      System.out.println("Enter your previous password");
      Scanner scan=new Scanner(System.in); 
      pass=scan.nextInt();
      if(pass==password){
          System.out.println("Enter new password");
          int  newPin=scan.nextInt();
          password=newPin;
      }
      else{
         System.out.println("You entered wrong Password");  
      }
    }
    
 

}

class Customer{
   public static void main(String args[]){
      Bank c1=new Bank();
      Scanner scan=new Scanner(System.in);    

      System.out.println("Enter Your Choices."); 
      System.out.println("1.See Your Detail.");  
      System.out.println("2.Check Balance."); 
      System.out.println("3.Withdraw Money.");
      System.out.println("4.Deposit Money.");
      System.out.println("5.Change Pin.");
      int choice=scan.nextInt();
      
      switch(choice){
        case 1:
                   c1.seeDetail();
                   break; 
        case 2:
                   c1.checkBalance();
                   break; 
        case 3:
                   c1.withdrawMoney();
                   break; 
        case 4:
                   c1.depositMoney();
                   break; 
        case 5:
                   c1.changePin();
                   break;  
        default:
                   System.out.println("Wrong Choice.");  
      }
     
   }

}
class Shape{
  final double pi=3.14d;
  
  Shape(double radius){
     System.out.print("Area of circle== "+(pi*radius*radius));
      System.out.println();
  }

  Shape(int side){
    System.out.print("Area of square== "+(side*side));
      System.out.println();
  }

  Shape(int height,int width){
    System.out.print("Area of rectangle== "+(height*width));
      System.out.println();
  }

   Shape(double height,int width){
    System.out.print("Area of triangle== "+((height*width)*0.5));
      System.out.println();
  }

}

class Area{
 public static void main(String args[]){
   Shape circle=new Shape(4.5d);
   Shape rectangle=new Shape(4,5);
   Shape triangle=new Shape(4.5d,3);
   Shape square=new Shape(5);
    
 }
}

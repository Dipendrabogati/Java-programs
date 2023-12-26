 class Shape1{
  
  void area(){};
}

class Circle extends Shape1{
  final double pi=3.14d;
  double radius;
  Circle(double rad){
     radius=rad;
  }
  
  @Override
  void area(){
     System.out.println("Area of circle== "+(pi*radius*radius));
     
  }

}


class Rectangle extends Shape1{
  int height,width;

  Rectangle( int height,int width){
     this.height=height;
     this.width=width;
  }
  
   @Override
  void area(){
     System.out.println("Area of rectangle== "+(height*width));
  }

}

class Triangle extends Shape1{
  int base,height;

  Triangle( int base,int height){
     this.base=base;
     this.height=height;
  }
  
  @Override 
  void area(){
     System.out.println("Area of triangle== "+((height*base)*0.5));
  }

}
 

class Square extends Shape1{
  int side;

  Square( int side){
     this.side=side;
  }
  
  @Override
  void area(){
     System.out.println("Area of Square== "+(side*side));
  }

}
class Area{
 public static void main(String args[]){
   Shape1 circle=new Circle(4.5d);
   Shape1 rectangle=new Rectangle(4,5);
   Shape1 triangle=new Triangle(4,3);
   Shape1 square=new Square(6);

   circle.area();
   triangle.area();
   rectangle.area();
   square.area();
    
 }
}

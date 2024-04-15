package Week04.Abstract;

import Week03.oop.ornek02.Shape;

public class Rectangle extends Shape {
     private  double width;
      private double height;


      Rectangle(double width, double height) {
          this.width = width;
          this.height = height;


      }

      @Override

    public double  calculateArea(){

          return width*height;





    }
}

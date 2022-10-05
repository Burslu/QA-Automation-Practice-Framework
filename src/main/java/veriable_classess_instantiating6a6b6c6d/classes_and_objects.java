package veriable_classess_instantiating6a6b6c6d;

public class classes_and_objects {
   private double lenght;
   private double width;
    public classes_and_objects(){
        lenght = 0;
        width  = 0;
    }
    public classes_and_objects(double lenght,double width){
         setLenght(lenght);
         setWidth(width);
    }

    public double getLenght(){
        return lenght;
    }
    public void  setLenght(double lenght){
        this.lenght = lenght;
    }
    public double getWidth(){
        return width;

    }
    public void  setWidth(double width){
        this.width =width;
    }
    double calculatePrimeter(){
      return (2 * lenght) + (2 * width );
    }
    double calculateArea(){
      return lenght * width;

    }
}

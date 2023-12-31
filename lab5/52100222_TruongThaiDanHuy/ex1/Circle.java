public class Circle {
    protected double radius;
    protected String color;

    public Circle(){
        radius = 1.0;
        color = "red";
    }
    public Circle (double radius){
        this.radius = radius;
        color ="";
    }
    public Circle ( double radius , String color){
        this.radius = radius;
        this.color = color;
    }
    public double getRadius (){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public void setRadius( double radius){
        this.radius = radius;
    }
    public void setColor( String color){
        this.color = color;
    }
    public double getArea (){
        double Area = (Math.PI)*Math.pow(radius,2);
        return Area;
    }
    @Override
    public String toString(){
        return "Circle : { radius :" + radius +" , color : " + color +" }";
    }
}

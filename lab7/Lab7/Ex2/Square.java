public class Square extends Rectangle{
    public Square() {
        super();
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    public double getSide() {
        return super.getLength();
    }
    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }
    public void setWidth(double side) {
        super.setWidth(side);
    }
    public void setLength(double side) {
        super.setLength(side);
    }
    public boolean equals(Shape s) {
        if (s instanceof Square) {
            Square temp = (Square) s;
            if (this.getArea() == temp.getArea()) {
                return true;
            }
        }
        return false;
    }
}

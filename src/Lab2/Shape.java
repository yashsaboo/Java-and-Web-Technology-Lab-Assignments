package Lab2;

public abstract class Shape {
    String color;
    boolean filled;
    Shape()
    {
        color = "Black";
        filled = false;
    }
    Shape(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }
    String getcolor()
    {
        return color;
    }
    void setColor(String color)
    {
        this.color = color;
    }
    boolean isFilled()
    {
        return filled;
    }
    void setFilled(boolean filled)
    {
        this.filled = filled;
    }
    abstract double getArea();
    abstract double getPerimeter();        
    public static void main(String args[])
    {
        
    }
}

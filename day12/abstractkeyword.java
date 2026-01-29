abstract class Shape{
    abstract void draw();

    void display(){
        System.out.println("this is a shape");
    }
}
class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("drawing a circle");
    }
}

public class abstractkeyword {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
        s.display();
    }
}

class Human{
    private int age = 22;
    private String name = "manoj";

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }
}

public class encapsulation {
    public static void main(String[] args)
    {
        Human obj = new Human();
        System.out.println(obj.getAge() + " ; " + obj.getName());
    }
}

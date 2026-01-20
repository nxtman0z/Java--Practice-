class Human{
    private int age;
    private String name;

    public Human(){
        System.out.println("constructor");
        age = 22;
        name = "obito";
    }

    public void all(){
        System.out.println(age + name);
    }
}

public class constructors {
    public static void main(String[] args) {
        Human obj = new Human();
        Human obj2 = new Human();

        obj.all();
    }
}

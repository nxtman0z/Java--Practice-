class Animal{
    void sound(){
        System.out.println("Animal sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("dog barks");
    }
    void fetch(){
        System.out.println("dog is fetching");
    }
}

public class upcasting {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}

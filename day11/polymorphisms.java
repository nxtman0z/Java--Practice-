

class Animal{
    void sound(){
        System.out.println("animal makes sound");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("dog barks");
    }
}
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class polymorphisms {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.sound();
        a2.sound();

    }
}

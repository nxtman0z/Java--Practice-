


class A{
    public void showMeAtTheCornerLikeYouThe(){
        System.out.println("in a show");
    }
}

class B extends A{
    @Override
    public void showMeAtTheCornerLikeYouThe(){
        System.out.println("in b show");
    }
}
public class annotation {
    public static void main(String[] args) {
        B obj = new B();
        obj.showMeAtTheCornerLikeYouThe();
    }
}

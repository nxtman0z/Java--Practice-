public class methods{
    public static void main(String[] args){
        Computer com = new Computer();
        com.playMusic();
    }
}
class Computer{
    public void playMusic(){
        System.out.println("music playing..");
    }
    public  String getPen(){
        return "pen";
    }
}
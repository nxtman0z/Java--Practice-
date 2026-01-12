public class methods{
    public static void main(String[] args){
        Computer com = new Computer();
        com.playMusic();
        String str = com.getPen(1);
        System.out.println(str);
    }
}
class Computer{
    public void playMusic(){
        System.out.println("music playing..");
    }
    public  String getPen(int cost){
        if(cost >= 10){
            return "pen";
        }else{
            return "nothing";
        }
    }
}
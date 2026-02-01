
enum Status{
    Running,Failed,Pending,Success;
}
public class enums {
    public static void main(String[] args) {
        Status[] ss= Status.values();

        
        for(Status s1 : ss)
        {
            System.out.println(s1+ " :" +s1.ordinal());
        }
    }
}

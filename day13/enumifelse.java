enum Status{
    Running,Failed,Pending,Success;
}

public class enumifelse {
    public static void main(String[] args) {
        Status s = Status.Pending;

        if (s == Status.Running)
            System.out.println("all good");
        else if(s == Status.Failed)
            System.out.println("try again");
        else
            System.out.println("done");
    }
}

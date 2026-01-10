public class newss {
    public static void main(String[] args){
        String day ="sunday";
        String result = "";

        switch(day){
            case "monday","tuesday" -> System.out.println("6 am");
            case "sunday" -> System.out.println("10 am");
            case "wednesday" ->System.out.println("5 am");
        }
    }
}

public class newss {
    public static void main(String[] args){
        String day ="sunday";
        String result = "";

        result = switch(day){
            case "monday","tuesday" -> ("6 am");
            case "sunday" -> ("10 am");
            case "wednesday" ->("5 am");
        }
    }
}

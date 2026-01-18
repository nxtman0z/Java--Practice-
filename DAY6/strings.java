

public class strings {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("manoj");
        System.out.println(sb.length());

        sb.append("uchiha");
        sb.insert(0, "manoj");
        System.out.println(sb);

        String str = sb.toString();
    }
}

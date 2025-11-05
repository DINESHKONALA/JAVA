package others;
public class stringbuffer {
    public static void main(String[] arg)
    {
        StringBuffer sb = new StringBuffer("hello");
        sb.append(" user");
        System.out.println(sb);

        sb.insert(6, "dear ");
        System.out.println(sb);

        sb.delete(6, 11);
        System.out.println(sb); 

        sb.setLength(30);
        System.out.println(sb.length());
    }
}


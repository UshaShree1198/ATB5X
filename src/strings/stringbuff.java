package src.strings;

public class stringbuff
{
    public static void main(String[] args) {
        StringBuffer sb  = new StringBuffer("usha");
        sb.reverse();
        System.out.println(sb);


        /* string buffer is mutable in nature
        it is thread safe  ->  it will be slow, so we have to avoid
        */
    }
}

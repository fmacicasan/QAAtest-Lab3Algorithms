/**
 * @author flo
 * @since 22/11/2016.
 */
public class Lab3Alg3 {
    public static void main(String[] args) {
        int a = Integer.valueOf(ReadUtils.readValueFromConsole());
        int b = Integer.valueOf(ReadUtils.readValueFromConsole());

        int diff = a;
        for(int i = 0; i < b; i++ ) {
            diff = diff - 1;
        }
        System.out.println(a + " - " + b + " = " + diff);
    }
}

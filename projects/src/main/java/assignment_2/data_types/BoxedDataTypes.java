package assignment_2.data_types;

public class BoxedDataTypes {
    public static void main (String args[]) {
        /*
            Declare your code here!
         */

        Integer i_1 = 0;
        // versus
        int i_2 = 0;

        System.out.println( "Value of Integer i_1 = " +i_1);
        System.out.println( "Value of int i_2 = " + i_2);
        System.out.println( "Is i_1 == i_2?     The answer is " + (i_1 == i_2));
        System.out.println( "Is i_1 equals i_2? The answer is " + (i_1.equals( i_2)));
    }
}

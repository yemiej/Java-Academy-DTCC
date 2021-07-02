package assignment_2.data_types;

public class BooleansCompoundsExamples {
    public static void main (String args[]) {

        // Simple assignment
        boolean myBoolean_1 = false;
        boolean myBoolean_2 = true;

        // Assignment with operators and or methods
        boolean myBoolean_3 = 3 > 2;
        boolean myBoolean = "yellow".equals("blue");

        // Assignment with operators
        int x_1 = 3 + 1;
        int x_2 = 9 - 1;
        // Assignment with previously used variables and operators
        double d_1 = x_1 + x_2 * 2.5;
        System.out.println("The value of d_1 is " + d_1);
    }
}


// Answers to Data Types
// x_2 * 2.5 will be evaluated first i.e 8 * 2.5 =20.0
// The result 20.0 will be added to x_1 i.e 4 + 20.0
// Giving the final result 24.0

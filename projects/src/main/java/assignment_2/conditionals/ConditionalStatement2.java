package assignment_2.conditionals;

public class ConditionalStatement2 {
    public static void main (String args[]) {
        int value = 100;
        if(value != 2) {
            if(value == 100) {
                System.out.println("You Win");
            }
        } else {
            System.out.println("You Lose");
        }

        doSomething(true);
    }


    public static void doSomething(boolean b) {
        if(b) {
            System.out.println("You win again");
        }

        if(b != false) {
            System.out.println("You win, again, and again");
        }

        if(b || !b) {
            System.out.println("I think you would probably always win here");
        }

        if(b && b ) {
            System.out.println("You will never win here!");
        }
    }
}

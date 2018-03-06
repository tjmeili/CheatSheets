/**
 * https://docs.oracle.com/javase/tutorial/java/concepts/object.html
 */

//      Basic shit to know

/*
 *                          Variable Scope
 *
 *      General Rule: variables that are defined within a block (between curly brackets)
 *      are not not accessible outside that block, only within.
 *
 */

public class ClassName {

    // static variable
    static int x = 0;

    public static void main(String[] args){                 // this is the default method that runs first in standard java programs. (like onCreate for Android)

        /*
         *          Relational operators
         *
         *      greater than                >
         *      less than                   <
         *      greater than or equal to    >=
         *      less than or equal to       <=
         *      equal to                    ==
         *      not equal to                !=
         *
         *          Logical Operators
         *
         *     And      &&
         *     Or       ||
         *     Not      !
         */

        /**
         *      IF statements
         */
        int num1 = 7, num2 = 12;

        if(num1 >= 4){
            //true
        }

        if(num1 <= 30 && num2 > num1){
            //false
        }

        if( !(num1 == 6) ){
            // true
        }

        // if-else statement
        if(num2 >= 41 || num1 > 0){
            // true
            // do something
        } else {
            // if not, do this
        }

        // else if
        if(num1 == 20){
            //do something
        } else if(num1 == 21){
            // do this
        } else {

        }

        /**
         *      FOR loops
         */

        for(int i = 0; i < 9; i++){
            //do something 10 times
        }

        // Nested for loops
        int x = 0, y = 0;

        for(int i = 0; i < 9; i++){
            x++;
            for(int j = 0; j < 9; j++){
                y++;
            }
        }
        // x = 10, y = 100;


    }

}

package techy.hw.two;

public class HwJavaTwo {


    public static void main(String [] agrs ) {


        System.out.println("_ Java Home Work _");

        System.out.println("... Data Types Method ...");

        dataTypes();
        operators();



    }

    // DataTypes Method

    public static void dataTypes() {


        int techyInt = 15;
        byte techyByt = 10;
        short techyShot = 20;
        long techyLon = 40l;
        float techyFlot = 250f;
        double techyDuble = 200d;

        char techyVariable = 'T';

        boolean techyBolan = false;





        System.out.println(techyInt);
        System.out.println(techyByt);
        System.out.println(techyShot);
        System.out.println(techyLon);
        System.out.println(techyFlot);
        System.out.println(techyDuble);
        System.out.println(techyVariable);
        System.out.println(techyBolan);



    }

    // Arithmetic Operators Method

    public static void operators(){


        System.out.println("... Arithmetic Operators ...");


        // + Additive operator

        int tNumOne = 110;
        int tNumTwo = 20;

        // - Subtraction operator

        int tNumthree =50;
        int tNumFour = 30;

        // * Multiplication operator

        int tNumfive = 4;
        int tNumSix = 6;

        // / Division operator

        int tNumseven = 10;
        int tNumEight = 5;

        // % Remainder operator

        int tNumNine = 15;
        int tNumTen = 10;




        System.out.println(tNumOne + tNumTwo);
        System.out.println(tNumthree - tNumFour);
        System.out.println(tNumfive * tNumSix);
        System.out.println(tNumseven / tNumEight);
        System.out.println("Remainder :-" +" " +  tNumNine % tNumTen);


        // Unary Operators Method

        System.out.println("... Unary Operators ...");


        // ++ Increment operator

        int tVal = 20;

        tVal++;

        // -- Decrement operator

        int tValtwo = 20;

        tValtwo--;

        // ! Logical complement operator

        boolean tValu = !false;


        System.out.println(tVal);
        System.out.println(tValtwo);
        System.out.println(!tValu);



    }




    }



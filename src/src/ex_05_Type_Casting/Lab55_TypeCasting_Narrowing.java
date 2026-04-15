package src.ex_05_Type_Casting;

public class Lab55_TypeCasting_Narrowing {

    static void main(String[] args) {
        int val = 300;

        // **0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 1 0 1 1 0 0**


       // byte b = Val; //Narrowing - Implicit Casting - Valid ? No
        byte b = (byte) val; //Narrowing - ExplicitCasting - Valid
        System.out.println(b);

        // **0 0 1 0 1 1 0 0**
        // value is
        //
         //  0 + 0 + 32 + 0 + 8 + 4 + 0 + 0 = **4.**

    }
}

package src.ex_05_Type_Casting;

public class Lab54_TypeCasting {

    static void main(String[] args) {

        byte b = 10;
        int a =  b;  //valid Syntax -> Widening -> Implicit Casting - Automatically done.
        int a1 = (int)b; // Valid Syntax -> Wideing -> Explicit Casing - Not required.

       // int a1 = 300;
       // byte b1 = a1;
    }
}

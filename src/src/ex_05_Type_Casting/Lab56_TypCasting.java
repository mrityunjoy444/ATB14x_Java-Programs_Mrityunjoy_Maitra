package src.ex_05_Type_Casting;

public class Lab56_TypCasting {

    static void main(String[] args) {

        long phone_no = 9073267057l;
       // short s= phone_no; //Naarrowing - implicit : Not Possible
        short s = (short) phone_no; // Naarrowing - Explicit : Possible

        System.out.println(s);
    }
}

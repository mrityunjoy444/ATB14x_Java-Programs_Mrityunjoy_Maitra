package src.ex_04_Operators;

public class Lab43_OR_AND_GATE {

    static void main(String[] args) {

         // ||OR gate
        // T || T -> T
        // T || F -> F
        // F || T -> F
        // F || F -> F
        System.out.println(true||true);

        System.out.println(true && true);  // True
        System.out.println(true && false);  // False
        System.out.println(false && true);  // False
        System.out.println(false && false);  // False
    }
}

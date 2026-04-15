package src.ex_04_Operators;

public class Lab44_Interview {

    static void main(String[] args) {
        int Mrityunjoy_Salary = 12;
        boolean b = !(Mrityunjoy_Salary> 10 || Mrityunjoy_Salary <5);
        System.out.println(b);


        // Divide and Conquer!

        // A-> Mrityunjoy_Salary >10 -> 12>10 -> True
        // B-> Mrityunjoy_Salary <5 -> 12<5 -> False
        // (A || B) -> True
        // !(True) -> False
    }
}

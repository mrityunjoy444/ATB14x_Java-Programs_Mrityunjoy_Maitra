package src.ex_04_Operators;

public class Lab40_Interview_Concat_Plus {

    static void main() {

        String first_name = "Mrityunjoy";
        String last_name = "Maitra";

        int a = 10;
        int b =50;

        System.out.println(first_name + last_name + a + b);
        System.out.println(a + b + first_name + last_name);

        //BODMAS- Bracket of Division, Multiplication, Addition and Substraction
        System.out.println(first_name + last_name + (a + b));
    }
}

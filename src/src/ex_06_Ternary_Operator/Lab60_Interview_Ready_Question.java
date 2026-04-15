package src.ex_06_Ternary_Operator;

public class Lab60_Interview_Ready_Question {

    static void main(String[] args) {

        int age = 27;

        // Nested Ternary
        // result  = condition1 ? expression1 : (Condition2 ? expression2 : expression3);

        String result = (age > 18)? (age >25 ? "You can ride on bike" : "You can go to Nepal But can't ride bike") : "No";
        System.out.println(result);
    }
}

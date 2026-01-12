package ex03_Literals;

public class Lab030_Char_Literals {

    static void main(String[] args) {

        char c1 = 'A'; // A to Z, a-z, !@#$%^&*()_+
        // char c = "A"; // " " == String = Bunch of Char

        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' ' ; // blank space


        // Escape Sequence

        char new_line = '\n' ;
        char tab_line = '\t' ;
        char back_space = '\b' ;
        char carriage_return = '\r' ;

        System.out.println("MrityunjoyMaitra");
        System.out.println("Mrityunjoy"+new_line+"Maitra");
        System.out.println("Mrityunjoy\nMaitra");
        System.out.println("Mrityunjoy"+tab_line+"Maitra");
        System.out.println("Mrityunjoy"+back_space+"Maitra");
        System.out.println("Mrityunjoy"+new_line+"Maitra");
        System.out.println("____");
        System.out.println("Hi, This is the First line"+new_line+"This is the second line\n This is Third line");

        char c10 = 'A';
        // // ASCII, (limited numbers) - A ->65


        char ruppes = '₹';
        System.out.println(ruppes);

        char my_laugh_smily= '\u1f60'; // :)
        System.out.println(my_laugh_smily);

        char c11 = '\u1f60';





    }
}

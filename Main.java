public class Main{
    static Questions question;
    
    public static void main(String[]args){

        //constructors
        Questions questions = new Questions();
        Tally tally = new Tally(0, 0, 0, 0, 0);


        //introduction
        Introduction.Introduction();
        
        //opening
        System.out.println("Narrator: It has been 10 years since you've arrived in a strange world,"+ 
            "similar to Earth in medieval era but it has magic and monsters.\n"+
            "You have climbed in ranks as an A class adventurer and you currently has a crush on another adventurer\n");
        
        questions.choice1();
        questions.choice2();
        questions.choice3();
        questions.choice4();
        questions.choice5();
        questions.choice6();
        questions.choice7();
        questions.choice8();
        questions.choice9();
        questions.choice10();
        questions.choice11();
        questions.choice12();
        questions.choice13();
        questions.choice14();
        questions.choice15();
        questions.choice16();
        questions.choice17();
        questions.choice18();
        questions.choice19();
        questions.choice20();

        //after Q19
        System.out.println("\nYou accepted happily for your promotion, then you run back to home and shares the news with your crush\n\nYou both move to the capital city for a brand new adventures\n\nMany decades later, You are retired and has happy life, on your bed, you close your eyes...\n");
        
        //after Q20
        System.out.println("--------------------T H E  E N D--------------------");

        //RESULT
        System.out.println("\nDid you enjoy your adventure?\nThen I will tell the result of the choices you have made: ");
        System.out.println("Between Extrovert and Introvert, the result is: ");
        tally.resultIE();

        System.out.println("\nBetween Optimist and Pessimist, the result is: ");
        tally.resultOP();

        System.out.println("\nThank you for participating!");

    }
}
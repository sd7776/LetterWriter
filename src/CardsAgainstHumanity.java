import java.util.Scanner;

public class CardsAgainstHumanity {

    public static void main(String[] args){
        //Make set of black cards
        String[] blackCards = {"Before I kill you, Mr bond, I need to show you: ",
                "Daddy why is mommy crying:", "What are my parents hiding from me:", "MTV's new reality show features eight washed-up celebritites living with:",
                "During sex, I like to think about:","BILLY MAYS HERE FOR: ", "What is the next happy meal:", "I drink to forget:",
                "What will always get you laid ?" , "Next from J.K. Rowling: Harry Potter and the Chamber of: "};

        //Make set of white cards
        String[] whiteCards = {"This 8 oz. of sweet Mexican black-tar heroin", "AIDS", "Historically black colleges", "Edible underpants", "A collection of high tech sex toys",
                "Doing it in the butt", "Natural male enhancement", "Date rape drug", "White privilege"};

        //Find out how many words are in each list
        int blackLength = blackCards.length;
        int whiteLength = whiteCards.length;
        do {
            //generate random indices
            int randBlack = (int) (Math.random() * blackLength);
            int randWhite = (int) (Math.random() * whiteLength);

            //Create the phrase
            String phrase = blackCards[randBlack] + " " + whiteCards[randWhite];

            //Print out the phrase
            System.out.println(phrase);
        }while (playAgain());
    }

    public static boolean playAgain(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Play again?(Y/N)");
        String choice = scan.next();
        if(choice.equalsIgnoreCase("y")) {
            return true;
        }
        else{
            System.out.println("Thanks for playing cards against humanity");
            return false;
        }
    }
}

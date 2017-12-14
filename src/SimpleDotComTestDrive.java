public class SimpleDotComTestDrive {

    public static void main(String[] args){

        int numOfGuesses = 0;

        GameHelper helper = new GameHelper();

        SimpleDotCom dot = new SimpleDotCom();

        int randomNum = (int)Math.random() * 5;

        int[] locations = {randomNum, randomNum + 1, randomNum + 2};

        dot.setLocationCells(locations);

        boolean isAlive = true;

        //String userGuess = "2";
        while(isAlive) {

            String userGuess = helper.getUserInput("enter a number: ");

            String result = dot.checkYourself(userGuess);

            numOfGuesses++;

            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took "+ numOfGuesses +" guesses");
            }
        }
    }
}

public class Hello {
    public static void main (String[] args ){
        boolean gameOver = true;


        int highScore= calculateScore(true, 800, 5, 100);
        System.out.println("The high score is " + highScore);

        System.out.println("the next high score is "+
        calculateScore(true, 10000, 8, 200));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        int finalScore = score;
        if(gameOver){
            finalScore+= (levelCompleted * bonus);
            finalScore+= 1000;
        }
        return finalScore;
    }
}

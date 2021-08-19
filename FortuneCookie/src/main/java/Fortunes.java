import java.util.Random;

public class Fortunes {

//    created an array of fortune cookie quotes
   static String[] fortunes = {"Today it's up to you to create the peacefulness you long for.","A friend asks only for your time not your money.","If you refuse to accept anything but the best, you very often get it.","A smile is your passport into the hearts of others.","A good way to keep healthy is to eat more Chinese food.","Your high-minded principles spell success.", "Hard work pays off in the future, laziness pays off now."," Change can hurt, but it leads a path to something better."," Enjoy the good luck a companion brings you."," People are naturally attracted to you.","Hidden in a valley beside an open stream- This will be the type of place where you will find your dream." };




    public static void main(String[] args) {
//        created a random obj named "rand"
        Random rand = new Random();
//        new variable
        int r = rand.nextInt(fortunes.length);
        System.out.println(fortunes [r]);

    }
}

import java.util.Random;

public class RandomNumberGen {

    Random random = new Random();
    int randomInt;
    boolean isCorrect = false;
    public RandomNumberGen()
    {
        randomInt = random.nextInt(99);
    }
    public RandomNumberGen(int randomInt)
    {
        this.randomInt = randomInt;
    }

    public int randomLogic(int i)
    {
        System.out.println(randomInt);
        if (i < randomInt)
        {
          //  System.out.println("Guess a higher number");
            return 1;
        }
        else if(i > randomInt)
        {
          //  System.out.println("Guess a lower number");
            return 2;
        }
        else
        {
         //   System.out.println("You guessed correct!");
            isCorrect = true;
            return 3;
        }

    }

//    public void switchLogic(int i)
//    {
//        switch (i)
//        {
//            case 1:
//                System.out.println("Guess a higher number");
//                break;
//            case 2:
//                System.out.println("Guess a lower number");
//            default:
//                System.out.println("You guessed the correct number!");
//        }
//    }

}

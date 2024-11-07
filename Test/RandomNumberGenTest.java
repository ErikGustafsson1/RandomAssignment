import org.junit.Test;

import static org.junit.Assert.*;

public class RandomNumberGenTest {

    @Test
    public void numberTooLow()
    {
     RandomNumberGen randomNumberGen = new RandomNumberGen(49);
     assertEquals( 1, randomNumberGen.randomLogic(45));
    }
}
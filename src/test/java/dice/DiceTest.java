import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class DiceTest {
    @Test
    void checkDiceInRange() {
        Dice myDie = new Dice();
        for(int i = 0; i < 101; i++){
            int result = myDie.roll(6);
            assertTrue(1<= result);
            assertTrue(result <= 6);
        }
    }
}
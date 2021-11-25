package stringsandarrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import stringsandarrays.OneAway;

import static org.junit.jupiter.api.Assertions.*;

class OneAwayTest {
    OneAway oneAway;
    @BeforeEach
    void setup(){
        oneAway = new OneAway();
    }

    @Test
    @DisplayName("Should return false for string with lenght > 2")
    void checkStringTest(){
        assertEquals(false, oneAway.checkString("cat", "cattt"));
        assertEquals(false, oneAway.checkString("cat", "catss"));
        assertEquals(true, oneAway.checkString("cat", "cats"));
    }

    @Test
    @DisplayName("Should return boolean for one step away string with same length and different chars")
    void oneEditReplaceSameStringTest(){
        assertEquals(true, oneAway.oneEditReplace("cat", "cat"));
        assertEquals(true, oneAway.oneEditReplace("cat", "cot"));
        assertEquals(false, oneAway.oneEditReplace("cat", "coa"));
    }

    @Test
    @DisplayName("Should return true for string with 1 length diff chars")
    void oneEditInsertTest(){
        assertEquals(true, oneAway.oneEditInsert("cat", "cats"));
        assertEquals(false, oneAway.oneEditInsert("cat", "cots"));
    }


}
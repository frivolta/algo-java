package patterns.singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaptainTest {

    @Test
    @DisplayName("it should create a captain")
    void getCaptain(){
        Captain captain = Captain.getCaptain();
    }

}
package patterns.prototype;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    Client client;

    @Test
    @DisplayName("Should create three prototypes")
    void createPrototypes(){
        this.client = new Client();
        this.client.populateMap();
        ComputerPrototype laptop = this.client.getComputer(CType.LAPTOP);
        ComputerPrototype server = this.client.getComputer(CType.SERVER);
        ComputerPrototype desktop = this.client.getComputer(CType.SERVER);
        System.out.println(laptop.getModel());
        System.out.println(server.getModel());
        System.out.println(desktop.getModel());
    }

}
package patterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class Client {
    private Map<Enum, ComputerPrototype> computers = new HashMap<>();

    public ComputerPrototype getComputer(CType type){
        ComputerPrototype computer = computers.get(type);
        if(computer==null){
            return null;
        }
        return computer.clone();
    }

    public void populateMap(){
        computers.put(CType.DESKTOP, new Desktop("MSI"));
        computers.put(CType.LAPTOP, new Laptop("Asus"));
        computers.put(CType.SERVER, new Server("Microsoft"));
    }
}

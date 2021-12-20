package patterns.prototype;

public class Server extends ComputerPrototype{
    public Server (String model){
        super(model);
    }

    @Override
    public void printModel() {
        System.out.println(this.model);
    }
}

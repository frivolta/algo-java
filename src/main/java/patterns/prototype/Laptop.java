package patterns.prototype;

public class Laptop extends ComputerPrototype {
    public Laptop(String model) {
        super(model);
    }

    @Override
    public void printModel() {
        System.out.println(this.model);
    }
}

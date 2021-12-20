package patterns.prototype;

public abstract class ComputerPrototype implements Cloneable {
    public String model;

    public ComputerPrototype(String model) {
        this.model = model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public String getModel(){return this.model;}

    @Override
    public ComputerPrototype clone() {
        try {
            return (ComputerPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Something went wrong");
            return null;
        }
    }

    public abstract void printModel();
}

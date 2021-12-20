package patterns.prototype;

public class Desktop extends ComputerPrototype{
    public Desktop(String model){
        super(model);
    }
    @Override
    public void printModel(){
        System.out.println(this.model);
    }
}

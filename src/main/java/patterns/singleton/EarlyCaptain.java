package patterns.singleton;

public class EarlyCaptain {
    private static EarlyCaptain earlyCaptain = new EarlyCaptain();

    private EarlyCaptain(){
        System.out.println("new early captain");
    }

    public static final EarlyCaptain getCaptain(){
        return earlyCaptain;
    }
}

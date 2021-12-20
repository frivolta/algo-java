package patterns.singleton;

final public class Captain {
    private static Captain captain;

    private Captain(){};

    public static synchronized Captain getCaptain(){
        if (captain==null){
            captain = new Captain();
            System.out.println("Captain is created");
        }else{
            System.out.println("No new captain is used");
        }
        return captain;
    }
}

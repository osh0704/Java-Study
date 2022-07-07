public class SingleTorn {
    private static SingleTorn instance = new SingleTorn();
    private SingleTorn() {}

    public static SingleTorn getInstance() {
        if(instance == null) {
            instance = new SingleTorn();
        }
        return instance;
    }
    public void hello(){
        System.out.println("hi, SingleTorn");
    }
}

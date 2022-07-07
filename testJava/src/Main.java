public class Main {
    public static void main(String[] args){
        SingleTorn singleTorn1 = SingleTorn.getInstance();
        SingleTorn singleTorn2 = SingleTorn.getInstance();
        System.out.println(singleTorn1 == singleTorn2);
    }
}

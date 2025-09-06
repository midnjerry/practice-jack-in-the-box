
public class Main {
    public static void main(String[] args) {

        JackInTheBox box = new JackInTheBox();
        box.crank();
        box.crank();
        box.crank();
        System.out.println("Number of cranks: " + box.getNumberOfCranks());
        box.crank();
        box.crank();
        System.out.println("Number of cranks: " + box.getNumberOfCranks());
        box.close();
        box.crank();
        box.crank();
        box.crank();
        System.out.println("Number of cranks: " + box.getNumberOfCranks());



    }


}

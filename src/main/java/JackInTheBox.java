import Exceptions.JackInTheBoxIsAlreadyClosed;
import Exceptions.JackInTheBoxIsAlreadyOpened;


public class JackInTheBox {

    public static final int CRANKS_TO_OPEN = 3;
    private int numberOfCranks;
    private boolean isOpen;

    public JackInTheBox() {
        this.numberOfCranks = 0;
        this.isOpen = false;
    }

    private void open() {
        isOpen = true;
        System.out.println("POP! " + "🤡" + " Jack-In-The-Box is opened!");
    }

    public void close(){
        if(!isOpen) {
            throw new JackInTheBoxIsAlreadyClosed("You cannot close an already closed Jack-In-The-Box");
        }
        isOpen = false;
        numberOfCranks = 0;
        System.out.println("The Jack-In-The-Box is closed.");
    }

    public void crank(){
        numberOfCranks++;
        playMusic();
        if(numberOfCranks == CRANKS_TO_OPEN && !isOpen){
            open();
        } else if(numberOfCranks == CRANKS_TO_OPEN && isOpen) {
            throw new JackInTheBoxIsAlreadyOpened("The Jack-In-The-Box is already opened!");
        }
    }

    private void playMusic(){
        System.out.println("🎵");
    }

    public int getNumberOfCranks(){
        return numberOfCranks;
    }

    public Boolean isOpen() {
        return isOpen;
    }

    protected void setNumberOfCranks(int numberOfCranks) {
        this.numberOfCranks = numberOfCranks;
    }

}

import Exceptions.JackInTheBoxIsAlreadyClosed;
import Exceptions.JackInTheBoxIsAlreadyOpened;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JackInTheBoxTest {


    @Test
    void close_Should_Set_Cranks_To_Zero_After_Being_Opened() {
        JackInTheBox box = new JackInTheBox();
        box.crank();
        box.crank();
        box.crank();
        box.close();
        assertEquals(0, box.getNumberOfCranks());
    }

    @Test
    void close_Should_Result_In_Box_Being_Closed() {
        JackInTheBox box = new JackInTheBox();
        box.crank();
        box.crank();
        box.crank();
        box.close();
        assertEquals(false, box.isOpen());
    }

    @Test
    void close_Should_Throw_JackInTheBoxIsAlreadyClosed_Exception_If_Already_Closed(){
        JackInTheBox box = new JackInTheBox();
        assertThrows(JackInTheBoxIsAlreadyClosed.class, box::close);
}

    @Test
    void crank_Should_Increment_Number_Of_Cranks() {
        JackInTheBox box = new JackInTheBox();
        box.crank();
        assertEquals(1, box.getNumberOfCranks());
    }

    @Test
    void crank_Should_Open_Box_With_Three_Cranks_While_Box_Is_Closed() {
        JackInTheBox box = new JackInTheBox();
        box.crank();
        box.crank();
        box.crank();
        assertEquals(true, box.isOpen());
    }

    @Test
    void crank_Should_Not_Open_Box_With_Two_Cranks_While_Box_Is_Closed() {
        JackInTheBox box = new JackInTheBox();
        box.crank();
        box.crank();
        assertEquals(false, box.isOpen());
    }

    @Test
    void crank_Should_Not_Open_Box_With_Three_Cranks_After_Being_Opened() {
        JackInTheBox box = new JackInTheBox();
        box.crank();
        box.crank();
        box.crank();
        box.setNumberOfCranks(2);
        assertThrows(JackInTheBoxIsAlreadyOpened.class, box::crank);

    }

    @Test
    void getNumberOfCranks_Should_Return_Zero_If_Not_Cranked() {
        JackInTheBox box = new JackInTheBox();
        assertEquals(0, box.getNumberOfCranks());
    }

    @Test
    void isOpen_Should_Return_True_If_Opened() {
        JackInTheBox box = new JackInTheBox();
        box.crank();
        box.crank();
        box.crank();
        assertEquals(true, box.isOpen());
    }
    @Test
    void isOpen_Should_Return_False_If_Closed() {
        JackInTheBox box = new JackInTheBox();
        assertEquals(false, box.isOpen());
    }
}
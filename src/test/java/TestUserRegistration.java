import org.example.UserRegistration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class TestUserRegistration {
    UserRegistration user = new UserRegistration();
    @Test
    public void testAddUser(){
        String[] arr = {"Kuldeep","Badgujar","Kuldeep.badgujar@gmail.com","91 7878989800","HashTable@4567"};
        assertEquals("Happy",user.addUser(arr));
        String[] array = {"Kuldeep","Badgujar","Kuldeep.badgujar@gmail.com","91 787898980","HashTable@4567"};
        assertEquals("Sad",user.addUser(array));
        String[] array1 = {"Kuldeep","Badgujar","Kuldeep.badgujar@gmail.com","91 7878989809","HashTable@4567"};
        assertEquals("Happy",user.addUser(array1));
    }
    @ParameterizedTest
    @ValueSource(strings = {"kuldeep.badgujar@gmail.com","akash.kumar@gmail.com","vikaskumar@gmail.com",
            "umang.kumar@gmail.com","utshah.raju@yahoo.co.in","proven.youtube@yahoo.com"})
    public void testCheckEmail(String email){
        assertTrue(user.checkEmail(email));
    }
}

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
    @ParameterizedTest
    @ValueSource(strings = {"abc@yahoo.com","abc-100@yahoo.com","abc.100@yahoo.com","abc111@abc.com","abc-100@abc.net",
    "abc.100@abc.com.au","abc@1.com","abc@gmail.com.com","abc+100@gmail.com"})
    public void testEmail(String email){
        assertTrue(user.checkEmail(email));

    }
    @ParameterizedTest
    @ValueSource(strings = {"abc","abc@.com.my","abc123@gmail.a","abc123@.com","abc123@.com.com",".abc@abc.com"
    ,"abc()*@gmail.com","abc@%*.com","abc..2002@gmail.com","abc.@gmail.com","abc@abc@gmail.com","abc@gmail.com.1a","abc.@gmail.com.aa.au"})
    public void testEmailInvalid(String str){
        assertFalse(user.checkEmail(str));
    }
}

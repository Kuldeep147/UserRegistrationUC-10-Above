import org.example.UserRegistration;
import org.junit.jupiter.api.Test;
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
}

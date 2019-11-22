import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UserNGTest {
 
     private static User test;
    public UserNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        test= new User("arsal","1234","abc@gmail.com");
        
    }

   

    /**
     * Test of getName method, of class User.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Assert.assertTrue(test.getName().equals("arsal"));
        Assert.assertFalse(test.getName().equals("fail"));
        
    }

   @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Assert.assertTrue(test.getPassword().equals("1234"));
        Assert.assertFalse(test.getPassword().equals("fail"));
        
        
    }

     @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Assert.assertTrue(test.getEmail().equals("abc@gmail.com"));
        Assert.assertFalse(test.getEmail().equals("fail"));
        
    }
    
     @Test
    public void testSetName() {
        test.setName("ali");
        Assert.assertTrue(test.getName().equals("ali"));
        Assert.assertFalse(test.getName().equals("fail"));
        
    }

     @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        test.setPassword("54321");
        Assert.assertTrue(test.getPassword().equals("54321"));
        Assert.assertFalse(test.getPassword().equals("fail"));
                
                
    }


    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        test.setEmail("arsal@gmail.com");
        Assert.assertTrue(test.getEmail().equals("arsal@gmail.com"));
        Assert.assertFalse(test.getEmail().equals("fail"));
    }

 }
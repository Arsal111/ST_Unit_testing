
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckListNGTest {

    private static CheckList test;
    public CheckListNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        test = new CheckList("arsal");
    }


    @Test
    public void testAddItem() {
        System.out.println("AddItem");
        test.AddItem("test");
        Assert.assertTrue(test.ItemsIncluded.size()==1&&test.ItemsIncluded.get(0).name=="test");
        Assert.assertFalse(test.ItemsIncluded.size()==2&&test.ItemsIncluded.get(0).name=="fail");
    }

}
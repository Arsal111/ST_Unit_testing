
import java.util.ArrayList;

public class CheckList {

    ArrayList<Item> ItemsIncluded;
    boolean Status;
    String name;

    public CheckList(String n) {
        ItemsIncluded = new ArrayList<Item>();
        Status = false;
        name = n;
    }

    void AddItem(String x) {
        Item i = new Item(x);
        ItemsIncluded.add(i);
    }

}

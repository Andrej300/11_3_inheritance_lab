import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Bob", "AB 12 30 07 C", 50000.36, "Human Resources");
    }

    @Test
    public void hasName(){
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("AB 12 30 07 C", manager.getNINumber());
    }
}

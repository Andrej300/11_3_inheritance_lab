import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Bob", "AB 12 30 07 C", 50000.36, "Management");
    }

    @Test
    public void hasName(){
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("AB 12 30 07 C", manager.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(50000.36, manager.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Management", manager.getDeptName());
    }

    @Test
    public void canChangeDeptName(){
        manager.setDeptName("HR");
        assertEquals("HR", manager.getDeptName());
    }

    @Test
    public void testRaiseSalary(){
        manager.raiseSalary(1000.14);
        assertEquals(51000.50, manager.getSalary(), 0.01);
    }

    @Test
    public void testPayBonus(){
        manager.payBonus();
        assertEquals(50500.3636, manager.getSalary(), 0.0001);
    }

    @Test
    public void canChangeName(){
        manager.changeName("Frank");
        assertEquals("Frank", manager.getName());
    }
}

import management.Manager;
import techStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Dave", "CD 13 20 05 B", 30000.60);
    }

    @Test
    public void hasName(){
        assertEquals("Dave", databaseAdmin.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("CD 13 20 05 B", databaseAdmin.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(30000.60, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void testRaiseSalary(){
        databaseAdmin.raiseSalary(1000.14);
        assertEquals(31000.74, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void testPayBonus(){
        assertEquals(300.006, databaseAdmin.payBonus(), 0.0001);
    }

}

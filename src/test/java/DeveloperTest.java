import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Tom", "EF 14 10 06 D", 30000.60);
    }

    @Test
    public void hasName(){
        assertEquals("Tom", developer.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("EF 14 10 06 D", developer.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(30000.60, developer.getSalary(), 0.01);
    }

    @Test
    public void testRaiseSalary(){
        developer.raiseSalary(1000.14);
        assertEquals(31000.74, developer.getSalary(), 0.01);
    }

    @Test
    public void testPayBonus(){
        developer.payBonus();
        assertEquals(30300.606, developer.getSalary(), 0.0001);
    }

}

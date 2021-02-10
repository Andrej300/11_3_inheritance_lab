import org.junit.Before;
import org.junit.Test;
import management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before(){
        director = new Director("Chris", "GH 14 50 04 A", 70000.60, "Management", 100000.80);
    }

    @Test
    public void hasName(){
        assertEquals("Chris", director.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("GH 14 50 04 A", director.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(70000.60, director.getSalary(), 0.01);
    }

    @Test
    public void hasBudget(){
        assertEquals(100000.80, director.getBudget(), 0.01);
    }

    @Test
    public void canChangeBudget(){
        director.setBudget(150000.80);
        assertEquals(150000.80, director.getBudget(), 0.001);
    }

    @Test
    public void testRaiseSalary(){
        director.raiseSalary(1000.14);
        assertEquals(71000.74, director.getSalary(), 0.01);
    }

    @Test
    public void testPayBonus(){
        director.payBonus();
        assertEquals(71400.612, director.getSalary(), 0.0001);
    }

}

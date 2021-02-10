import org.junit.Before;
import org.junit.Test;
import management.Director;
import techStaff.DatabaseAdmin;

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
    public void testRaiseSalary(){
        assertEquals(71000.74, director.raiseSalary(1000.14), 0.01);
    }

    @Test
    public void testPayBonus(){
        assertEquals(700.006, director.payBonus(), 0.0001);
    }

}

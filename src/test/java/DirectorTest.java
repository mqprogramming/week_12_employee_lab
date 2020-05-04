import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void before() {
        director = new Director("Percy",1,90000, "B7", 500000);
    }

    @Test
    public void canGetName() {
        assertEquals("Percy", director.getName());
    }

    @Test
    public void canGetSalary() {
        assertEquals(90000, director.getSalary(), 0.01);
    }

    @Test
    public void canGetBudget() {
        assertEquals(500000, director.getBudget(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(100);
        assertEquals(90100, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(1800, director.payBonus(), 0.01);
    }

}

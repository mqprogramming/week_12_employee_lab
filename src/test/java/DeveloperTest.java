import org.junit.Before;
import org.junit.Test;

import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer developer;

    @Before
    public void before() {
        developer = new Developer("George",7,70000);
    }

    @Test
    public void canGetName() {
        assertEquals("George", developer.getName());
    }

    @Test
    public void canGetSalary() {
        assertEquals(70000, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(100);
        assertEquals(70100, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(700, developer.payBonus(), 0.01);
    }

}

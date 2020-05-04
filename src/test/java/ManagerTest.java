import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void before() {
        manager = new Manager("Fred",3,40000,"A5");
    }

    @Test
    public void canGetName() {
        assertEquals("Fred", manager.getName());
    }

    @Test
    public void canGetSalary() {
        assertEquals(40000, manager.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(100);
        assertEquals(40100, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(400, manager.payBonus(), 0.01);
    }

}

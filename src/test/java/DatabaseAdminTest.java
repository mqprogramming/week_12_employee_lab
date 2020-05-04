import org.junit.Before;
import org.junit.Test;

import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Bill",6,60000);
    }

    @Test
    public void canGetName() {
        assertEquals("Bill", databaseAdmin.getName());
    }

    @Test
    public void canGetSalary() {
        assertEquals(60000, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(200);
        assertEquals(60200, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(600, databaseAdmin.payBonus(), 0.01);
    }

}
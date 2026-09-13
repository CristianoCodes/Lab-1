package u;

import c.HybridVehicle;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class HybridVehicleTest {
    private HybridVehicle car;

    @Before
    public void setUp() {
        car = new HybridVehicle();
    }

    @Test
    public void testCalcMPG() {
        double result = car.calcMPG(120, 6);
        assertEquals(20.0, result, 0.001);
    }

    @Test
    public void testCalcMPW() {
        double result = car.calcMPW(300, 70);
        assertEquals(144.43, result, 0.01);
    }

    @Test
    public void testCostPerGallon() {
        car.setCostPerGallon(3.50);
        assertEquals(3.50, car.getCostPerGallon(), 0.001);
    }

    @Test
    public void testCostPerKWh() {
        car.setCostPerKWh(0.24);
        assertEquals(0.24, car.getCostPerKWh(), 0.001);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testZeroGallons() {
        car.calcMPG(100, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testZeroKWh() {
        car.calcMPW(100, 0);
    }
}
package test;

import geometry.Cylinder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CylinderTest {

    @Test
    void testGetBaseArea() {
        Cylinder c = new Cylinder(2, 4);
        assertEquals(Math.PI * 4, c.getBaseArea(), 0.001);
    }

    @Test
    void testGetLateralArea() {
        Cylinder c = new Cylinder(3, 5);
        assertEquals(2 * Math.PI * 3 * 5, c.getLateralArea(), 0.001);
    }

    @Test
    void testGetSurfaceArea() {
        Cylinder c = new Cylinder(1, 1);
        double expected = 2 * Math.PI * 1 * 1 + 2 * Math.PI * 1 * 1;
        assertEquals(expected, c.getSurfaceArea(), 0.001);
    }

    @Test
    void testGetVolume() {
        Cylinder c = new Cylinder(2, 10);
        assertEquals(Math.PI * 4 * 10, c.getVolume(), 0.001);
    }

    @Test
    void testInvalidConstructor() {
        assertThrows(IllegalArgumentException.class, () -> new Cylinder(-2, 1));
        assertThrows(IllegalArgumentException.class, () -> new Cylinder(2, -1));
    }
}

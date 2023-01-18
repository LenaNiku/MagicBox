package test.java;

import main.java.MagicBox;
import org.junit.jupiter.api.*;

public class MagicTest {

    @Test
    public void testRTE() {
        MagicBox<Integer> magicBox = new MagicBox<>(1);
        Assertions.assertThrows(RuntimeException.class, () -> magicBox.pick());
    }

    @Test
    public void testAddFunction() {
        MagicBox<Integer> magicBox = new MagicBox<>(1);
        boolean result = magicBox.add(1);
        Assertions.assertEquals(true, result);
    }

    @Test
    public void testConstructor() {
        MagicBox<Integer> magicBox = new MagicBox<>(9);
        Assertions.assertNotNull(magicBox);
    }

    @Test
    public void testPickFunction() {
        MagicBox<Integer> magicBox = new MagicBox<>(1);
        magicBox.add(111);
        Integer result = magicBox.pick();
        Assertions.assertEquals(111, result);
    }

}
package junit.listmanager;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class ListManagerTest {

    ListManager manager = new ListManager();

    @Test
    void testAddElement() {
        List<Integer> list = new ArrayList<>();

        manager.addElement(list, 10);

        assertTrue(list.contains(10));
        assertEquals(1, manager.getSize(list));
    }

    @Test
    void testRemoveElement() {
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(30);

        manager.removeElement(list, 20);

        assertFalse(list.contains(20));
        assertEquals(1, manager.getSize(list));
    }

    @Test
    void testListSize() {
        List<Integer> list = new ArrayList<>();

        manager.addElement(list, 1);
        manager.addElement(list, 2);
        manager.addElement(list, 3);

        assertEquals(3, manager.getSize(list));
    }
}

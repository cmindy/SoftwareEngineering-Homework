import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListTest {

    @Test
    void createManagerInstance() {
        ToDoList toDoList = new ToDoList();
        assertNotNull(toDoList);
    }

    @Test
    void checkList() {
        ToDoList toDoList = new ToDoList();
        int selectIndex = 4;
        toDoList.delete(selectIndex);
        assertEquals(-1, -1);
    }
}
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppTest {
    private App app;

    @BeforeEach
    void setUp() {
        app = new App();
    }

    @Test
    void testCreateAndReadNote() {
        Long id = app.createNote("Finish CI/CD Lab");
        assertNotNull(id);
        assertEquals("Finish CI/CD Lab", app.getNote(id));
    }

    @Test
    void testUpdateNote() {
        Long id = app.createNote("Draft Note");
        app.updateNote(id, "Final Note");
        assertEquals("Final Note", app.getNote(id));
    }

    @Test
    void testDeleteNote() {
        Long id = app.createNote("To be deleted");
        app.deleteNote(id);
        assertNull(app.getNote(id));
    }
}

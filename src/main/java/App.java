import java.util.*;

public class App {
    private Map<Long, String> notes = new HashMap<>();
    private long nextId = 1;


    public Long createNote(String content) {
        if (content == null || content.trim().isEmpty()) {
            throw new IllegalArgumentException("Note content cannot be empty");
        }
        long id = nextId++;
        notes.put(id, content);
        return id;
    }


    public String getNote(Long id) {
        return notes.get(id);
    }

    public boolean updateNote(Long id, String newContent) {
        if (notes.containsKey(id)) {
            notes.put(id, newContent);
            return true;
        }
        return false;
    }

    public boolean deleteNote(Long id) {
        return notes.remove(id) != null;
    }

    public static void main(String[] args) {
        System.out.println("Notes Management System is running...");
    }
}

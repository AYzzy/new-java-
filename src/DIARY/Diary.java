package DIARY;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Diary {
    private  int entryId = 0;
    private String username;
    private String password;
    private boolean isLocked ;
    private final List<Entry> entries = new ArrayList<>();
    public Diary(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public List<Entry> getEntries() {
        return entries;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked() {
        isLocked = true;
    }
    public void setUnlocked(String password) {
            isLocked = false;
    }


    public void createEntry(int entryId,String title, String body) {
        int id = generateId();
        Entry entry = new Entry(id, title, body);
        entries.add(entry);

    }

    private int generateId() {
        return entryId++;
    }

    public void deleteEntry(int entryId){
        Entry entry = findEntry(entryId);
        entries.remove(entry);
    }
    
    public Entry findEntry(int entryId){
        for(Entry entry : entries){
            if (entry.getID() == entryId) {
                return entry;
            }
        }
        return null;
    }
    public Entry updateEntry(int ID, String Title, String Body){
        Entry entry = findEntry(entryId);
        Entry entry1 = new Entry(ID,Title,Body);
        entry1.setTitle(Title);
        entry1.setBody(Body);
        return entry1;
    }
    public int getEntriesSize(){
        return entries.size();
    }

    public Entry getUpdated(int entryId, String Title, String Body){
        for(Entry entry : getEntries()){
            if (entryId == entry.getID() && Objects.equals(entry.getTitle(), Title) && Objects.equals(entry.getBody(), Body)) {
                return entry;
            }
        }
        return null;
    }

}

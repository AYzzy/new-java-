package DIARY;

import java.time.LocalDateTime;

public class Entry {
    private int ID;
    private String title;
    private String body;
    private LocalDateTime dateCreated;

    public Entry(int ID, String title, String body) {
        this.ID = ID;
        this.title = title;
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }
    public int getID(){
        return ID;
    }


}


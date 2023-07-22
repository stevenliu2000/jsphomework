package bean;

public class Message {
    private String name;
    private String title;
    private String content;

    public Message() {
    }

    public Message(String name, String title, String content) {
        this.name = name;
        this.title = title;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

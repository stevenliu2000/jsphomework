package bean;

public class Message {
    private String name;
    private String title;
    private String content;

    public Message(String name, String title, String content) {
        this.name = name;
        this.title = title;
        this.content = content;
    }

    @Override
	public String toString() {
		return "Message [name=" + name + ", title=" + title + ", content=" + content + "]";
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

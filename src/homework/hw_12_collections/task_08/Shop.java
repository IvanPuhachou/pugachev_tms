package homework.hw_12_collections.task_08;

public class Shop {
    private int id;
    private String title;

    public Shop(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "This is shop " + title +
                " its id is " + id + ".";
    }

}

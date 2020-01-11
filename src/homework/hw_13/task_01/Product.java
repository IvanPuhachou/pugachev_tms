package homework.hw_13.task_01;

import java.time.LocalDateTime;

public class Product {
    private String title;
    private int id;
    private LocalDateTime arrivedDate;

    public Product(String title, int id) {
        this.title = title;
        this.id = id;
        this.arrivedDate = LocalDateTime.now();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "this is product " +
                " with title \"" + title +
                "\". Its  id is " + id +
                ". Its  arrivedDate is " + arrivedDate;
    }
}

package homework.hw_14.task_03;

import java.util.Objects;

public class Phone {
    private String producer;
    private int price;

    public Phone(String producer, int price) {
        this.producer = producer;
        this.price = price;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "This phone is " + producer + ". It cost " + price + " dollars";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phones = (Phone) o;
        return price == phones.price &&
                Objects.equals(producer, phones.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer, price);
    }
}

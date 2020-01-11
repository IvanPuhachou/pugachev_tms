package homework.hw_13.task_04;

public class Main {
    public static void main(String[] args) {
        UserBuilder userBuilder = User::new;  // альтернатива написанию (name) -> new User(name);
        User thomas = userBuilder.build("Thomas");
        System.out.println(thomas);
    }
}

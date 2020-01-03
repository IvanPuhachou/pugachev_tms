package homework.hw_07_08.task_05;

public class Mouse {
    Button mouse;

    public Mouse(Button mouse) {
        this.mouse = mouse;
    }

    public void click() {
        mouse.execute();
    }

}
package homework.hw_12_generic.task_03;

public class ClassName<T> implements ShowClassName<T> {
    private T unknown;

    public <T> void showClassName() {
        System.out.println("Class name is " + unknown.getClass());
    }

    public ClassName(T unknown) {
        this.unknown = unknown;
    }

    public T getUnknown() {
        return unknown;
    }


}

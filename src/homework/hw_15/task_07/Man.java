package homework.hw_15.task_07;

/*
Сделать класс Man у которого 3 поля - имя, фамилия, тел.номер.
Сделать конструкторы:
1.с параметрами имя тел. номер,
2. с параметрами имя, фамилия тел. номер.
3. с параметрами имя, фамилия.
Конструктора без параметров быть не должно. Избежать дублирования кода
 */

public class Man {
    private String name;
    private String surname;
    private  int phonesNumber;

    public Man(String name, int phonesNumber) {
        this(name,null,  phonesNumber);
    }

    public Man(String name, String surname, int phonesNumber) {
        this.name = name;
        this.surname = surname;
        this.phonesNumber = phonesNumber;
    }

    public Man(String name, String surname) {
        this(name, surname, 0);
    }
}

package homework.hw_07_08.taks_01;

/*
Есть класс SuperUser, у которого есть поля логин и пароль.
 Сделать так, чтобы нельзя было наследоваться от этого класса
 */

public final class SuperUser {   // просто при создании класса обозначить его как final
    private String login;
    private String password;

    public SuperUser(String login, String password) {
        this.login = login;
        this.password = password;
    }
}

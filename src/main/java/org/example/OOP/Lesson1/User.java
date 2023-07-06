package org.example.OOP.Lesson1;

public class User {
    private String login;
    private Integer password;
    private Basket basket;

    public User(String login, Integer password) {
        this.login = login;
        this.password = password;
        this.basket = new Basket();
    }

    public String getLogin() {
        return login;
    }


    public Integer getPassword() {
        return password;
    }

    public Basket getBasket() {
        return basket;
    }

}

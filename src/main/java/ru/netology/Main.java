package ru.netology;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "4444 № 444444";
        post.patronymic = "Иванович";
        post.phone = "+79999999999";
        post.surname = "Иванов";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 01;
        post.birthday.month = 01;
        post.birthday.year = 1990;
    }
}

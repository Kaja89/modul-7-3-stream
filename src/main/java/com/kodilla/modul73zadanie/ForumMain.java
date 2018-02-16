package com.kodilla.modul73zadanie;

import com.kodilla.modul73zadanie.forumuser.Forum;
import com.kodilla.modul73zadanie.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;


public class ForumMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> newUsersMap = forum.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> user.getBirthDate().getYear() <= 1998)
                .filter(user -> user.getPublishedPostsAmount() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserID, user -> user));

        System.out.println("The map of man users being older than 20 years and having at least 1 post published: ");
        newUsersMap.entrySet().stream()
                .map(entry -> "ID: " + entry.getKey() + " : " + entry.getValue())
                .forEach(System.out::println);
    }
}

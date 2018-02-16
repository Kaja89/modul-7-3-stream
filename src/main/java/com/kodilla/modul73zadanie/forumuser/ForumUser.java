package com.kodilla.modul73zadanie.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userID;
    private final String username;
    private final char sex;
    private final LocalDate birthDate;
    private final int publishedPostsAmount;

    public ForumUser(final int userID, final String username, final char sex, final int day, final int month, final int year, final int publishedPostsAmount) {
        this.userID = userID;
        this.username = username;
        this.sex = sex;
        this.birthDate = LocalDate.of(year, month, day);
        this.publishedPostsAmount = publishedPostsAmount;
    }

    public int getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPublishedPostsAmount() {
        return publishedPostsAmount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", publishedPostsAmount=" + publishedPostsAmount +
                '}';
    }
}



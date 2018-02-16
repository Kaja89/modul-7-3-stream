package com.kodilla.modul73zadanie.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    final List<ForumUser> users = new ArrayList<>();

    public ArrayList<ForumUser> getUserList(){
        users.add(new ForumUser(1, "annakowalska", 'F', 12, 4, 2000, 5));
        users.add(new ForumUser(2, "tomasznowakowski", 'M', 19, 2, 1978, 16));
        users.add(new ForumUser(3, "zofiakwiatkowska", 'F', 9, 4, 1990, 9));
        users.add(new ForumUser(4, "adammalinowski", 'M', 15, 7, 1997, 5));
        users.add(new ForumUser(5, "antonikaczmarek", 'M', 1, 10, 2000, 5));
        users.add(new ForumUser(6, "kamilkowal", 'M', 11, 3, 1987, 5));

        return new ArrayList<ForumUser>(users);
    }
}

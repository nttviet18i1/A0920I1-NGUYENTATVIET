package com.userdao;

import com.model.Login;
import com.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private static List<User>users;
    static {
        users= new ArrayList<>();
        User user1 = new User();
        user1.setName("hung");
        user1.setAge(18);
        user1.setEmail("hungcodegym@gmail.com");
        user1.setAccount("hungnguyen123");
        user1.setPassword("123123");
        users.add(user1);

        User user2 = new User();
        user2.setName("hung1");
        user2.setAge(19);
        user2.setEmail("hung1codegym@gmail.com");
        user2.setAccount("hungnguyen1234");
        user2.setPassword("123123");
        users.add(user2);

        User user3= new User();
        user3.setName("viet");
        user3.setAge(21);
        user3.setEmail("vietodegym@gmail.com");
        user3.setAccount("vietnguyen123");
        user3.setPassword("123123");
        users.add(user3);

        User user4 = new User();
        user4.setName("tu");
        user4.setAge(25);
        user4.setEmail("tucodegym@gmail.com");
        user4.setAccount("tugnguyen123");
        user4.setPassword("123123");
        users.add(user4);

        User user5= new User();
        user5.setName("hoang");
        user5.setAge(28);
        user5.setEmail("hoangcodegym@gmail.com");
        user5.setAccount("hoangnguyen123");
        user5.setPassword("123123");
        users.add(user5);



    }
    public static User checkLogin(Login login){
        for (User u: users) {
            if(u.getAccount().equals(login.getAccount())
                    && u.getPassword().equals(login.getPassword())){
                return u;
            }
        }
        return null;
    }
}

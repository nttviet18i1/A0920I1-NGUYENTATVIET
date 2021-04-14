package dao;

import model.User;
import utill.ConnectDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Userlmpl implements  IUser{
    private static final String SELECT_USER_BY_ID = "select id,name,email,country from users where id =?";
    private static final String SELECT_ALL_USERS = "select * from usernamebase";
    private static final String DELETE_USERS_SQL = "delete from users where id = ?;";
    private static final String UPDATE_USERS_SQL = "update users set name = ?,email= ?, country =? where id = ?;";

    @Override
    public void insertUser(User user) {


    }

    @Override
    public User getUser(int id) {
        return null;
    }

    @Override
    public List<User> getAllUser() {
        Connection connection=null;
        PreparedStatement statement = null;
        List<User>userList= new ArrayList<>();
        try {
            connection = ConnectDB.getConnection();
            statement = connection.prepareStatement(SELECT_ALL_USERS);
            ResultSet resultSet=statement.executeQuery();
            while (resultSet.next()){
            String id =resultSet.getString("id");
            String name= resultSet.getString("name");
            String email= resultSet.getString("email");
            String country = resultSet.getString("country");
            User user= new User(id,name,email,country);
            userList.add(user);

            }

        }catch (Exception e){
            e.printStackTrace();
        } finally {
            try{
                if (statement!= null){
                    statement.close();
                }
                if( connection!=null){
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }


        }
        return userList;

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(String id) {

    }
}

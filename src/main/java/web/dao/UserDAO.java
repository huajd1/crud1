package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import java.util.List;

@Repository
public interface UserDAO {
    List<User> getListOfUsers();
    void create(User user);
    User readUserById(int id);
    void update(User user);
    void delete(int id);
}








//package web.dao;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.stereotype.Component;
//import web.model.User;
//
//@Component
//public class UserDAO {
//    private static int PEOPLE_COUNT;
//    private List<User> users;
//
//    {
//        users =  new ArrayList<>();
//
//        users.add(new User(++PEOPLE_COUNT, "Tom", "Rob"));
//        users.add(new User(++PEOPLE_COUNT, "Mike", "Tyson"));
//        users.add(new User(++PEOPLE_COUNT, "Bob", "Armaunt"));
//        users.add(new User(++PEOPLE_COUNT, "John", "Fokin"));
//    }
//
//    public List<User> index() {
//        return users;
//    }
//
//    public User show(int id) {
//        return users.stream().filter(user -> user.getId() == id).findAny().orElse(null);
//    }
//
//    public void save (User user) {
//        user.setId(++PEOPLE_COUNT);
//        users.add(user);
//    }
//
//    public void update(int id, User updatedUser) {
//        User userToBeUpdated = show(id);
//        userToBeUpdated.setName(updatedUser.getName());
//        userToBeUpdated.setLastname(updatedUser.getLastname());
//
//    }
//
//    public void delete(int id) {
//        users.removeIf(u -> u.getId() == id);
//    }
//}

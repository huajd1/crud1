package web.service;

import org.springframework.stereotype.Component;
import web.dao.UserDAO;
import web.model.User;

import java.util.ArrayList;
import java.util.List;
@Component
public class UserDAOService {
    private int count;
    private List<User> users;
    {
        users = new ArrayList<>();
        users.add(new User(++count, "Ivan", "Ivanow"));
        users.add(new User(++count, "Gleb", "Chernyakovskiy"));
        users.add(new User(++count, "Roma", "Michurin"));
        users.add(new User(++count, "Mark", "Panteleyev"));
    }
    public List<User> index(){
        return users;
    }
    public User read(int id){
        return users.stream().filter(user -> user.getId() == id).findAny().orElse(null);
    }
    public void save (User newUser) {
        newUser.setId(++count);
        users.add(newUser);
    }

    public void update(int id, User updatedUser) {
        User userToBeUpdated = read(id);
        userToBeUpdated.setName(updatedUser.getName());
        userToBeUpdated.setSurname(updatedUser.getSurname());

    }

    public void delete(int id) {
        users.removeIf(p -> p.getId() == id);
    }
}
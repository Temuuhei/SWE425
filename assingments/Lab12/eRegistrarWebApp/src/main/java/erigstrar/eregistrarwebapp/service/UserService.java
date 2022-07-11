package erigstrar.eregistrarwebapp.service;

import erigstrar.eregistrarwebapp.model.User;

import java.util.List;

public interface UserService {

    public abstract List<User> getAllUsers();
    public abstract User saveUser(User user);
    public abstract User getUserById(Integer userId);

}


package com.openclassrooms.magicgithub.api;

import com.openclassrooms.magicgithub.model.User;

import java.util.List;

import static com.openclassrooms.magicgithub.api.FakeApiServiceGenerator.generateCloneUsers;
import static com.openclassrooms.magicgithub.api.FakeApiServiceGenerator.generateUsers;

public class CloneApiService implements ApiService {

    private List<User> usersCloned = generateCloneUsers();
    private List<User> users = generateUsers();

    @Override
    public List<User> getUsers() {
        return usersCloned;
    }

    @Override
    public void generateRandomUser() {
        User userRandom = User.random();
        users.add(userRandom);
    }

    @Override
    public void deleteUser(User username) {
        users.remove(username);
    }
}
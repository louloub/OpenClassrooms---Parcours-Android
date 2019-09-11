package com.openclassrooms.magicgithub.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.openclassrooms.magicgithub.model.User;
import com.openclassrooms.magicgithub.repository.UserRepository;
import com.openclassrooms.magicgithub.utils.UserDiffCallback;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import static com.openclassrooms.magicgithub.api.FakeApiServiceGenerator.FAKE_USERS;
import static com.openclassrooms.magicgithub.api.FakeApiServiceGenerator.FAKE_USERS_RANDOM;
import static com.openclassrooms.magicgithub.api.FakeApiServiceGenerator.generateUsers;

public class FakeApiService implements ApiService {

    private List<User> users = generateUsers();

    /**
     * Return a list of {@link User}
     * Those users must be generated by {@link FakeApiServiceGenerator}
     */
    @Override
    public List<User> getUsers() {
        // TODO: A modifier
        // "generateUsers" in "FakeApiService.java" line21 return arraylist of fake
        // users (in FakeApiServiceGenerator.java line12)
        return users;
    }

    /**
     * Generate a random {@link User} and add it {@link FakeApiService#users} list.
     * This user must be get from the {@link FakeApiServiceGenerator#FAKE_USERS_RANDOM} list.
     */
    @Override
    public void generateRandomUser() {
        // TODO: A modifier
        // Generate "userRandom" with method "random" in objet "user" line28
        User userRandom = User.random();
        // Add this "userRandom" in "users" (List<User>)
        users.add(userRandom);
    }

    /**
     * Delete a {@link User} from the {@link FakeApiService#users} list.
     */
    @Override
    public void deleteUser(User user) {
        // TODO: A modifier
        // method remove can accpet "int" or another object (polymorphism)
        // Use method "remove" of object "User" for remove a user in "Users" with his index
        users.remove(user);
    }
}
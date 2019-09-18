package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.api.FakeApiService;
import com.openclassrooms.magicgithub.api.FakeApiServiceGenerator;
import com.openclassrooms.magicgithub.model.User;

import java.util.List;

public class UserRepository {

    private final ApiService apiService;

    // Voir "Injection" pour la création d'un nouveau UserReporitory
    // Dans notre cas le service défini pour l'instanciation de
    // "UserRepository" est "FakeApiService" (dans "injection")
    // En modifiant le service on modifie le comportement des méthodes
    // défini dans le nouveau service
    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<User> getUsers() {
        // on utilise l'interface "apiService" plutot que son implementation
        // FakeApiService pour récupérer les users
        // On peut changer l'implementation d'interface plus facilement
        // dans INJECTION
        return apiService.getUsers();
    }

    public void generateRandomUser() {
        //
        apiService.generateRandomUser();
    }

    public void deleteUser(User user) {
        //
        apiService.deleteUser(user);
    }
}
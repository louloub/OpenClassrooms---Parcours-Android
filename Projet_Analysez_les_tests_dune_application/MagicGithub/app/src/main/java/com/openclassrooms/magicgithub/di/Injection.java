package com.openclassrooms.magicgithub.di;

import com.openclassrooms.magicgithub.api.FakeApiService;
import com.openclassrooms.magicgithub.repository.UserRepository;

public class Injection {

    // Changer "FakeApiService" en cas de changement de service
    public static UserRepository createUserRepository() {
        return new UserRepository(new FakeApiService());
    }
}

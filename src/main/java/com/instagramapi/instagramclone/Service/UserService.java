package com.instagramapi.instagramclone.Service;

import com.instagramapi.instagramclone.Entity.Users;
import com.instagramapi.instagramclone.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public Users submitMetaDataOfUser(Users user){
            return userRepo.save(user);
    }

    public Users displayUserMetaData(String userId){
        return userRepo.findByUserId(userId);
    }
}

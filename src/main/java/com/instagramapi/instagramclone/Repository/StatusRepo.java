package com.instagramapi.instagramclone.Repository;

import com.instagramapi.instagramclone.Entity.Status;
import com.instagramapi.instagramclone.Entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface StatusRepo extends CrudRepository<Status,Integer> {
    ArrayList<Status> findAll();
}

package com.instagramapi.instagramclone.Repository;

import com.instagramapi.instagramclone.Entity.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface PostRepo extends CrudRepository<Post,Integer> {
    ArrayList<Post> findAll();
}

package com.instagramapi.instagramclone.Service;

import com.instagramapi.instagramclone.Entity.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PostService {
    public Post submitPostToDb(Post post){
        return new Post();
    }
    public ArrayList<Post> retrivePostFromDb(){
        return new ArrayList<Post>();
    }
}

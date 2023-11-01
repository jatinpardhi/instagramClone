package com.instagramapi.instagramclone.Service;

import com.instagramapi.instagramclone.Entity.Post;
import com.instagramapi.instagramclone.Entity.Status;
import com.instagramapi.instagramclone.Repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PostService {
    @Autowired
    private PostRepo postRepo;
    @Autowired
    private UserService userService;
    public Post submitPostToDb(Post post){
        return postRepo.save(post);
    }
    public ArrayList<Post> retrivePostFromDb(){
        ArrayList<Post> postList= postRepo.findAll();
        for(int i=0;i<postList.size();i++){
            Post postItems=postList.get(i);
            postItems.setUserName(userService.displayUserMetaData(postItems.getUserId()).getUserName());
        }
        return postList;
    }
}

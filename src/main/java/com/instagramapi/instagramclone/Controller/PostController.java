package com.instagramapi.instagramclone.Controller;

import com.instagramapi.instagramclone.Entity.Post;
import com.instagramapi.instagramclone.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired
    private PostService postService;
    @PostMapping("")
    private Post submitUserPost(@RequestBody Post post){
        return postService.submitPostToDb(post);
    }
    @GetMapping("")
    private ArrayList<Post> getAllPost(){
        return postService.retrivePostFromDb();
    }

}

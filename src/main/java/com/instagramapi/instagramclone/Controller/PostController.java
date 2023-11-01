package com.instagramapi.instagramclone.Controller;

import com.instagramapi.instagramclone.Entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired
    
    @PostMapping("")
    private Post submitUserPost(@RequestBody Post post){
        return new Post();
    }
    @GetMapping("")
    private ArrayList<Post> getAllPost(){
        return new ArrayList<Post>();
    }

}

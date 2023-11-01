package com.instagramapi.instagramclone.Controller;

import com.instagramapi.instagramclone.Entity.Comments;
import com.instagramapi.instagramclone.Service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/comments")
public class CommentsController {
    @Autowired
    private CommentsService commentsService;
    @PostMapping("")
    private Comments submitComment(@RequestBody Comments comments){
            return commentsService.submitCommentToDb(comments);
    }
    @GetMapping("/{postId}")
    private ArrayList<Comments>getCommentsForPost(@PathVariable("postId") String postId) {
        return commentsService.getAllCommentsForDb(postId);
    }

}
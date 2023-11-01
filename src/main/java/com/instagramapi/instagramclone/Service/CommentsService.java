package com.instagramapi.instagramclone.Service;

import com.instagramapi.instagramclone.Entity.Comments;
import com.instagramapi.instagramclone.Entity.Post;
import com.instagramapi.instagramclone.Repository.CommentsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CommentsService {

    @Autowired
    private CommentsRepo commentsRepo;
    @Autowired
    private UserService userService;
    public Comments submitCommentToDb(Comments comments){
        return commentsRepo.save(comments);
    }
    public ArrayList<Comments> getAllCommentsForDb(String postId){
        ArrayList<Comments> commentsList= commentsRepo.findAllByPostId(postId);
        for(int i=0;i<commentsList.size();i++){
            Comments commentsItems=commentsList.get(i);
            commentsItems.setUserName(userService.displayUserMetaData(commentsItems.getUserId()).getUserName());
        }
        return commentsList;
    }
}

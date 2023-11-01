package com.instagramapi.instagramclone.Repository;

import com.instagramapi.instagramclone.Entity.Comments;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface CommentsRepo extends CrudRepository<Comments,Integer> {
    ArrayList<Comments> findAllByPostId(String postId);
}

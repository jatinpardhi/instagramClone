package com.instagramapi.instagramclone.Service;

import com.instagramapi.instagramclone.Entity.Status;
import com.instagramapi.instagramclone.Repository.StatusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StatusService {
    @Autowired
    private StatusRepo statusRepo;
    @Autowired
    private UserService userService;
    public Status submitDataInDb(Status status){
        return statusRepo.save(status);
    }
    public ArrayList<Status> retriveStatus(){
        ArrayList<Status> statusList= statusRepo.findAll();
        for(int i=0;i<statusList.size();i++){
            Status statusItems=statusList.get(i);
            statusItems.setUserName(userService.displayUserMetaData(statusItems.getUserId()).getUserName());
        }
        return statusList;
    }
}

package com.instagramapi.instagramclone.Controller;

import com.instagramapi.instagramclone.Entity.Status;
import com.instagramapi.instagramclone.Service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/status")
public class StatusController {

    @Autowired
    private StatusService statusService;
    @PostMapping("")
    private Status submitStatus(@RequestBody Status status){
        return statusService.submitDataInDb(status);
    }
    @GetMapping("")
    private ArrayList<Status> getAllStatus(){
        return statusService.retriveStatus();
    }
}

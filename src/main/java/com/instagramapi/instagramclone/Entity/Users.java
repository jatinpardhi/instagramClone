package com.instagramapi.instagramclone.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.springframework.lang.NonNull;

@Entity(name="Users")
public class Users {

    @Id
    @GeneratedValue
    private int id;
    @NonNull
    private String userId;
    private String userName;
    private String name;
    private String profileImage;

    public Users() {
        super();
    }

    public Users(int id, @NonNull String userId, String userName, String name, String profileImage) {
        this.id = id;
        this.userId = userId;
        this.userName = userName;
        this.name = name;
        this.profileImage = profileImage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NonNull
    public String getUserId() {
        return userId;
    }

    public void setUserId(@NonNull String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }
}

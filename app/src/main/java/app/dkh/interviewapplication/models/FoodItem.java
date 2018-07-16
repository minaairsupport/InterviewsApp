package app.dkh.interviewapplication.models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class FoodItem extends RealmObject {
    // TODO: Fill out the rest of the class
    @PrimaryKey
    private int id;
    private String name;
    private String photoUrl;
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

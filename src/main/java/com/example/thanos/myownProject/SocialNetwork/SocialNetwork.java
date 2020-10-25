package com.example.thanos.myownProject.SocialNetwork;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public
class SocialNetwork {
    @Id
    private String id;
    private String name;
    private String owner;

    public SocialNetwork(){

    }
    public SocialNetwork(String id, String name, String owner) {
        super();
        this.id = id;
        this.name = name;
        this.owner = owner;
    }



    public String getDescription() {
        return owner;
    }

    public void setDescription(String description) {
        this.owner = description;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}

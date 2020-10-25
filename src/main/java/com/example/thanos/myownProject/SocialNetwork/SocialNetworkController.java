package com.example.thanos.myownProject.SocialNetwork;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SocialNetworkController {
    @Autowired
    private SocialNetworkService socialNetworkService;

    @RequestMapping("/socialnetworks")
    public List<SocialNetwork> getAllSocialNetworks(){
        return socialNetworkService.getAllSocialNetworks();
    }

    @RequestMapping("/socialnetworks/{id}")
    public SocialNetwork getSocialNetwork(@PathVariable("id") String id){
        return socialNetworkService.getSocialNetwork(id);
    }

    @RequestMapping(method=RequestMethod.POST,value="/socialnetworks")
    public void addSocialNetwork(@RequestBody SocialNetwork socialNetwork){
        socialNetworkService.addSocialNetwork(socialNetwork);
    }


    @RequestMapping(method=RequestMethod.DELETE,value="/socialnetworks/{id}")
    public void deleteSocialNetwork(@PathVariable("id") String id){
        socialNetworkService.deleteSocialNetwork(id);
    }

    @RequestMapping(method=RequestMethod.PUT,value="/socialnetworks/{id}")
    public void updateSocialNetwork(@RequestBody SocialNetwork socialNetwork){
        socialNetworkService.updateSocialNetwork(socialNetwork);
    }
}

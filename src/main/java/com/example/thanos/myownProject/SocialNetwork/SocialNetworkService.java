package com.example.thanos.myownProject.SocialNetwork;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class SocialNetworkService {

    @Autowired
    private SocialNetworkRepository SocialNetworkRepository;


    public List<SocialNetwork> getAllSocialNetworks(){
        List<SocialNetwork> socialNetworks = new ArrayList<SocialNetwork>();
        SocialNetworkRepository.findAll().forEach(socialNetworks::add);
        return socialNetworks;
    }

    public SocialNetwork getSocialNetwork(String id){
        SocialNetwork t = SocialNetworkRepository.findById(id).get();
        return t;
    }

    public void addSocialNetwork(SocialNetwork topics){
        SocialNetworkRepository.save(topics);
    }

    public void deleteSocialNetwork(String id){
        SocialNetworkRepository.deleteById(id);
    }
    public void updateSocialNetwork(SocialNetwork topics){
        SocialNetworkRepository.save(topics);
    }
}

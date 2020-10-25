package com.example.thanos.myownProject.SocialNetwork;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SocialNetworkRepository extends CrudRepository<SocialNetwork, String>{
    //public List<SocialNetwork> findBySocialNetworkId(String SocialNetworkId);
}

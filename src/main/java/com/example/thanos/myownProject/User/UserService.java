//package com.example.thanos.myownProject.User;
//
//import com.example.thanos.myownProject.SocialNetwork.SocialNetwork;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class UserService {
//
//    @Autowired
//    private UserRepository UserRepository;
//
//    public List<User> getUsers(String SocialNetworkId){
//        List<User> users = new ArrayList<User>();
//        //UserRepository.findBySocialNetworkId(SocialNetworkId).forEach(users::add);
//        return users;
//    }
//
//    public User getUser(String UserId){
//        return UserRepository.findById(UserId).get();
//    }
//
//    public void createUser(User user){
//        UserRepository.save(user);
//
//    }
//    public void updateUser(User user){
//        UserRepository.save(user);
//    }
//
//    public void deleteUser(String UserId){
//        UserRepository.deleteById(UserId);
//    }
//
//}

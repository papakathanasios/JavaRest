//package com.example.thanos.myownProject.User;
//
//import com.example.thanos.myownProject.SocialNetwork.SocialNetwork;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class UserController {
//
//    private UserService service;
//
//    public UserController(UserService service) {
//        this.service = service;
//    }
//
//    @RequestMapping("/socialnetworks/{socialNetworkId}/users")
//    public List<User> getUsers(@PathVariable String socialNetworkId){
//        return service.getUsers(socialNetworkId);
//    }
//
//    @RequestMapping("/socialnetworks/{socialNetworkId}/user/{userid}")
//    public User getUser(@PathVariable String socialNetworkId, @PathVariable String userid){
//        return service.getUser(userid);
//    }
//
//    @RequestMapping(name="/socialnetworks/{socialnetworkid}/user", method= RequestMethod.POST)
//    public void createUser(@PathVariable String socialnetworkid, @RequestBody User user){
//        User.setSocialNetwork(new SocialNetwork(socialnetworkid,"","","",""));
//        service.createUser(user);
//    }
//
//    @RequestMapping(name="/socialnetworks/{socialnetworkid}/user/{userid}",method = RequestMethod.PUT)
//    public void updateUser(@RequestBody User user){
//        service.updateUser(user);
//    }
//
//    @RequestMapping(name = "/socialnetworks/{socialnetworkid}/user/{userid}", method = RequestMethod.DELETE)
//    public void deleteUser(@RequestParam String userid){
//        service.deleteUser(userid);
//    }
//
//}

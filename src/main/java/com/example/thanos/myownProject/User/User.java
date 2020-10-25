//package com.example.thanos.myownProject.User;
//
//import com.example.thanos.myownProject.SocialNetwork.SocialNetwork;
//import com.example.thanos.myownProject.SocialNetwork.SocialNetworkRepository;
//import com.example.thanos.myownProject.SocialNetwork.SocialNetworkService;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.ManyToOne;
//
//@Entity
//public class User {
//
//    public static void setSocialNetwork(com.example.thanos.myownProject.SocialNetwork.SocialNetwork socialNetwork) {
//    }
//
//    public String getUserId() {
//        return UserId;
//    }
//
//    public void setUserId(String userId) {
//        UserId = userId;
//    }
//
//    public String getUsername() {
//        return Username;
//    }
//
//    public void setUsername(String username) {
//        Username = username;
//    }
//
//    public String getMemberId() {
//        return MemberId;
//    }
//
//    public void setMemberId(String memberId) {
//        MemberId = memberId;
//    }
//
//    public boolean isAdmin() {
//        return IsAdmin;
//    }
//
//    public void setAdmin(boolean admin) {
//        IsAdmin = admin;
//    }
//
//    @Id
//    private String UserId;
//    private String Username;
//    private String MemberId;
//    private boolean IsAdmin;
//
//    public com.example.thanos.myownProject.SocialNetwork.SocialNetwork getSocialNetwork() {
//        return SocialNetwork;
//    }
//
//    public void setSocialNetwork(String Id, String Desc, String Status, String Name, String Owner) {
//        new SocialNetwork(Id,Desc,Owner,Status,Name);
//    }
//
//    @ManyToOne
//    private SocialNetwork SocialNetwork;
//
//
//    public User(){}
//    public User(String UserId, String MemberId, String Username, boolean IsAdmin, String SocialNetworkId){
//        super();
//        this.UserId = UserId;
//        this.MemberId = MemberId;
//        this.Username = Username;
//        this.IsAdmin = IsAdmin;
//        this.SocialNetwork = new SocialNetwork(SocialNetworkId,"","","","");
//    }
//}

package com.gojgho.dto;

public class user {

  private String userId;
  private String userPassword;
  private String telephone;
  private String userWork;
  private String userType;

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getUserPassword() {
    return userPassword;
  }

  public void setUserPassword(String userPassword) {
    this.userPassword = userPassword;
  }

  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  public String getUserWork() {
    return userWork;
  }

  public void setUserWork(String userWork) {
    this.userWork = userWork;
  }

  public String getUserType() {
    return userType;
  }

  public void setUserType(String userType) {
    this.userType = userType;
  }



  public user(String userId,String userPassword, String telephone, String userWork, String userType){
    this.userId = userId;
    this.userPassword = userPassword;
    this.telephone = telephone;
    this.userWork = userWork;
    this.userType = userType;

  }

  @Override
  public String toString(){
    return "user{"+
        "userId='" + userId + '\''+
        ",userPassword='" + userPassword + '\''+
        ",telephone='" + telephone + '\''+
        ",userWork='" + userWork + '\''+
        ",userType='" + userType + '\''+
        '}';
  }

}

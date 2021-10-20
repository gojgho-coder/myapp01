package com.gojgho.ui;
import com.gojgho.dao.userDao;
import com.gojgho.dto.user;
import java.util.List;

public class Main {
  public static void main(String[] args) throws ClassNotFoundException {

    userDao userdao = new userDao();
    List<user> users = userdao.searchPerson("gojgho");

    for(user userlist : users){
      System.out.println(userlist);
    }

//    userdao.addPerson(new user("gojgho","wjdgy12!","010-xxxx-xxxx","회사원","의지"));
//  System.out.println("insert ok");

  }
}

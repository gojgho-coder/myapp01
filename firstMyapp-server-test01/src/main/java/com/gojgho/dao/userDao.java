package com.gojgho.dao;

import com.gojgho.dto.user;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class userDao {
  private String driver = "com.mysql.cj.jdbc.Driver";
  private String url = "jdbc:mysql://localhost:3306/firstmyapp?useSSL=false&useUnicode=true&serverTimezone=Asia/Seoul";
  private String id = "root";
  private String password = "wjdgy12!";


  public List<user> searchPerson(String keyword) throws ClassNotFoundException {
    List<user> people = new ArrayList<>();
    Class.forName(driver);
    try (
        Connection conn = DriverManager.getConnection(url,id,password);
        PreparedStatement ps = conn.prepareStatement("SELECT userid, userpassword, telephone, userwork,usertype FROM tb_user_m where userid like ? ");
    ) {
      ps.setString(1, keyword);

      try (ResultSet rs = ps.executeQuery()) {
        // 결과 레코드가 끝날때까지 반복
        while(rs.next()) {
          String userid = rs.getString("userid");
          String userpassword = rs.getString("userpassword");
          String telephone = rs.getString("telephone");
          String userwork = rs.getString("userwork");
          String usertype = rs.getString("usertype");
          people.add(new user(userid, userpassword, telephone,userwork, usertype));
        }
      } catch(Exception e) {
        e.printStackTrace();
      }
    } catch(Exception e) {
      e.printStackTrace();
    }

    return people;
  }

  public void addPerson(user person) {
    try (
        Connection conn = DriverManager.getConnection(url,id,password);
        PreparedStatement ps = conn.prepareStatement("INSERT INTO tb_user_m(userid, userpassword, telephone, userwork,usertype) VALUES(?, ?, ?, ?,?)")
    ) {
      ps.setString(1, person.getUserId());
      ps.setString(2, person.getUserPassword());
      ps.setString(3, person.getTelephone());
      ps.setString(4, person.getUserWork());
      ps.setString(5, person.getUserType());
      // 구문 실행
      ps.executeUpdate();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}


package com.example.blogs.pojo;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

  @Id
  private long id;
  private String username;
  private String password;
  private java.sql.Date gmtCreate;
  private java.sql.Date gmtModified;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public java.sql.Date getGmtCreate() {
    return gmtCreate;
  }

  public void setGmtCreate(java.sql.Date gmtCreate) {
    this.gmtCreate = gmtCreate;
  }


  public java.sql.Date getGmtModified() {
    return gmtModified;
  }

  public void setGmtModified(java.sql.Date gmtModified) {
    this.gmtModified = gmtModified;
  }

}

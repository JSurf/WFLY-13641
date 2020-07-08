package de.vitec.ejb.entity;

import java.io.Serializable;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="user")
@Table(name="TAB_USER")
@Cacheable(true)
public class User implements Serializable
{   
   private static final long serialVersionUID = 1L;
   
   private String userId;
   private String username;
   
   @Id
   @Column(name="USER_ID")
   public java.lang.String getUserId()
   {
      return userId;
   }
   public void setUserId(java.lang.String userId)
   {
      this.userId = userId;
   }

   @Column(name="USERNAME")
   public java.lang.String getUsername()
   {
      return username;
   }
   public void setUsername(java.lang.String username)
   {
      this.username = username;
   }

}

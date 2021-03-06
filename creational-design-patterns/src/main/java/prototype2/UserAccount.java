package prototype2;

import java.util.*;

public class UserAccount implements Cloneable {

  private String userName;
  private String password;
  private String fname;
  private String lname;
  private Vector<Permission> permissions = new Vector<Permission>();

  public void setUserName(String uName) {
    userName = uName;
  }
  
  public String getUserName() {
    return userName;
  }
  
  public void setPassword(String pwd) {
    password = pwd;
  }
  
  public String getPassword() {
    return password;
  }
  
  public void setFName(String name) {
    fname = name;
  }
  
  public String getFName() {
    return fname;
  }
  
  public void setLName(String name) {
    lname = name;
  }
  
  public String getLName() {
    return lname;
  }
  
  public void setPermissions(Vector<Permission> rights) {
    permissions = rights;
  }
  
  public Vector<Permission> getPermissions() {
    return permissions;
  }
  
  public void addPermission(Permission p) {
    permissions.add(p);
  }
  
  public Object clone() {
    //Shallow Copy
    try {
      return super.clone();
    } catch (CloneNotSupportedException e) {
      return null;
    }

    //Deep Copy
    /*
    UserAccount account = new UserAccount();
    account.setUserName(this.getUserName());
    account.setPassword(this.getPassword());
    account.setFName(this.getFName());
    account.setLName(this.getLName());
    Vector<Permission> permissions = new Vector<Permission>();
    for (int i=0; i<permissions.size(); i++) {
        Permission permission = (Permission) permissions.elementAt(i).clone();
    	permissions.add(permission);
    }
    account.setPermissions(permissions);
    return account;
    */    
  }
  
  public String toString() {
    String str = "User: " + getUserName() + "\n" + " Permissions : \n";
    for (int i = 0; i < permissions.size(); i++) {
        str = str + (Permission) permissions.elementAt(i) + "\n";
    }
    return str;
  }
}
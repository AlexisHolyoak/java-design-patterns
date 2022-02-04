package prototype2;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.*;

public class Client {

  public static void main(String[] args) throws URISyntaxException {
    
    Vector<Permission> supervisorPermissions = getPermissionsFromFile("supervisor.txt");
    UserAccount supervisor = new UserAccount();
    supervisor.setPermissions(supervisorPermissions);

    Vector<Permission> accountRepPermissions = getPermissionsFromFile("accountrep.txt");
    UserAccount accountRep = new UserAccount();
    accountRep.setPermissions(accountRepPermissions);

    AccountPrototypeFactory factory = new AccountPrototypeFactory(supervisor, accountRep);

    UserAccount newSupervisor = factory.getSupervisor();
    newSupervisor.setUserName("PKuchana");
    newSupervisor.setPassword("Everest");
    System.out.println(newSupervisor);

    UserAccount anotherSupervisor = factory.getSupervisor();
    anotherSupervisor.setUserName("SKuchana");
    anotherSupervisor.setPassword("Everest");
    System.out.println(anotherSupervisor);

    UserAccount newAccountRep = factory.getAccountRep();
    newAccountRep.setUserName("VKuchana");
    newAccountRep.setPassword("Vishal");
    System.out.println(newAccountRep);
  }

  public static Vector<Permission> getPermissionsFromFile(String fileName) throws URISyntaxException {
    Vector<Permission> permissions = new Vector<Permission>();
    String inputLine;
    try {      
      URL path = Client.class.getResource(fileName);
      File inFile = new File(path.toURI());
      BufferedReader br = new BufferedReader(
                            new InputStreamReader(
                              new FileInputStream(inFile)));

      while ((inputLine = br.readLine()) != null) {
        StringTokenizer st = new StringTokenizer(inputLine, ",");
        String resource = st.nextToken();
        String permission = st.nextToken();
        permissions.addElement(new Permission(resource, permission));
      }
      br.close();
    }
    catch (FileNotFoundException ex) {
    }
    catch (IOException ex) {
    }
    return permissions;
  }
}
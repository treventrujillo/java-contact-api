package treventrujillo.com.javacontactapi;

import org.springframework.data.annotation.Id;

public class Contact {

  @Id
  private String id;

  private String firstName;
  private String lastName;

  public String getContactFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getContactLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

}
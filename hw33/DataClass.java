package hw33;

import java.time.LocalDate;

/**
 * Этот класс служит для хранения данных пользователя, предоставляет доступ
 * только для чтения данных.
 */

public class DataClass {

  private String lastName;
  private String firstName;
  private String middleName;
  private LocalDate dateOfBirth;
  private long phoneNumber;
  private String gender;

  public DataClass(String lastName, String firstName, String middleName, LocalDate dateOfBirth,
      long phoneNumber, String gender) {
    this.lastName = lastName;
    this.firstName = firstName;
    this.middleName = middleName;
    this.dateOfBirth = dateOfBirth;
    this.phoneNumber = phoneNumber;
    this.gender = gender;
  }

  public String getLastName() {
    return lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public long getPhoneNumber() {
    return phoneNumber;
  }

  public String getGender() {
    return gender;
  }
}
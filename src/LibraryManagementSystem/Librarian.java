package LibraryManagementSystem;

public class Librarian extends User {

  String employeeNumber;

  Librarian() {
    super();
  }
  public Librarian(String employeeNumber, String name, String contact) {
    super(name, contact);
    this.employeeNumber = employeeNumber;
  }

  @Override
  void displayDashboard() {
    System.out.println("Member Name: " + getName());
    System.out.println("Member Contact: " + getContactInfo());
    System.out.println(employeeNumber + "employeeNumber");
  }

  @Override
  boolean canBorrowBooks() {
    return true;
  }

  void addNewBook() {
    return;
  }

  void removeBook() {
    return;
  }
}

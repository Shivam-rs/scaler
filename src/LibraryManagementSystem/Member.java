package LibraryManagementSystem;

public class Member extends User {
  private  int borrowedBooksCount;
  final private int MAX_BORROW_LIMIT = 5;

  Member(){
    super();
    borrowedBooksCount = 0;
  }

  Member(String name, String contact){
    super(name, contact);
    borrowedBooksCount = 0;
  }

  @Override
  void displayDashboard() {
    System.out.println("Member Name: " + getName());
    System.out.println("Member Contact: " + getContactInfo());
    System.out.println(borrowedBooksCount + " borrowed books");
  }

  @Override
  boolean canBorrowBooks() {
    return borrowedBooksCount < MAX_BORROW_LIMIT;
  }
}

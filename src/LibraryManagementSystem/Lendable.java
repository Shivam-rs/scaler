package LibraryManagementSystem;

public interface Lendable {
  boolean kend(User user);
  void returnBook(User user);
  boolean isAvailable();
}

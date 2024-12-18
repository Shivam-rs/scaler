package LibraryManagementSystem;

abstract class User {
  private String userId;
  private String name;
  private String contactInfo;
  static int totalUsers = 0;

  int getTotalUsers() {
    return totalUsers;
  }

  public String getName() {
    return name;
  }

  public String getContactInfo() {
    return contactInfo;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setContactInfo(String contactInfo) {
    this.contactInfo = contactInfo;
  }

  User(){
    this.userId = generateUniqueId();
    this.name = "";
    this.contactInfo = "";
  }

  User(String name, String contactInfo) {
    this.name = name;
    this.contactInfo = contactInfo;

  }

  User(User user){
    this.userId = generateUniqueId();
    this.name = user.name;
    this.contactInfo = user.contactInfo;
  }

  final private String generateUniqueId(){
    return "User "+ totalUsers++;
  }

  abstract void displayDashboard();
  abstract boolean canBorrowBooks();

}

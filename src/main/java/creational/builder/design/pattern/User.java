package creational.builder.design.pattern;

/*
  Builder Design Pattern is a category of Creational pattern and it
  is a way to construct complex object.

  Below is the User class that have some private fields/attributes.

  Please implement Builder Design Pattern.

  To design this pattern, whatever number of classes needed, please feel free to
  implement those.
 */
public class User {
    private String userName;
    private String userEmail;
    private String userSSN;
    private int userAge;

    public User(UserBuilder userBuilder){
        this.userName = userBuilder.userName;
        this.userAge = userBuilder.userAge;
        this.userEmail = userBuilder.userEmail;
        this.userSSN = userBuilder.userSSN;
    }

    public static class UserBuilder {
        private String userName;
        private String userEmail;
        private String userSSN;
        private int userAge;

        public UserBuilder(String userName, String userSSN) {
            this.userName = userName;
            this.userSSN = userSSN;
        }

        public UserBuilder age(int userAge) {
            this.userAge = userAge;
            return this;
        }

        public UserBuilder email(String userEmail) {
            this.userEmail = userEmail;
            return this;
        }
        public User build(){ return new User(this); }


    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userSSN='" + userSSN + '\'' +
                ", userAge=" + userAge +
                '}';
    }

    public static void main(String[] args) {
        User userObject = new UserBuilder("Juned5252","9999").age(27).email("juned@gmail.com").build();
        System.out.println( userObject.toString());
    }
}

import java.util.Scanner;

public class DirverClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Please Enter your name");
            String username = sc.nextLine();
            checkUsername(username);

            System.out.println("Please Enter your age");
            int age = sc.nextInt();
            checkAge(age);

            User user = new User(username, age);
            System.out.println(user);
        }catch(IllegalUsernameException e){
            System.out.println(e.getMessage());
        }catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }

    private static void checkUsername(String username){
        if(username.length()<6 || username.length()>20){
            throw new IllegalUsernameException("Username length is invalid. Please keep the length between 6 to 20");
        }
    }

    private static void checkAge(int age){
        if(age<0){
            throw new InvalidAgeException("Invalid Age input. Given age is negative");
        }
    }
}

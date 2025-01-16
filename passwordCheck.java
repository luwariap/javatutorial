import java.util.Scanner ;
public  class passwordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password;
        do {
            System.out.println("pleas set  password : ");
             password = input.next();

         } while(!isPasswordCorrect(password)) ;
        System.out.println("your password is  correct  go ahead");
    }

    public static boolean isPasswordCorrect(String password) {
        return password.length()>6 ;


    }


}

class User {
    synchronized public void passCheck(String email, String password) {
        try {
            System.out.println("User waiting for authentication...");
            wait();  
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
        System.out.println("User is authorized");
    }
}

class Admin {

     public void auth(User user, String email, String password) {
        synchronized (user) {
            if (email.equals(user.email) && password.equals(user.password)) {
                System.out.println("Admin authenticated the user.");
                user.notify(); 
            } else {
                System.out.println("Authentication failed.");
            }
        }
    }
}

public class InterThreadComWithTwoClass {
    public static void main(String[] args) {
        User user = new User();  
        Admin admin = new Admin();

        Thread userThread = new Thread(() -> {
            user.passCheck("xyz@gmail.com", "password@123");
        });

        Thread adminThread = new Thread(() -> {
            try {
      
                Thread.sleep(1000); 
                admin.auth(user, "xyz@gmail.com", "password@123");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        userThread.start();
        adminThread.start();
    }
}


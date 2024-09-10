package org.example;

import java.util.Scanner;

public class LastExercise {
    public static class Registration {
        private String email;
        private String userName;
        private String password;

        public Registration() {
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            if (email != null && email.endsWith("@yahoo.com")) {
                this.email = email;
            } else {
                System.out.println("Invalid email. Only Yahoo emails are accepted.");
            }
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            if (userName != null && userName.length() > 6) {
                this.userName = userName;
            } else {
                System.out.println("Invalid userName. It must be longer than 6 characters.");
            }
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            if (password != null && password.length() > 6 && !password.contains(userName)) {
                this.password = password;
            } else {
                System.out.println("Invalid password. It must be longer than 6 characters and cannot contain the userName.");
            }
        }


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            Registration reg = new Registration();


            System.out.print("Enter your email: ");
            String email = scanner.nextLine();
            reg.setEmail(email);


            System.out.print("Enter your username: ");
            String userName = scanner.nextLine();
            reg.setUserName(userName);


            System.out.print("Enter your password: ");
            String password = scanner.nextLine();
            reg.setPassword(password);


            System.out.println("Registration Details:");
            System.out.println("Email: " + reg.getEmail());
            System.out.println("Username: " + reg.getUserName());
            System.out.println("Password: " + reg.getPassword());

            scanner.close();
        }
    }
}

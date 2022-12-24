package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

        public void changePassword(String oldPassword, String newPassword){
            boolean flag = false;
            if(newPassword.length() <= 8) {
                flag = crctPass(newPassword);
            }
          else{
                System.out.println("your password is not meets all criteria");

            }

          if(flag == true){
              if(oldPassword.equals(this.password)){
                  password = newPassword;
          }
       }
    }

    public static boolean crctPass(String password){
        boolean Num = false,caps = false,low = false,spec = false;
        char c;
        for(int i = 0;i<password.length();i++){
            c = password.charAt(i);
            if(Character.isDigit(c)){
                Num = true;
            }
            else if (Character.isUpperCase(c)){
                caps = true;
            }
            else if  (Character.isLowerCase(c)){
                low = true;
            }else{
                spec = true;
            }
            if(Num && caps && low && spec){
                return true;
            }

        }
        return false;
    }


}



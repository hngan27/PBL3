/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;


import DAL.*;
import DTO.*;

/**
 *
 * @author Admin
 */
public class UserBLL {

    static UserDAL user = new UserDAL();

    public static boolean checkLogin(String name, String password) {

        if (user.getUserLogin(name, password).getUserAccount() != null) {
            return true;
        } else {
            return false;
        }
    }

    public static void getSignup(String username, String password, String name, String gmail, String phone) {
//        if ()
        //UserDTO user = new UserDTO(0, username, password, name, gmail, phone);
        UserDAL.createUser(username, password, name, gmail, phone);
        
    }
    public static boolean checkSignup(String username, String password, String name, String gmail, String phone){
        if (checkGmail(gmail) == false|| checkName(name) == false || checkPassword(password) == false || checkPhone(phone) == false || checkUserName(username) == false)
            return false;
        return true;
        
    }
    public static UserDTO getUser(String name, String password) {
        return user.getUserLogin(name, password);

    }

    public static boolean checkGmail(String gmail) {
        StringBuffer temp = new StringBuffer(gmail);
        if (temp.length() < 11 || user.getListGmail().contains(gmail)) {
            return false;
        } else if (temp.substring(gmail.length() - 10, gmail.length()).equals("@gmail.com")) {
            return true;
        }
        return false;
    }

    public static boolean checkPhone(String phone) {
        if (phone.length() != 10 || user.getListPhone().contains(phone)) {
            return false;
        }
        return true;
    }
    public static boolean checkUserName(String username){
        if (username.isEmpty() || user.getListUserName().contains(username))
            return false;
        return true;
    }
    public static boolean checkName(String name){
        if (name.isEmpty())
            return false;
        return true;
    }
    public static boolean checkPassword(String password){
        if (password.isEmpty())
            return false;
        return true;
    }

}

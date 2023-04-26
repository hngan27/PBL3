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
public class Test {
    public static void main(String[] args) {
        UserDAL a = new UserDAL();
//        DictDAL b = new DictDAL();
//        for (String temp : b.getListDictEng()){
//            System.out.println(temp);
//        }
        for (UserDTO temp : a.getListUser()){
            System.out.println(temp.toString());
        }
        
        System.out.println(a.getUserLogin("tin1712", "tin17122003").toString());
    }
}

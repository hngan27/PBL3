/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.*;
import DTO.UserDTO;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class UserDAL {

    Connection1 con = new Connection1();

    public static List<UserDTO> getListUser() {
        List<UserDTO> list = new ArrayList<>();
        try {

            String querry = "select * from Nguoidung";
            Connection1.result = Connection1.statement.executeQuery(querry);
            Connection1.rmsd = Connection1.result.getMetaData();
            int socot = Connection1.rmsd.getColumnCount();
            if (Connection1.result.next()) {
                while (Connection1.result.next()) {
                    UserDTO temp = new UserDTO();
                    for (int i = 1; i <= socot; i++) {
                        switch (i) {
                            case 1:
                                temp.setUserId(Connection1.result.getInt(i));
                                break;
                            case 2:
                                temp.setUserAccount(Connection1.result.getString(i));
                                break;
                            case 3:
                                temp.setUserPassword(Connection1.result.getString(i));
                                break;
                            case 4:
                                temp.setUserName(Connection1.result.getString(i));
                                break;
                            case 5:
                                temp.setUserGmail(Connection1.result.getString(i));
                                break;
                            case 6:
                                temp.setUserPhoneNumber(Connection1.result.getString(i));
                                break;
                            default:
                                throw new AssertionError();
                        }

                    }
                    list.add(temp);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public List<String> getListGmail(){
        List<String> list = new ArrayList<>();
        try {
            String querry = "select Gmail from Nguoidung ";
            Connection1.result = Connection1.statement.executeQuery(querry);
            while (Connection1.result.next()) {
                list.add(Connection1.result.getString("Gmail"));
            }
        } catch (Exception e) {

        }
        return list;
    }
    public List<String> getListPhone(){
        List<String> list = new ArrayList<>();
        try {
            String querry = "select Sdt from Nguoidung ";
            Connection1.result = Connection1.statement.executeQuery(querry);
            while (Connection1.result.next()) {
                list.add(Connection1.result.getString("Sdt"));
            }
        } catch (Exception e) {

        }
        return list;
    }
    public List<String> getListUserName() {
        List<String> list = new ArrayList<>();
        try {
            String querry = "select TaiKhoan from Nguoidung ";
            Connection1.result = Connection1.statement.executeQuery(querry);
            while (Connection1.result.next()) {
                list.add(Connection1.result.getString("TaiKhoan"));
            }
        } catch (Exception e) {

        }
        return list;
    }

    public static  int getUserIdByUsername(String username) {
        try {
            String querry = "select idU from Nguoidung where TaiKhoan = '" + username + "'";
            Connection1.result = Connection1.statement.executeQuery(querry);
            while(Connection1.result.next()){
                return  Connection1.result.getInt(1);
            }
            return  Connection1.result.getInt(1);
        } catch (Exception e) {
             return 5;
        }
       
    }

    public  static  UserDTO getUserLogin(String username, String password) {
        UserDTO user = new UserDTO();
        try {
            String querry = "select * from Nguoidung " + "where TaiKhoan= '" + username + "'" + " and matkhau= '" + password + "'";
            Connection1.result = Connection1.statement.executeQuery(querry);
//            if (Connection1.result == null)
//                return null;
            Connection1.rmsd = Connection1.result.getMetaData();
            int socot;
            socot = Connection1.rmsd.getColumnCount();
            if (Connection1.result.next()) {
                for (int i = 1; i <= socot; i++) {
                    switch (i) {
                        case 1:
                            user.setUserId(Connection1.result.getInt(i));
                            break;
                        case 2:
                            user.setUserAccount(Connection1.result.getString(i));
                            break;
                        case 3:
                            user.setUserPassword(Connection1.result.getString(i));
                            break;
                        case 4:
                            user.setUserName(Connection1.result.getString(i));
                            break;
                        case 5:
                            user.setUserGmail(Connection1.result.getString(i));
                            break;
                        case 6:
                            user.setUserPhoneNumber(Connection1.result.getString(i));
                            break;
                        default:
                            throw new AssertionError();
                    }
                }
            }

        } catch (Exception e) {

        }
        return user;

    }
    public static void createUser(String username, String password, String name, String gmail, String phone){
        try {
            String querry = "insert into Nguoidung "
                    + "values "
                    + "('" + username + "','" + password + "',N'" + name + "','" + gmail + "','" + phone + "');";
            System.out.println(querry);
            Connection1.statement.executeUpdate(querry);
        } catch (Exception e) {
        }
    }

    public static void ChangeName(String name,int id)
    {
        try {
            String querry = "update Nguoidung set Ten = N'" + name + "' where idU = " + id;
            System.out.println(querry);
            Connection1.statement.executeUpdate(querry);
        } catch (Exception e) {
        }
    }
    
    public static void ChangePass(String pass, int id)
    {
        try {
            String querry = "update Nguoidung set MatKhau = '" + pass + "' where idU = " + id;
            System.out.println(querry);
            Connection1.statement.executeUpdate(querry);
        } catch (Exception e) {
        }
    }
}

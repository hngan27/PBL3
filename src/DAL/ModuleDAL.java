/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.DictDTO;
import DTO.ModuleDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class ModuleDAL {

    Connection1 conn = new Connection1();

    public List<ModuleDTO> getListModule() {
        List<ModuleDTO> list = new ArrayList<>();
        try {
            String querry = "select * from HocPhan";
            conn.result = conn.statement.executeQuery(querry);
            int socot;
            conn.rmsd = conn.result.getMetaData();
            socot = conn.rmsd.getColumnCount();
            while (conn.result.next()) {
                ModuleDTO hocphan = new ModuleDTO();
                for (int i = 1; i <= socot; i++) {
                    switch (i) {
                        case 1:
                            hocphan.setModuleId(conn.result.getInt(i));
                            break;
                        case 3:
                            hocphan.setModuleName(conn.result.getString(i));
                            break;
                        case 4:
                            hocphan.setModuleDescription(conn.result.getString(i));
                            break;
                        case 2:
                            hocphan.setUserId(conn.result.getInt(i));
                            break;
                        default:
                            throw new AssertionError();
                    }
                }
                list.add(hocphan);

            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<ModuleDTO> getListModuleByIdU(int id) {
        List<ModuleDTO> list = new ArrayList<>();
        try {
            String querry = "select * from HocPhan " + "where idU = " + id;
            conn.result = conn.statement.executeQuery(querry);
            int socot;
            conn.rmsd = conn.result.getMetaData();
            socot = conn.rmsd.getColumnCount();
            while (conn.result.next()) {
                ModuleDTO hocphan = new ModuleDTO();
                for (int i = 1; i <= socot; i++) {
                    switch (i) {
                        case 1:
                            hocphan.setModuleId(conn.result.getInt(i));
                            break;
                        case 3:
                            hocphan.setModuleName(conn.result.getString(i));
                            break;
                        case 4:
                            hocphan.setModuleDescription(conn.result.getString(i));
                            break;
                        case 2:
                            hocphan.setUserId(conn.result.getInt(i));
                            break;
                        default:
                            throw new AssertionError();
                    }
                }
                list.add(hocphan);

            }
        } catch (Exception e) {

        }
        return list;
    }

    public ModuleDTO getModuleByIdH(int idH) {
        ModuleDTO module = new ModuleDTO();
        try {
            String querry = "select * from Hocphan where idH = " + idH;
            conn.result = conn.statement.executeQuery(querry);
            while (conn.result.next()) {
                module.setModuleId(conn.result.getInt(1)); 
                module.setUserId(conn.result.getInt(2)); 
                module.setModuleName(conn.result.getString(3));
                module.setModuleDescription(conn.result.getString(4)); 
            }
            //return conn.result.getInt(1);
        } catch (Exception e) {
           
        }
        return module;

    }

    public static void AddHocPhan(ModuleDTO module) {
        try {
            String querry = "insert into HocPhan "
                    + "values "
                    + "(" + module.getUserId() + ",N'" + module.getModuleName() + "',N'" + module.getModuleDescription() + "');";
            Connection1.statement.executeUpdate(querry);
        } catch (SQLException e) {
        }
    }

    public static void AddWordHocPhan(String wordId) {
        try {

            String querry = "insert into KetNoi "
                    + "values "
                    + "(" + getLastIndex() + ",'" + wordId + "');";
            Connection1.statement.executeUpdate(querry);
        } catch (SQLException e) {  

        }

    }
    public static int getLastIndex() {
        int count = 0;
        try {

            String querry = "select idH from HocPhan";

            Connection1.result = Connection1.statement.executeQuery(querry);
            Connection1.result.last();
            return Connection1.result.getInt(1);

        } catch (Exception ex) {
            return count;
        }
    }

    public static int getNumbersWordModule(int idH) {
        int count = 0;
        try {

            String querry = "select * from KetNoi where idH = " + idH;
            Connection1.result = Connection1.statement.executeQuery(querry);
            Connection1.result.last();
            return Connection1.result.getRow();

        } catch (SQLException ex) {
            return count;
        }
    }
    public static void DeleteModule(int id){
        try {
            String querry1 = "delete from Ketnoi where idH = " + id;
            String querry = "delete from HocPhan where idH = " + id;
            Connection1.statement.executeUpdate(querry1);
            Connection1.statement.executeUpdate(querry);
        } catch (SQLException e) {
            System.out.println("error");
        }
    }
    public static void UpdateModule(int id, String moduleName, String moduleDescription){
        try {
            String querry = "Update HocPhan set TenHP = N'" + moduleName + "',Mota = '" + moduleDescription + "' where idH = " + id;
            Connection1.statement.executeUpdate(querry);
        } catch (SQLException e) {
            System.out.println("error");
        }
    }
   
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.DictDTO;
import DTO.ModuleDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ModuleDAL {
    Connection1 conn = new Connection1();
    public  List<ModuleDTO> getListModule(){
       List<ModuleDTO> list = new ArrayList<>();
       try{
           String querry = "select * from HocPhan";
           conn.result = conn.statement.executeQuery(querry);
           int socot;
           conn.rmsd = conn.result.getMetaData();
           socot  = conn.rmsd.getColumnCount();
           while (conn.result.next()){
               ModuleDTO hocphan = new ModuleDTO();
            for (int i = 1; i <= socot; i ++){
              switch (i) {
                        case 1:
                            hocphan.setModuleId(conn.result.getString(i));
                            break;
                        case 2:
                            hocphan.setModuleName(conn.result.getString(i));
                            break;
                        case 3:
                            hocphan.setModuleDescription(conn.result.getString(i));
                            break;
                        case 4:
                            hocphan.setUserId(conn.result.getString(i));
                            break;
                        default:
                            throw new AssertionError();
                    }
            }
            list.add(hocphan);
                   
           }
       }catch(Exception e)
       {
           
       }
       return list;
    }
    public  List<String> getListModuleName(){
       List<String> list = new ArrayList<>();
       try{
           String querry = "select TenHP from Hocphan ";
           conn.result = conn.statement.executeQuery(querry);
           while (conn.result.next()){
               list.add(conn.result.getString("")); 
           }
       }catch(Exception e)
       {
           
       }
       return list;
    }
}

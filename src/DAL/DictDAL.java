/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.DictDTO;
import DTO.UserDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class DictDAL {
    Connection1 conn = new Connection1();
    private ModuleDAL module = new ModuleDAL();
    public  List<DictDTO> getListDict(){
       List<DictDTO> list = new ArrayList<>();
       try{
           String querry = "select * from dictionary";
           conn.result = conn.statement.executeQuery(querry);
           int socot;
           conn.rmsd = conn.result.getMetaData();
           socot  = conn.rmsd.getColumnCount();
           while (conn.result.next()){
               DictDTO word = new DictDTO();
            for (int i = 1; i <= socot; i ++){
              switch (i) {
                        case 1:
                            word.setWordId(conn.result.getString(i));
                            break;
                        case 2:
                            word.setEnglishLanguage(conn.result.getString(i));
                            break;
                        case 3:
                            word.setVietnameseLanguae(conn.result.getString(i));
                            break;
                        case 4:
                            word.setInternationalPhonetic(conn.result.getString(i));
                            break;
                        case 5:
                            word.setWordForm(conn.result.getString(i));
                            break;
                        default:
                            throw new AssertionError();
                    }
            }
            list.add(word);
                   
           }
       }catch(Exception e)
       {
           
       }
       return list;
    }
    public  List<String> getListDictEng(){
       List<String> list = new ArrayList<>();
       try{
           String querry = "select TiengAnh from dictionary ";
           conn.result = conn.statement.executeQuery(querry);
           while (conn.result.next()){
               list.add(conn.result.getString("TiengAnh")); 
           }
       }catch(Exception e)
       {
           
       }
       return list;
    }
    public static DictDTO getDictWord(String word){
        
        DictDTO word1 = new DictDTO();
        try {
            String querry = "select * from dictionary " + "where TiengAnh= '" + word + "'" ;
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
                            word1.setWordId(Connection1.result.getString(i));
                            break;
                        case 2:
                            word1.setEnglishLanguage(Connection1.result.getString(i));
                            break;
                        case 3:
                            word1.setVietnameseLanguae(Connection1.result.getString(i));
                            break;
                        case 4:
                            word1.setInternationalPhonetic(Connection1.result.getString(i));
                            break;
                        case 5:
                            word1.setWordForm(Connection1.result.getString(i));
                            break;
                        
                        default:
                            throw new AssertionError();
                    }
                }
            }

        } catch (Exception e) {

        }
        return word1;

    }
   public  List<DictDTO> getWordHocPhan(int idH){
        List<DictDTO> list = new ArrayList<>();
        try {

            String querry = "select  dictionary.id, TiengAnh, TiengViet, PhienAm, LoaiTu from dictionary" +
                            " join KetNoi on KetNoi.id= dictionary.id" +
                            " join HocPhan on HocPhan.idH = KetNoi.idH and HocPhan.idH = " + idH + 
                            " join Nguoidung on HocPhan.idU = Nguoidung.idU " +
                            "where Nguoidung.idU = " + module.getModuleByIdH(idH).getUserId();
            Connection1.result = Connection1.statement.executeQuery(querry);
            while (Connection1.result.next()) {
                DictDTO word = new DictDTO();
                word.setWordId(Connection1.result.getString(1)); 
                word.setEnglishLanguage(Connection1.result.getString(2)); 
                word.setVietnameseLanguae(Connection1.result.getString(3));
                word.setInternationalPhonetic(Connection1.result.getString(4));
                word.setWordForm(Connection1.result.getString(5));
                list.add(word);
            }
            //Connection1.result.last();
            

        } catch (Exception ex) {
            
        }
        return list;
        
    } 
   public static void DeleteWordModule(String id){
       try {
           String querry = "delete from Ketnoi where id = '" + id + "'";
           Connection1.statement.executeUpdate(querry);
       } catch (Exception e) {
           System.out.println("Loi roi");
       }
       
   }
   public static void InsertWordModule(int idH, String id){
       try {
           String querry = "insert into ketnoi "
                    + "values "
                    + "(" + idH + ",'" + id + "')" ;
            Connection1.statement.executeUpdate(querry);
       } catch (Exception e) {
           System.out.println("Loi roi");
       }
   }
    
}

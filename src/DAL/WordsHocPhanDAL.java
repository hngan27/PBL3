/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.UserDTO;
import DTO.WordsHocPhanDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class WordsHocPhanDAL {
    Connection1 conn = new Connection1();
    public List<WordsHocPhanDTO> getListWordsHocPhan(){
        List<WordsHocPhanDTO> list = new ArrayList<>();
        try{
            String querry = "select *from KetNoi";
            conn.result = conn.statement.executeQuery(querry);
            conn.rmsd = conn.result.getMetaData();
            int socot;
            socot  = conn.rmsd.getColumnCount();
            while (conn.result.next()){
                for (int i = 1; i < socot; i++){
                    WordsHocPhanDTO temp = new WordsHocPhanDTO();
                
                    switch (i) {
                        case 1:
                            temp.setHocPhanId(conn.result.getString(i));
                            break;
                        case 2:
                            temp.setWordsId(conn.result.getString(i));
                            break;
                        default:
                            throw new AssertionError();
                    }

                list.add(temp);
                }
            }
        }catch(Exception e)
        {
            
        }
        return list;
    }
}

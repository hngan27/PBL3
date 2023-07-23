/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DTO.*;
import DAL.*;
import GUI.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class ModuleBLL {
    DictDAL dictDAL = new DictDAL();
    ModuleDAL moduleDAL = new ModuleDAL();

    public static void AddWordHocPhan(Vector<Vector> a) {
        System.out.println(DAL.ModuleDAL.getLastIndex());
        for (int i = 0; i < TaoHP.indexCount; i++) {
            String temp = String.valueOf(a.elementAt(i).elementAt(1));

            DAL.ModuleDAL.AddWordHocPhan(DictBLL.getWord(temp).getWordId());
        }

    }

    public static void AddHocPhan(int userId, String moduleName, String moduleDescription) {
        ModuleDTO module = new ModuleDTO(0, userId, moduleName, moduleDescription);
        DAL.ModuleDAL.AddHocPhan(module);
    }

    public List<ModuleDTO> getListModule(int id) {
        return moduleDAL.getListModuleByIdU(id);
    }

    public Vector<Vector> getDataListModule(int id) {
        List<ModuleDTO> list = new ArrayList<>();
        list = getListModule(id);
        Vector<Vector> dataTable = new Vector<Vector>();

        for (int i = 0; i < list.size(); i++) {
            Vector<String> vector = new Vector<String>();
            vector.add(String.valueOf(dataTable.size() + 1));
            vector.add(list.get(i).getModuleName());
            vector.add(String.valueOf(ModuleDAL.getNumbersWordModule(list.get(i).getModuleId())));
            vector.add(list.get(i).getModuleDescription());
            dataTable.add(vector);
        }
        return dataTable;
    }
    public int getIdModulebyTable(int id, Vector data){
        int idH = 0;
        HashMap<Integer, Vector> map = new HashMap<>();
        List<ModuleDTO> list = new ArrayList<>();
        list = getListModule(id);
        Vector<Vector> dataTable = getDataListModule(id);
        for (int i = 0; i < dataTable.size(); i++){
            map.put(list.get(i).getModuleId(), dataTable.get(i));
        }
        for (Map.Entry<Integer, Vector> entry : map.entrySet()){
            if (entry.getValue().equals(data)){
                idH = entry.getKey();  
                 return idH;
                //System.out.println("1");
            }
            //System.out.println(entry.getValue());
           
        }
        return idH;
        
    }
    public DefaultTableModel getDataListWord(int idH){
        DefaultTableModel model = new DefaultTableModel();
        List<DictDTO> list = new ArrayList<>();
        list = dictDAL.getWordHocPhan(idH);
        Vector<Vector> dataTable = new Vector<>();
        for (DictDTO temp : list){
            Vector row = new Vector();
            row.add(temp.getEnglishLanguage());
            row.add(temp.getVietnameseLanguae());
            row.add(temp.getInternationalPhonetic());
            row.add(temp.getWordForm());
            dataTable.add(row);
            
        }
//        if(dataTable.size() <=8){
//            int rows = dataTable.size();
//            for (int i = 0; i <= 8 - rows;i++){
//                dataTable.add(new Vector());
//            }
//        }
        Vector columns = new Vector<>();
        columns.add("Tiếng Anh");
        columns.add("Tiếng Việt");
        columns.add("Phiên âm");
        columns.add("Loại từ");
        model.setDataVector(dataTable, columns);
        
        return model;
        
    }
    public ModuleDTO getModuleById(int idH){
        return moduleDAL.getModuleByIdH(idH);
        
    }
    public static void DeleteModule(int idH){
        DAL.ModuleDAL.DeleteModule(idH);
    }
    public static void UpdateModule(int idH, String moduleName, String  moduleDescription){
        DAL.ModuleDAL.UpdateModule(idH, moduleName, moduleDescription);
    }
    
    public String[][] getArrDataListWord(int idH){
        DefaultTableModel model = new DefaultTableModel();
        List<DictDTO> list = new ArrayList<>();
        list = dictDAL.getWordHocPhan(idH);
        String[][] arr = new String[list.size()][4];
        int i = 0;
        for (DictDTO temp : list){         
            arr[i][0] = temp.getEnglishLanguage();
            arr[i][1] = temp.getVietnameseLanguae();
            arr[i][2] = temp.getInternationalPhonetic();
            arr[i][3] = temp.getWordForm();
            i++;
        }
        return arr;  
    } 
}

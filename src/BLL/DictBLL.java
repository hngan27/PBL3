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
public class DictBLL {
    public static boolean  isWord(String search){
        if (DictDAL.getDictWord(search).getEnglishLanguage() != null)
            return true;
        return false;
    }
    public static DictDTO getWord(String search){
        if (isWord(search))
            return   DictDAL.getDictWord(search);
        return null;
           
           
    }
}
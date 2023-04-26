/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;

import DTO.DataSearchDTO;
import java.awt.Component;

/**
 *
 * @author Admin
 */
public interface EventClick {
    public void itemClick(DataSearchDTO data);
    public void itemRemove(Component com, DataSearchDTO data);
    
}

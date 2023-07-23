/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import DAL.Connection1;
import java.util.ArrayList;
import java.util.List;
import javax.management.modelmbean.ModelMBean;

/**
 *
 * @author Admin
 */
public class ModuleDTO {

    /**
     * @return the moduleId
     */
    public int getModuleId() {
        return moduleId;
    }

    /**
     * @param moduleId the moduleId to set
     */
    public void setModuleId(int moduleId) {
        this.moduleId = moduleId;
    }

    /**
     * @return the userId
     */
    public int getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * @return the moduleName
     */
    public String getModuleName() {
        return moduleName;
    }

    /**
     * @param moduleName the moduleName to set
     */
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    /**
     * @return the moduleDescription
     */
    public String getModuleDescription() {
        return moduleDescription;
    }

    /**
     * @param moduleDescription the moduleDescription to set
     */
    public void setModuleDescription(String moduleDescription) {
        this.moduleDescription = moduleDescription;
    }
    private int moduleId;
    private int userId;
    private String moduleName;
    private String moduleDescription;
   

    public ModuleDTO() {
    }
    

    public ModuleDTO(int moduleId, int userId, String moduleName, String moduleDescription) {
        this.moduleId = moduleId;
        this.userId = userId;
        this.moduleName = moduleName;
        this.moduleDescription = moduleDescription;
    }
     
    @Override
     public String toString () {
        return ("ID: " + moduleId + ", USER ID: " + userId + ", Name " + moduleName + ", Description: " + moduleDescription );
    }
    
}

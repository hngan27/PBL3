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
    public String getModuleId() {
        return moduleId;
    }

    /**
     * @param moduleId the moduleId to set
     */
    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    /**
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(String userId) {
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
    private String moduleId;
    private String userId;
    private String moduleName;
    private String moduleDescription;
    private DAL.Connection1 con = new Connection1();

    public ModuleDTO() {
    }
    

    public ModuleDTO(String moduleId, String userId, String moduleName, String moduleDescription) {
        this.moduleId = moduleId;
        this.userId = userId;
        this.moduleName = moduleName;
        this.moduleDescription = moduleDescription;
    }
     public List<ModuleDTO> ListModule() {
        List<ModuleDTO> list = new ArrayList<>();
        try {

            String querry = "select * from HocPhan";
            con.result = con.statement.executeQuery(querry);
            con.rmsd = con.result.getMetaData();
            int socot = con.rmsd.getColumnCount();
            while (con.result.next()) {
                ModuleDTO temp = new ModuleDTO();
                for (int i = 1; i <= socot; i++) {
                    switch (i) {
                        case 1:
                            temp.setModuleId(con.result.getString(i));
                            break;
                        case 2:
                            temp.setUserId(con.result.getString(i));
                            break;
                        case 3:
                            temp.setModuleName(con.result.getString(i));
                            break;
                        case 4:
                            temp.setModuleDescription(con.result.getString(i));
                            break;
                        default:
                            throw new AssertionError();
                    }

                }
                list.add(temp);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    @Override
     public String toString () {
        return ("ID: " + moduleId + ", USER ID: " + userId + ", Name " + moduleName + ", Description: " + moduleDescription );
    }
    
}

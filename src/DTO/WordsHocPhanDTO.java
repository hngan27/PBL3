/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Admin
 */
public class WordsHocPhanDTO {

    /**
     * @return the hocPhanId
     */
    public String getHocPhanId() {
        return hocPhanId;
    }

    /**
     * @param hocPhanId the hocPhanId to set
     */
    public void setHocPhanId(String hocPhanId) {
        this.hocPhanId = hocPhanId;
    }

    /**
     * @return the wordsId
     */
    public String getWordsId() {
        return wordsId;
    }

    /**
     * @param wordsId the wordsId to set
     */
    public void setWordsId(String wordsId) {
        this.wordsId = wordsId;
    }
    private String hocPhanId;
    private String wordsId;

    public WordsHocPhanDTO() {
    }

    public WordsHocPhanDTO(String hocPhanId, String wordsId) {
        this.hocPhanId = hocPhanId;
        this.wordsId = wordsId;
    }
    
    
    
    
}

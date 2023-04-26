/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import DAL.Connection1;
import com.sun.jdi.connect.spi.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class DictDTO {

    /**
     * @return the wordId
     */
    static Connection1 connn = new Connection1();
    private String wordId;
    private String englishLanguage;
    private String vietnameseLanguae;
    private String internationalPhonetic;
    private String wordForm;

    public DictDTO(String wordId, String englishLanguage, String vietnameseLanguague, String internationalPhonetic, String wordForm) {
        this.wordId = wordId;
        this.englishLanguage = englishLanguage;
        this.vietnameseLanguae = vietnameseLanguague;
        this.internationalPhonetic = internationalPhonetic;
        this.wordForm = wordForm;

    }

    public DictDTO() {

    }

    public String getWordId() {
        return wordId;
    }

    /**
     * @param wordId the wordId to set
     */
    public void setWordId(String wordId) {
        this.wordId = wordId;
    }

    /**
     * @return the englishLanguage
     */
    public String getEnglishLanguage() {
        return englishLanguage;
    }

    /**
     * @param englishLanguage the englishLanguage to set
     */
    public void setEnglishLanguage(String englishLanguage) {
        this.englishLanguage = englishLanguage;
    }

    /**
     * @return the vietnameseLanguae
     */
    public String getVietnameseLanguae() {
        return vietnameseLanguae;
    }

    /**
     * @param vietnameseLanguae the vietnameseLanguae to set
     */
    public void setVietnameseLanguae(String vietnameseLanguae) {
        this.vietnameseLanguae = vietnameseLanguae;
    }

    /**
     * @return the internationalPhonetic
     */
    public String getInternationalPhonetic() {
        return internationalPhonetic;
    }

    /**
     * @param internationalPhonetic the internationalPhonetic to set
     */
    public void setInternationalPhonetic(String internationalPhonetic) {
        this.internationalPhonetic = internationalPhonetic;
    }

    /**
     * @return the wordForm
     */
    public String getWordForm() {
        return wordForm;
    }

    /**
     * @param wordForm the wordForm to set
     */
    public void setWordForm(String wordForm) {
        this.wordForm = wordForm;
    }

    public String toString() {
        return ("ID: " + wordId + ", EngLish: " + englishLanguage + ", Vietnamese: " + vietnameseLanguae + ", IP: " + internationalPhonetic + ", Form: " + wordForm);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Admin
 */
public class DataSearchDTO {

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return the story
     */
    public boolean isStory() {
        return story;
    }

    /**
     * @param story the story to set
     */
    public void setStory(boolean story) {
        this.story = story;
    }
    private String text;
    private boolean story;
    public DataSearchDTO()
    {
        
    }
    public DataSearchDTO(String text, boolean story)
    {
        this.text = text;
        this.story = story;
    }
    
    
}

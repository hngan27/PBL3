/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class textField extends JTextField{

    /**
     * @return the prefixIcon
     */
        Icon prefixIcon;
        Icon suffixIcon;
        public Icon getPrefixIcon() {
            return prefixIcon;
        }
        /**
         * @param prefixIcon the prefixIcon to set
         */
        public void setPrefixIcon(Icon prefixIcon) {
            this.prefixIcon = prefixIcon;
            initBorder();
        }
        /**
         * @return the SuffixIcon
         */
        public Icon getSuffixIcon() {
            return suffixIcon;
        }

        /**
         * @param suffixIcon the SuffixIcon to set
         */
        public void setSuffixIcon(Icon suffixIcon) {
            this.suffixIcon = suffixIcon;
            initBorder();

        }
    //setLayout(setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    
    public textField()
    {
    setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); 
        paintIcon(g);
        if (isFocusOwner())
        {
            g.setColor(new Color(43, 124, 220));
            g.drawRect(0, 0, getWidth() -1, getHeight() -1);
            //g.drawRect(, 1, getWidth() -3, getHeight() -3);
        }else
        {
            g.setColor(new Color(105, 122, 143));
            g.drawRect(0, 0, getWidth() -1 , getHeight()-1);
        }
    }
    private void paintIcon(Graphics g)
    {
        Graphics2D a = (Graphics2D)g;
        if (prefixIcon != null)
        {
            Image prefix = ((ImageIcon)prefixIcon).getImage();
            int y = (getHeight() - prefixIcon.getIconHeight())/2;
            a.drawImage(prefix, 0, y,  this);
        }
        if (suffixIcon != null)
        {
            Image suffix = ((ImageIcon)suffixIcon).getImage();
            int y = (getHeight() - suffixIcon.getIconHeight())/2;
            a.drawImage(suffix, getWidth() -suffixIcon.getIconWidth(), y,  this);
        }
    }
    private void initBorder()
    {
        int left = 5;
        int right = 5;
        if (prefixIcon != null)
        {
            left = prefixIcon.getIconWidth() + 3;
        }
        if (suffixIcon != null)
        {
            right = suffixIcon.getIconWidth() + 3;
        }
        setBorder(BorderFactory.createEmptyBorder(5,left,5,right));
    }
}


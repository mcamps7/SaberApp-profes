/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistes.panels;
import javax.swing.JPanel;
/**
 *
 * @author Montse
 */
public class CanviaPanel {
    //
    private JPanel container;
    private JPanel content;


    /**
     * Constructor de classe
     * @param container
     * @param content
     */
    public CanviaPanel(JPanel container, JPanel content) {
        this.container = container;
        this.content = content;
        
        this.container.removeAll();
        this.container.revalidate();
        this.container.repaint();
        
        this.container.add(this.content);
        this.container.revalidate();
        this.container.repaint();

        
        
        /*
        this.container.setVisible(false);
        this.content.setVisible(true);
        
        this.container.add(content);
        
        this.container.validate();
        */
    }


}
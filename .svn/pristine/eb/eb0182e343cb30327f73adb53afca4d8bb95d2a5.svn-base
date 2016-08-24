package POS.GUI;
import java.awt.*;
import javax.swing.*;

/**
 * A POS System for a
 * small restaurant.
 * 
 * Maeghan Colvin and Jennifer Haveman
 * CSC 289 0B01
 * February 13, 2014
 */

public class MainFrame extends JFrame
{
    // Variables
    private JPanel mainPanel;               // Holds the mainPanel
    private JPanel clockInOutPanel;         // Holds the Clock in pad
    
    /**
     * Constructor
     */
    public MainFrame() 
    {
        // Set title.
        this.setTitle("I Don't Know Eatery");
        
        // Close program option.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Add mainPanel
        this.buildMainPanel();
        this.add(mainPanel);
        
        // Set resizable false, pack, and view.
        this.setResizable(false);
        //this.pack();
        //this.setVisible(true);
    }
    
    /**
     * The buildMainPanel builds the 
     * mainPanel.
     */
    
    private void buildMainPanel() 
    {
        // Create mainPanel
        this.mainPanel = new JPanel(new BorderLayout());
        this.mainPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        
        // Add the Clock in/out screen.
        clockInOutPanel = new ClockInOutPanel();
        mainPanel.add(clockInOutPanel, BorderLayout.CENTER);
    }
}
package test_runs;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingMenuDemo {
	   private JFrame mainFrame;
	   private JLabel headerLabel;
	   private JLabel statusLabel;
	   private JPanel controlPanel; 
	   private JButton okButton;
	   private JButton cancelButton;
	   public JButton getJbutton(String s) {
		   if(s.equals("okButton")) {
			   return okButton;
		   }
		   else if(s.equals("cancelButton")) {
			   return cancelButton;
		   }
		   return null;
	   }
	   public JLabel getJlabel(String s) {
		   if(s.equals("headerLabel")) {
			   return headerLabel;
		   }
		   else if(s.equals("statusLabel")) {
			   return statusLabel;
		   }
		   return null;
	   }
	   public SwingMenuDemo(){
//	      prepareGUI();
	   }
	   public static void main(String[] args){
	      SwingMenuDemo  swingMenuDemo = new SwingMenuDemo();
	      swingMenuDemo.prepareGUI();
	      swingMenuDemo.showMenuDemo();
	   }
	   public void prepareGUI(){
	      mainFrame = new JFrame("Java SWING Examples");
	      mainFrame.setSize(600,600);
	      mainFrame.setLayout(new GridLayout(6, 6));

	      headerLabel = new JLabel("",JLabel.CENTER );
	      statusLabel = new JLabel("",JLabel.CENTER);        
	      statusLabel.setSize(350,100);
	      mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	      mainFrame.addWindowListener(new WindowAdapter() {
//	         public void windowClosing(WindowEvent windowEvent){
//	            System.exit(0);
//	         }        
//	      });
	      controlPanel = new JPanel();
	      controlPanel.setLayout(new FlowLayout());

	      mainFrame.add(headerLabel);
	      mainFrame.add(controlPanel);
	      mainFrame.add(statusLabel);
	      mainFrame.setVisible(true);
	   }
	   private void showMenuDemo(){
	      //create a menu bar
	      final JMenuBar menuBar = new JMenuBar();
	      //create menus
	      JMenu fileMenu = new JMenu("File",true);
//	      fileMenu.add("Hello");
	      JMenu editMenu = new JMenu("Edit");
	      JMenu  format = new JMenu("Format");
	      JMenu  help = new JMenu("Help");

	     
	      //create menu items
	      JMenuItem newMenuItem = new JMenuItem("New");
	      newMenuItem.setMnemonic(KeyEvent.VK_N);
	      newMenuItem.setActionCommand("New");

	      JMenuItem openMenuItem = new JMenuItem("Open");
	      openMenuItem.setActionCommand("Open");

	      JMenuItem saveMenuItem = new JMenuItem("Save");
	      saveMenuItem.setActionCommand("Save");

	      JMenuItem exitMenuItem = new JMenuItem("Exit");
	      exitMenuItem.setActionCommand("Exit");

	      JMenuItem cutMenuItem = new JMenuItem("Cut");
	      cutMenuItem.setActionCommand("Cut");

	      JMenuItem copyMenuItem = new JMenuItem("Copy");
	      copyMenuItem.setActionCommand("Copy");

	      JMenuItem pasteMenuItem = new JMenuItem("Paste");
	      pasteMenuItem.setActionCommand("Paste");
	      
	      JMenuItem wrapmenuitem = new JMenuItem("Word-Wrap");
	      wrapmenuitem.setActionCommand("Word-Wrap");
	      
	      JMenuItem windowmenuitem = new JMenuItem("Show Window");
	      windowmenuitem.setActionCommand("Show Window");
	      
	      JMenuItem helpmenuitem = new JMenuItem("Bhaad me jao");
	      helpmenuitem.setActionCommand("Bhaad me jao");

     	  okButton = new JButton("OK");
	      okButton.setActionCommand("OK");

	      cancelButton = new JButton("Cancel");
	      cancelButton.setActionCommand("Cancel");
	      
	      MenuItemListener menuItemListener = new MenuItemListener(this);
	      
	      newMenuItem.addActionListener(menuItemListener);
	      openMenuItem.addActionListener(menuItemListener);
	      saveMenuItem.addActionListener(menuItemListener);
	      exitMenuItem.addActionListener(menuItemListener);
	      cutMenuItem.addActionListener(menuItemListener);
	      copyMenuItem.addActionListener(menuItemListener);
	      pasteMenuItem.addActionListener(menuItemListener);
	      wrapmenuitem.addActionListener(menuItemListener);
	      windowmenuitem.addActionListener(menuItemListener);
	      helpmenuitem.addActionListener(menuItemListener);
	      okButton.addActionListener(menuItemListener);
	      cancelButton.addActionListener(menuItemListener);
	      
	      
	      controlPanel.add(okButton);
          controlPanel.add(cancelButton);
          okButton.setVisible(false);
          cancelButton.setVisible(false);
	       
	      //add menu items to menus
	      fileMenu.add(newMenuItem);
	      fileMenu.add(openMenuItem);
	      fileMenu.add(saveMenuItem);
	      fileMenu.addSeparator();
	      fileMenu.add(exitMenuItem);        
	      
	      editMenu.add(cutMenuItem);
	      editMenu.add(copyMenuItem);
	      editMenu.add(pasteMenuItem);

	      //add menu to menubar
	      menuBar.add(fileMenu);
	      menuBar.add(editMenu);
	      menuBar.add(format);
	      menuBar.add(help);
	      
	      //add menu to format
	      format.add(wrapmenuitem);
	      format.addSeparator();
	      format.add(windowmenuitem);
	      
	      //add menu to help
	      help.add(helpmenuitem);

	      //add menubar to the frame
	      mainFrame.setJMenuBar(menuBar);
	      mainFrame.setVisible(true);
	   }
	  
}
class MenuItemListener implements ActionListener  {
	SwingMenuDemo gui;
	public MenuItemListener(SwingMenuDemo s) {
		this.gui=s;
		this.statusLabel=gui.getJlabel("statusLabel");
		this.okButton=gui.getJbutton("okButton");
		this.cancelButton=gui.getJbutton("cancelButton");
	}
	JLabel statusLabel;
	JButton okButton;
	JButton cancelButton;
	public String lastClick=null;
	public void actionPerformed(ActionEvent e) {
		statusLabel.setText(e.getActionCommand() + " kyo dabaya ?");
    if(e.getActionCommand()== "Exit")
    {
//	    MenuItemListener menuItemListener = new MenuItemListener();
	    okButton.setVisible(true);
	    cancelButton.setVisible(true);
		//create Buttons

    }
    else if(lastClick=="Exit") {
	      okButton.setVisible(false);
	      cancelButton.setVisible(false);
    }
		 lastClick=e.getActionCommand(); 
    
    }    
}

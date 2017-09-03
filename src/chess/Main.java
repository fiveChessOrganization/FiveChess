package chess;


import com.jtattoo.plaf.mcwin.McWinLookAndFeel;
import util.AudioPlayer;

import javax.swing.*;

/*************************************************
 * 功能: 程序开始入口
 * 作者: 蒋宇森  
 * 时间: 2017-08-09
 *************************************************/
public class Main {
  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        setLookAndFeel();
        new Home();
        //new Thread(new AudioPlayer("resource/audio/background.wav")).start();
      }
    });
  }
  /*************************************************
   * 功能: 设置窗体风格
   * 作者: 蒋宇森   时间: 2017-08-09
   *************************************************/
  private static void setLookAndFeel() {
    try {
      UIManager.put("TabbedPane.contentOpaque", false);
      UIManager.setLookAndFeel(new McWinLookAndFeel());
      UIManager.put("CheckBox.font", new java.awt.Font("宋体", 0, 14));
      UIManager.put("Tree.font", new java.awt.Font("宋体", 0, 14));
      UIManager.put("Viewport.font", new java.awt.Font("宋体", 0, 14));
      UIManager.put("ProgressBar.font", new java.awt.Font("宋体", 0, 14));
      UIManager.put("RadioButtonMenuItem.font", new java.awt.Font("宋体", 0, 14));
      UIManager.put("FormattedTextField.font", new java.awt.Font("宋体", 0, 14));
      UIManager.put("ToolBar.font", new java.awt.Font("宋体", 0, 14));
      UIManager.put("ColorChooser.font", new java.awt.Font("宋体", 0, 14));
      UIManager.put("ToggleButton.font", new java.awt.Font("宋体", 0, 14));
      UIManager.put("Panel.font", new java.awt.Font("宋体", 0, 14));
      UIManager.put("TextArea.font", new java.awt.Font("宋体", 0, 14));
      UIManager.put("Menu.font", new java.awt.Font("宋体", 0, 14));
      UIManager.put("RadioButtonMenuItem.acceleratorFont", new java.awt.Font("宋体", 0, 14));
      UIManager.put("Spinner.font", new java.awt.Font("宋体", 0, 14));
      UIManager.put("Menu.acceleratorFont", new java.awt.Font("宋体", 0, 14));
      UIManager.put("CheckBoxMenuItem.acceleratorFont", new java.awt.Font("宋体", 0, 14));
      UIManager.put("TableHeader.font", new java.awt.Font("宋体", 0, 14));
      UIManager.put("TextField.font", new java.awt.Font("宋体", 0, 14));
      UIManager.put("OptionPane.font", new java.awt.Font("宋体", 0, 14));
      UIManager.put("MenuBar.font", new java.awt.Font("宋体", 0, 14));
      UIManager.put("Button.font", new java.awt.Font("宋体", 0, 14));
      UIManager.put("Label.font", new java.awt.Font("宋体", 0, 14));
      UIManager.put("PasswordField.font", new java.awt.Font("宋体", 0, 14));
      UIManager.put("InternalFrame.titleFont", new java.awt.Font("宋体", 0, 14));
      UIManager.put("OptionPane.buttonFont", new java.awt.Font("宋体", 0, 14));
      UIManager.put("ScrollPane.font", new java.awt.Font("宋体", 0, 14));
      UIManager.put("MenuItem.font", new java.awt.Font("宋体", 0, 14));
      UIManager.put("ToolTip.font", new java.awt.Font("宋体", 0, 14));
      UIManager.put("List.font", new java.awt.Font("宋体", 0, 14));
      UIManager.put("OptionPane.messageFont", new java.awt.Font("宋体", 0, 14));
      UIManager.put("EditorPane.font", new java.awt.Font("宋体", 0, 14));
      UIManager.put("Table.font", new java.awt.Font("宋体", 0, 14));
      UIManager.put("TabbedPane.font", new java.awt.Font("宋体", 0, 14));
      UIManager.put("RadioButton.font", new java.awt.Font("宋体", 0, 14));
      UIManager.put("CheckBoxMenuItem.font", new java.awt.Font("宋体", 0, 14));
      UIManager.put("TextPane.font", new java.awt.Font("宋体", 0, 14));
      UIManager.put("PopupMenu.font", new java.awt.Font("宋体", 0, 14));
      UIManager.put("TitledBorder.font", new java.awt.Font("宋体", 0, 14));
      UIManager.put("ComboBox.font", new java.awt.Font("宋体", 0, 14));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

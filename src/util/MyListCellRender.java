package util;

import javax.swing.*;
import java.awt.*;
import entity.User;

/**
 * Created by 徐健锋 on 2017/8/13.
 */
public class MyListCellRender extends JLabel implements ListCellRenderer {
  @Override
  public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
    setIcon(new ImageIcon(((User)value).getFileName()));
    setText(((User)value).getName());
    return this;
  }
}

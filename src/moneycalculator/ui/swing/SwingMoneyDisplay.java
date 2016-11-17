/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moneycalculator.ui.swing;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.PopupMenu;
import javax.swing.JLabel;
import javax.swing.JPanel;
import moneycalculator.model.Money;
import moneycalculator.ui.MoneyDisplay;

/**
 *
 * @author LENOVO G500
 */
public class SwingMoneyDisplay extends JPanel implements MoneyDisplay{
    
  private Money money;

    private Component currency() {
        return new JLabel("300");
    }

    private Component amount() {
        return new JLabel("$");
    }

    @Override
    public void display(Money money) {
       this.money = money;
        setLayout(new FlowLayout());
        add(amount());
        add(currency());
    }
    
}

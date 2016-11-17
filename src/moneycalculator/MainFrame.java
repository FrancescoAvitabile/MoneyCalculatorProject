/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moneycalculator;

import java.awt.Component;
import java.awt.HeadlessException;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import moneycalculator.ui.MoneyDisplay;
import moneycalculator.ui.swing.SwingMoneyDisplay;

/**
 *
 * @author LENOVO G500
 */
public class MainFrame extends JFrame{
    
    private MoneyDisplay moneyDisplay;
    
    public MainFrame() throws HeadlessException{
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Money Calculator");
        setSize(400,400);
        setLocationRelativeTo(null);
        setMenuBar(menuBar());
        add(moneyDisplay());
        setVisible(true);
        
        
    }

    private MenuBar menuBar() {
        MenuBar menuBar = new MenuBar();
        menuBar.add(calculateMenu());
        return menuBar;
    }

    private Menu calculateMenu() {
        Menu menu = new Menu("Calculate");
        menu.add(newExchange());
        return menu;
    }

    private MenuItem newExchange() {
        MenuItem menuItem = new MenuItem("Hey..");
        menuItem.addActionListener(exchangeOperation());
        return menuItem;
    }

    private ActionListener exchangeOperation() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("New Exchange");
            }
        };
           
    }
    
        Component moneyDisplay(){
            SwingMoneyDisplay component = new SwingMoneyDisplay();
            this.moneyDisplay = component;
            return component;
            
        }

    public MoneyDisplay getMoneyDisplay() {
        return moneyDisplay;
    }
        
        
        
        

    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


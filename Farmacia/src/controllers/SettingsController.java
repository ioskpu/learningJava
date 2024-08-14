
package controllers;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import views.SystemView;



public class SettingsController implements MouseListener {
    
    private SystemView views;
    
    public SettingsController(SystemView views){
        this.views = views;
        this.views.jLabelProduct.addMouseListener(this);
        this.views.jLabelCategories.addMouseListener(this);
        this.views.jLabelEmployees.addMouseListener(this);
        this.views.jLabelReports.addMouseListener(this);
        this.views.jLabelPurchases.addMouseListener(this);
        this.views.jLabelSettings.addMouseListener(this);
        this.views.jLabelSuppliers.addMouseListener(this);
        this.views.jLabelCustomers.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource() == views.jLabelProduct){
            views.jPanelProduct.setBackground(new Color(152, 202, 63));
        }else if(e.getSource() == views.jLabelPurchases){
            views.jPanelPurchases.setBackground(new Color(152, 202, 63));
        }else if(e.getSource() == views.jLabelCustomers){
            views.jPanelCustomers.setBackground(new Color(152, 202, 63));
        }else if(e.getSource() == views.jLabelEmployees){
            views.jPanelEmployees.setBackground(new Color(152,202, 63));
        }else if(e.getSource() == views.jLabelSuppliers){
            views.jPanelSuppliers.setBackground(new Color(152, 202, 63));
        }else if(e.getSource() == views.jLabelCategories){
            views.jPanelCategories.setBackground(new Color(152, 202, 63));
        }else if(e.getSource() == views.jLabelReports){
            views.jPanelReports.setBackground(new Color(152, 202, 63));
        }else if (e.getSource() == views.jLabelSettings){
            views.jPanelSettings.setBackground(new Color(152, 202, 63));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource() == views.jLabelProduct){
            views.jPanelProduct.setBackground(new Color(0,51,51));
        }else if(e.getSource() == views.jLabelPurchases){
            views.jPanelPurchases.setBackground(new Color(0,51,51));
        }else if(e.getSource() == views.jLabelCustomers){
            views.jPanelCustomers.setBackground(new Color(0,51,51));
        }else if(e.getSource() == views.jLabelEmployees){
            views.jPanelEmployees.setBackground(new Color(0,51,51));
        }else if(e.getSource() == views.jLabelSuppliers){
            views.jPanelSuppliers.setBackground(new Color(0,51,51));
        }else if(e.getSource() == views.jLabelCategories){
            views.jPanelCategories.setBackground(new Color(0,51,51));
        }else if(e.getSource() == views.jLabelReports){
            views.jPanelReports.setBackground(new Color(0,51,51));
        }else if (e.getSource() == views.jLabelSettings){
            views.jPanelSettings.setBackground(new Color(0,51,51));
        }
    }
    
}

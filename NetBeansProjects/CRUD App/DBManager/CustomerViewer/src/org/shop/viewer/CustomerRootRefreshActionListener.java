/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.shop.viewer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(id="org.shop.viewer.CustomerRootRefreshActionListener", category="Customer")
@ActionRegistration(displayName="#CTL_CustomerRootRefreshActionListener")
@Messages("CTL_CustomerRootRefreshActionListener=Refresh")
public class CustomerRootRefreshActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        CustomerViewerTopComponent.refreshNode();
    }
    
}
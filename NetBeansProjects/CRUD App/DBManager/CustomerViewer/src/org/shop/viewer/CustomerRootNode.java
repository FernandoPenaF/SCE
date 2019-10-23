/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.shop.viewer;

import java.util.List;
import javax.swing.Action;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;
import org.openide.util.NbBundle.Messages;
import org.openide.util.Utilities;
import static org.shop.viewer.Bundle.*;

public class CustomerRootNode extends AbstractNode {

    @Messages("CTRL_RootName=Root")
    public CustomerRootNode(Children kids) {
        super(kids);
        setDisplayName(CTRL_RootName());
    }

    @Override
    public Action[] getActions(boolean context) {
        List<? extends Action> actionsForCustomer = Utilities.actionsForPath("Actions/Customer");
        return actionsForCustomer.toArray(new Action[actionsForCustomer.size()]);
    }

}
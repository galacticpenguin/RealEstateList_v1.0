package realestatelist;

import java.awt.Color;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/*
* Ian Medina
* icm27@drexel.edu
* CS338:GUI, Assignment #1
*
*/

public class RealEstateList extends javax.swing.JFrame {

    /**
     * Creates new form RealEstateList
     */
    
    public RealEstateList() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        realEstateTable = new javax.swing.JTable();
        tAddress = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tBeds = new javax.swing.JTextField();
        jUpdate = new javax.swing.JButton();
        jDelete = new javax.swing.JButton();
        jlAlert = new javax.swing.JLabel();
        tCity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tBaths = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tSFeet = new javax.swing.JTextPane();
        tYear = new javax.swing.JTextField();
        tPrice = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        reList = new javax.swing.JList<>();
        jLabel8 = new javax.swing.JLabel();
        moveToTable = new javax.swing.JButton();
        moveToList = new javax.swing.JButton();
        addToList = new javax.swing.JButton();
        clearList = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.activeTitleBackground"));

        realEstateTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Street Address", "City", "Number of Bedrooms", "Number of Bathrooms", "Square Feet", "Year Built", "Price/Square Feet"
            }
        ));
        realEstateTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                realEstateTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(realEstateTable);

        tAddress.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Street Address:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("City:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Number of Bedrooms:");

        jUpdate.setText("Update");
        jUpdate.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUpdateActionPerformed(evt);
            }
        });

        jDelete.setText("Delete");
        jDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteActionPerformed(evt);
            }
        });

        jlAlert.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        tCity.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Number of Bathrooms:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Square Feet:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Year Built:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Price/Square Feet:");

        jScrollPane2.setViewportView(tSFeet);

        jScrollPane3.setViewportView(reList);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setText("                RealEstateList");
        jLabel8.setToolTipText("");

        moveToTable.setText(">>");
        moveToTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveToTableActionPerformed(evt);
            }
        });

        moveToList.setText("<<");
        moveToList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveToListActionPerformed(evt);
            }
        });

        addToList.setText("Add");
        addToList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToListActionPerformed(evt);
            }
        });

        clearList.setText("Clear List");
        clearList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearListActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Copyright © 2016 Ian Medina");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                .addComponent(clearList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(46, 46, 46)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(moveToTable)
                                .addComponent(moveToList))
                            .addGap(43, 43, 43)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlAlert, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 841, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(addToList, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(42, 42, 42)
                                    .addComponent(jUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(42, 42, 42)
                                    .addComponent(jDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 472, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(tCity, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tAddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                                    .addGap(41, 41, 41)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel4)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(tBaths, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel3)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(tBeds, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(45, 45, 45)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel6)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(tYear, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel5)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(tPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addComponent(jLabel9))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tCity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tBeds, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tBaths, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)
                                .addComponent(tPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tYear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addToList, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jlAlert, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(moveToTable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(moveToList)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clearList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    DefaultListModel list =  new DefaultListModel();
    House house = new House();      
    
    
    //Update selected row when update button is clicked
    private void jUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUpdateActionPerformed
        DefaultTableModel model = (DefaultTableModel) realEstateTable.getModel();
        
        jlAlert.setText("");
        
        if(realEstateTable.getSelectedRow() == -1) {
            if(realEstateTable.getRowCount() == 0) {
                jlAlert.setText("Error: Table is empty");
                jlAlert.setForeground(Color.red);
            }
            else
                jlAlert.setText("Error: Please select an entry");
                jlAlert.setForeground(Color.red);
        } else {
            model.setValueAt(tAddress.getText(), realEstateTable.getSelectedRow(), 0);
            model.setValueAt(tCity.getText(), realEstateTable.getSelectedRow(), 1);
            model.setValueAt(tBeds.getText(), realEstateTable.getSelectedRow(), 2);
            model.setValueAt(tBaths.getText(), realEstateTable.getSelectedRow(), 3);
            model.setValueAt(tSFeet.getText(), realEstateTable.getSelectedRow(), 4);
            model.setValueAt(tYear.getText(), realEstateTable.getSelectedRow(), 5);
            model.setValueAt(tPrice.getText(), realEstateTable.getSelectedRow(), 6);
            
            jlAlert.setText("Succesfully updated new entry!");
            jlAlert.setForeground(Color.blue);
        }
        
    }//GEN-LAST:event_jUpdateActionPerformed

    //set text field to values selected in the table row
    private void realEstateTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_realEstateTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) realEstateTable.getModel();
        
        jlAlert.setText("");
        tAddress.setText(model.getValueAt(realEstateTable.getSelectedRow(),0).toString());
        tCity.setText(model.getValueAt(realEstateTable.getSelectedRow(),1).toString());
        tBeds.setText(model.getValueAt(realEstateTable.getSelectedRow(),2).toString());
        tBaths.setText(model.getValueAt(realEstateTable.getSelectedRow(),3).toString());
        tSFeet.setText(model.getValueAt(realEstateTable.getSelectedRow(),4).toString());
        tYear.setText(model.getValueAt(realEstateTable.getSelectedRow(),5).toString());
        tPrice.setText(model.getValueAt(realEstateTable.getSelectedRow(),6).toString());
        
        
    }//GEN-LAST:event_realEstateTableMouseClicked

    //delete selected row
    
    private void jDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteActionPerformed
        DefaultTableModel model = (DefaultTableModel) realEstateTable.getModel();
        
        jlAlert.setText("");
        if(realEstateTable.getSelectedRow() == -1) {
            if(realEstateTable.getRowCount() == 0) {
                jlAlert.setText("Error: Table is empty");
                jlAlert.setForeground(Color.red);
            }
            else
                jlAlert.setText("Error: Please select an entry");
                jlAlert.setForeground(Color.red);
        } else {
            model.removeRow(realEstateTable.getSelectedRow());
            jlAlert.setText("Entry successfully deleted!");
            jlAlert.setForeground(Color.blue);
        }
    }//GEN-LAST:event_jDeleteActionPerformed

    //add value to list
    private void add(String name) {
        reList.setModel(list);
        list.addElement(name);
    }
    
    //set text field values to respective class variables
    private void setHouse() {
        house.setAddress(tAddress.getText()); 
        house.setCity(tCity.getText());
        house.setNumBeds(tBeds.getText());
        house.setNumBaths(tBaths.getText());
        house.setSqFeet(tSFeet.getText());
        house.setYear(tYear.getText());
        house.setPrice(tPrice.getText());
    }
    
    //add to list once add button is clicked
    private void addToListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToListActionPerformed
        
        setHouse();
        
        String houseInfo = house.getAddress() + ", " +
                           house.getCity() + ", " +
                           house.getNumBeds() + ", " +
                           house.getNumBaths() + ", " +
                           house.getSqFeet() + ", " +
                           house.getYear() + ", " +
                           house.getPrice();
        
        if(house.getAddress().equals("")   
                || house.getCity().equals("") 
                || house.getNumBeds().equals("") 
                || house.getNumBaths().equals("")
                || house.getSqFeet().equals("")
                || house.getYear().equals("")
                || house.getPrice().equals("")) {
            
            jlAlert.setText("Please make sure all fields are filled!");
            jlAlert.setForeground(Color.red);
            
        } else {    
            add(houseInfo);
        
            jlAlert.setText("Successfully added to list!");
            jlAlert.setForeground(Color.blue);
            
            tAddress.setText("");    
            tCity.setText("");
            tBeds.setText("");
            tBaths.setText("");
            tSFeet.setText("");
            tYear.setText("");
            tPrice.setText("");
        }
            
    }//GEN-LAST:event_addToListActionPerformed

    //clear list -- deletes all entries in the jList
    private void clearListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearListActionPerformed
        list.clear();
        reList.setModel(list);
    }//GEN-LAST:event_clearListActionPerformed

    //move selected list value into the table
    //once moved selected list value will be removed
    private void moveToTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveToTableActionPerformed

        String selected = reList.getSelectedValue();
        String[] splitter = selected.split(", ");
        int index = reList.getSelectedIndex();       
        
        DefaultTableModel model = (DefaultTableModel) realEstateTable.getModel();
        
        if(!selected.isEmpty()) {
            model.addRow(new Object[]{splitter[0],splitter[1],splitter[2],splitter[3],splitter[4],splitter[5], splitter[6]});
            list.removeElementAt(index);
            jlAlert.setText("Succesfully added new entry!");
            jlAlert.setForeground(Color.blue);
        } else {
            jlAlert.setText("Error: Please make sure List is not empty!");
            jlAlert.setForeground(Color.red);
        }
    }//GEN-LAST:event_moveToTableActionPerformed

    //move selected row to list
    //once moved the selected row will be removed
    private void moveToListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveToListActionPerformed
        DefaultTableModel model = (DefaultTableModel) realEstateTable.getModel();
        
        jlAlert.setText("");
        
        if(realEstateTable.getSelectedRow() == -1) {
            if(realEstateTable.getRowCount() == 0) {
                jlAlert.setText("Error: Table is empty");
                jlAlert.setForeground(Color.red);
            }
            else
                jlAlert.setText("Error: Please select an entry");
                jlAlert.setForeground(Color.red);
        } else {
            
            String houseInfo = model.getValueAt(realEstateTable.getSelectedRow(),0).toString() + ", " +
                               model.getValueAt(realEstateTable.getSelectedRow(),1).toString() + ", " +
                               model.getValueAt(realEstateTable.getSelectedRow(),2).toString() + ", " +
                               model.getValueAt(realEstateTable.getSelectedRow(),3).toString() + ", " +
                               model.getValueAt(realEstateTable.getSelectedRow(),4).toString() + ", " +
                               model.getValueAt(realEstateTable.getSelectedRow(),5).toString() + ", " +
                               model.getValueAt(realEstateTable.getSelectedRow(),6).toString();
            
            add(houseInfo);
            
            model.removeRow(realEstateTable.getSelectedRow());
            jlAlert.setText("Entry moved to list!");
            jlAlert.setForeground(Color.blue);
        }
    }//GEN-LAST:event_moveToListActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(RealEstateList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(RealEstateList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(RealEstateList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(RealEstateList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new RealEstateList().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToList;
    private javax.swing.JButton clearList;
    private javax.swing.JButton jDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jUpdate;
    private javax.swing.JLabel jlAlert;
    private javax.swing.JButton moveToList;
    private javax.swing.JButton moveToTable;
    private javax.swing.JList<String> reList;
    private javax.swing.JTable realEstateTable;
    private javax.swing.JTextField tAddress;
    private javax.swing.JTextField tBaths;
    private javax.swing.JTextField tBeds;
    private javax.swing.JTextField tCity;
    private javax.swing.JTextField tPrice;
    private javax.swing.JTextPane tSFeet;
    private javax.swing.JTextField tYear;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.supplier;

import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import model.Supplier;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.net.MalformedURLException;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.JFileChooser;
import java.io.File;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author ABHISHEK PRAKASH
 */
public class UpdateSupplierProfile extends javax.swing.JPanel {

    /**
     * Creates new form UpdateSupplierProfile
     */
    JPanel mainWorkArea;
    Supplier supplier;
    private final JFileChooser fileChooser = new JFileChooser();
    ImageIcon logoImage;
    
    public UpdateSupplierProfile(JPanel mainWorkArea, Supplier supplier) {
        initComponents();
        this.mainWorkArea = mainWorkArea;
        this.supplier = supplier;
        
        txtName.setText(supplier.getSupplyName());
        jTextArea1.setText(supplier.getDescription());
        imgLogo.setIcon(supplier.getLogoImage());
        
        FileFilter jpegFilter = new FileNameExtensionFilter("JPEG file","jpg","jpeg");
        FileFilter pngFilter = new FileNameExtensionFilter("PNG file","png","png");
        
        fileChooser.addChoosableFileFilter(jpegFilter);
        fileChooser.addChoosableFileFilter(pngFilter);
        fileChooser.setFileFilter(pngFilter);
        toggleFieldsAccess(false);
        btnUpdate.setEnabled(true);
        btnSave.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnAttach = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        btnRemove = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        lblDescription = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        lblLogo = new javax.swing.JLabel();
        imgLogo = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update Supplier Profile");

        btnAttach.setBackground(new java.awt.Color(102, 255, 0));
        btnAttach.setText("Attach");
        btnAttach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttachActionPerformed(evt);
            }
        });

        lblName.setText("Name:");

        btnRemove.setBackground(new java.awt.Color(255, 0, 0));
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        lblDescription.setText("Description:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        lblLogo.setText("Logo:");

        imgLogo.setText("<No Image>");
        imgLogo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        imgLogo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnSave.setBackground(new java.awt.Color(102, 255, 0));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(102, 255, 0));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDescription)
                    .addComponent(lblName)
                    .addComponent(lblLogo))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAttach, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRemove)))
                    .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSave)
                        .addGap(26, 26, 26)))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescription)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblLogo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAttach)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRemove))
                            .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdate)
                    .addComponent(btnSave))
                .addContainerGap(44, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void toggleFieldsAccess(boolean value){
        txtName.setEnabled(value);
        jTextArea1.setEnabled(value);
        btnAttach.setVisible(value);
        btnRemove.setVisible(value);
    }
    private void btnAttachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttachActionPerformed
        // TODO add your handling code here:
        int returnVal = fileChooser.showOpenDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION){
            File file = fileChooser.getSelectedFile();
            URL url;
            try{
                url = file.toURI().toURL();
                logoImage = new ImageIcon(url);
                logoImage = new ImageIcon(logoImage.getImage().getScaledInstance(150,150, Image.SCALE_SMOOTH));
                imgLogo.setIcon(logoImage);
            }catch(MalformedURLException ex){
                Logger.getLogger(this.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btnAttachActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        logoImage = null;
        imgLogo.setIcon(logoImage);
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        supplier.setSupplyName(txtName.getText());
        supplier.setDescription(jTextArea1.getText());
        supplier.setLogoImage(logoImage);
        JOptionPane.showMessageDialog(this, "Supplier Profile Updated.");
        toggleFieldsAccess(false);
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        toggleFieldsAccess(true);
        btnUpdate.setEnabled(false);
        btnSave.setEnabled(true);
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAttach;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblName;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}

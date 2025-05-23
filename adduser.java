/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
import dao.connectionprovider;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.Date;

public class adduser extends javax.swing.JFrame {
    
    public String emailpattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
    public String MobileNumberPattern = "^[0-9]*$";
    public int checkUsername = 0;
    private int checkusername;

    /**
     * Creates new form adduser
     */
    public adduser() {
        initComponents();
        iconlabel.setVisible(false);
        setLocationRelativeTo(null);
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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        combouserrole = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        datedob = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        txtmobile = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtpassward = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtadd = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        iconlabel = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(81, 210, 124));
        setFocusCycleRoot(false);
        setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(830, 525));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("ADD USER ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 40, 261, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 110, 740, 10));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("USER ROLE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 138, 263, -1));

        combouserrole.setBackground(new java.awt.Color(204, 204, 204));
        combouserrole.setForeground(new java.awt.Color(0, 102, 102));
        combouserrole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "pharmacist" }));
        combouserrole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combouserroleActionPerformed(evt);
            }
        });
        getContentPane().add(combouserrole, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 170, 263, -1));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("NAME");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 231, 263, -1));

        txtname.setBackground(new java.awt.Color(204, 204, 204));
        txtname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtname.setForeground(new java.awt.Color(0, 102, 102));
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 263, 263, -1));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("DOB(Date of Birth)");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 327, 168, -1));

        datedob.setBackground(new java.awt.Color(204, 204, 204));
        datedob.setForeground(new java.awt.Color(0, 102, 102));
        getContentPane().add(datedob, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 359, 263, -1));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 948, 37, -1));

        txtmobile.setBackground(new java.awt.Color(204, 204, 204));
        txtmobile.setForeground(new java.awt.Color(0, 102, 102));
        getContentPane().add(txtmobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 447, 263, -1));

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("MOBILE NUMBER");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 421, 132, -1));

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("EMAIL");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 132, 72, -1));

        txtemail.setBackground(new java.awt.Color(204, 204, 204));
        txtemail.setForeground(new java.awt.Color(0, 102, 102));
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 164, 322, -1));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 231, 62, -1));

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("USERNAME");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 225, 81, -1));

        txtusername.setBackground(new java.awt.Color(204, 204, 204));
        txtusername.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtusername.setForeground(new java.awt.Color(0, 102, 102));
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        txtusername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtusernameKeyReleased(evt);
            }
        });
        getContentPane().add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 257, 322, -1));

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("PASSWARD");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 321, 98, -1));

        txtpassward.setBackground(new java.awt.Color(204, 204, 204));
        txtpassward.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtpassward.setForeground(new java.awt.Color(0, 102, 102));
        getContentPane().add(txtpassward, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 353, 322, -1));

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("ADDRESS");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 415, 77, -1));

        txtadd.setBackground(new java.awt.Color(204, 204, 204));
        txtadd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtadd.setForeground(new java.awt.Color(0, 102, 102));
        getContentPane().add(txtadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 441, 322, -1));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, -1, -1));
        getContentPane().add(iconlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 43, 10));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/all_pages_background.png"))); // NOI18N
        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtusernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusernameKeyReleased
        String username = txtusername.getText();
        if(!username.equals("")){
            iconlabel.setVisible(true);
            iconlabel.setIcon(new ImageIcon("src\\images\\yes.png"));
            iconlabel.setText("");
            checkusername = 0;
            
            try{
                Connection con = connectionprovider.getcon();
                Statement st = con.createStatement();
                 ResultSet rs = st.executeQuery("SELECT * FROM appuser WHERE username='" + username + "' ");
                while(rs.next()){
                    checkusername = 1;
                    iconlabel.setIcon(new ImageIcon("src\\images\\no.png"));
                    iconlabel.setText("");
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            
            }
            
        }else{
                    iconlabel.setVisible(false);
                    }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameKeyReleased

    
    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        System.out.println("method implemented");
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String userrole = (String) combouserrole.getSelectedItem();
        String name = txtname.getText();
        SimpleDateFormat dformat = new SimpleDateFormat("DD-MM-YYYY");
        Date date = datedob.getDate();
        String dob = "";
        if(date != null){
            dob = dformat.format(datedob.getDate());
        }
        String mobilenumber = txtmobile.getText();
        String email = txtemail.getText();
        String username = txtusername.getText();
        String passward = txtpassward.getText();
        String address = txtadd.getText();
        
        if(name.equals("")){
            JOptionPane.showMessageDialog(null,"name field is requied");
        }else if(dob.equals("")){
            JOptionPane.showMessageDialog(null,"dob field is requied");
        }else if(mobilenumber.equals("")){
            JOptionPane.showMessageDialog(null,"mobile number field is requied");
        }else if(mobilenumber.matches("mobilenumberPattern")||mobilenumber.length() != 10){
            JOptionPane.showMessageDialog(null,"mobile number field is invalid");
        }else if(email.equals("")){
            JOptionPane.showMessageDialog(null,"email field is requied");
        }else if(email.matches("emailPattern")){
            JOptionPane.showMessageDialog(null,"email field is invalid");
        }else if(username.equals("")){
            JOptionPane.showMessageDialog(null,"username field is requied");
        }else if(checkusername == 1){
            JOptionPane.showMessageDialog(null,"username already exist");
        }else if(passward.equals("")){
            JOptionPane.showMessageDialog(null,"password field is requied");
        }else if(address.equals("")){
            JOptionPane.showMessageDialog(null,"address field is requied");
        }else{
            try{
                Connection con = connectionprovider.getcon();
               PreparedStatement ps = con.prepareStatement("INSERT INTO appuser (userrole, name, dob, mobilenumber, email, username, passward, address) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");

            //PreparedStatement ps = con.prepareStatement("insert into appuser(userrole,name,mobilenumber,email,address,dob,password,username) values(?,?,?,?,?,?,?,?,)");
                ps.setString(1, userrole);
                ps.setString(2, name);
                ps.setString(3, dob);
                ps.setString(4, mobilenumber);
                ps.setString(5, email);
                ps.setString(6, username);
                ps.setString(7, passward);
                ps.setString(8, address);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"user added successfully");
                setVisible(false);
                new adduser().setVisible(true);
                      
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void combouserroleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combouserroleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combouserroleActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(adduser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adduser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adduser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adduser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adduser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combouserrole;
    private com.toedter.calendar.JDateChooser datedob;
    private javax.swing.JLabel iconlabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtadd;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtmobile;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpassward;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}

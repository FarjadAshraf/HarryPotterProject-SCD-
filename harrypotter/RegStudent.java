package harrypotter;

import java.util.ArrayList;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Syed Farjad Ali
 */
public class RegStudent extends javax.swing.JFrame {
    ArrayList<Students> Reg_Stud;
    String header[] = new String[]{"First Name", "Last Name","Gender","Type"};
    DefaultTableModel dtm;
    int row,col;
    /**
     * Creates new form AddStudent
     */
    public RegStudent() {
        initComponents();
        Reg_Stud = new ArrayList<>();
        dtm = new DefaultTableModel(header,0);
        jTable1.setModel(dtm);
        this.setLocationRelativeTo(null);
        loadData();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        gen = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        lname = new javax.swing.JTextField();
        ptype = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(null);

        jButton4.setBackground(new java.awt.Color(102, 204, 255));
        jButton4.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/search x30.png"))); // NOI18N
        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(750, 540, 140, 40);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/back.png"))); // NOI18N
        jLabel10.setText("jLabel3");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel10);
        jLabel10.setBounds(10, 0, 30, 40);

        jButton3.setBackground(new java.awt.Color(51, 102, 255));
        jButton3.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/update.png"))); // NOI18N
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(600, 500, 140, 40);

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/delete.png"))); // NOI18N
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(460, 460, 140, 40);

        jTable1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setOpaque(false);
        jTable1.setRowHeight(22);
        jTable1.setRowMargin(3);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(912, 262, 370, 310);

        gen.setBackground(new java.awt.Color(255, 102, 0));
        gen.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        gen.setForeground(new java.awt.Color(102, 0, 0));
        gen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Wizard", "Witch" }));
        gen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genActionPerformed(evt);
            }
        });
        jPanel2.add(gen);
        gen.setBounds(460, 290, 170, 30);

        jButton1.setBackground(new java.awt.Color(51, 102, 0));
        jButton1.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/save.png"))); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(330, 420, 130, 40);

        lname.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        lname.setForeground(new java.awt.Color(102, 0, 0));
        lname.setSelectionColor(new java.awt.Color(153, 0, 0));
        jPanel2.add(lname);
        lname.setBounds(460, 230, 170, 30);

        ptype.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        ptype.setForeground(new java.awt.Color(102, 0, 0));
        ptype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pure Blood", "Half Blood", "Muggle" }));
        ptype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ptypeActionPerformed(evt);
            }
        });
        jPanel2.add(ptype);
        ptype.setBounds(460, 350, 170, 30);

        jLabel8.setFont(new java.awt.Font("Bookman Old Style", 3, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 0));
        jLabel8.setText("Parents Type : ");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(220, 350, 200, 40);

        jLabel6.setFont(new java.awt.Font("Bookman Old Style", 3, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 0));
        jLabel6.setText("Gender :");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(220, 280, 170, 50);

        jLabel7.setFont(new java.awt.Font("Bookman Old Style", 3, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 0));
        jLabel7.setText("Last Name :");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(220, 220, 200, 50);

        fname.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        fname.setForeground(new java.awt.Color(102, 0, 0));
        fname.setSelectionColor(new java.awt.Color(153, 0, 0));
        jPanel2.add(fname);
        fname.setBounds(460, 170, 170, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/cross 2.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel9);
        jLabel9.setBounds(1260, 10, 30, 40);

        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 3, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 0));
        jLabel5.setText("First Name :");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(220, 160, 200, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/head1.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(-30, -30, 710, 300);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/logo3.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(1040, 0, 200, 280);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/bl1.png"))); // NOI18N
        jLabel3.setToolTipText("");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(-160, 330, 600, 290);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/back1.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 1300, 610);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1300, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void genActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genActionPerformed
    }//GEN-LAST:event_genActionPerformed

    private void ptypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ptypeActionPerformed
    }//GEN-LAST:event_ptypeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if(fname.getText().isEmpty()||lname.getText().isEmpty()||
        gen.getSelectedItem().toString().isEmpty()||ptype.getSelectedItem().toString().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Cant leave any box Empty");
        }
        else{
            String first = fname.getText();
            String last = lname.getText();
            String gender = gen.getSelectedItem().toString();
            String type = ptype.getSelectedItem().toString();
  
            Reg_Stud.add(new Students(first,last,gender,type));

            
//            JOptionPane.showMessageDialog(null, "Student Enrolled ");
            writeData();
             //reset

            clearField();          
        }
              
        
   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        if(fname.getText().isEmpty()||lname.getText().isEmpty()||
                gen.getSelectedItem().toString().isEmpty()||ptype.getSelectedItem().toString().isEmpty()){
            
            JOptionPane.showMessageDialog(rootPane, "Search Student You want to Delete");
            
                } else {
        
        
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Delete Patient data", "Delete", dialogButton);
        if(dialogResult == 0) {
            Reg_Stud.remove(row);
            clearField();
            writeData();
        }}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String updateFname = fname.getText();
        String updatedLname = lname.getText();
        String updatedGender = gen.getSelectedItem().toString();
        String updatedType = ptype.getSelectedItem().toString();
        
        
        Reg_Stud.get(row).first = updateFname;
        Reg_Stud.get(row).last = updatedLname;
        Reg_Stud.get(row).gender = updatedGender;
        Reg_Stud.get(row).type = updatedType;

        writeData();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String input = JOptionPane.showInputDialog(this,"Search Student :");
        for (int i = 0; i < Reg_Stud.size(); i++) {
            if (Reg_Stud.get(i).first.equalsIgnoreCase(input)){
                JOptionPane.showMessageDialog(jButton4, "Found!!!","Search Patient",2);
                fname.setText(Reg_Stud.get(i).first);
                lname.setText(Reg_Stud.get(i).last);

                String Gender = Reg_Stud.get(i).gender;
                for (int j = 0; j<(gen.getItemCount());j++){
                    if (gen.getItemAt(i).equalsIgnoreCase(Gender)){
                        gen.setSelectedIndex(i);
                    }
                }
                String Type = Reg_Stud.get(i).gender;
                for (int j = 0; j<(ptype.getItemCount());j++){
                    if (ptype.getItemAt(i).equalsIgnoreCase(Type)){
                        ptype.setSelectedIndex(i);
                    }
                }
                return;
            }
        }
        JOptionPane.showMessageDialog(jButton4, "Not Found!!!","Search Student",2);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
                // TODO add your handling code here:
        row = jTable1.getSelectedRow();
        col = jTable1.getColumnCount();
        System.out.println(row+","+col);
        fname.setText(dtm.getValueAt(row, 0).toString());
        lname.setText(dtm.getValueAt(row, 1).toString());
        String gender = dtm.getValueAt(row, 2).toString();
        for (int i = 0; i<(gen.getItemCount());i++){
            if (gen.getItemAt(i).equalsIgnoreCase(gender)){
                gen.setSelectedIndex(i);
            }
        }
        
        String Type = dtm.getValueAt(row, 3).toString();
        for (int i = 0; i<(ptype.getItemCount());i++){
            if (ptype.getItemAt(i).equalsIgnoreCase(gender)){
                ptype.setSelectedIndex(i);
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        Dashboard obj = new Dashboard();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel10MouseClicked
    void loadData(){
        try {
            File file = new File("Howarts Data.txt"); //create file
            file.createNewFile();//if not exit
            FileReader f = new FileReader("Howarts Data.txt");
            StringBuffer sb = new StringBuffer();
            while (f.ready()) {
                char c = (char) f.read();
                    if (c == '-') {
                        String[] Array = sb.toString().split(",");
                        //System.out.println(Array[2]);
                        Reg_Stud.add(new Students(Array[0],Array[1],Array[2],Array[3]));
                        sb = new StringBuffer();
                    }else{
                        sb.append(c);
                    }
            }
        }catch(IOException e){
            return;
        }
                dtm.setRowCount(0);//reset data model
        for (int i = 0; i < Reg_Stud.size(); i++) {
            Object[] objs = {Reg_Stud.get(i).first,Reg_Stud.get(i).last,Reg_Stud.get(i).gender,
            Reg_Stud.get(i).type};
            dtm.addRow(objs);
        
    }
    }
    private void writeData(){
        try (FileWriter f = new FileWriter("Howarts Data.txt")) {
            StringBuilder sb = new StringBuilder();
            for (int i=0;i<Reg_Stud.size();i++){
                sb.append(Reg_Stud.get(i).first+","+Reg_Stud.get(i).last+","+Reg_Stud.get(i).gender+
                        ","+Reg_Stud.get(i).type+"-");
            }
            f.write(sb.toString());
            f.close();
        }catch(IOException e){
            return;
        }
        dtm.setRowCount(0);//reset data model
        for (int i = 0; i < Reg_Stud.size(); i++) {
            Object[] objs = {Reg_Stud.get(i).first,Reg_Stud.get(i).last,Reg_Stud.get(i).gender,Reg_Stud.get(i).type};
            dtm.addRow(objs);
    }}
    
    private void clearField(){
        fname.requestFocus();
        fname.setText("");
        lname.setText("");
        gen.setSelectedIndex(0);
        ptype.setSelectedIndex(0);
    }
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
            java.util.logging.Logger.getLogger(RegStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fname;
    private javax.swing.JComboBox<String> gen;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField lname;
    private javax.swing.JComboBox<String> ptype;
    // End of variables declaration//GEN-END:variables
}

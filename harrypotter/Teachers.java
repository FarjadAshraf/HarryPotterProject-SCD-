package harrypotter;

import java.util.LinkedList;
import java.util.Stack;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Syed Farjad Ali
 */
public final class Teachers extends javax.swing.JFrame {

    /**
     * Creates new form LinkedList
     */
    public Teachers() {
        initComponents();

        Transfiguration();
        DefenceVSDark();
        Potion();
        CareofMagicCreatures();
        MuggleStudies();
        Flying();
        Other();
    }


    class Teacher {

        private final String Names;
        private final String Subjects;
        
        public Teacher(String nm, String sb) {
            this.Names = nm;
            this.Subjects = sb;
        }
    }

    public void Transfiguration() {
        Stack<Teacher> list = new Stack<>();
        Teacher t1 = new Teacher("Professor Albus Dumbledore", "Transfiguration");
        Teacher t2 = new Teacher("Minerva McGonagall", "Transfiguration");
        list.push(t1);
        list.push(t2);

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row;
        for (int i = 0; i < list.size(); i++) {
            row = new Object[2];
            row[0] = list.get(i).Names;
            row[1] = list.get(i).Subjects;
            model.addRow(row);
        }
    }

    public void DefenceVSDark() {
        LinkedList<Teacher> list = new LinkedList<>();
        Teacher t1 = new Teacher("Remus Lupin", "Defence Against the Dark Arts");
        Teacher t2 = new Teacher("Dolores Umbridge", "Defence Against the Dark Arts");
        Teacher t3 = new Teacher("Gilderoy Lockhart", "Defence Against the Dark Arts");
        Teacher t4 = new Teacher("Alastor Moody ", "Defence Against the Dark Arts");
        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row;
        for (int i = 0; i < list.size(); i++) {
            row = new Object[2];
            row[0] = list.get(i).Names;
            row[1] = list.get(i).Subjects;
            model.addRow(row);
        }
    }

    public void Potion() {
        Stack<Teacher> list = new Stack<>();
        Teacher t1 = new Teacher("Severus Snape", "Potions");
        Teacher t2 = new Teacher("Horace Slughorn", "Potions");
        list.push(t1);
        list.push(t2);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row;
        for (int i = 0; i < list.size(); i++) {
            row = new Object[2];
            row[0] = list.get(i).Names;
            row[1] = list.get(i).Subjects;
            model.addRow(row);
        }
    }

    public void CareofMagicCreatures() {
        LinkedList<Teacher> list = new LinkedList<>();
        Teacher t1 = new Teacher("Rubeus Hagrid", "Care of Magical Creatures");
        Teacher t2 = new Teacher("Silvanus Kettleburn", "Care of Magical Creatures");
        Teacher t3 = new Teacher("Wilhelmina Grubbly-Plank", "Care of Magical Creatures");
        list.add(t1);
        list.add(t2);
        list.add(t3);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row;
        for (int i = 0; i < list.size(); i++) {
            row = new Object[2];
            row[0] = list.get(i).Names;
            row[1] = list.get(i).Subjects;
            model.addRow(row);
        }
    }

    public void MuggleStudies() {
        Stack<Teacher> list = new Stack<>();
        Teacher t1 = new Teacher("Quirinus Quirrell", "Muggle Studies");
        Teacher t2 = new Teacher("Charity Burbage", "Muggle Studies");
        list.push(t1);
        list.push(t2);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row;
        for (int i = 0; i < list.size(); i++) {
            row = new Object[2];
            row[0] = list.get(i).Names;
            row[1] = list.get(i).Subjects;
            model.addRow(row);
        }
    }

    public void Flying() {
        LinkedList<Teacher> list = new LinkedList<>();
        Teacher t1 = new Teacher("Rolanda Hooch", "Flying");
        list.push(t1);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row;
        for (int i = 0; i < list.size(); i++) {
            row = new Object[2];
            row[0] = list.get(i).Names;
            row[1] = list.get(i).Subjects;
            model.addRow(row);
        }
    }

    public void Other() {
        Stack<Teacher> list = new Stack<>();
        Teacher t1 = new Teacher("Pomona Sprout", "Herbology");
        Teacher t2 = new Teacher("Aurora Sinistra", "Astronomy");
        Teacher t3 = new Teacher("Cuthbert Binns", "History of Magic");
        Teacher t4 = new Teacher("Firenze", "Divination");
        Teacher t5 = new Teacher("Septima Vector", "Arithmancy");
        Teacher t6 = new Teacher("Sybill Trelawney", "Divination");
        Teacher t7 = new Teacher("Filius Flitwick", "	Charms");
        list.push(t1);
        list.push(t2);
        list.push(t3);
        list.push(t4);
        list.push(t5);
        list.push(t6);
        list.push(t7);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row;
        for (int i = 0; i < list.size(); i++) {
            row = new Object[2];
            row[0] = list.get(i).Names;
            row[1] = list.get(i).Subjects;
            model.addRow(row);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1084, 610));
        jPanel1.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/cross 2.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4);
        jLabel4.setBounds(960, 0, 30, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/back.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 10, 40, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/TeacherTag.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(350, 10, 360, 150);

        jTable1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Teacher Names", "Subjects"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setName(""); // NOI18N
        jTable1.setOpaque(false);
        jTable1.setRowHeight(28);
        jTable1.setRowMargin(2);
        jTable1.setSelectionBackground(new java.awt.Color(102, 0, 102));
        jTable1.setSurrendersFocusOnKeystroke(true);
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.setUpdateSelectionOnSort(false);
        jTable1.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 160, 920, 370);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/teacherback.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1000, 560);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 998, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        Dashboard obj = new Dashboard();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(Teachers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teachers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teachers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teachers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teachers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

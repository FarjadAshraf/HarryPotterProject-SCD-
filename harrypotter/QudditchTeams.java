package harrypotter;

/**
 *
 * @author Syed Farjad Ali
 */
public class QudditchTeams extends javax.swing.JFrame {
    public  Object Lock1 = new Object();
    public  Object Lock2 = new Object();
    public  Object Lock3 = new Object();
    public  Object Lock4 = new Object();
    public  Object Lock5 = new Object();
    
    public  void displayTeams(){
        ThreadGryffindor T1 = new ThreadGryffindor();
	ThreadSlytherin  T2 = new ThreadSlytherin();
        ThreadRavenclaw  T3 = new ThreadRavenclaw ();
        ThreadHufflepuff T4 = new ThreadHufflepuff ();
        
        T2.start();         
        T1.start();
        T4.start();
        T3.start();
    }

    /**
     * Creates new form QudditchTeams
     */
    public QudditchTeams() {
        initComponents();
        displayTeams() ;
    }
    private class ThreadGryffindor extends Thread {
        public void run() {
            synchronized (Lock1) {
                G_Seeker.setText("Harry Potter");
                synchronized (Lock2) {
                    G_Keeper.setText("Oliver Wood");
                    synchronized (Lock3) {
                        G_Chaser.setText("Angelina Johnson");
                        synchronized (Lock4) {
                            G_Beater.setText("Fred Weasley");
                            synchronized (Lock5) {
                                G_Reserve.setText("Katie Bell");
            }}}}}}}

    private class ThreadSlytherin extends Thread {
        public void run() {
            synchronized (Lock1) {
                S_Seeker.setText("Draco Malfoy");
                synchronized (Lock2) {
                    S_Keeper.setText("Miles Bletchley");
                    synchronized (Lock3) {
                        S_Chaser.setText("Marcus Flint");
                        synchronized (Lock4) {
                            S_Beater.setText("Gregory Goyle");
                            synchronized (Lock5) {
                                S_Reserve.setText("Terence Higgs");
          }}}}}}}


    private class ThreadRavenclaw extends Thread {
        public void run() {
            synchronized (Lock1) {
                R_Seeker.setText("Cho Chang");
                synchronized (Lock2) {
                    R_Keeper.setText(" Grant Page");
                    synchronized (Lock3) {
                        R_Chaser.setText("Roger Davies");
                        synchronized (Lock4) {
                            R_Beater.setText("Jason Samuels");
                            synchronized (Lock5) {
                                R_Reserve.setText("Jeremy Stretton");
                }}}}}}}

    private class ThreadHufflepuff extends Thread {
        public void run() {
            synchronized (Lock1) {
                H_Seeker.setText("Cedric Diggory");
                synchronized (Lock2) {
                    H_Keeper.setText("Herbert Fleet");
                    synchronized (Lock3) {
                        H_Chaser.setText("Malcolm Preece");
                        synchronized (Lock4) {
                            H_Beater.setText("Maxine O'Flaherty");
                            synchronized (Lock5) {
                                H_Reserve.setText("Heidi Macavoy");
           }}}}}}}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Griffindor = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        Ravenclaw = new javax.swing.JLabel();
        Hufflepuff = new javax.swing.JLabel();
        S_Chaser = new javax.swing.JLabel();
        S_Beater = new javax.swing.JLabel();
        S_Keeper = new javax.swing.JLabel();
        S_Reserve = new javax.swing.JLabel();
        S_Seeker = new javax.swing.JLabel();
        R_Seeker = new javax.swing.JLabel();
        H_Seeker = new javax.swing.JLabel();
        H_Keeper = new javax.swing.JLabel();
        H_Chaser = new javax.swing.JLabel();
        H_Beater = new javax.swing.JLabel();
        H_Reserve = new javax.swing.JLabel();
        R_Keeper = new javax.swing.JLabel();
        R_Chaser = new javax.swing.JLabel();
        R_Beater = new javax.swing.JLabel();
        R_Reserve = new javax.swing.JLabel();
        G_Reserve = new javax.swing.JLabel();
        G_Chaser = new javax.swing.JLabel();
        G_Beater = new javax.swing.JLabel();
        G_Keeper = new javax.swing.JLabel();
        G_Seeker = new javax.swing.JLabel();
        Beater = new javax.swing.JLabel();
        Keeper = new javax.swing.JLabel();
        Reserve = new javax.swing.JLabel();
        Seeker = new javax.swing.JLabel();
        Chaser = new javax.swing.JLabel();
        Layout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(null);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/cross 2.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel6);
        jLabel6.setBounds(980, 0, 30, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/back.png"))); // NOI18N
        jLabel5.setText("jLabel3");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 0, 30, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/harryfly.png"))); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(670, 0, 300, 190);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/4color.png"))); // NOI18N
        jLabel3.setText("jLabel2");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(70, 0, 250, 100);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/qudditchlogo.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(340, 10, 360, 160);

        Griffindor.setBackground(new java.awt.Color(153, 0, 0));
        Griffindor.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        Griffindor.setForeground(new java.awt.Color(255, 255, 255));
        Griffindor.setText("       Griffindor");
        Griffindor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Griffindor.setOpaque(true);
        jPanel2.add(Griffindor);
        Griffindor.setBounds(150, 180, 190, 40);

        jLabel29.setBackground(new java.awt.Color(51, 51, 0));
        jLabel29.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("        Slytherin");
        jLabel29.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel29.setOpaque(true);
        jLabel29.setPreferredSize(new java.awt.Dimension(116, 26));
        jPanel2.add(jLabel29);
        jLabel29.setBounds(380, 180, 180, 40);

        Ravenclaw.setBackground(new java.awt.Color(0, 0, 51));
        Ravenclaw.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        Ravenclaw.setForeground(new java.awt.Color(255, 255, 255));
        Ravenclaw.setText("       Ravenclaw");
        Ravenclaw.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Ravenclaw.setMaximumSize(new java.awt.Dimension(116, 26));
        Ravenclaw.setMinimumSize(new java.awt.Dimension(116, 26));
        Ravenclaw.setOpaque(true);
        Ravenclaw.setPreferredSize(new java.awt.Dimension(116, 26));
        jPanel2.add(Ravenclaw);
        Ravenclaw.setBounds(590, 180, 180, 40);

        Hufflepuff.setBackground(new java.awt.Color(204, 153, 0));
        Hufflepuff.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        Hufflepuff.setForeground(new java.awt.Color(255, 255, 255));
        Hufflepuff.setText("       Hufflepuff");
        Hufflepuff.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Hufflepuff.setOpaque(true);
        jPanel2.add(Hufflepuff);
        Hufflepuff.setBounds(810, 180, 180, 40);

        S_Chaser.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        S_Chaser.setForeground(new java.awt.Color(255, 255, 102));
        jPanel2.add(S_Chaser);
        S_Chaser.setBounds(380, 360, 210, 40);

        S_Beater.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        S_Beater.setForeground(new java.awt.Color(255, 255, 102));
        jPanel2.add(S_Beater);
        S_Beater.setBounds(380, 420, 210, 40);

        S_Keeper.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        S_Keeper.setForeground(new java.awt.Color(255, 255, 102));
        jPanel2.add(S_Keeper);
        S_Keeper.setBounds(380, 300, 210, 40);

        S_Reserve.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        S_Reserve.setForeground(new java.awt.Color(255, 255, 102));
        jPanel2.add(S_Reserve);
        S_Reserve.setBounds(380, 480, 220, 40);

        S_Seeker.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        S_Seeker.setForeground(new java.awt.Color(255, 255, 102));
        jPanel2.add(S_Seeker);
        S_Seeker.setBounds(380, 250, 210, 40);

        R_Seeker.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        R_Seeker.setForeground(new java.awt.Color(255, 255, 102));
        jPanel2.add(R_Seeker);
        R_Seeker.setBounds(600, 250, 200, 40);

        H_Seeker.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        H_Seeker.setForeground(new java.awt.Color(255, 255, 102));
        jPanel2.add(H_Seeker);
        H_Seeker.setBounds(810, 250, 200, 40);

        H_Keeper.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        H_Keeper.setForeground(new java.awt.Color(255, 255, 102));
        jPanel2.add(H_Keeper);
        H_Keeper.setBounds(810, 300, 200, 40);

        H_Chaser.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        H_Chaser.setForeground(new java.awt.Color(255, 255, 102));
        jPanel2.add(H_Chaser);
        H_Chaser.setBounds(810, 360, 200, 40);

        H_Beater.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        H_Beater.setForeground(new java.awt.Color(255, 255, 102));
        jPanel2.add(H_Beater);
        H_Beater.setBounds(810, 420, 200, 40);

        H_Reserve.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        H_Reserve.setForeground(new java.awt.Color(255, 255, 102));
        jPanel2.add(H_Reserve);
        H_Reserve.setBounds(810, 480, 200, 40);

        R_Keeper.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        R_Keeper.setForeground(new java.awt.Color(255, 255, 102));
        jPanel2.add(R_Keeper);
        R_Keeper.setBounds(600, 300, 200, 40);

        R_Chaser.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        R_Chaser.setForeground(new java.awt.Color(255, 255, 102));
        jPanel2.add(R_Chaser);
        R_Chaser.setBounds(600, 360, 200, 40);

        R_Beater.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        R_Beater.setForeground(new java.awt.Color(255, 255, 102));
        jPanel2.add(R_Beater);
        R_Beater.setBounds(600, 420, 200, 40);

        R_Reserve.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        R_Reserve.setForeground(new java.awt.Color(255, 255, 102));
        jPanel2.add(R_Reserve);
        R_Reserve.setBounds(600, 480, 200, 40);

        G_Reserve.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        G_Reserve.setForeground(new java.awt.Color(255, 255, 102));
        jPanel2.add(G_Reserve);
        G_Reserve.setBounds(150, 480, 220, 40);

        G_Chaser.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        G_Chaser.setForeground(new java.awt.Color(255, 255, 102));
        jPanel2.add(G_Chaser);
        G_Chaser.setBounds(150, 360, 220, 40);

        G_Beater.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        G_Beater.setForeground(new java.awt.Color(255, 255, 102));
        jPanel2.add(G_Beater);
        G_Beater.setBounds(150, 420, 220, 40);

        G_Keeper.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        G_Keeper.setForeground(new java.awt.Color(255, 255, 102));
        jPanel2.add(G_Keeper);
        G_Keeper.setBounds(150, 300, 220, 40);

        G_Seeker.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        G_Seeker.setForeground(new java.awt.Color(255, 255, 102));
        jPanel2.add(G_Seeker);
        G_Seeker.setBounds(150, 250, 220, 40);

        Beater.setFont(new java.awt.Font("Sitka Subheading", 3, 24)); // NOI18N
        Beater.setForeground(new java.awt.Color(255, 153, 51));
        Beater.setText("Beater");
        jPanel2.add(Beater);
        Beater.setBounds(20, 430, 160, 31);

        Keeper.setFont(new java.awt.Font("Sitka Subheading", 3, 24)); // NOI18N
        Keeper.setForeground(new java.awt.Color(255, 153, 51));
        Keeper.setText("Keeper");
        jPanel2.add(Keeper);
        Keeper.setBounds(20, 310, 160, 30);

        Reserve.setFont(new java.awt.Font("Sitka Subheading", 3, 24)); // NOI18N
        Reserve.setForeground(new java.awt.Color(255, 153, 51));
        Reserve.setText("Reserve");
        jPanel2.add(Reserve);
        Reserve.setBounds(20, 490, 180, 31);

        Seeker.setFont(new java.awt.Font("Sitka Subheading", 3, 24)); // NOI18N
        Seeker.setForeground(new java.awt.Color(255, 153, 51));
        Seeker.setText("Seeker");
        jPanel2.add(Seeker);
        Seeker.setBounds(20, 260, 130, 31);

        Chaser.setFont(new java.awt.Font("Sitka Subheading", 3, 24)); // NOI18N
        Chaser.setForeground(new java.awt.Color(255, 153, 51));
        Chaser.setText("Chaser");
        jPanel2.add(Chaser);
        Chaser.setBounds(20, 360, 160, 40);

        Layout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Qudditch Back - Copy.jpg"))); // NOI18N
        jPanel2.add(Layout);
        Layout.setBounds(0, 0, 1020, 576);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1018, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        Dashboard obj = new Dashboard();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

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
            java.util.logging.Logger.getLogger(QudditchTeams.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QudditchTeams.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QudditchTeams.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QudditchTeams.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QudditchTeams().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Beater;
    private javax.swing.JLabel Chaser;
    private javax.swing.JLabel G_Beater;
    private javax.swing.JLabel G_Chaser;
    private javax.swing.JLabel G_Keeper;
    private javax.swing.JLabel G_Reserve;
    private javax.swing.JLabel G_Seeker;
    private javax.swing.JLabel Griffindor;
    private javax.swing.JLabel H_Beater;
    private javax.swing.JLabel H_Chaser;
    private javax.swing.JLabel H_Keeper;
    private javax.swing.JLabel H_Reserve;
    private javax.swing.JLabel H_Seeker;
    private javax.swing.JLabel Hufflepuff;
    private javax.swing.JLabel Keeper;
    private javax.swing.JLabel Layout;
    private javax.swing.JLabel R_Beater;
    private javax.swing.JLabel R_Chaser;
    private javax.swing.JLabel R_Keeper;
    private javax.swing.JLabel R_Reserve;
    private javax.swing.JLabel R_Seeker;
    private javax.swing.JLabel Ravenclaw;
    private javax.swing.JLabel Reserve;
    private javax.swing.JLabel S_Beater;
    private javax.swing.JLabel S_Chaser;
    private javax.swing.JLabel S_Keeper;
    private javax.swing.JLabel S_Reserve;
    private javax.swing.JLabel S_Seeker;
    private javax.swing.JLabel Seeker;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

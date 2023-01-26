package harrypotter;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Syed Farjad Ali
 */
public class Books extends javax.swing.JFrame {
        private Thread thread; 

    /**
     * Creates new form Books
     */
    public Books() {
        initComponents();
    }
    public class Display {
        synchronized void TheSorcererStone(){ 
            
            Desktop browser = Desktop.getDesktop();
            try {
                browser.browse(new URI("https://docenti.unimc.it/antonella.pascali/teaching/2018/19055/files/ultima-lezione/harry-potter-and-the-philosophers-stone"));
            } catch (IOException ex) {
                Logger.getLogger(Books.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException ex) {
                Logger.getLogger(Books.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        synchronized void ChamberofSecrets(){ 
            Desktop browser = Desktop.getDesktop();
            try {
                browser.browse(new URI("https://www.ircambridge.com/books/Book2-Harry-Potter-and-the-Chamber-of-Secrets.pdf"));
            } catch (IOException ex) {
                Logger.getLogger(Books.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException ex) {
                Logger.getLogger(Books.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        synchronized void PrisonerofAzkaban(){ 
            Desktop browser = Desktop.getDesktop();
            try {
                browser.browse(new URI("https://www.ircambridge.com/books/Book3-Harry-Potter-and-the-Prisoner-of-Azkaban.pdf"));
            } catch (IOException ex) {
                Logger.getLogger(Books.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException ex) {
                Logger.getLogger(Books.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        synchronized void GobletofFire(){ 
            
            Desktop browser = Desktop.getDesktop();
            try {
                browser.browse(new URI("https://www.ircambridge.com/books/Book4-Harry-Potter-and-the-Goblet-of-Fire.pdf"));
            } catch (IOException ex) {
                Logger.getLogger(Books.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException ex) {
                Logger.getLogger(Books.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        synchronized void OrderofPheonix(){ 
            Desktop browser = Desktop.getDesktop();
            try {
                browser.browse(new URI("https://www.ircambridge.com/books/Book5-Harry-Potter-and-the-Order-of-the-Phoenix.pdf"));
            } catch (IOException ex) {
                Logger.getLogger(Books.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException ex) {
                Logger.getLogger(Books.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        synchronized void HalfBloodPrince(){ 
            Desktop browser = Desktop.getDesktop();
            try {
                browser.browse(new URI("https://www.ircambridge.com/books/Book6-Harry-Potter-and-the-Half-Blood-Prince.pdf"));
            } catch (IOException ex) {
                Logger.getLogger(Books.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException ex) {
                Logger.getLogger(Books.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        synchronized void TheDeathyHollows(){ 
            Desktop browser = Desktop.getDesktop();
            try {
                browser.browse(new URI("https://www.ircambridge.com/books/Book7-Harry-Potter-and-the-Deathly-Hallows.pdf"));
            } catch (IOException ex) {
                Logger.getLogger(Books.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException ex) {
                Logger.getLogger(Books.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

//        synchronized void TheCursedChild(){ 
//            Desktop browser = Desktop.getDesktop();
//            try {
//                browser.browse(new URI("https://www.instagram.com/"));
//            } catch (IOException ex) {
//                Logger.getLogger(Books.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (URISyntaxException ex) {
//                Logger.getLogger(Books.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
    
    
} 
    class Thread1 extends Thread{
        Display d=new Display(); 
        public void run(){
            d.TheSorcererStone();
        }
    }
    
    class Thread2 extends Thread{
        Display d=new Display(); 
        public void run(){
            d.ChamberofSecrets();
        }
    }
    
    class Thread3 extends Thread{
        Display d=new Display(); 
        public void run(){
            d.PrisonerofAzkaban();
        }
    }
    
    class Thread4 extends Thread{
        Display d=new Display(); 
        public void run(){
            d.GobletofFire();
        }
    }
    class Thread5 extends Thread{
        Display d=new Display(); 
        public void run(){
            d.OrderofPheonix();
        }
    }
    
    class Thread6 extends Thread{
        Display d=new Display(); 
        public void run(){
            d.HalfBloodPrince();
        }
    }
    class Thread7 extends Thread{
        Display d=new Display(); 
        public void run(){
            d.TheDeathyHollows();
        }
    }
    
//    class Thread8 extends Thread{
//        Display d=new Display(); 
//        public void run(){
//            d.TheCursedChild();
//        }
//    }
    
//class PrintPage{ 
//    public static void main(String args[]){ 
//        
//       
//        ThreadB t2=new ThreadB();
//       
//        t2.start();
//    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/cross 2.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5);
        jLabel5.setBounds(1260, 0, 30, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/back.png"))); // NOI18N
        jLabel4.setText("jLabel3");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 10, 40, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Hpbooks.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(1140, 20, 150, 180);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/HarrypotterBooks.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(120, 30, 1020, 120);

        jButton12.setBackground(new java.awt.Color(0, 0, 0));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/h6.jpg"))); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12);
        jButton12.setBounds(940, 190, 170, 240);

        jButton11.setBackground(new java.awt.Color(0, 0, 0));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/h1.png"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11);
        jButton11.setBounds(10, 190, 170, 240);

        jButton8.setBackground(new java.awt.Color(0, 0, 0));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/h4.jpg"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(570, 190, 170, 240);

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/h5.jpg"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(760, 190, 170, 240);

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/h7.jpg"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(1120, 190, 170, 240);

        jButton9.setBackground(new java.awt.Color(0, 0, 0));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/h3.jpg"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);
        jButton9.setBounds(390, 190, 170, 240);

        jButton10.setBackground(new java.awt.Color(0, 0, 0));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/h2.jpeg"))); // NOI18N
        jButton10.setPreferredSize(new java.awt.Dimension(183, 233));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);
        jButton10.setBounds(200, 190, 170, 240);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Back4.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1300, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1299, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        Thread1 t1=new Thread1();
        t1.start();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        Thread2 t2=new Thread2();
        t2.start();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        Thread3 t3=new Thread3();
        t3.start();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        Thread4 t4=new Thread4();
        t4.start();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Thread5 t5=new Thread5();
        t5.start();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        Thread6 t6=new Thread6();
        t6.start();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Thread7 t7=new Thread7();
        t7.start();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        Dashboard obj = new Dashboard();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Books().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

package harrypotter;

import javax.swing.JOptionPane;

/**
 *
 * @author Syed Farjad Ali
 */
public class Loading extends javax.swing.JFrame {
    /**
     * Creates new form Loading
     */ 
    public Loading() {
        initComponents();

    }  
    public static void Splash(){
          try{
                Loading spl = new Loading();
                spl.setVisible(true);
                for(int i = 0; i <= 100; i++){
                //set the sleep time of the loader
                    Thread.sleep(45);
                    spl.LoadingNum.setText("Loading..."+Integer.toString(i) +" %");
                    spl.jProgressBarload.setValue(i);

                    if(i == 100){
                        
                        JOptionPane.showMessageDialog(null, "Welcome");
                        Intro obj = new Intro();
                        obj.setVisible(true);
                        spl.setVisible(false);
                    }else if(i == 45){
                        Thread.sleep(500);
                        

                    }else if(i == 90){
                        try {
                            Thread.sleep(500);

                        } catch (Exception e) {
                            e.printStackTrace();
                    }
                        spl.guide_add.setText("Almost there");
                    }else if(i == 99){
                        spl.guide_add.setText("Loading completed! Enjoy!!");
                    }
            }
                }catch (Exception e){
                    
                }
    }
        
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LoadingNum = new javax.swing.JLabel();
        guide_add = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jProgressBarload = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        LoadingNum.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        LoadingNum.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(LoadingNum);
        LoadingNum.setBounds(580, 430, 390, 50);

        guide_add.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        guide_add.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(guide_add);
        guide_add.setBounds(90, 544, 680, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Rotating-Logo-unscreen.gif"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(410, 10, 450, 330);
        jPanel1.add(jProgressBarload);
        jProgressBarload.setBounds(60, 490, 1120, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/StudentBacks.jpg"))); // NOI18N
        jLabel2.setText("99");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1278, 620);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1249, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
          Splash();
  
      
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
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                                      

////
//                new Loading().setVisible(true);
                  
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel LoadingNum;
    public javax.swing.JLabel guide_add;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JProgressBar jProgressBarload;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the LoadingNum
     */
//    public javax.swing.JLabel getLoadingNum() {
//        return LoadingNum;
//    }

    /**
     * @param LoadingNum the LoadingNum to set
     */
//    public void setLoadingNum(javax.swing.JLabel LoadingNum) {
//        this.LoadingNum = LoadingNum;
//    }
//
//    /**
//     * @return the guide_add
//     */
//    public javax.swing.JLabel getGuide_add() {
//        return guide_add;
//    }
//
//    /**
//     * @param guide_add the guide_add to set
//     */
//    public void setGuide_add(javax.swing.JLabel guide_add) {
//        this.guide_add = guide_add;
//    }
}

package harrypotter;

/**
 *
 * @author Syed Farjad Ali
 */
public class HousesInfo extends javax.swing.JFrame {
    /**
     * Creates new form HousesInfo
     */
    public HousesInfo() {
        initComponents();
    }
    public class HeadsMutable {
        String g_head;
        String s_head;
        String r_head;
        String h_head;     
        
        public HeadsMutable (String ghead , String shead , String rhead , String hhead) {
            this.g_head = ghead;
            this.s_head = shead;
            this.r_head = rhead;
            this.h_head = hhead;
        }
        
        public String getGriffindorHead() {
            return g_head;
        }
        public String getSlytherinHead() {
            return s_head;
        }
        public String getRavenclawHead() {
            return r_head;
        }
        
        public String getHufflepuffHead() {
            return h_head;
        }
        
        public String setGriffindorHead(String ghead) {
            this.g_head = ghead; 
            return ghead;
        }
        public String setSlytherinHead(String shead) {
            this.s_head = shead;
            return shead;
        }
        public String setRavenclawHead(String rhead) {
            this.r_head = rhead; 
            return rhead;
        }
        public String setHufflepuffHead(String hhead) {
            this.h_head = hhead; 
            return hhead;
        }
    }
    
        /*This is an Immutable Class in which The ghost names 
    are given  by getters and Can't be updated*/
    
    public class GhostImmutable {
        final String grif_ghost;
        final String sly_ghost;
        final String rav_ghost;
        final String huf_ghost;
        public GhostImmutable (String sghost, String gghost, String rghost,String hghost) {
            this.sly_ghost = sghost;
            this.grif_ghost = gghost;
            this.rav_ghost = rghost;
            this.huf_ghost = hghost;
        }
        public String getGriffindorGhost() {
            return grif_ghost;
        }
        public String getSlytherinGhost() {
            return sly_ghost;
        }
        public String getRavenclawGhost() {
            return rav_ghost;
        }
        public String getHufflepuffGhost() {
            return huf_ghost;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        g_head = new javax.swing.JLabel();
        s_head = new javax.swing.JLabel();
        r_head = new javax.swing.JLabel();
        g_ghost = new javax.swing.JLabel();
        s_ghost = new javax.swing.JLabel();
        r_ghost = new javax.swing.JLabel();
        h_ghost = new javax.swing.JLabel();
        h_head = new javax.swing.JLabel();
        s_founder = new javax.swing.JLabel();
        r_founder = new javax.swing.JLabel();
        h_founder = new javax.swing.JLabel();
        g_founder = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/cross 2.png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel15);
        jLabel15.setBounds(960, 0, 30, 40);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 102, 0));
        jLabel12.setText("Hufflepuff");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(710, 220, 70, 14);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/back.png"))); // NOI18N
        jLabel16.setText("jLabel3");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel16);
        jLabel16.setBounds(20, 10, 40, 40);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 0, 0));
        jLabel13.setText("Gryffindor");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(240, 220, 70, 17);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 102, 0));
        jLabel14.setText("Slytherin");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(390, 220, 60, 17);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 153));
        jLabel9.setText("Ravenclaw");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(550, 220, 70, 17);

        jButton1.setBackground(new java.awt.Color(255, 204, 102));
        jButton1.setFont(new java.awt.Font("High Tower Text", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/wandicon.png"))); // NOI18N
        jButton1.setText("Reveal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(460, 500, 135, 30);

        g_head.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        g_head.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(g_head);
        g_head.setBounds(240, 350, 140, 20);

        s_head.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        s_head.setForeground(new java.awt.Color(51, 102, 0));
        jPanel1.add(s_head);
        s_head.setBounds(400, 350, 140, 20);

        r_head.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        r_head.setForeground(new java.awt.Color(0, 102, 153));
        jPanel1.add(r_head);
        r_head.setBounds(520, 350, 140, 20);

        g_ghost.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        g_ghost.setForeground(new java.awt.Color(204, 0, 0));
        g_ghost.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                g_ghostMouseEntered(evt);
            }
        });
        jPanel1.add(g_ghost);
        g_ghost.setBounds(280, 420, 130, 20);

        s_ghost.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        s_ghost.setForeground(new java.awt.Color(51, 102, 0));
        jPanel1.add(s_ghost);
        s_ghost.setBounds(400, 420, 130, 20);

        r_ghost.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        r_ghost.setForeground(new java.awt.Color(0, 102, 153));
        jPanel1.add(r_ghost);
        r_ghost.setBounds(530, 420, 100, 20);

        h_ghost.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        h_ghost.setForeground(new java.awt.Color(255, 102, 0));
        jPanel1.add(h_ghost);
        h_ghost.setBounds(610, 420, 100, 20);

        h_head.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        h_head.setForeground(new java.awt.Color(255, 102, 0));
        jPanel1.add(h_head);
        h_head.setBounds(660, 350, 130, 20);

        s_founder.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        s_founder.setForeground(new java.awt.Color(51, 102, 0));
        jPanel1.add(s_founder);
        s_founder.setBounds(360, 280, 140, 21);

        r_founder.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        r_founder.setForeground(new java.awt.Color(0, 102, 153));
        jPanel1.add(r_founder);
        r_founder.setBounds(500, 280, 160, 20);

        h_founder.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        h_founder.setForeground(new java.awt.Color(255, 102, 0));
        jPanel1.add(h_founder);
        h_founder.setBounds(670, 280, 140, 20);

        g_founder.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        g_founder.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(g_founder);
        g_founder.setBounds(210, 280, 150, 20);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/h1logo.png"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(680, 110, 110, 110);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/R1logo.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(520, 100, 110, 120);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/g1logo.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(220, 110, 100, 111);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/S1logo.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(370, 110, 100, 110);

        jLabel4.setBackground(new java.awt.Color(255, 204, 153));
        jLabel4.setFont(new java.awt.Font("ChunkFive Roman", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 51, 0));
        jLabel4.setText("Namesake Founders:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(420, 240, 190, 30);

        jLabel6.setBackground(new java.awt.Color(255, 204, 153));
        jLabel6.setFont(new java.awt.Font("ChunkFive Roman", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 51, 0));
        jLabel6.setText("House Ghosts");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(450, 390, 120, 30);

        jLabel7.setBackground(new java.awt.Color(255, 204, 153));
        jLabel7.setFont(new java.awt.Font("ChunkFive Roman", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 51, 0));
        jLabel7.setText("Head of House");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(440, 310, 140, 30);

        jLabel3.setBackground(new java.awt.Color(255, 204, 153));
        jLabel3.setFont(new java.awt.Font("ChunkFive Roman", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 51, 0));
        jLabel3.setText(" Hogwarts School Of Witchcraft  and Wizardry");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(230, 70, 560, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/oldpage.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 10, 900, 510);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/back3.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1000, 570);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 999, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void g_ghostMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g_ghostMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_g_ghostMouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         HousesInfo hi = new HousesInfo();         
 //IMMUTABLE CLASS CONCEPT IS USED TO DISPLAY HOUSE GHOSTS 
        GhostImmutable obj = new GhostImmutable ("Headless Nick" , "Bloody Baron" ,"Grey Lady","Fat Frier" );
       
        g_ghost.setText(obj.getGriffindorGhost());
        s_ghost.setText(obj.getSlytherinGhost());
        r_ghost.setText(obj.getRavenclawGhost());
        h_ghost.setText(obj.getHufflepuffGhost());
        
        
 //MUTABLE CLASS CONCEPT IS USED TO DISPLAY HOUSE FOUNDER & HEADS
 
       //FOR HEAD FOUNDERS, VALUES ARE PASSED IN THE OBJECT AND DISPLAYED BY USING GETTERS
        HeadsMutable obj1 = new HeadsMutable ("Godric Griffindor","Salazar Slytherin" ,"Rowena Ravenclaw","Helga Hufflepuff" );     
        g_founder.setText(obj1.getGriffindorHead());
        s_founder.setText(obj1.getSlytherinHead());
        r_founder.setText(obj1.getRavenclawHead());
        h_founder.setText(obj1.getHufflepuffHead());

 
       //FOR HEAD OF HOUSES, VALUES ARE UPDATED BY USING SETTERS
        obj1.setGriffindorHead("Minerva McGonagall");
        obj1.setSlytherinHead("Severus Snape");
        obj1.setRavenclawHead("Whiteney Houston");
        obj1.setHufflepuffHead("Pomona Sprout");
        
        //UPDATED VALUES ARE DISPLAYED BY USING GETTERS
        g_head.setText(obj1.getGriffindorHead());
        s_head.setText(obj1.getSlytherinHead());
        r_head.setText(obj1.getRavenclawHead());
        h_head.setText(obj1.getHufflepuffHead());

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        Dashboard obj = new Dashboard();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel16MouseClicked

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
            java.util.logging.Logger.getLogger(HousesInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HousesInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HousesInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HousesInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HousesInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel g_founder;
    private javax.swing.JLabel g_ghost;
    private javax.swing.JLabel g_head;
    private javax.swing.JLabel h_founder;
    private javax.swing.JLabel h_ghost;
    private javax.swing.JLabel h_head;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel r_founder;
    private javax.swing.JLabel r_ghost;
    private javax.swing.JLabel r_head;
    private javax.swing.JLabel s_founder;
    private javax.swing.JLabel s_ghost;
    private javax.swing.JLabel s_head;
    // End of variables declaration//GEN-END:variables
}

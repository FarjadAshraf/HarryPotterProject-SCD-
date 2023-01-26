package harrypotter;

import javax.swing.JOptionPane;

/**
 *
 * @author Syed Farjad Ali
 */
public class HpQuiz extends javax.swing.JFrame {
    private Thread thread;   
    private int currentQuestion = 0;
    private int currentOptions = 0;
    private int score = 0;

    private String questions[] = { "<html>"+ "Tom Riddle belonged to which House of Hogwarts?" + "<html>",       
                                   "<html>"+"Which position does harry potter play in Qudditch?"+ "<html>",
                                   "<html>"+"Who was the Prisoner Of Azkaban"+ "<html>",
                                   "<html>"+"What was Ron Scared of"+ "<html>",
                                   "<html>"+"Who Killed Voldmort's Snake NIGINI"+ "<html>",
                                   "<html>"+"Harry Learned the Patronus Charm Spell To fight?"+ "<html>",
                                   "<html>"+"In Goglet of Fire, Tri-Wizard Tournament Age Limit was?"+ "<html>",
                                   "<html>"+"Who was the Half-Blood Prince"+ "<html>",
                                   "<html>"+"In the Last Part, the Story move forward How Many Years"+ "<html>", 
                                   "<html>"+"Fat Frier was the Ghost of which House?"+ "<html>"};
    
    
    private String options[] = { "<html>Slytherin<br>Griffindor<br>Ravenclaw</html>",
                                 "<html>Beater<br>Seeker<br>Chaser</html>",
                                 "<html>Voldmort<br>Black<br>Hagrid</html>",
                                 "<html>Snakes<br>Darkness<br>Spiders</html>",
                                 "<html>Hermione<br>Naville<br>Luna</html>",
                                 "<html>Dementors<br>Voldmort<br>Dragons</html>",
                                 "<html>19<br>18<br>17</html>",
                                 "<html>Harry<br>Snape<br>Ron</html>",
                                 "<html>18<br>19<br>20</html>",
                                 "<html>Hufflepuff<br>Griffindor<br>Ravenclaw</html>" };
    
    
    
    
    private String answers[] = {"Slytherin", "Seeker", "Black","Spiders", "Naville",
                                "Dementors","17", "Snape", "19","Hufflepuff"};

    /**
     * Creates new form HpQuiz
     */
    public HpQuiz() {
        initComponents();
        HarryThread t1=new HarryThread();
        questionLabel.setText(questions[currentQuestion]);
        OptionLabel.setText(options[currentOptions]);
    }
    
    
    public class HogwartsQuiz extends Thread{
        synchronized void QnA(){ 
            String answer = answerField.getText();
            if (answer.equalsIgnoreCase(answers[currentQuestion])) {
                JOptionPane.showMessageDialog(null, "Correct!");
                score++;
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is " + answers[currentQuestion]);
            }
            currentQuestion++;
            currentOptions++;
            if (currentQuestion < questions.length) {
                questionLabel.setText(questions[currentQuestion]);
                OptionLabel.setText(options[currentOptions]);
                answerField.setText("");
            } else {               
                JOptionPane.showMessageDialog(null, "Quiz completed! Your total score is: " + score );
                Dashboard obj = new Dashboard();
                obj.setVisible(true);
                dispose();
            }
        }
    };
    class HarryThread extends Thread{
        HogwartsQuiz a=new HogwartsQuiz(); 
        public void run(){
            a.QnA();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        p1 = new javax.swing.JLabel();
        p5 = new javax.swing.JLabel();
        p2 = new javax.swing.JLabel();
        p3 = new javax.swing.JLabel();
        p4 = new javax.swing.JLabel();
        ques = new javax.swing.JLabel();
        opt = new javax.swing.JLabel();
        OptionLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        ans = new javax.swing.JLabel();
        answerField = new javax.swing.JTextField();
        questionLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/cross 2.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7);
        jLabel7.setBounds(970, 0, 30, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/back.png"))); // NOI18N
        jLabel6.setText("jLabel3");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 40, 40);

        p1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/all3.png"))); // NOI18N
        p1.setText("jLabel4");
        jPanel1.add(p1);
        p1.setBounds(0, 180, 300, 430);

        p5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/151651_email_128x128.png"))); // NOI18N
        jPanel1.add(p5);
        p5.setBounds(340, 440, 140, 120);

        p2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/QuizHead.png"))); // NOI18N
        jPanel1.add(p2);
        p2.setBounds(610, 70, 310, 80);

        p3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Harrypotterlogo.png"))); // NOI18N
        p3.setText("jLabel4");
        jPanel1.add(p3);
        p3.setBounds(10, 10, 410, 170);

        p4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/151649_hat_128x128.png"))); // NOI18N
        p4.setText("jLabel4");
        jPanel1.add(p4);
        p4.setBounds(410, 10, 120, 120);

        ques.setFont(new java.awt.Font("Microsoft Himalaya", 1, 30)); // NOI18N
        ques.setForeground(new java.awt.Color(153, 0, 0));
        ques.setText("Question");
        jPanel1.add(ques);
        ques.setBounds(580, 150, 120, 30);

        opt.setFont(new java.awt.Font("Microsoft Himalaya", 1, 30)); // NOI18N
        opt.setForeground(new java.awt.Color(153, 0, 0));
        opt.setText("Options");
        jPanel1.add(opt);
        opt.setBounds(590, 250, 90, 30);

        OptionLabel.setFont(new java.awt.Font("Microsoft Himalaya", 1, 26)); // NOI18N
        OptionLabel.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(OptionLabel);
        OptionLabel.setBounds(590, 260, 340, 120);

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/wandicon.png"))); // NOI18N
        jButton1.setText("Check");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(690, 460, 130, 30);

        ans.setFont(new java.awt.Font("Microsoft Himalaya", 1, 24)); // NOI18N
        ans.setForeground(new java.awt.Color(153, 0, 0));
        ans.setText("Type your Answer Here");
        jPanel1.add(ans);
        ans.setBounds(590, 380, 160, 40);

        answerField.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(answerField);
        answerField.setBounds(610, 420, 270, 30);

        questionLabel.setFont(new java.awt.Font("Microsoft Himalaya", 1, 24)); // NOI18N
        questionLabel.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(questionLabel);
        questionLabel.setBounds(580, 170, 350, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/oldpage - Copy.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(520, -10, 480, 570);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/back2.jpeg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-190, -70, 1300, 730);

        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(690, 200, 34, 14);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        HarryThread t1=new HarryThread();
        t1.start();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        Dashboard obj = new Dashboard();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(HpQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HpQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HpQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HpQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HpQuiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel OptionLabel;
    private javax.swing.JLabel ans;
    private javax.swing.JTextField answerField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel opt;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p2;
    private javax.swing.JLabel p3;
    private javax.swing.JLabel p4;
    private javax.swing.JLabel p5;
    private javax.swing.JLabel ques;
    private javax.swing.JLabel questionLabel;
    // End of variables declaration//GEN-END:variables
}

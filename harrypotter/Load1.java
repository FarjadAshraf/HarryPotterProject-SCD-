/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harrypotter;


import javax.swing.JOptionPane;

/**
 *
 * @author Syed Farjad Ali
 */
public class Load1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
                        Dashboard app = new Dashboard();
                        app.setVisible(true);
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
    
        
    }
    


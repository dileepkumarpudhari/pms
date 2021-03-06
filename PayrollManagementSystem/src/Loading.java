
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dilee
 */
public class Loading extends javax.swing.JFrame implements Runnable{

    
Thread th; 
    /**
     * Creates new form Loading
     */
    public Loading() {
        
        initComponents();
        th= new Thread((Runnable)this);
    }
    
    
    public void setUpLoading()
    {
        
        setVisible(false);
        th.start();
        
        
        
    }

   @Override
    public void run()
    {
     try{
         for (int i=1;i<=101;i++)
         {
          int m = jProgressBar.getMaximum();
          
          int v = jProgressBar.getValue();
          if(v<m)
          {
              jProgressBar.setValue(jProgressBar.getValue()+1);
              
          }
          else{             
              setVisible(false);
              HomeScreen hs1 = new HomeScreen();
              hs1.setVisible(true);
              hs1.pack();
              hs1.setLocationRelativeTo(null);
              //hs.setExtendedState(JFrame.MAXIMIZED_BOTH);
              
              this.dispose();
              
          } Thread.sleep(10);
         }
     } 
     catch(Exception e)
     {
         JOptionPane.showMessageDialog(null, e);
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
        jLabel1 = new javax.swing.JLabel();
        jProgressBar = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(36, 47, 65));
        jPanel1.setForeground(new java.awt.Color(137, 196, 244));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Payroll Management System");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(130, 90, 350, 60);

        jProgressBar.setStringPainted(true);
        jPanel1.add(jProgressBar);
        jProgressBar.setBounds(170, 420, 240, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/geometry-hour-glass-loader.gif"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(-120, 160, 720, 230);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Loading..");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(260, 450, 60, 16);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(602, 545));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loading().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar;
    // End of variables declaration//GEN-END:variables
}

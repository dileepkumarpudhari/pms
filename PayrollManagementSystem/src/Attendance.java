
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
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
public class Attendance extends javax.swing.JPanel {

    /**
     * Creates new form Attendance
     */
    public Attendance() {
        initComponents();
        selectJob();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        SelectJobid = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        hoursworkedfield = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        SubmitHours = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Paymentofday = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(36, 47, 65));
        setPreferredSize(new java.awt.Dimension(1236, 589));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Choose Date :");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Job id :");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Hours Worked :");

        hoursworkedfield.setBackground(new java.awt.Color(36, 47, 65));
        hoursworkedfield.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        hoursworkedfield.setForeground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(51, 153, 51));

        SubmitHours.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        SubmitHours.setForeground(new java.awt.Color(255, 255, 255));
        SubmitHours.setText("    Submit");
        SubmitHours.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubmitHoursMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SubmitHours, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SubmitHours, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("   Refresh");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Payment for the day :");

        Paymentofday.setEditable(false);
        Paymentofday.setBackground(new java.awt.Color(36, 47, 65));
        Paymentofday.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Paymentofday.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("TimeSheet");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SelectJobid, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hoursworkedfield, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(233, 233, 233)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(Paymentofday, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(546, 546, 546)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1))))
                .addContainerGap(241, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(SelectJobid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(hoursworkedfield, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(Paymentofday, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(76, 76, 76))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    public void selectJob()
    {
        
        DefaultComboBoxModel model1 = (DefaultComboBoxModel) SelectJobid.getModel();
        PreparedStatement ps;
        ResultSet rs;
        
        String uname;
        uname = HomeScreen.user;
                
        String query = "select * from jobdetails where uid='"+uname+"' ";
        
        try{
        SelectJobid.setModel(model1);
        model1.removeAllElements();
        ps= JavaConnect.connectDB().prepareStatement(query);
        rs=ps.executeQuery();
        while(rs.next())
        {
            model1.addElement(rs.getString(1));
            //String value = rs.getString("jobid");
            //selectjob.addItem(value);
        }
           
        } catch (SQLException ex) {
            Logger.getLogger(JobDetails.class.getName()).log(Level.SEVERE, null, ex);
        }           
    }
    
    
    
    
    private void SubmitHoursMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitHoursMouseClicked
        PreparedStatement ps;
        ResultSet rs;
        
        
        String uname;
        uname = HomeScreen.user;
        
        
        String Hoursworked = hoursworkedfield.getText();
        double hours = Double.parseDouble(Hoursworked);
        
        String searchj= SelectJobid.getSelectedItem().toString();
        int sea = Integer.parseInt(searchj);
        
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        String workingdate = dateformat.format(jCalendar1.getDate());
        
        
        
        if(workingdate == null)
        {
            JOptionPane.showMessageDialog(null, "Enter the date you worked !");
        }
        
        else if(Hoursworked.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Enter the Hours, if not it will take the default value !");
        }
        
        else
        {
            
            String query = "Insert into timesheet (workid, jobid, uid, workingdate, Hoursworked, Payment) values (?,?,?,?,?,?)";
            try{
             ps= JavaConnect.connectDB().prepareStatement(query);
                
             ps.setString(1, null);
             ps.setInt(2,sea);
             ps.setString(3, uname);
             ps.setString(4, workingdate);
             ps.setDouble(5, hours);
             
            //double pay = getPayment();
             ps.setDouble(6, getPayment());
  
             if(ps.executeUpdate()>0)
             {
                 JOptionPane.showMessageDialog(null, "Hours are addded to timesheet");
             }
             
             
            } catch (SQLException ex) {
                Logger.getLogger(Attendance.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_SubmitHoursMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        
        hoursworkedfield.setText("");
        Paymentofday.setText("");
        
    }//GEN-LAST:event_jLabel5MouseClicked

    
    
    
    public double getPayment()
    {
       double payment=0;
       String Hoursworked = hoursworkedfield.getText();
       double hours = Double.parseDouble(Hoursworked);
       
       String searchj= SelectJobid.getSelectedItem().toString();
       int jid = Integer.parseInt(searchj);
       
       PreparedStatement pst;
       ResultSet rst;
       
       String sql = "Select payrate from jobdetails where jobid="+jid;
       
       
       try{
           
       pst= JavaConnect.connectDB().prepareStatement(sql);
       rst=pst.executeQuery();
        if(rst.next())
        {
          String pay = rst.getString(1);
          payment = Double.parseDouble(pay)* hours;
          String p = Double.toString(payment);
          Paymentofday.setText(p);
        }
       
       } catch (SQLException ex) {
            Logger.getLogger(Attendance.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return payment;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Paymentofday;
    private javax.swing.JComboBox<String> SelectJobid;
    private javax.swing.JLabel SubmitHours;
    private javax.swing.JTextField hoursworkedfield;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
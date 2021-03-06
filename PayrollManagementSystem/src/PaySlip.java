
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dilee
 */
public class PaySlip extends javax.swing.JPanel {

    DefaultTableModel dm;
    
    /**
     * Creates new form PaySlip
     */
    public PaySlip() {
        initComponents();
        selectjobid();
        setTable();
        
        
        //getData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fromDate = new com.toedter.calendar.JDateChooser();
        toDate = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jid = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tothours = new javax.swing.JTextField();
        totalpayment = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(36, 47, 65));
        setPreferredSize(new java.awt.Dimension(1236, 589));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("From :");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("To :");

        fromDate.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        toDate.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Job Id :");

        jid.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jid.setAutoscrolls(true);

        jTable1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "S.no", "Date ", "Hours Worked", "Pay Received"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("    Trigger");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Total Hours :");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Total Payment :");

        tothours.setEditable(false);
        tothours.setBackground(new java.awt.Color(36, 47, 65));
        tothours.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        tothours.setForeground(new java.awt.Color(255, 255, 255));

        totalpayment.setEditable(false);
        totalpayment.setBackground(new java.awt.Color(36, 47, 65));
        totalpayment.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        totalpayment.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("   Download Payslip");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(toDate, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jid, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tothours, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalpayment, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jid, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(toDate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(fromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(tothours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalpayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(107, 107, 107))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void selectjobid()
    {
        DefaultComboBoxModel model1 = (DefaultComboBoxModel) jid.getModel();
        PreparedStatement ps;
        ResultSet rs;
        
        String uname;
        uname = HomeScreen.user;
        
        //System.out.println(uname);
                
        String query = "select jobid from jobdetails where uid='"+uname+"' ";
        
        try{
        //jid.setModel(model1);
        model1.removeAllElements();
        ps= JavaConnect.connectDB().prepareStatement(query);
        rs=ps.executeQuery();
        while(rs.next())
        {
            model1.addElement(rs.getString(1));
            //String value = rs.getString("jobid");
            //selectjob.addItem(value);
        }
           
        //jid.setModel(model1);
        
        } catch (SQLException ex) {
            Logger.getLogger(JobDetails.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    private void updateTable()
    {
        PreparedStatement ps;
        ResultSet rs;
        String sql = "Select * from timesheet";
        try
        {
            ps=JavaConnect.connectDB().prepareStatement(sql);
            
            rs=ps.executeQuery();
            
            //jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        } catch (SQLException ex) {
            Logger.getLogger(PaySlip.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        PreparedStatement pst;
        ResultSet rst;
        setTable();
        
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        String fdate = dateformat.format(fromDate.getDate());
        
        //LocalDate currentdate =java.time.LocalDate.now();
        
        Date cdate = new Date();
        String currentdate= dateformat.format(cdate);
        
        
        SimpleDateFormat dateformat1 = new SimpleDateFormat("yyyy-MM-dd");
        String tdate = dateformat1.format(toDate.getDate());
        
        String searchj= jid.getSelectedItem().toString();
        int sea = Integer.parseInt(searchj);
        
        /* SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
       try {
            Date frdate = format.parse(fdate);
            Date todate = format.parse(tdate);
        } catch (ParseException ex) {
            Logger.getLogger(PaySlip.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        
        if(fdate.equals(currentdate))
        {
            JOptionPane.showMessageDialog(null, "From Date cannot be same as Today's date");
        }
        else if(tdate.compareTo(currentdate)>0)
        {
            JOptionPane.showMessageDialog(null," To date cannot be after Today's date");
        }
        else if(fdate.compareTo(tdate)>0)
        {
           JOptionPane.showMessageDialog(null, "From date cannot be before To-date"); 
        }
        else if(fdate.compareTo(tdate)==0)
        {
            JOptionPane.showMessageDialog(null, "From date and To-date cannot be equal");
        }
        
        else
        {
        
        String timesheet = "Select * from timesheet where jobid='"+searchj+"' and workingdate between '"+fdate+"' and '"+tdate+"'";
        
        try
        {
            pst= JavaConnect.connectDB().prepareStatement(timesheet);
            rst = pst.executeQuery();  
            while (rst.next())
            {  
            String Sno = rst.getString(1);  
            String date = rst.getString(4);
            String hours = rst.getString(5);
            String payment = rst.getString(6);
            Vector<String> vector = new Vector<String>();    
            vector.add(Sno);  
            vector.add(date);
            vector.add(hours);
            vector.add(payment);
            dm.addRow(vector);     
        }
        }catch (SQLException ex) {
            Logger.getLogger(PaySlip.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        tothours.setText(Double.toString(totalHours()));
        totalpayment.setText(Double.toString(totalPayment()));
                } 
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        File file= new File("C:\\Users\\dilee\\Downloads\\Documents\\Java Project\\Payslip\\Payslip.txt");
        try{
        if(!file.exists())
        {
                file.createNewFile();
        }
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
               
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write("Sno\tWorking date\tHours Payment Received");
                bw.newLine();
                bw.write("_____________________________________________");
                bw.write("                                             ");
                bw.newLine();
                
                //PrintWriter pw= new PrintWriter(fw);
                //pw.print("Sno\tWorking date\tHours Worked\tPayment Received");
                
                for(int i=0; i< jTable1.getRowCount(); i++)
                {
                    for(int j=0; j<jTable1.getColumnCount(); j++)
                    {
                        bw.write((String)jTable1.getModel().getValueAt(i,j)+ "\t");   
                    }
                    bw.newLine();
                    bw.write("_____________________________________________");
                    bw.newLine();
                }
                
                bw.newLine();
                bw.newLine();
                bw.write("Total Hours worked during the Period are " + tothours.getText());
                
                bw.newLine();
                bw.write("Total Payment received is "+ totalpayment.getText());
                
                bw.close();
                fw.close();
                //pw.close();
            
            //bw.write("Sno\tWorking date\tHours Worked\tPayment Received"+"\n");
        JOptionPane.showMessageDialog(null, "Payslip is downloaded");
        
        
        }    catch (IOException ex) {
                Logger.getLogger(PaySlip.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        
        
        
        
        
    }//GEN-LAST:event_jLabel7MouseClicked

    public void setCombo()
    {
        
    }
    
    
    public void setTable()
    {
     dm = new DefaultTableModel(0, 0);  
     String s[] = new String[]{"S.no", "Date", "Hours Worked", "Payment Received"};  
     dm.setColumnIdentifiers(s);  
     jTable1.setModel(dm);
    }

    public void getData()
    {
        PreparedStatement ps;
        ResultSet rs;
        
        String query = "select * from timesheet";
        
        try
        {
            ps= JavaConnect.connectDB().prepareStatement(query);
            rs = ps.executeQuery();  
            while (rs.next())
            {  
            String Sno = rs.getString(1);  
            String date = rs.getString(4);
            String hours = rs.getString(5);
            String payment = rs.getString(6);
            Vector<String> vector = new Vector<String>();    
            vector.add(Sno);  
            vector.add(date);
            vector.add(hours);
            vector.add(payment);
            dm.addRow(vector);     
        }
        }catch (SQLException ex) {
            Logger.getLogger(PaySlip.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    
    public double totalHours()
    {
        double thours=0;
        
        int rowscount = jTable1.getRowCount();
        for(int i=0; i<rowscount; i++)
        {
         thours = thours+ Double.parseDouble(jTable1.getValueAt(i, 2).toString());
        }
        return thours;
    }
    
    public double totalPayment()
    {
        double tpay= 0;
        int rowscount= jTable1.getRowCount();
        for(int i=0; i<rowscount; i++)
        {
            tpay = tpay + Double.parseDouble(jTable1.getValueAt(i, 3).toString());
        }
        return tpay;
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser fromDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> jid;
    private com.toedter.calendar.JDateChooser toDate;
    private javax.swing.JTextField totalpayment;
    private javax.swing.JTextField tothours;
    // End of variables declaration//GEN-END:variables
}

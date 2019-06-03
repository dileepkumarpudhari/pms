
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.ComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
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
public class JobDetails extends javax.swing.JPanel {
GridBagLayout layout = new GridBagLayout();

EditJobDetails jed;
    
    //DefaultComboBoxModel<String> model1 = new DefaultComboBoxModel<>();
    /**
     * Creates new form JobDetails
     */
    public JobDetails() {
        initComponents();
        
        
        jed= new EditJobDetails();
        GridBagConstraints c = new GridBagConstraints();
        c.gridx=0;
        c.gridy=0;
        HomeScreen.DynamicPanel.add(jed,c);
        //this.setVisible(true);
        
        jed.setVisible(false);
        
        ArrayList<String> jobidsearch;
        jobidsearch= selectJob();
        
        selectjob.setModel(new DefaultComboBoxModel(jobidsearch.toArray()));
        
        
        String[] array = new String[jobidsearch.size()];
        for(int i = 0; i < array.length; i++) {
            array[i] = jobidsearch.get(i);
             }
         //selectjob = new JComboBox<>(array); 
         
         //selectjob.setModel(new DefaultComboBoxModel<>(array));
        Vector jobitem = new Vector();
       for(int k=1; k<jobidsearch.size(); k++ ){
          jobitem.add(jobidsearch.get(k)); 
          //selectjob.addItem(jobidsearch.get(k));
        } 
       DefaultComboBoxModel model = new DefaultComboBoxModel(jobitem);
       model.addElement(jobidsearch);
    }

   
    /*public ArrayList<String> arrayJobList()
    {
        PreparedStatement ps;
        ResultSet rs;
        
        String uname;
        uname = HomeScreen.user;
        
        ArrayList<String> jobidlist = new ArrayList<String>();
                
        String query = "select * from jobdetails where uid='"+uname+"' ";
        
        try{
        //selectjob.setModel(model1);
        //model1.removeAllElements();
        ps= JavaConnect.connectDB().prepareStatement(query);
        rs=ps.executeQuery();
        while(rs.next())
        {
           //model.addElement(rs.getString(1));
           jobidlist.add(rs.getString("jobid"));
           
        }
        
        
        
        
        
           for (String jobidlist1 : jobidlist) {
                System.out.println(jobidlist1);
            } 
        
        } catch (SQLException ex) {
            Logger.getLogger(JobDetails.class.getName()).log(Level.SEVERE, null, ex);
        }   
        return jobidlist;
        
        
        
    } */

    /**
     *
     * @return
     */

    
    
    public static ArrayList<String> selectJob()
    {
        
        //DefaultComboBoxModel model= new DefaultComboBoxModel();
        
        PreparedStatement pst;
        ResultSet rst;
        
        String uname;
        uname = HomeScreen.user;
        
        ArrayList<String> jobidlist = new ArrayList<>();
        
                      
        String query = "select * from jobdetails where uid='"+uname+"' ";
        //selectjob.setModel(model);
        //DefaultComboBoxModel model;
        //model = new DefaultComboBoxModel(jobidlist.toArray());
        
        try{
            
        //selectjob.setModel(model);
        //selectjob.setModel(new DefaultComboBoxModel(jobidlist.toArray()));
        //model.removeAllElements();
        
        pst= JavaConnect.connectDB().prepareStatement(query);
        rst=pst.executeQuery();
        while(rst.next())
        {
           //model.addElement(rs.getString(1));
           jobidlist.add(rst.getString("jobid"));
           /*for(int i=0; i<jobidlist.size(); i++){
           //selectjob.addItem((String) jobidlist.get(i));
           //} */
            //Vector<String> vector = new Vector<String>();    
           // vector.add(rs.getString("jobid"));
            //model.addRow(vector);
             //System.out.println("before adding"+ rs.getString("jobid"));
             //model.addElement(rs.getString("jobid"));
             //System.out.println("after adding"+ rs.getString("jobid"));
            //model.addElement(rs.getString("jobid"));
             //selectjob.setModel(model);
            
        }
        
            //DefaultComboBoxModel model= new DefaultComboBoxModel();
            //DefaultComboBoxModel dlm = new DefaultComboBoxModel();
            //selectjob.setModel(model);
            //model.removeAllElements();
            jobidlist.forEach((jobidlist1) -> {
                System.out.println(jobidlist1);
            }); 
           //dlm.removeAllElements();
           //selectjob.setModel(new DefaultComboBoxModel(jobidlist.toArray()));
        for(int i=0; i<jobidlist.size(); i++)
        {
            //String S = Integer.parseInt(jobidlist.get(i));
            //selectjob.Items.AddRange(jobidlist.toArray());
            //(using) model.addElement(jobidlist.get(i));
            //selectjob.addItem(jobidlist.get(i));
            //model.addElement(rs.getString("jobid"));
            //(using) selectjob.setModel(model);
            //System.out.println(jobidlist.get(i));
            //dlm.addElement(jobidlist.get(i));
            //selectjob.addItem(jobidlist.get(i));
            //System.out.println(i+ " is added");
        }
           
       // selectjob.setModel(new DefaultComboBoxModel(jobidlist.toArray()));
        //selectjob.setModel(model);
           
        } catch (SQLException ex) {
            Logger.getLogger(JobDetails.class.getName()).log(Level.SEVERE, null, ex);
        }           
        return jobidlist;
    }
    
    
    public void search()
    {
        PreparedStatement ps;
        ResultSet rs;
        
        
      
        
        String searchj= selectjob.getSelectedItem().toString();
        int sea = Integer.parseInt(searchj);
        String query = "Select * from jobdetails where jobid ="+sea;
     
        
        
       try{
        ps= JavaConnect.connectDB().prepareStatement(query);
        rs=ps.executeQuery();
        if(rs.next())
        {
            OrganisationName.setText(rs.getString(6));
            jobDescription.setText(rs.getString(3));
            Designationbox.setText(rs.getString(4));
            Payrate.setText(rs.getString(5));
            rs.close();
            ps.close();
            
        }

       }
        catch (Exception e)
                {
                JOptionPane.showMessageDialog(null,e);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        selectjob = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        SearchJob = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        OrganisationName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jobDescription = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Designationbox = new javax.swing.JTextField();
        Payrate = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        EditJobDetails = new javax.swing.JLabel();

        setBackground(new java.awt.Color(36, 47, 65));
        setPreferredSize(new java.awt.Dimension(1236, 589));

        jLabel2.setBackground(new java.awt.Color(36, 47, 65));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Job Details :");

        jLabel3.setBackground(new java.awt.Color(36, 47, 65));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Select Job :");

        selectjob.setBackground(new java.awt.Color(36, 47, 65));
        selectjob.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        selectjob.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                selectjobMouseEntered(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        SearchJob.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        SearchJob.setForeground(new java.awt.Color(255, 255, 255));
        SearchJob.setText("    Search");
        SearchJob.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchJobMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SearchJob, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SearchJob, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Organisation Name :");

        OrganisationName.setEditable(false);
        OrganisationName.setBackground(new java.awt.Color(36, 47, 65));
        OrganisationName.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        OrganisationName.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Job Description :");

        jobDescription.setEditable(false);
        jobDescription.setBackground(new java.awt.Color(36, 47, 65));
        jobDescription.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jobDescription.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Designation :");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Pay Rate :");

        Designationbox.setEditable(false);
        Designationbox.setBackground(new java.awt.Color(36, 47, 65));
        Designationbox.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Designationbox.setForeground(new java.awt.Color(255, 255, 255));

        Payrate.setBackground(new java.awt.Color(36, 47, 65));
        Payrate.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Payrate.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(102, 204, 0));

        EditJobDetails.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        EditJobDetails.setForeground(new java.awt.Color(255, 255, 255));
        EditJobDetails.setText("   Edit Job Details");
        EditJobDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditJobDetailsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EditJobDetails, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EditJobDetails, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(OrganisationName)
                        .addComponent(jobDescription)
                        .addComponent(Designationbox)
                        .addComponent(Payrate, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(selectjob, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(370, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(selectjob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(120, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(OrganisationName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jobDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Designationbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Payrate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(160, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SearchJobMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchJobMouseClicked
        search();
    }//GEN-LAST:event_SearchJobMouseClicked

    private void selectjobMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectjobMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_selectjobMouseEntered

    private void EditJobDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditJobDetailsMouseClicked
        jed.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_EditJobDetailsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Designationbox;
    private javax.swing.JLabel EditJobDetails;
    private javax.swing.JTextField OrganisationName;
    private javax.swing.JTextField Payrate;
    private javax.swing.JLabel SearchJob;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jobDescription;
    private javax.swing.JComboBox<String> selectjob;
    // End of variables declaration//GEN-END:variables
}

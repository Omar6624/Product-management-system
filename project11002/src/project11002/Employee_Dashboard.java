/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project11002;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class Employee_Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Employee_Dashboard
     */
    public Employee_Dashboard() {
        initComponents();
         connect();
         try {
            

            Statement statement = con.createStatement();
            String query = "select * from dbo.employee1";

            ResultSet rs = statement.executeQuery(query);
            ResultSetMetaData RS = rs.getMetaData();

            int counter = RS.getColumnCount();
            DefaultTableModel table1 = (DefaultTableModel)jTable2.getModel();
            table1.setRowCount(0);
            while(rs.next()){
                Vector v1 = new Vector();
                for(int i=1;i<=counter;i++){
                    v1.add(rs.getString("emp_id"));
                    v1.add(rs.getString("emp_name"));
                    v1.add(rs.getString("emp_age"));
                    v1.add(rs.getString("emp_phone"));
                    v1.add(rs.getString("emp_address"));
                    v1.add(rs.getString("emp_salary"));
                    v1.add(rs.getString("emp_position"));
                    v1.add(rs.getString("emp_join_date"));
                    v1.add(rs.getString("emp_reg_date"));
                    v1.add(rs.getString("status"));
                    v1.add(rs.getString("bran_id"));

                }
                table1.addRow(v1);

            }
        } catch (SQLException ex) {
           Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
    Connection con; 
  
     public void connect()
    {
        String connection = "jdbc:sqlserver://localhost:1433; databaseName=Project1799 ;user=sa;password=123456"  ;
        try {
            con=DriverManager.getConnection(connection);
        } catch (SQLException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public void del()
     {
      Ad5.setText("");
        Ad6.setText("");
        Ad7.setText("");
        Ad8.setText("");
        Ad9.setText("");
        Ad12.setText("");
        Ad13.setText("");
        Ad11.setText("");
        Ad15.setText("");
        q1.setText("");
        q2.setText("");   
     }
     
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        Ad5 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Ad6 = new javax.swing.JTextField();
        Ad7 = new javax.swing.JTextField();
        Ad8 = new javax.swing.JTextField();
        Ad9 = new javax.swing.JTextField();
        add1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        Ad11 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        Ad12 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        Ad13 = new javax.swing.JTextField();
        Ad15 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        q1 = new javax.swing.JTextField();
        q2 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 900));

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("Employee ID            :");

        Ad5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ad5ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setText("Name                        :");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setText("Age                            :");

        jLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13.setText("Phone                       :");

        jLabel14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel14.setText("Address                    :");

        Ad7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ad7ActionPerformed(evt);
            }
        });

        add1.setBackground(new java.awt.Color(102, 255, 102));
        add1.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        add1.setForeground(new java.awt.Color(153, 0, 51));
        add1.setText("ADD");
        add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add1ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(102, 255, 102));
        jButton4.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(153, 0, 51));
        jButton4.setText("DELETE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(102, 255, 102));
        jButton10.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jButton10.setForeground(new java.awt.Color(153, 0, 51));
        jButton10.setText("UPDATE");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        Ad11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ad11ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel17.setText("Salary                             :");

        Ad12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ad12ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel18.setText("Position                         :");

        jLabel19.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel19.setText("Joining Date                 :");

        jLabel20.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel20.setText("Res Date                      :");

        jLabel21.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel21.setText("Status                            :");

        Ad13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ad13ActionPerformed(evt);
            }
        });

        Ad15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ad15ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel22.setText("bran_id                          :");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Emp_id", "Name", "Age", "Phone", "Address", "Salary", "Position", "Join Date", "Expire Date", "Status", "bran_id"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jButton5.setBackground(new java.awt.Color(102, 255, 102));
        jButton5.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(153, 0, 51));
        jButton5.setText("BACK");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Imprint MT Shadow", 1, 48)); // NOI18N
        jLabel1.setText("Employee Dashboard");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1001, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(168, 168, 168))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Ad8, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(Ad7)
                            .addComponent(Ad6)
                            .addComponent(Ad5)
                            .addComponent(Ad9))
                        .addGap(18, 18, 18)))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ad13, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ad12, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ad11, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ad15, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(128, 128, 128))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(add1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(204, 204, 204))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(221, 221, 221))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ad5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ad12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ad13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ad6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ad7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ad8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ad11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ad9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ad15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Ad5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ad5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ad5ActionPerformed

    private void Ad7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ad7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ad7ActionPerformed

    private void add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add1ActionPerformed
            String emp_id = Ad5.getText();
        String emp_name= Ad6.getText();
        int emp_age = Integer.parseInt(Ad7.getText());
        int emp_phone = Integer.parseInt(Ad8.getText());
        String emp_address= Ad9.getText();
        String emp_salary = Ad12.getText();
        String emp_position = Ad13.getText();
        String emp_join_date = q1.getText();
        String emp_reg_date = q2.getText();
        String emp_status= Ad11.getText();
        String bran_id = Ad15.getText();
       
       try {
            PreparedStatement pst = con.prepareStatement("insert into dbo.employee1 (emp_id,emp_name,emp_age,emp_phone,emp_address,emp_salary,emp_position,emp_join_date,emp_reg_date,status,bran_id) values(?,?,?,?,?,?,?,?,?,?,?) ");
            pst.setString(1,emp_id);
            pst.setString(2,emp_name);
            pst.setInt(3,emp_age);
            pst.setInt(4,emp_phone);
            pst.setString(5,emp_address);
            pst.setString(6,emp_salary);
            pst.setString(7,emp_position);
            pst.setString(8,emp_join_date);
            pst.setString(9,emp_reg_date);
            pst.setString(10, emp_status);
            pst.setString(11, bran_id);
            
           
            
            int check = pst.executeUpdate();
            
            if(check==1)
            {
                JOptionPane.showMessageDialog(this,"Entry Successful");
                del();
            }else
            {
                JOptionPane.showMessageDialog(this,"Entry Failed");
                
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(Branch_Manager.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        try {

            Statement statement = con.createStatement();
            String query = "select * from employee1";

            ResultSet rs = statement.executeQuery(query);
            ResultSetMetaData RS = rs.getMetaData();

            int counter = RS.getColumnCount();
            DefaultTableModel table1 = (DefaultTableModel)jTable2.getModel();
            table1.setRowCount(0);
            while(rs.next()){
                Vector v1 = new Vector();
                for(int i=1;i<=counter;i++){
                    v1.add(rs.getString("emp_id"));
                    v1.add(rs.getString("emp_name"));
                    v1.add(rs.getString("emp_age"));
                    v1.add(rs.getString("emp_phone"));
                    v1.add(rs.getString("emp_address"));
                    v1.add(rs.getString("emp_salary"));
                    v1.add(rs.getString("emp_position"));
                    v1.add(rs.getString("emp_join_date"));
                    v1.add(rs.getString("emp_reg_date"));
                    v1.add(rs.getString("status"));
                    v1.add(rs.getString("bran_id"));

                }
                table1.addRow(v1);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);

        }


    }//GEN-LAST:event_add1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       DefaultTableModel df = (DefaultTableModel)jTable2.getModel();
        int si = jTable2.getSelectedRow();
        
       
        
        
        
        try {
            
            String emp_id = Ad5.getText();
            
            int dr = JOptionPane.showConfirmDialog(null, "Do You Want to Delete","Warning",JOptionPane.YES_NO_OPTION);
            
            
            if(dr == JOptionPane.YES_OPTION)
            {
                PreparedStatement pst = con.prepareStatement("delete from employee1  where emp_id=? ");
            pst.setString(1,emp_id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"delete Successful");
            del();
                
            }
                
                
           
        } catch (SQLException ex) {
            Logger.getLogger(Branch_Manager.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"delete failed");
        }
        try {

            Statement statement = con.createStatement();
            String query = "select * from employee1";

            ResultSet rs = statement.executeQuery(query);
            ResultSetMetaData RS = rs.getMetaData();

            int counter = RS.getColumnCount();
            DefaultTableModel table1 = (DefaultTableModel)jTable2.getModel();
            table1.setRowCount(0);
            while(rs.next()){
                Vector v1 = new Vector();
                for(int i=1;i<=counter;i++){
                    v1.add(rs.getString("emp_id"));
                    v1.add(rs.getString("emp_name"));
                    v1.add(rs.getString("emp_age"));
                    v1.add(rs.getString("emp_phone"));
                    v1.add(rs.getString("emp_address"));
                    v1.add(rs.getString("emp_salary"));
                    v1.add(rs.getString("emp_position"));
                    v1.add(rs.getString("emp_join_date"));
                    v1.add(rs.getString("emp_reg_date"));
                    v1.add(rs.getString("status"));
                    v1.add(rs.getString("bran_id"));

                }
                table1.addRow(v1);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
      DefaultTableModel df = (DefaultTableModel)jTable2.getModel();
        int si = jTable2.getSelectedRow();
        
        String emp_id = Ad5.getText();
        String emp_name= Ad6.getText();
        int emp_age = Integer.parseInt(Ad7.getText());
        int emp_phone = Integer.parseInt(Ad8.getText());
        String emp_address= Ad9.getText();
        String emp_salary = Ad12.getText();
        String emp_position = Ad13.getText();
        String emp_join_date = q1.getText();
        String emp_reg_date = q2.getText();
        String emp_status= Ad11.getText();
        String bran_id = Ad15.getText();
       
       
     
        try {
            PreparedStatement pst = con.prepareStatement("update employee1 set emp_name=?,emp_age=?,emp_phone=?,emp_address=?,emp_salary=?,emp_position=?,emp_join_date=?,emp_reg_date=?,status=?,bran_id=? where emp_id=? ");
            pst.setString(11,emp_id);
            pst.setString(1,emp_name);
            pst.setInt(2,emp_age);
            pst.setInt(3,emp_phone);
            pst.setString(4,emp_address);
            pst.setString(5,emp_salary);
            pst.setString(6,emp_position);
            pst.setString(7,emp_join_date);
            pst.setString(8,emp_reg_date);
            pst.setString(9,emp_status);
            pst.setString(10,bran_id);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"update Successful");
            del();

        } catch (SQLException ex) {
            Logger.getLogger(Sell_report.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"update failed");
        }
       try {

            Statement statement = con.createStatement();
            String query = "select * from employee1";

            ResultSet rs = statement.executeQuery(query);
            ResultSetMetaData RS = rs.getMetaData();

            int counter = RS.getColumnCount();
            DefaultTableModel table1 = (DefaultTableModel)jTable2.getModel();
            table1.setRowCount(0);
            while(rs.next()){
                Vector v1 = new Vector();
                for(int i=1;i<=counter;i++){
                    v1.add(rs.getString("emp_id"));
                    v1.add(rs.getString("emp_name"));
                    v1.add(rs.getString("emp_age"));
                    v1.add(rs.getString("emp_phone"));
                    v1.add(rs.getString("emp_address"));
                    v1.add(rs.getString("emp_salary"));
                    v1.add(rs.getString("emp_position"));
                    v1.add(rs.getString("emp_join_date"));
                    v1.add(rs.getString("emp_reg_date"));
                    v1.add(rs.getString("status"));
                    v1.add(rs.getString("bran_id"));

                }
                table1.addRow(v1);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);

        }

    }//GEN-LAST:event_jButton10ActionPerformed

    private void Ad11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ad11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ad11ActionPerformed

    private void Ad12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ad12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ad12ActionPerformed

    private void Ad13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ad13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ad13ActionPerformed

    private void Ad15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ad15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ad15ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         new Employee().setVisible(true);
         dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Employee_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee_Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Ad11;
    private javax.swing.JTextField Ad12;
    private javax.swing.JTextField Ad13;
    private javax.swing.JTextField Ad15;
    private javax.swing.JTextField Ad5;
    private javax.swing.JTextField Ad6;
    private javax.swing.JTextField Ad7;
    private javax.swing.JTextField Ad8;
    private javax.swing.JTextField Ad9;
    private javax.swing.JButton add1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField q1;
    private javax.swing.JTextField q2;
    // End of variables declaration//GEN-END:variables
}

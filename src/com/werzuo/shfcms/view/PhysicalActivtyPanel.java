/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.view;

import com.werzuo.shfcms.controller.QuestionController;
import com.werzuo.shfcms.controllerfactoryimpl.ControllerFactoryImpl;
import com.werzuo.shfcms.model.Member;
import com.werzuo.shfcms.model.OtherMeasurement;
import com.werzuo.shfcms.model.PhysicalDetails;
import com.werzuo.shfcms.model.Questions;
import com.werzuo.shfcms.model.RegDetails;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ravindu
 */
public class PhysicalActivtyPanel extends javax.swing.JPanel {

    private RegDetails regDetails;
    private Member member;
    private OtherMeasurement otherMeasurement;
    private DefaultTableModel dtm;
    private HomeFrame homeFrame;

    /**
     * Creates new form PhysicalActivtyPanel
     */
    public PhysicalActivtyPanel() {
        initComponents();
        dtm = (DefaultTableModel) tblQuestions.getModel();
    }

    public PhysicalActivtyPanel(HomeFrame homeFrame, Member member, RegDetails regDetails,
            OtherMeasurement otherMeasurement) {
        initComponents();
        this.homeFrame = homeFrame;
        this.regDetails = regDetails;
        this.member = member;
        this.otherMeasurement = otherMeasurement;
        setUpUI();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtMID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblQuestions = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(null);

        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton6.setText("Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6);
        jButton6.setBounds(630, 510, 120, 40);

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton5.setText("Resgister");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5);
        jButton5.setBounds(780, 500, 120, 50);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("MemberShip NO");
        add(jLabel5);
        jLabel5.setBounds(600, 90, 120, 30);

        txtMID.setBackground(new java.awt.Color(0, 0, 0));
        txtMID.setOpaque(false);
        txtMID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMIDActionPerformed(evt);
            }
        });
        add(txtMID);
        txtMID.setBounds(730, 90, 170, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name");
        add(jLabel4);
        jLabel4.setBounds(80, 90, 80, 30);

        txtName.setBackground(new java.awt.Color(0, 0, 0));
        txtName.setOpaque(false);
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        add(txtName);
        txtName.setBounds(170, 90, 170, 30);

        tblQuestions.setBackground(new Color(52,52,52));
        tblQuestions.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tblQuestions.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null}
            },
            new String [] {
                "Question No", "Question", "Yes", "No"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblQuestions.setOpaque(false);
        tblQuestions.setRowHeight(25);
        tblQuestions.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblQuestions);
        if (tblQuestions.getColumnModel().getColumnCount() > 0) {
            tblQuestions.getColumnModel().getColumn(1).setMinWidth(40);
            tblQuestions.getColumnModel().getColumn(2).setMinWidth(40);
            tblQuestions.getColumnModel().getColumn(2).setPreferredWidth(40);
            tblQuestions.getColumnModel().getColumn(2).setMaxWidth(40);
            tblQuestions.getColumnModel().getColumn(3).setMinWidth(40);
            tblQuestions.getColumnModel().getColumn(3).setPreferredWidth(40);
            tblQuestions.getColumnModel().getColumn(3).setMaxWidth(40);
        }

        add(jScrollPane1);
        jScrollPane1.setBounds(80, 150, 820, 330);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/werzuo/shfcms/images/panelBody.PNG"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 970, 570);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/werzuo/shfcms/images/Untitled-1.png"))); // NOI18N
        jLabel2.setText("dasdasdasdsadsdsadsa");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(43, 227, 117), 2));
        add(jLabel2);
        jLabel2.setBounds(0, 0, 970, 570);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtMIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMIDActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        PhysicalDetails physicalDetails = createPhysicalDetailsModel();
        PaymentPanel p = new PaymentPanel(homeFrame, member, regDetails, otherMeasurement, physicalDetails);
        homeFrame.panelBody.removeAll();
        p.setSize(homeFrame.panelBody.getSize());
        homeFrame.panelBody.add(p);
        homeFrame.panelBody.revalidate();
        homeFrame.panelBody.repaint();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblQuestions;
    private javax.swing.JTextField txtMID;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

    /**
     * set up the UI
     */
    private void setUpUI() {
        try {
            dtm = (DefaultTableModel) tblQuestions.getModel();
            txtName.setText(member.getfName() + " " + member.getlName());
            txtMID.setText(member.getCid());
            getQuestionList();
        } catch (SQLException ex) {
            Logger.getLogger(PhysicalActivtyPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PhysicalActivtyPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * load the questions from the database to the table
     */
    private void getQuestionList() throws SQLException, ClassNotFoundException {
        QuestionController questionController = new ControllerFactoryImpl().getQuestionController();
        ArrayList<Questions> allQuestion = questionController.getAllQuestion();
        dtm.setRowCount(0);
        for (Questions questions : allQuestion) {
            if (questions != null) {
                Object[] row = {questions.getQid(), questions.getQuestions()};
                dtm.addRow(row);
            }
        }
    }

    /**
     * create the physical details model
     *
     * @return PhysicalDetails
     */
    private PhysicalDetails createPhysicalDetailsModel() {
        String mid = txtMID.getText();
        ArrayList<String> questionList = new ArrayList<>();

        for (int i = 0; i < dtm.getRowCount(); i++) {
            Object val1 = dtm.getValueAt(i, 2);
            Object val2 = dtm.getValueAt(i, 3);
            boolean bol1 = false;
            boolean bol2 = false;
            if (val1 != null) {
                bol1 = (boolean) val1;
            }
            if (val2 != null) {
                bol2 = (boolean) val2;
            }

            if (bol1) {
                String qid = String.valueOf(dtm.getValueAt(i, 0));
                questionList.add(qid);
            }
            if (bol2) {
                String qid = String.valueOf(dtm.getValueAt(i, 0));
                questionList.add(qid);
            }
        }
        PhysicalDetails physicalDetails = new PhysicalDetails(mid, questionList);

        return physicalDetails;
    }
}
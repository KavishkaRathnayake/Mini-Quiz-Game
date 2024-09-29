
import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Kavishka
 */
public class GK02 extends javax.swing.JFrame {

    int quizanswered = 0;
    int marks = 0;
    /**
     * Creates new form q2
     */
    //change comstructor to pass values
    public GK02(int questionAnswered , int marks) {
        initComponents();
        this.quizanswered = questionAnswered;
        this.marks = marks;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        s1 = new javax.swing.JRadioButton();
        s2 = new javax.swing.JRadioButton();
        s3 = new javax.swing.JRadioButton();
        s4 = new javax.swing.JRadioButton();
        G2 = new javax.swing.JButton();
        btnCheckAnswer = new javax.swing.JButton();
        AnswerStatus = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("    What is the full form of PDF?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 940, -1));

        buttonGroup1.add(s1);
        s1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        s1.setForeground(new java.awt.Color(255, 255, 255));
        s1.setText("Printed Document Format");
        s1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 590, 30));

        buttonGroup1.add(s2);
        s2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        s2.setForeground(new java.awt.Color(255, 255, 255));
        s2.setText("Public Document Format");
        getContentPane().add(s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 590, -1));

        buttonGroup1.add(s3);
        s3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        s3.setForeground(new java.awt.Color(255, 255, 255));
        s3.setText("Portable Document Format  ");
        getContentPane().add(s3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 590, -1));

        buttonGroup1.add(s4);
        s4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        s4.setForeground(new java.awt.Color(255, 255, 255));
        s4.setText("Published Document Format");
        s4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s4ActionPerformed(evt);
            }
        });
        getContentPane().add(s4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 590, -1));

        G2.setBackground(new java.awt.Color(102, 102, 102));
        G2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        G2.setForeground(new java.awt.Color(255, 255, 255));
        G2.setText("Next >");
        G2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G2ActionPerformed(evt);
            }
        });
        getContentPane().add(G2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 500, 90, 30));

        btnCheckAnswer.setBackground(new java.awt.Color(0, 214, 51));
        btnCheckAnswer.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        btnCheckAnswer.setForeground(new java.awt.Color(255, 255, 255));
        btnCheckAnswer.setText("SUBMIT ANSWER");
        btnCheckAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckAnswerActionPerformed(evt);
            }
        });
        getContentPane().add(btnCheckAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 280, 40));

        AnswerStatus.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        AnswerStatus.setForeground(javax.swing.UIManager.getDefaults().getColor("CheckBox.disabledText"));
        AnswerStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AnswerStatus.setText("Answer Status");
        getContentPane().add(AnswerStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 940, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kavishka\\Downloads\\Yellow Black Minimalist Fun Quiz Session Facebook Post (5).png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 790));

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 560, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void s4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s4ActionPerformed

    private void G2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G2ActionPerformed
       //prevent go to next question without selecting an answer
       if(!s1.isSelected()&& !s2.isSelected() && !s3.isSelected() && !s4.isSelected()) {
            JOptionPane.showMessageDialog(null, "Please select an answer");
            }
        else{
        //Check correct answer
        if(s3.isSelected()){
            //assign 5 marks to marks variable
            marks = marks + 5;
          }
        //Assign question answered
        quizanswered = quizanswered + 1;
        //call for the next question window with passing values 
        new GK03(quizanswered , marks).setVisible(true);
        this.dispose();     
        
        }
    }//GEN-LAST:event_G2ActionPerformed

    private void btnCheckAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckAnswerActionPerformed
        // check the user selected option, otherwise show an error message.
        if(!s1.isSelected()&& !s2.isSelected() && !s3.isSelected() && !s4.isSelected()) {
            JOptionPane.showMessageDialog(null, "Please select an answer");
            }
        else {
            //what happen when user select correct answer
            if (s3.isSelected()){
                AnswerStatus.setText("Correct Answer");
                AnswerStatus.setForeground(Color.green);
            }
            else{
                AnswerStatus.setText("Incorrect, Answer is Portable Document Format");
                AnswerStatus.setForeground(Color.red);
            
            }
            //code to lock the all radio buttons when submit check answer button
            s1.setEnabled(false);
            s2.setEnabled(false);
            s3.setEnabled(false);
            s4.setEnabled(false);
            
        }
    }//GEN-LAST:event_btnCheckAnswerActionPerformed

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
            java.util.logging.Logger.getLogger(GK02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GK02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GK02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GK02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GK02(0,0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AnswerStatus;
    private javax.swing.JButton G2;
    private javax.swing.JButton btnCheckAnswer;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton s1;
    private javax.swing.JRadioButton s2;
    private javax.swing.JRadioButton s3;
    private javax.swing.JRadioButton s4;
    // End of variables declaration//GEN-END:variables
}

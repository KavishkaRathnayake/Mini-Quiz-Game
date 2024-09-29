
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
public class GK04 extends javax.swing.JFrame {
    int quizanswered = 0;
    int marks = 0;
    /**
     * Creates new form GK04
     */
    public GK04(int questionAnswered , int marks) {
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
        jLabel2 = new javax.swing.JLabel();
        s1 = new javax.swing.JRadioButton();
        s2 = new javax.swing.JRadioButton();
        s3 = new javax.swing.JRadioButton();
        s4 = new javax.swing.JRadioButton();
        G4 = new javax.swing.JButton();
        btnCheckAnswer = new javax.swing.JButton();
        Status = new javax.swing.JLabel();
        AnswerStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("General Knowledge");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Who is the founder of Bluetooth?");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 940, -1));

        buttonGroup1.add(s1);
        s1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        s1.setForeground(new java.awt.Color(255, 255, 255));
        s1.setText("Ericsson");
        s1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1ActionPerformed(evt);
            }
        });
        getContentPane().add(s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 150, -1));

        buttonGroup1.add(s2);
        s2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        s2.setForeground(new java.awt.Color(255, 255, 255));
        s2.setText("IBM");
        getContentPane().add(s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, -1, -1));

        buttonGroup1.add(s3);
        s3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        s3.setForeground(new java.awt.Color(255, 255, 255));
        s3.setText("Apple");
        getContentPane().add(s3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, -1, -1));

        buttonGroup1.add(s4);
        s4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        s4.setForeground(new java.awt.Color(255, 255, 255));
        s4.setText("Dell");
        getContentPane().add(s4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, -1, -1));

        G4.setBackground(new java.awt.Color(102, 102, 102));
        G4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        G4.setForeground(new java.awt.Color(255, 255, 255));
        G4.setText("Next >");
        G4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G4ActionPerformed(evt);
            }
        });
        getContentPane().add(G4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 500, 90, 30));

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

        Status.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Status.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledText"));
        Status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Status.setText("Answer Status");
        getContentPane().add(Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 940, -1));

        AnswerStatus.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kavishka\\Downloads\\Yellow Black Minimalist Fun Quiz Session Facebook Post (5).png")); // NOI18N
        getContentPane().add(AnswerStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 790));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void s1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s1ActionPerformed

    private void G4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G4ActionPerformed
        //prevent go to next question without selecting an answer
       if(!s1.isSelected()&& !s2.isSelected() && !s3.isSelected() && !s4.isSelected()) {
            JOptionPane.showMessageDialog(null, "Please select an answer");
            }
        else{
        //Check correct answer
        if(s1.isSelected()){
            //assign 5 marks to marks variable
            marks = marks + 5;
          }
        //Assign question answered
        quizanswered = quizanswered + 1;
        //call for the next question window with passing values 
        new GK05(quizanswered , marks).setVisible(true);
        this.dispose();     
        
        }
    }//GEN-LAST:event_G4ActionPerformed

    private void btnCheckAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckAnswerActionPerformed
      // check the user selected option, otherwise show an error message.
       if(!s1.isSelected()&& !s2.isSelected() && !s3.isSelected() && !s4.isSelected()) {
            JOptionPane.showMessageDialog(null, "Please select an answer");
            }
        else {
            //what happen when user select correct answer
            if (s1.isSelected()){
                Status.setText("Correct Answer");
                Status.setForeground(Color.green);
            }
            else{
               Status.setText("Incorrect, Answer is Ericsson");
               Status.setForeground(Color.red);
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
            java.util.logging.Logger.getLogger(GK04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GK04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GK04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GK04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GK04(0,0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AnswerStatus;
    private javax.swing.JButton G4;
    private javax.swing.JLabel Status;
    private javax.swing.JButton btnCheckAnswer;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton s1;
    private javax.swing.JRadioButton s2;
    private javax.swing.JRadioButton s3;
    private javax.swing.JRadioButton s4;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculator;

/**
 *
 * @author Asus
 */
public class MyCalculator extends javax.swing.JFrame {
  int choice = 0; 
    /**
     * Creates new form MyCalculator
     */
    public MyCalculator() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButtonMinus = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButtonplus = new javax.swing.JButton();
        jButton00 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButtonDot = new javax.swing.JButton();
        jButtonEquals = new javax.swing.JButton();
        jButtonAC = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonMod = new javax.swing.JButton();
        jButtonDiv = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButtonMultiply = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 350, 70));

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 80, 70));

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 80, 70));

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 80, 70));

        jButtonMinus.setBackground(new java.awt.Color(0, 0, 0));
        jButtonMinus.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButtonMinus.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMinus.setText("-");
        jButtonMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMinusActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 80, 70));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 80, 70));

        jButton0.setBackground(new java.awt.Color(0, 0, 0));
        jButton0.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton0.setForeground(new java.awt.Color(255, 255, 255));
        jButton0.setText("0");
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton0, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 80, 70));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 80, 70));

        jButtonplus.setBackground(new java.awt.Color(0, 0, 0));
        jButtonplus.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButtonplus.setForeground(new java.awt.Color(255, 255, 255));
        jButtonplus.setText("+");
        jButtonplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonplusActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonplus, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 80, 70));

        jButton00.setBackground(new java.awt.Color(0, 0, 0));
        jButton00.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton00.setForeground(new java.awt.Color(255, 255, 255));
        jButton00.setText("00");
        jButton00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton00ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton00, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 80, 70));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 80, 70));

        jButtonDot.setBackground(new java.awt.Color(0, 0, 0));
        jButtonDot.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButtonDot.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDot.setText(".");
        jButtonDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDotActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDot, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 80, 70));

        jButtonEquals.setBackground(new java.awt.Color(255, 153, 0));
        jButtonEquals.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButtonEquals.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEquals.setText("=");
        jButtonEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEqualsActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEquals, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 80, 70));

        jButtonAC.setBackground(new java.awt.Color(0, 0, 0));
        jButtonAC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButtonAC.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAC.setText("AC");
        jButtonAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonACActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 80, 70));

        jButtonDelete.setBackground(new java.awt.Color(0, 0, 0));
        jButtonDelete.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButtonDelete.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDelete.setText("DEL");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 80, 70));

        jButtonMod.setBackground(new java.awt.Color(0, 0, 0));
        jButtonMod.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButtonMod.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMod.setText("%");
        jButtonMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 80, 70));

        jButtonDiv.setBackground(new java.awt.Color(0, 0, 0));
        jButtonDiv.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButtonDiv.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDiv.setText("÷");
        jButtonDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 80, 70));

        jButton7.setBackground(new java.awt.Color(0, 0, 0));
        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 80, 70));

        jButton8.setBackground(new java.awt.Color(0, 0, 0));
        jButton8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 80, 70));

        jButton9.setBackground(new java.awt.Color(0, 0, 0));
        jButton9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 80, 70));

        jButtonMultiply.setBackground(new java.awt.Color(0, 0, 0));
        jButtonMultiply.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButtonMultiply.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMultiply.setText("×");
        jButtonMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplyActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMultiply, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 80, 70));

        jTextField2.setBackground(new java.awt.Color(0, 0, 0));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setText("Made by Shubhangi");
        jTextField2.setAlignmentX(10.0F);
        jTextField2.setAlignmentY(10.0F);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 140, 30));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+ "5");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+ "4");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+ "6");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButtonMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinusActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+ " - ");
        choice = 1; 
    }//GEN-LAST:event_jButtonMinusActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+ "1");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+ "0");
    }//GEN-LAST:event_jButton0ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+ "3");
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonplusActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+ " + ");
        choice = 2; 
    }//GEN-LAST:event_jButtonplusActionPerformed

    private void jButton00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton00ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+ "00");
    }//GEN-LAST:event_jButton00ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+ "2");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDotActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+ ".");
    }//GEN-LAST:event_jButtonDotActionPerformed

    private void jButtonEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEqualsActionPerformed
        // TODO add your handling code here:
        //jTextField1.setText(jTextField1.getText()+ " = ");
        
        float ans = 0 ; 
        String str = jTextField1.getText();
        String[] substr = str.split(" ");
        
        float number1 = Float.parseFloat(substr[0]);
        float number2 = Float.parseFloat(substr[2]);
        
        if (choice == 1){
            ans = (number1-number2);
            jTextField1.setText(jTextField1.getText()+ " " + (number1-number2));
        }
        
        else if (choice == 2){
            ans = (number1+number2);
            jTextField1.setText(jTextField1.getText()+ " " + (number1+number2));
        }
        
        else if (choice == 3){
            ans = (number1%number2);
            jTextField1.setText(jTextField1.getText()+ " " + (number1%number2));
        }
        
        else if (choice == 4){
            ans = (number1/number2);
            jTextField1.setText(jTextField1.getText()+ " " + (number1/number2));
        }
        
        else if (choice == 5){
            ans = (number1*number2);
            jTextField1.setText(jTextField1.getText()+ " " + (number1*number2));
        }
        
        jTextField1.setText("" + ans);
    }//GEN-LAST:event_jButtonEqualsActionPerformed

    private void jButtonACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonACActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        choice = 0;
    }//GEN-LAST:event_jButtonACActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+ " % ");
        choice = 3 ; 
    }//GEN-LAST:event_jButtonModActionPerformed

    private void jButtonDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+ " ÷ ");
        choice = 4;
    }//GEN-LAST:event_jButtonDivActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+ "7");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+ "8");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+ "9");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButtonMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiplyActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+ " × ");
        choice = 5; 
    }//GEN-LAST:event_jButtonMultiplyActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
            java.util.logging.Logger.getLogger(MyCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton00;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonAC;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonDiv;
    private javax.swing.JButton jButtonDot;
    private javax.swing.JButton jButtonEquals;
    private javax.swing.JButton jButtonMinus;
    private javax.swing.JButton jButtonMod;
    private javax.swing.JButton jButtonMultiply;
    private javax.swing.JButton jButtonplus;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}

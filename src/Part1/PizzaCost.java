package Part1;


import javax.swing.JOptionPane;


public class PizzaCost extends javax.swing.JFrame {

    final double LCOST = 1.5;
    final double UCOST = 0.75;
    double tcost, bcost, totalcost;
    

    public PizzaCost() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lcostl1 = new javax.swing.JLabel();
        sizel = new javax.swing.JLabel();
        toppingsl = new javax.swing.JLabel();
        sizetf = new javax.swing.JTextField();
        toppingstf = new javax.swing.JTextField();
        calcbt = new javax.swing.JButton();
        Resetbt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        gfdgf = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        totalcostl = new javax.swing.JLabel();
        lcostl = new javax.swing.JLabel();
        ucostl = new javax.swing.JLabel();
        tcostl = new javax.swing.JLabel();
        bcostl = new javax.swing.JLabel();
        costthing = new javax.swing.JLabel();

        lcostl1.setText(" ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sizel.setText("Enter Size of Pizza:      ");

        toppingsl.setText("Enter Number Of Toppings:  ");

        sizetf.setText(" ");
        sizetf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizetfActionPerformed(evt);
            }
        });

        toppingstf.setText(" ");
        toppingstf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toppingstfActionPerformed(evt);
            }
        });

        calcbt.setText("Calculate");
        calcbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcbtActionPerformed(evt);
            }
        });

        Resetbt.setText("Reset");
        Resetbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetbtActionPerformed(evt);
            }
        });

        jLabel1.setText("Utilities Cost(Fixed):");

        gfdgf.setText("Labour Cost(Fixed):");

        jLabel3.setText("Topping Cost:");

        jLabel4.setText("Base Ingredient Cost:");

        totalcostl.setText(" ");
        totalcostl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lcostl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lcostl.setText(" ");

        ucostl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ucostl.setText(" ");

        tcostl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tcostl.setText(" ");

        bcostl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bcostl.setText(" ");

        costthing.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        costthing.setText("Total Cost:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sizel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(toppingsl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sizetf, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(toppingstf, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(50, 50, 50)
                                                .addComponent(calcbt, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(costthing))
                                        .addGap(21, 21, 21))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(44, 44, 44)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(totalcostl, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Resetbt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ucostl, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gfdgf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(bcostl, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                        .addComponent(tcostl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(lcostl, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(31, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sizel)
                    .addComponent(sizetf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toppingsl)
                    .addComponent(toppingstf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calcbt)
                    .addComponent(Resetbt))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gfdgf)
                    .addComponent(lcostl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ucostl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tcostl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(bcostl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalcostl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(costthing, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(75, 75, 75))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sizetfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizetfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sizetfActionPerformed

    private void toppingstfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toppingstfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toppingstfActionPerformed

    private void calcbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcbtActionPerformed
        
        try{
        tcost = 0.75*(Double.parseDouble(toppingstf.getText()));
        bcost = 0.50*(Double.parseDouble(sizetf.getText()));}
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Enter a valid number in the input fiedlds");
            return;}
        
          
        totalcost = tcost+bcost+UCOST+LCOST;
        lcostl.setText(String.format("%.2f", LCOST));
        ucostl.setText(String.format("%.2f", UCOST));
        bcostl.setText(String.format("%.2f", bcost));
        tcostl.setText(String.format("%.2f", tcost));
        totalcostl.setText(String.format("%.2f", totalcost));
        
        
                
                
    }//GEN-LAST:event_calcbtActionPerformed

    private void ResetbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetbtActionPerformed
        lcostl.setText(String.format(" "));
        ucostl.setText(String.format(" "));
        bcostl.setText(String.format(" "));
        tcostl.setText(String.format(" "));
        sizetf.setText(String.format(" "));
        toppingstf.setText(String.format(" "));
        totalcostl.setText(String.format(""));
        
        
    }//GEN-LAST:event_ResetbtActionPerformed

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
            java.util.logging.Logger.getLogger(PizzaCost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PizzaCost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PizzaCost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PizzaCost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PizzaCost().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Resetbt;
    private javax.swing.JLabel bcostl;
    private javax.swing.JButton calcbt;
    private javax.swing.JLabel costthing;
    private javax.swing.JLabel gfdgf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lcostl;
    private javax.swing.JLabel lcostl1;
    private javax.swing.JLabel sizel;
    private javax.swing.JTextField sizetf;
    private javax.swing.JLabel tcostl;
    private javax.swing.JLabel toppingsl;
    private javax.swing.JTextField toppingstf;
    private javax.swing.JLabel totalcostl;
    private javax.swing.JLabel ucostl;
    // End of variables declaration//GEN-END:variables
}

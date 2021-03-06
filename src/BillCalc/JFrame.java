/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BillCalc;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author dreikurs
 */
public class JFrame extends javax.swing.JFrame {

    /**
     * Creates new form JFrame
     */
    public JFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Units = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        But_Calculate = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Charge = new javax.swing.JLabel();
        fixedCharge = new javax.swing.JLabel();
        totalCharge = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        startDateBox = new org.jdesktop.swingx.JXDatePicker();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        endDateBox = new org.jdesktop.swingx.JXDatePicker();
        labelA = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        About = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bill Calculator");
        setResizable(false);

        Units.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Units.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Units.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UnitsFocusGained(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLabel1.setText("Number of units (kWh): ");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Total kWh charge ");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Total fixed charge ");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Total charge    ");

        But_Calculate.setBackground(new java.awt.Color(144, 144, 144));
        But_Calculate.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        But_Calculate.setForeground(new java.awt.Color(35, 114, 170));
        But_Calculate.setText("Calculate");
        But_Calculate.setToolTipText("Click to calculate you bill");
        But_Calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                But_CalculateActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(182, 202, 213));
        jLabel5.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(95, 140, 193));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Electricity Bill Calculator");
        jLabel5.setOpaque(true);

        Charge.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        Charge.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Charge.setText("0.00");

        fixedCharge.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        fixedCharge.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fixedCharge.setText("0.00");

        totalCharge.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        totalCharge.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalCharge.setText("0.00");

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLabel6.setText(":  Rs.");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLabel7.setText(":  Rs.");

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setText(":  Rs.");

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(157, 155, 155));
        jLabel10.setText(" RPL");
        jLabel10.setToolTipText("Created by Prasith Lakshan - 2015");

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel11.setText("Start Date :");

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel12.setText("End Date   :");

        labelA.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        labelA.setForeground(new java.awt.Color(136, 136, 136));
        labelA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA.setText("0 days");

        About.setText("About");
        About.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutActionPerformed(evt);
            }
        });

        jMenuItem1.setText("About");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        About.add(jMenuItem1);

        jMenuBar1.add(About);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Units, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel12))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(endDateBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(startDateBox, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(But_Calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fixedCharge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(totalCharge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Charge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(22, 22, 22))
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Units, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startDateBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(endDateBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(But_Calculate)
                    .addComponent(labelA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Charge)
                    .addComponent(jLabel6))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fixedCharge)
                    .addComponent(jLabel7))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(totalCharge)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void But_CalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_But_CalculateActionPerformed
       // checking for number format errors
        try {
        // getting units    
        double result;
        String str;
        
        if(Units.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter number of units first!");
        }
        
        int units = Integer.parseInt(Units.getText());
       
        
        // getting start and end dates
        SimpleDateFormat DateFormatter = new SimpleDateFormat("dd");
        SimpleDateFormat MonthFormatter = new SimpleDateFormat("MM");
        SimpleDateFormat YearFormatter = new SimpleDateFormat("yyyy");
        //SimpleDateFormat Formatter = new SimpleDateFormat("dd-MM-yyyy");
        
        
        Date start = startDateBox.getDate();
        Date end = endDateBox.getDate();
        
        // converting start date and month to int
        int startDate = Integer.parseInt( DateFormatter.format(start));
        int startMonth = Integer.parseInt( MonthFormatter.format(start));
        
        // converting end date and month to int
        int endDate = Integer.parseInt( DateFormatter.format(end));
        int endMonth = Integer.parseInt( MonthFormatter.format(end));
        
        // converting year to int
        int year = Integer.parseInt( YearFormatter.format(end));
        int range = dateRange(startDate, startMonth, endDate, endMonth, year);
        labelA.setText(Integer.toString(range) + " Days");
        
        // displaying kWh charge
        result = calc(units, range);
        str = String.format("%.2f",result);
        Color black = Color.BLACK;
        Units.setForeground(black);
        Charge.setText(str);
        
        // displaying the fixed charge
        double result2;
        String str2;
        result2 = fixedCharge(units);
        str2 = String.format("%.2f", result2);
        fixedCharge.setText(str2);
        
        //displaying total charge
        String str3 = String.format("%.2f", (result+result2));
        totalCharge.setText(str3);
        
        } catch (NumberFormatException e) {
            Color red = Color.RED;
            Units.setForeground(red);
            //Units.setText("Error!");
            Charge.setText("0.00");
            fixedCharge.setText("0.00");
            totalCharge.setText("0.00");
            labelA.setText("0 days");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Please select a date range!");
        }
        
    }//GEN-LAST:event_But_CalculateActionPerformed

    private void UnitsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UnitsFocusGained
            Color black = Color.BLACK;
            Units.setForeground(black);
    }//GEN-LAST:event_UnitsFocusGained

    private void AboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutActionPerformed
        JOptionPane.showMessageDialog(null,"Created By\nPrasith Lakshan\n2015");
    }//GEN-LAST:event_AboutActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JOptionPane.showMessageDialog(null,"Created By\nPrasith Lakshan\n2015\n\nFor more details on calculation\nhttp://www.ceb.lk/sub/knowledge/billcalculation.html");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            // wanted to have GTK+ theme on linux instead of Nimbus, but since Nimbus comes up before 
            // GTK+ in the for loop, I created an array to hold LFs, which I used to get the count of the
            // LFs installed. 
            
            javax.swing.UIManager.LookAndFeelInfo[] lfs = javax.swing.UIManager.getInstalledLookAndFeels();
            int count = 1;
            String nimbusLF = null;
            //System.out.println(lfs.length);
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                //System.out.println(info.getClassName());
                
                // if the current LF in the loop is Nimbus this will save its Class name to a String.
                // had to do this when I typed in the class name, it gave an error because it couldn't
                // find nimbus. This solved it.
                if ("Nimbus".equals(info.getName())) {
                    //javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    nimbusLF = info.getClassName();
                    //break;
                }
                
                // If GTK+ is installed this will set it and break the loop.
                if ("GTK+".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    //System.out.println(info.getClassName());
                    break;
                }
                
                // this will set the windows theme instead of nimbus
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    //System.out.println(info.getClassName());
                    break;
                }
                
                // count is greater than the array length only if GTK+ or windows is not found. 
                // Then set the Nimbus LF.
                if(count > lfs.length) {
                    javax.swing.UIManager.setLookAndFeel(nimbusLF);
                    
                }
                
                count++;
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JFrame().setVisible(true);
            }
        });
    }
    
    // my code
    static double calc(int units, int range) {
        /*    units     charge(Rs.)
              0-60  ->	 7.85
             61-90  ->	10.00
             91-120 ->	27.75
            121-180 ->	32.00
               >180 ->	45.00
        
        
            vaues before the (+) are the sums of charges up to for each category
            ex: 7.85*60 + 10.00*30 = 771
        */
        
        
        
        int dateRange = range;
        double sum = 0;
        
        int unitRange[] = new int[5];
        double charges[] = new double[5];
        
        // setting unit ranges
        unitRange[0] = dateRange; // 0 - 31 (for 31 days)
        unitRange[1] = unitRange[0] + (dateRange); // 62
        unitRange[2] = unitRange[1] + (dateRange); // 93
        unitRange[3] = unitRange[2] + (dateRange); // 124
        unitRange[4] = unitRange[3] + (dateRange*2); // 186
        
      
        // setting unit range charge
        charges[0] = unitRange[0] * 2.50;
        charges[1] = (dateRange*2) * 7.85;
        charges[2] = dateRange * 10.00;
        charges[3] = dateRange * 27.75;
        charges[4] = (dateRange*2) * 32.00;
        
        
        outer: for(int i = 4; i >= 0; i--) {
            if(units >= unitRange[i]) {
                for(int j=1; j <= i; j++) {
                    sum = sum + charges[j];
                     //System.out.println(j);
                }
                break outer;
            }
            
        }        
        
        if (units <= 60 ) {            
            return units <= 30?units * 2.50: (charges[0]) + ((units - 30) * 7.85);
    
        } else {
    
            return units > unitRange[4] ? sum + ((units - unitRange[4]) * 45.00 ):
                   units > unitRange[3] ? sum + ((units - unitRange[3]) * 32.00 ):
                   units > unitRange[2] ? sum + ((units -  unitRange[2]) * 27.75 ):
                   /* else */       sum + ((units -  unitRange[1]) * 10.00 );
            
        }
    }//calc
    
    static int fixedCharge(int units) {
        return  units > 180? 540:
                units >  90? 480:
                units >  60?  90:
                units >  30?  60:
                /*else*/      30;
    }
    
    static int dateRange(int startDate, int startMonth, int endDate, int endMonth, int year) {
        if(startMonth != endMonth) {
            switch (startMonth) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        return (32-startDate) + endDate;
                    case 2:
                        if(year % 4 == 0 && year % 400 == 0 && !(year %100 == 0)) {
                            return (30-startDate) + endDate;
                        } else {
                            return (29-startDate) + endDate;
                        }
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        return (31-startDate) + endDate;
                    default:
                        return 0;
               
            } //switch
        } else {
            return (endDate - startDate) + 1;
        } //else
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu About;
    private javax.swing.JButton But_Calculate;
    private javax.swing.JLabel Charge;
    private javax.swing.JTextField Units;
    private org.jdesktop.swingx.JXDatePicker endDateBox;
    private javax.swing.JLabel fixedCharge;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel labelA;
    private org.jdesktop.swingx.JXDatePicker startDateBox;
    private javax.swing.JLabel totalCharge;
    // End of variables declaration//GEN-END:variables
}



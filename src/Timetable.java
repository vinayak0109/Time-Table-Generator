
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vinayak
 */
public class Timetable extends javax.swing.JFrame {
    
    /**
     * Creates new form Timetable
     */
    public Timetable() {
        initComponents();
        
        DefaultTableCellRenderer c = new DefaultTableCellRenderer();
            c.setHorizontalAlignment(SwingConstants.CENTER);

            for(int co=0; co<9; co++)
            {
                JTable.getColumnModel().getColumn(co).setCellRenderer(c);
            }
         
        TableCellRenderer rendererFromHeader = JTable.getTableHeader().getDefaultRenderer();
        JLabel headerLabel = (JLabel) rendererFromHeader;
        headerLabel.setHorizontalAlignment(JLabel.CENTER);
        
        //JTable.getColumnModel().getColumn(2).setHeaderValue("<html><center><p>column 1<br>design</p></center></html>");
        
        JTable.setShowGrid(true);
        JTable.setShowVerticalLines(true);
        //JTable.getColumnModel().getColumn(0).setPreferredWidth(60);
        JTable.setValueAt("Monday",0,0);
        JTable.setValueAt("Tuesday",1,0);
        JTable.setValueAt("Wednesday",2,0);
        JTable.setValueAt("Thursday",3,0);
        JTable.setValueAt("Friday",4,0);
        JTable.setValueAt("Saturday",5,0);
        JTable.setValueAt("L",0,5);
        JTable.setValueAt("U",1,5);
        JTable.setValueAt("N",2,5);
        JTable.setValueAt("C",3,5);
        JTable.setValueAt("H",4,5);
        JTable.setValueAt("BREAK",5,5);
        
        NewJFrame t=new NewJFrame();
        for(int i=0; i<6; i++)
        {
            for(int j=0; j<4; j++)
            {
                //FOR CHANGE
                    if(second.TT[i][j]==(second.change*10+2)){
                        JTable.setValueAt("Mentor/Library", i, j+1);
                        continue;
                    }
                //FOR CHANGE
                switch(second.TT[i][j])
                {
                    case 0: JTable.setValueAt(t.sub[0], i, j+1); break;
                    case 10: JTable.setValueAt(t.sub[1], i, j+1); break;
                    case 20: JTable.setValueAt(t.sub[2], i, j+1); break;
                    case 30: JTable.setValueAt(t.sub[3], i, j+1); break;
                    case 40: JTable.setValueAt(t.sub[4], i, j+1); break;
                    case 50: JTable.setValueAt(t.sub[5], i, j+1); break;
                    case 60: JTable.setValueAt(t.sub[6], i, j+1); break;
                    case 1: JTable.setValueAt(t.sub[0]+" - Lab", i, j+1); break;
                    case 11: JTable.setValueAt(t.sub[1]+" - Lab", i, j+1);; break;
                    case 21: JTable.setValueAt(t.sub[2]+" - Lab", i, j+1); break;
                    case 31: JTable.setValueAt(t.sub[3]+" - Lab", i, j+1); break;
                    case 41: JTable.setValueAt(t.sub[4]+" - Lab", i, j+1);; break;
                    case 51: JTable.setValueAt(t.sub[5]+" - Lab", i, j+1); break;
                    case 61: JTable.setValueAt(t.sub[6]+" - Lab", i, j+1); break;
                    case 2: JTable.setValueAt(t.sub[0]+"(TT)/"+t.sub[1]+"(TT)", i, j+1); break;
                    case 12: JTable.setValueAt(t.sub[1]+"(TT)/"+t.sub[0]+"(TT)", i, j+1); break;
                    case 22: JTable.setValueAt(t.sub[2]+"(TT)/"+t.sub[3]+"(TT)", i, j+1); break;
                    case 32: JTable.setValueAt(t.sub[3]+"(TT)/"+t.sub[2]+"(TT)", i, j+1); break;
                    case 42: JTable.setValueAt(t.sub[4]+"(TT)/"+t.sub[5]+"(TT)", i, j+1); break;
                    case 52: JTable.setValueAt(t.sub[5]+"(TT)/"+t.sub[4]+"(TT)", i, j+1); break;
//                    case 62: JTable.setValueAt("Mentor/Library", i, j+1); break;
//                    //case 42: JTable.setValueAt("Mentor/Library", i, j+1); break;
                }
            }
            System.out.println();
        }
        for(int i=0; i<6; i++)
        {
            for(int j=4; j<7; j++)
            {
                //FOR CHANGE
                    if(second.TT[i][j]==(second.change*10+2)){
                        JTable.setValueAt("Mentor/Library", i, j+1);
                        continue;
                    }
                //FOR CHANGE
                switch(second.TT[i][j])
                {
                    case 0: JTable.setValueAt(t.sub[0], i, j+2); break;
                    case 10: JTable.setValueAt(t.sub[1], i, j+2); break;
                    case 20: JTable.setValueAt(t.sub[2], i, j+2); break;
                    case 30: JTable.setValueAt(t.sub[3], i, j+2); break;
                    case 40: JTable.setValueAt(t.sub[4], i, j+2); break;
                    case 50: JTable.setValueAt(t.sub[5], i, j+2); break;
                    case 60: JTable.setValueAt(t.sub[6], i, j+2); break;
                    case 1: JTable.setValueAt(t.sub[0]+" - Lab", i, j+2); break;
                    case 11: JTable.setValueAt(t.sub[1]+" - Lab", i, j+2);; break;
                    case 21: JTable.setValueAt(t.sub[2]+" - Lab", i, j+2); break;
                    case 31: JTable.setValueAt(t.sub[3]+" - Lab", i, j+2); break;
                    case 41: JTable.setValueAt(t.sub[4]+" - Lab", i, j+2);; break;
                    case 51: JTable.setValueAt(t.sub[5]+" - Lab", i, j+2); break;
                    case 61: JTable.setValueAt(t.sub[6]+" - Lab", i, j+2); break;
                    case 2: JTable.setValueAt(t.sub[0]+"(TT)/"+t.sub[1]+"(TT)", i, j+2); break;
                    case 12: JTable.setValueAt(t.sub[1]+"(TT)/"+t.sub[0]+"(TT)", i, j+2); break;
                    case 22: JTable.setValueAt(t.sub[2]+"(TT)/"+t.sub[3]+"(TT)", i, j+2); break;
                    case 32: JTable.setValueAt(t.sub[3]+"(TT)/"+t.sub[2]+"(TT)", i, j+2); break;
                    case 42: JTable.setValueAt(t.sub[4]+"(TT)/"+t.sub[5]+"(TT)", i, j+2); break;
                    case 52: JTable.setValueAt(t.sub[5]+"(TT)/"+t.sub[4]+"(TT)", i, j+2); break;
//                    case 62: JTable.setValueAt("Mentor/Library", i, j+2); break;
                }
            }
            System.out.println();
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

        jScrollPane2 = new javax.swing.JScrollPane();
        JTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JTable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Day", "Period 1", "Period 2", "Period 3", "Period 4", "LUNCH", "Period 5", "Period 6", "Period 7"
            }
        ));
        JTable.setEnabled(false);
        JTable.setRequestFocusEnabled(false);
        JTable.setRowHeight(60);
        JTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(JTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Timetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Timetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Timetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Timetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Timetable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTable;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}

package proiect;

import javax.swing.JFrame;
import java.sql.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class magOn extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public magOn() {
        initComponents();
        conn = dbCon.ConnectionDB();
        updateTable();
    }


    /*
    public ArrayList<comenzi> comList(){
         public ArrayList<comenzi> comList=new ArrayList<>();
         Connection conn=null;
          PreparedStatement ps=null;
         conn=dbCon.ConnectionDB();
          
         String sql="SELECT * FROM comenzi; ";
         ps=conn.prepareStatement(sql)
                 
                 
    }*/
    private void updateTable() {
        String sql = "SELECT * FROM comenzi";
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            table_comenzi.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            ps.close();
            // conn.close();

        } catch (SQLException b) {
            JOptionPane.showMessageDialog(null, b);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        hdd = new javax.swing.JComboBox<>();
        pr = new javax.swing.JComboBox<>();
        plv = new javax.swing.JComboBox<>();
        pld = new javax.swing.JComboBox<>();
        comB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        adrs = new javax.swing.JTextField();
        nrt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_comenzi = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        hdd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HDD", "1TB", "2TB", "5TB", "256GB", "512GB", "1,2T", "1,5T", "2,5T", "6,4T", "7,8T", "10T", "12T", "11T", "127GB", "15T", "3T", "4T", " " }));
        hdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hddActionPerformed(evt);
            }
        });

        pr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Procesor", "i3-10th gen", "i5-8th gen", "i7-10th gen" }));

        plv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Placa video", "NVIDIA GEFORCE GTX 1050 TI", "NVIDIA GEFORCE GTX 1080" }));

        pld.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Placa de baza", "MSI", "ASUS", " " }));

        comB.setText("COMANDA ACUM");
        comB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comBActionPerformed(evt);
            }
        });

        jLabel1.setText("Adresa: ");

        jLabel2.setText("Nr.Tel: ");

        table_comenzi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "HDD", "Placa Video", "Placa de baza", "Procesor", "Adresa", "Nr.tel"
            }
        ));
        jScrollPane1.setViewportView(table_comenzi);

        jLabel3.setText("Ultimele comenzi facute:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nrt, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(adrs, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(hdd, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pr, javax.swing.GroupLayout.Alignment.LEADING, 0, 128, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(plv, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pld, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(comB, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(plv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(adrs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nrt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(comB)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void insert(String aa, String bb, String cc, String dd, String e, String f) {
        try {
            String sql = "INSERT INTO comenzi(HDD,PlacaV,PlacaB,Procesor,Adresa,Tel) VALUES(?,?,?,?,?,?); ";
            ps = conn.prepareStatement(sql);
            ps.setString(1, aa);
            ps.setString(2, bb);
            ps.setString(3, cc);
            ps.setString(4, dd);
            ps.setString(5, e);
            ps.setString(6, f);

            ps.execute();
            updateTable();
            JOptionPane.showMessageDialog(null, "Comanda a fost inregistrata cu succes!");
            ps.close();

        } catch (SQLException a) {
            JOptionPane.showMessageDialog(null, a);
        }
        updateTable();
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        loginU lgu = new loginU();
        lgu.setVisible(true);
        lgu.pack();
        lgu.setLocationRelativeTo(null);
        lgu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void hddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hddActionPerformed

    private void comBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comBActionPerformed
        String a = hdd.getSelectedItem().toString();
        String b = plv.getSelectedItem().toString();
        String c = pld.getSelectedItem().toString();
        String d = pr.getSelectedItem().toString();
        String e = adrs.getText();
        String f = nrt.getText();
        insert(a, b, c, d, e, f);

        /*String sql="select * from comenzi";
        try{
           rs=ps.executeQuery(); 
           while(rs.next()){
           String Hdd=String.valueOf(rs.getString("hdd"));
           String placaV=String.valueOf(rs.getString("PlacaV"));
           String placaB=String.valueOf(rs.getString("PlacaB"));
           String procesor=String.valueOf(rs.getString("Procesor"));
           String adresa=String.valueOf(rs.getString("Adresa"));
           String tel=String.valueOf(rs.getString("Tel"));
           String tbData[]={Hdd,placaV,placaB,procesor,adresa,tel};
           DefaultTableModel tlbModel = (DefaultTableModel)table_comenzi.getModel();
           table_comenzi.add(tbData, comB);
           }
        }catch(SQLException z){
                 JOptionPane.showMessageDialog(null, z);
                }
        
         */

    }//GEN-LAST:event_comBActionPerformed

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
            java.util.logging.Logger.getLogger(magOn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(magOn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(magOn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(magOn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new magOn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adrs;
    private javax.swing.JButton comB;
    private javax.swing.JComboBox<String> hdd;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nrt;
    private javax.swing.JComboBox<String> pld;
    private javax.swing.JComboBox<String> plv;
    private javax.swing.JComboBox<String> pr;
    private javax.swing.JTable table_comenzi;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author riani
 */
public class Frame1 extends javax.swing.JFrame {

    /**
     * Creates new form Frame1
     */
    public Frame1() {
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

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jKereta1 = new javax.swing.JLabel();
        jDeparture1 = new javax.swing.JLabel();
        jArrival1 = new javax.swing.JLabel();
        jKelas1 = new javax.swing.JLabel();
        jKereta2 = new javax.swing.JLabel();
        jDeparture2 = new javax.swing.JLabel();
        jArrival2 = new javax.swing.JLabel();
        jKelas2 = new javax.swing.JLabel();
        jKereta3 = new javax.swing.JLabel();
        jDeparture3 = new javax.swing.JLabel();
        jArrival3 = new javax.swing.JLabel();
        jKelas3 = new javax.swing.JLabel();
        jKereta4 = new javax.swing.JLabel();
        jKelas4 = new javax.swing.JLabel();
        jDeparture4 = new javax.swing.JLabel();
        jArrival4 = new javax.swing.JLabel();
        jKereta5 = new javax.swing.JLabel();
        jKelas5 = new javax.swing.JLabel();
        jDeparture5 = new javax.swing.JLabel();
        jArrival5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LIST KERETA API DARI STASIUN KOTA BARU MALANG");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 10, 490, 22);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih Jurusan --", "Malang - Blitar", "Malang - Surabaya ", "Malang - Banyuwangi ", "Malang - Yogyakarta ", "Malang - Bandung ", "Malang - Jakarta " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(250, 50, 200, 20);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("No Rangkaian / KA");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(20, 0, 120, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Arrival");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(350, 0, 120, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Departure");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(180, 0, 120, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Kelas");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(520, 0, 110, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(30, 90, 650, 30);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jKereta1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jKereta1);
        jKereta1.setBounds(40, 30, 140, 30);

        jDeparture1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jDeparture1);
        jDeparture1.setBounds(220, 30, 140, 30);

        jArrival1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jArrival1);
        jArrival1.setBounds(400, 30, 140, 30);

        jKelas1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jKelas1);
        jKelas1.setBounds(570, 30, 110, 30);

        jKereta2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jKereta2);
        jKereta2.setBounds(40, 60, 140, 30);

        jDeparture2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jDeparture2);
        jDeparture2.setBounds(220, 60, 140, 30);

        jArrival2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jArrival2);
        jArrival2.setBounds(400, 60, 140, 30);

        jKelas2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jKelas2);
        jKelas2.setBounds(570, 60, 110, 30);

        jKereta3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jKereta3);
        jKereta3.setBounds(40, 90, 140, 30);

        jDeparture3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jDeparture3);
        jDeparture3.setBounds(220, 90, 140, 30);

        jArrival3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jArrival3);
        jArrival3.setBounds(400, 90, 140, 30);

        jKelas3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jKelas3);
        jKelas3.setBounds(570, 90, 110, 30);

        jKereta4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jKereta4);
        jKereta4.setBounds(40, 120, 140, 30);

        jKelas4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jKelas4);
        jKelas4.setBounds(570, 120, 110, 30);

        jDeparture4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jDeparture4);
        jDeparture4.setBounds(220, 120, 140, 30);

        jArrival4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jArrival4);
        jArrival4.setBounds(400, 120, 140, 30);

        jKereta5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jKereta5);
        jKereta5.setBounds(40, 150, 140, 30);

        jKelas5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jKelas5);
        jKelas5.setBounds(570, 150, 110, 30);

        jDeparture5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jDeparture5);
        jDeparture5.setBounds(220, 150, 140, 30);

        jArrival5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jArrival5);
        jArrival5.setBounds(400, 150, 140, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 90, 670, 200);

        setBounds(0, 0, 722, 339);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        if (jComboBox1.getSelectedItem().equals("-- Pilih Jurusan --")){
            jKereta1.setText("");
            jDeparture1.setText("");
            jArrival1.setText("");
            jKelas1.setText("");

            jKereta2.setText("");
            jDeparture2.setText("");
            jArrival2.setText("");
            jKelas2.setText("");

            jKereta3.setText("");
            jDeparture3.setText("");
            jArrival3.setText("");
            jKelas3.setText("");

            jKereta4.setText("");
            jDeparture4.setText("");
            jArrival4.setText("");
            jKelas4.setText("");

            jKereta5.setText("");
            jDeparture5.setText("");
            jArrival5.setText("");
            jKelas5.setText("");
        }else
        if(jComboBox1.getSelectedItem().equals("Malang - Blitar")){
            jKereta1.setText("KA 439 / Penataran ");
            jDeparture1.setText("Malang Kotabaru / 07.24");
            jArrival1.setText("Blitar / 10.28");
            jKelas1.setText("Ekonomi");

            jKereta2.setText("KA 441 / Penataran ");
            jDeparture2.setText("Malang Kotabaru / 11.10");
            jArrival2.setText("Blitar / 13.25");
            jKelas2.setText("Ekonomi");

            jKereta3.setText("KA 443 / Penataran ");
            jDeparture3.setText("Malang Kotabaru / 14.57 ");
            jArrival3.setText("Blitar / 17.34");
            jKelas3.setText("Ekonomi");

            jKereta4.setText("KA 447 / Penataran ");
            jDeparture4.setText("Malang Kotabaru / 19.06");
            jArrival4.setText("Blitar / 21.23");
            jKelas4.setText("Ekonomi");

            jKereta5.setText("");
            jDeparture5.setText("");
            jArrival5.setText("");
            jKelas5.setText("");
        }else
        if(jComboBox1.getSelectedItem().equals("Malang - Surabaya ")){
            jKereta1.setText("KA 439 / Penataran ");
            jDeparture1.setText("Malang Kotabaru / 37.20");
            jArrival1.setText("Surabaya Gubeng / 05.56");
            jKelas1.setText("Ekonomi");

            jKereta2.setText("KA 440 / Penataran ");
            jDeparture2.setText("Malang Kotabaru / 06.30");
            jArrival2.setText("Surabaya Gubeng / 09.44");
            jKelas2.setText("Ekonomi");

            jKereta3.setText("KA 442 / Penataran ");
            jDeparture3.setText("Malang Kotabaru / 12.00 ");
            jArrival3.setText("Surabaya Gubeng / 14.54");
            jKelas3.setText("Ekonomi");

            jKereta4.setText("KA 444 / Penataran ");
            jDeparture4.setText("Malang Kotabaru / 16.59");
            jArrival4.setText("Surabaya Gubeng / 19.46");
            jKelas4.setText("Ekonomi");

            jKereta5.setText("KA 446 / Penataran ");
            jDeparture5.setText("Malang Kotabaru / 19.58");
            jArrival5.setText("Surabaya Gubeng / 22.41");
            jKelas5.setText("Ekonomi");
        }else
        if (jComboBox1.getSelectedItem().equals("Malang - Banyuwangi ")){
            jKereta1.setText("KA. Tawang Alun");
            jDeparture1.setText("Malang Kotabaru / 14.55");
            jArrival1.setText("Banyuwangi / 22.27");
            jKelas1.setText("Ekonomi AC");

            jKereta2.setText("");
            jDeparture2.setText("");
            jArrival2.setText("");
            jKelas2.setText("");

            jKereta3.setText("");
            jDeparture3.setText("");
            jArrival3.setText("");
            jKelas3.setText("");

            jKereta4.setText("");
            jDeparture4.setText("");
            jArrival4.setText("");
            jKelas4.setText("");

            jKereta5.setText("");
            jDeparture5.setText("");
            jArrival5.setText("");
            jKelas5.setText("");
        }else
        if (jComboBox1.getSelectedItem().equals("Malang - Yogyakarta ")){
            jKereta1.setText("KA. Malioboro Ekspres");
            jDeparture1.setText("Malang Kotabaru / 08.00");
            jArrival1.setText("Yogyakarta Tugu / 15.06");
            jKelas1.setText("Ekonomi AC &");

            jKereta2.setText("");
            jDeparture2.setText("");
            jArrival2.setText("");
            jKelas2.setText("Eksekutif");

            jKereta3.setText("");
            jDeparture3.setText("");
            jArrival3.setText("");
            jKelas3.setText("");

            jKereta4.setText("");
            jDeparture4.setText("");
            jArrival4.setText("");
            jKelas4.setText("");

            jKereta5.setText("");
            jDeparture5.setText("");
            jArrival5.setText("");
            jKelas5.setText("");
        }else
        if (jComboBox1.getSelectedItem().equals("Malang - Bandung ")){
            jKereta1.setText("KA. Malabar");
            jDeparture1.setText("Malang Kotabaru / 14.35");
            jArrival1.setText("Bandung / 06.04");
            jKelas1.setText("Ekonomi AC &");

            jKereta2.setText("");
            jDeparture2.setText("");
            jArrival2.setText("");
            jKelas2.setText("Eksekutif &");

            jKereta3.setText("");
            jDeparture3.setText("");
            jArrival3.setText("");
            jKelas3.setText("Bisnis");

            jKereta4.setText("");
            jDeparture4.setText("");
            jArrival4.setText("");
            jKelas4.setText("");

            jKereta5.setText("");
            jDeparture5.setText("");
            jArrival5.setText("");
            jKelas5.setText("");
        }else
        if (jComboBox1.getSelectedItem().equals("Malang - Jakarta ")){
            jKereta1.setText("KA. Majapahit");
            jDeparture1.setText("Malang Kotabaru / 12.10");
            jArrival1.setText("Pasarsenen / 03.16");
            jKelas1.setText("Ekonomi AC");

            jKereta2.setText("KA. Matarmaja");
            jDeparture2.setText("Malang Kotabaru / 17.00");
            jArrival2.setText("Pasarsenen / 09.21");
            jKelas2.setText("Ekonomi AC");

            jKereta3.setText("KA. Api Jayabaya");
            jDeparture3.setText("Malang Kotabaru / 10.45");
            jArrival3.setText("Pasarsenen / 00.23");
            jKelas3.setText("Ekonomi AC");

            jKereta4.setText("KA. Gajayana");
            jDeparture4.setText("Malang Kotabaru / 13.40");
            jArrival4.setText("Jakarta Kota / 04.45");
            jKelas4.setText("Eksekutif");

            jKereta5.setText("");
            jDeparture5.setText("");
            jArrival5.setText("");
            jKelas5.setText("");
        }

    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jArrival1;
    private javax.swing.JLabel jArrival2;
    private javax.swing.JLabel jArrival3;
    private javax.swing.JLabel jArrival4;
    private javax.swing.JLabel jArrival5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jDeparture1;
    private javax.swing.JLabel jDeparture2;
    private javax.swing.JLabel jDeparture3;
    private javax.swing.JLabel jDeparture4;
    private javax.swing.JLabel jDeparture5;
    private javax.swing.JLabel jKelas1;
    private javax.swing.JLabel jKelas2;
    private javax.swing.JLabel jKelas3;
    private javax.swing.JLabel jKelas4;
    private javax.swing.JLabel jKelas5;
    private javax.swing.JLabel jKereta1;
    private javax.swing.JLabel jKereta2;
    private javax.swing.JLabel jKereta3;
    private javax.swing.JLabel jKereta4;
    private javax.swing.JLabel jKereta5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}

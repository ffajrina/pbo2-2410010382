//Fajrina Bada
//2410010382

package id.ac.uniska.pbo2.p05;

import com.formdev.flatlaf.FlatLightLaf;

public class FormAnggotaPerpustakaan extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormAnggotaPerpustakaan.class.getName());

    public FormAnggotaPerpustakaan() {
        initComponents();
        
        alamatArea.setLineWrap(true);
        alamatArea.setWrapStyleWord(true);
        persetujuanCheck.putClientProperty(
            "JComponent.focusWidth", 1
        );
        getRootPane().setDefaultButton(daftarButton);
        pack();
        setMinimumSize(getSize());
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jenisAnggotaButtonGroup = new javax.swing.ButtonGroup();
        headerPanel = new javax.swing.JPanel();
        judulLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        isiPanel = new javax.swing.JPanel();
        dataPanel = new javax.swing.JPanel();
        dataAnggotaLabel = new javax.swing.JLabel();
        npmLabel = new javax.swing.JLabel();
        namaLengkapLabel = new javax.swing.JLabel();
        programStudiLabel = new javax.swing.JLabel();
        jenisAnggotaLabel = new javax.swing.JLabel();
        npmText = new javax.swing.JTextField();
        namaText = new javax.swing.JTextField();
        programStudiCombo = new javax.swing.JComboBox<>();
        umumRadio = new javax.swing.JRadioButton();
        mahasiswaRadio = new javax.swing.JRadioButton();
        dosenRadio = new javax.swing.JRadioButton();
        npmDigitLabel = new javax.swing.JLabel();
        kontakPanel = new javax.swing.JPanel();
        kontakLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        nomoHpLabel = new javax.swing.JLabel();
        alamatLabel = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        nomorHpField = new javax.swing.JTextField();
        alamatArea = new javax.swing.JTextArea();
        persetujuanPanel = new javax.swing.JPanel();
        persetujuanCheck = new javax.swing.JCheckBox();
        tombolPanel = new javax.swing.JPanel();
        batalButton = new javax.swing.JButton();
        daftarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Anggota Perpustakaan");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        headerPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(16, 16, 8, 16));
        headerPanel.setLayout(new javax.swing.BoxLayout(headerPanel, javax.swing.BoxLayout.Y_AXIS));

        judulLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        judulLabel.setText("Aplikasi Perpustakaan");
        judulLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        headerPanel.add(judulLabel);

        jLabel1.setText("Isi data ini");
        headerPanel.add(jLabel1);

        getContentPane().add(headerPanel, java.awt.BorderLayout.PAGE_START);

        isiPanel.setLayout(new java.awt.BorderLayout());

        dataPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 16, 8, 16));
        dataPanel.setLayout(new java.awt.GridBagLayout());

        dataAnggotaLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dataAnggotaLabel.setForeground(new java.awt.Color(0, 0, 0));
        dataAnggotaLabel.setText("Data Anggota");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 6);
        dataPanel.add(dataAnggotaLabel, gridBagConstraints);

        npmLabel.setText("NPM");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 12);
        dataPanel.add(npmLabel, gridBagConstraints);

        namaLengkapLabel.setText("Nama Lengkap");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 12);
        dataPanel.add(namaLengkapLabel, gridBagConstraints);

        programStudiLabel.setText("Program Studi");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 12);
        dataPanel.add(programStudiLabel, gridBagConstraints);

        jenisAnggotaLabel.setText("Jenis Anggota");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 12);
        dataPanel.add(jenisAnggotaLabel, gridBagConstraints);

        npmText.setMargin(new java.awt.Insets(0, 0, 0, 0));
        npmText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                npmTextKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 8, 4, 8);
        dataPanel.add(npmText, gridBagConstraints);

        namaText.setMargin(new java.awt.Insets(1, 3, 1, 3));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 8, 4, 8);
        dataPanel.add(namaText, gridBagConstraints);

        programStudiCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teknik Informatika", "Sistem Informasi", "Ilmu Komputer", " ", " " }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        dataPanel.add(programStudiCombo, gridBagConstraints);

        jenisAnggotaButtonGroup.add(umumRadio);
        umumRadio.setText("Umum");
        umumRadio.addActionListener(this::umumRadioActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        dataPanel.add(umumRadio, gridBagConstraints);

        jenisAnggotaButtonGroup.add(mahasiswaRadio);
        mahasiswaRadio.setText("Mahasiswa");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        dataPanel.add(mahasiswaRadio, gridBagConstraints);

        jenisAnggotaButtonGroup.add(dosenRadio);
        dosenRadio.setText("Dosen");
        dosenRadio.addActionListener(this::dosenRadioActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        dataPanel.add(dosenRadio, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        dataPanel.add(npmDigitLabel, gridBagConstraints);

        isiPanel.add(dataPanel, java.awt.BorderLayout.PAGE_START);

        kontakPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 16, 8, 14));
        kontakPanel.setLayout(new java.awt.GridBagLayout());

        kontakLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        kontakLabel.setForeground(new java.awt.Color(0, 0, 0));
        kontakLabel.setText("Kontak");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 6, 0);
        kontakPanel.add(kontakLabel, gridBagConstraints);

        emailLabel.setText("Email");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        kontakPanel.add(emailLabel, gridBagConstraints);

        nomoHpLabel.setText("Nomor Hp");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 12);
        kontakPanel.add(nomoHpLabel, gridBagConstraints);

        alamatLabel.setText("Alamat");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 12);
        kontakPanel.add(alamatLabel, gridBagConstraints);

        emailText.setMargin(new java.awt.Insets(4, 6, 4, 6));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 10, 4, 10);
        kontakPanel.add(emailText, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 10, 4, 10);
        kontakPanel.add(nomorHpField, gridBagConstraints);

        alamatArea.setColumns(20);
        alamatArea.setRows(5);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 6, 4, 6);
        kontakPanel.add(alamatArea, gridBagConstraints);

        isiPanel.add(kontakPanel, java.awt.BorderLayout.CENTER);

        persetujuanPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 16, 8, 16));
        persetujuanPanel.setLayout(new java.awt.BorderLayout());

        persetujuanCheck.setText("Saya sudah mengisi identitas dengan sesuai");
        persetujuanCheck.addItemListener(this::persetujuanCheckItemStateChanged);
        persetujuanCheck.addActionListener(this::persetujuanCheckActionPerformed);
        persetujuanPanel.add(persetujuanCheck, java.awt.BorderLayout.CENTER);

        isiPanel.add(persetujuanPanel, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(isiPanel, java.awt.BorderLayout.CENTER);

        tombolPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 16, 16, 16));
        tombolPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 7));

        batalButton.setText("Batal");
        batalButton.addActionListener(this::batalButtonActionPerformed);
        tombolPanel.add(batalButton);

        daftarButton.setText("Daftar");
        daftarButton.setEnabled(false);
        daftarButton.addActionListener(this::daftarButtonActionPerformed);
        tombolPanel.add(daftarButton);

        getContentPane().add(tombolPanel, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dosenRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosenRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dosenRadioActionPerformed

    private void umumRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_umumRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_umumRadioActionPerformed

    private void persetujuanCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_persetujuanCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_persetujuanCheckActionPerformed

    private void persetujuanCheckItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_persetujuanCheckItemStateChanged
    daftarButton.setEnabled(persetujuanCheck.isSelected());        // TODO add your handling code here:
    }//GEN-LAST:event_persetujuanCheckItemStateChanged

    private void batalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalButtonActionPerformed
    npmText.setText("");
    namaText.setText("");
    emailText.setText("");
    nomorHpField.setText("");
    alamatArea.setText("");

    programStudiCombo.setSelectedIndex(0);
    jenisAnggotaButtonGroup.clearSelection();

    persetujuanCheck.setSelected(false);
    daftarButton.setEnabled(false);

    npmDigitLabel.setText("0 dari 10 digit");

    npmText.requestFocusInWindow();        // TODO add your handling code here:
    }//GEN-LAST:event_batalButtonActionPerformed

    private void daftarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarButtonActionPerformed
    String jenisAnggota = "";

    if (umumRadio.isSelected()) {
        jenisAnggota = "Umum";
    } else if (mahasiswaRadio.isSelected()) {
        jenisAnggota = "Mahasiswa";
    } else if (dosenRadio.isSelected()) {
        jenisAnggota = "Dosen";
    }

    String ringkasan =
            "RINGKASAN PENDAFTARAN ANGGOTA\n\n"
            + "NPM: " + npmText.getText() + "\n"
            + "Nama: " + namaText.getText() + "\n"
            + "Program Studi: "
            + programStudiCombo.getSelectedItem() + "\n"
            + "Jenis Anggota: " + jenisAnggota + "\n"
            + "Email: " + emailText.getText() + "\n"
            + "Nomor HP: " + nomorHpField.getText() + "\n"
            + "Alamat: " + alamatArea.getText();

    javax.swing.JOptionPane.showMessageDialog(
            this,
            ringkasan,
            "Ringkasan Pendaftaran",
            javax.swing.JOptionPane.INFORMATION_MESSAGE
    );        // TODO add your handling code here:
    }//GEN-LAST:event_daftarButtonActionPerformed

    private void npmTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_npmTextKeyReleased
     String digit = npmText.getText().replaceAll("\\D", "");

    npmDigitLabel.setText(
            digit.length() + " dari 10 digit"
    );        // TODO add your handling code here:
    }//GEN-LAST:event_npmTextKeyReleased

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int jawab = javax.swing.JOptionPane.showConfirmDialog(
            this,
            "Keluar dari aplikasi?",
            "Konfirmasi",
            javax.swing.JOptionPane.YES_NO_OPTION
    );

    if (jawab == javax.swing.JOptionPane.YES_OPTION) {
        dispose();
    }        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) {

        FlatLightLaf.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FormAnggotaPerpustakaan().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea alamatArea;
    private javax.swing.JLabel alamatLabel;
    private javax.swing.JButton batalButton;
    private javax.swing.JButton daftarButton;
    private javax.swing.JLabel dataAnggotaLabel;
    private javax.swing.JPanel dataPanel;
    private javax.swing.JRadioButton dosenRadio;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailText;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JPanel isiPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.ButtonGroup jenisAnggotaButtonGroup;
    private javax.swing.JLabel jenisAnggotaLabel;
    private javax.swing.JLabel judulLabel;
    private javax.swing.JLabel kontakLabel;
    private javax.swing.JPanel kontakPanel;
    private javax.swing.JRadioButton mahasiswaRadio;
    private javax.swing.JLabel namaLengkapLabel;
    private javax.swing.JTextField namaText;
    private javax.swing.JLabel nomoHpLabel;
    private javax.swing.JTextField nomorHpField;
    private javax.swing.JLabel npmDigitLabel;
    private javax.swing.JLabel npmLabel;
    private javax.swing.JTextField npmText;
    private javax.swing.JCheckBox persetujuanCheck;
    private javax.swing.JPanel persetujuanPanel;
    private javax.swing.JComboBox<String> programStudiCombo;
    private javax.swing.JLabel programStudiLabel;
    private javax.swing.JPanel tombolPanel;
    private javax.swing.JRadioButton umumRadio;
    // End of variables declaration//GEN-END:variables
}

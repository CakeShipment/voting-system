package votingsystem.form;
import java.util.*;
import votingsystem.model.Storage;

public class Voter_UI extends javax.swing.JFrame {
    
    private String president;
    private String vPresident;
    private Set<String> senators = new HashSet<>();
    private Set<String> distReps = new HashSet<>();
    private String governor;
    private String mayor;
    
    private String tempSelect;
    
    public Voter_UI() {
        initComponents();
    }
    
    private String[] getCandidates(String type){
        if(!type.equals("Senator") && !type.equals("District_Representative")){
            String temp[] = new String[3];
            for(int i = 0; i < 3; i++){
                temp[i] = Storage.getCandidate(i, type).getFullName();
            }
            return temp;
        }
        Set<String> set = new HashSet<>();
        for(int i = 0; i < 10; i++){
            set.add(Storage.getCandidate(i, "Senator").getFullName());
        }
        if(type.equals("Senator") && !senators.isEmpty()){
            for(String s : senators){
                if(set.contains(s)){
                    set.remove(s);
                }
            }
        }
        if(type.equals("District_Representative") && !distReps.isEmpty()){
            for(String s : distReps){
                if(set.contains(s)){
                    set.remove(s);
                }
            }
        }
        return set.toArray(new String[set.size()]);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        senatorSelect1 = new javax.swing.JComboBox<>();
        senatorSelect2 = new javax.swing.JComboBox<>();
        senatorSelect3 = new javax.swing.JComboBox<>();
        senatorSelect4 = new javax.swing.JComboBox<>();
        senatorSelect5 = new javax.swing.JComboBox<>();
        presidentSelect = new javax.swing.JComboBox<>();
        vPresidentSelect = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        disRepresentativeSelect1 = new javax.swing.JComboBox<>();
        disRepresentativeSelect2 = new javax.swing.JComboBox<>();
        disRepresentativeSelect3 = new javax.swing.JComboBox<>();
        disRepresentativeSelect4 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        governorSelect = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        mayorSelect = new javax.swing.JComboBox<>();
        voteBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("President");

        jLabel2.setText("Vice President");

        jLabel3.setText("Senators");

        senatorSelect1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Candidate" }));
        senatorSelect1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                senatorSelect1MouseClicked(evt);
            }
        });
        senatorSelect1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senatorSelect1ActionPerformed(evt);
            }
        });

        senatorSelect2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Candidate"  }));
        senatorSelect2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                senatorSelect2MouseClicked(evt);
            }
        });
        senatorSelect2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senatorSelect2ActionPerformed(evt);
            }
        });

        senatorSelect3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Candidate" }));
        senatorSelect3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                senatorSelect3MouseClicked(evt);
            }
        });
        senatorSelect3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senatorSelect3ActionPerformed(evt);
            }
        });

        senatorSelect4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Candidate" }));
        senatorSelect4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                senatorSelect4MouseClicked(evt);
            }
        });
        senatorSelect4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senatorSelect4ActionPerformed(evt);
            }
        });

        senatorSelect5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Candidate" }));
        senatorSelect5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                senatorSelect5MouseClicked(evt);
            }
        });
        senatorSelect5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senatorSelect5ActionPerformed(evt);
            }
        });

        presidentSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Candidate" }));
        presidentSelect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                presidentSelectMouseClicked(evt);
            }
        });
        presidentSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presidentSelectActionPerformed(evt);
            }
        });

        vPresidentSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Candidate" }));
        vPresidentSelect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vPresidentSelectMouseClicked(evt);
            }
        });
        vPresidentSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vPresidentSelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(senatorSelect1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(senatorSelect2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(senatorSelect3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(senatorSelect4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(senatorSelect5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(0, 263, Short.MAX_VALUE))
            .addComponent(presidentSelect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(vPresidentSelect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(presidentSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vPresidentSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senatorSelect1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senatorSelect2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senatorSelect3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senatorSelect4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senatorSelect5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel4.setText("District Representatives");

        disRepresentativeSelect1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Candidate" }));

        disRepresentativeSelect2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Candidate" }));

        disRepresentativeSelect3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Candidate" }));

        disRepresentativeSelect4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Candidate" }));

        jLabel5.setText("Governor");

        governorSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Candidate" }));

        jLabel6.setText("Senators");

        mayorSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Candidate" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(0, 239, Short.MAX_VALUE))
            .addComponent(disRepresentativeSelect1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(disRepresentativeSelect2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(disRepresentativeSelect3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(disRepresentativeSelect4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(governorSelect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mayorSelect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(disRepresentativeSelect1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(disRepresentativeSelect2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(disRepresentativeSelect3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(disRepresentativeSelect4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(governorSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mayorSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        voteBtn.setText("Vote!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(voteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(voteBtn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void presidentSelectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_presidentSelectMouseClicked
        presidentSelect.setModel(new javax.swing.DefaultComboBoxModel<>(getCandidates("President")));
        presidentSelect.showPopup();
    }//GEN-LAST:event_presidentSelectMouseClicked

    private void vPresidentSelectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vPresidentSelectMouseClicked
        vPresidentSelect.setModel(new javax.swing.DefaultComboBoxModel<>(getCandidates("Vice_President")));
        vPresidentSelect.showPopup();
    }//GEN-LAST:event_vPresidentSelectMouseClicked

    private void senatorSelect1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_senatorSelect1MouseClicked
        tempSelect = senatorSelect1.getSelectedItem().toString();
        senatorSelect1.setModel(new javax.swing.DefaultComboBoxModel<>(getCandidates("Senator")));
        senatorSelect1.showPopup();
    }//GEN-LAST:event_senatorSelect1MouseClicked

    private void senatorSelect1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senatorSelect1ActionPerformed
        if(senators.contains(tempSelect)){
            senators.remove(tempSelect);
        }
        senators.add(senatorSelect1.getSelectedItem().toString());
    }//GEN-LAST:event_senatorSelect1ActionPerformed

    private void senatorSelect2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_senatorSelect2MouseClicked
        tempSelect = senatorSelect2.getSelectedItem().toString();
        senatorSelect2.setModel(new javax.swing.DefaultComboBoxModel<>(getCandidates("Senator")));
        senatorSelect2.showPopup();
    }//GEN-LAST:event_senatorSelect2MouseClicked

    private void senatorSelect2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senatorSelect2ActionPerformed
        if(senators.contains(tempSelect)){
            senators.remove(tempSelect);
        }
        senators.add(senatorSelect2.getSelectedItem().toString());
    }//GEN-LAST:event_senatorSelect2ActionPerformed

    private void senatorSelect3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_senatorSelect3MouseClicked
        tempSelect = senatorSelect3.getSelectedItem().toString();
        senatorSelect3.setModel(new javax.swing.DefaultComboBoxModel<>(getCandidates("Senator")));
        senatorSelect3.showPopup();
    }//GEN-LAST:event_senatorSelect3MouseClicked

    private void senatorSelect3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senatorSelect3ActionPerformed
        if(senators.contains(tempSelect)){
            senators.remove(tempSelect);
        }
        senators.add(senatorSelect3.getSelectedItem().toString());
    }//GEN-LAST:event_senatorSelect3ActionPerformed

    private void senatorSelect4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_senatorSelect4MouseClicked
        tempSelect = senatorSelect4.getSelectedItem().toString();
        senatorSelect4.setModel(new javax.swing.DefaultComboBoxModel<>(getCandidates("Senator")));
        senatorSelect4.showPopup();
    }//GEN-LAST:event_senatorSelect4MouseClicked

    private void senatorSelect4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senatorSelect4ActionPerformed
        if(senators.contains(tempSelect)){
            senators.remove(tempSelect);
        }
        senators.add(senatorSelect4.getSelectedItem().toString());
    }//GEN-LAST:event_senatorSelect4ActionPerformed

    private void senatorSelect5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_senatorSelect5MouseClicked
        tempSelect = senatorSelect5.getSelectedItem().toString();
        senatorSelect5.setModel(new javax.swing.DefaultComboBoxModel<>(getCandidates("Senator")));
        senatorSelect5.showPopup();
    }//GEN-LAST:event_senatorSelect5MouseClicked

    private void senatorSelect5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senatorSelect5ActionPerformed
        if(senators.contains(tempSelect)){
            senators.remove(tempSelect);
        }
        senators.add(senatorSelect5.getSelectedItem().toString());
    }//GEN-LAST:event_senatorSelect5ActionPerformed

    private void presidentSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presidentSelectActionPerformed
        president = presidentSelect.getSelectedItem().toString();
    }//GEN-LAST:event_presidentSelectActionPerformed

    private void vPresidentSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vPresidentSelectActionPerformed
        vPresident = vPresidentSelect.getSelectedItem().toString();
    }//GEN-LAST:event_vPresidentSelectActionPerformed

    public void open() {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Voter_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Voter_UI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> disRepresentativeSelect1;
    private javax.swing.JComboBox<String> disRepresentativeSelect2;
    private javax.swing.JComboBox<String> disRepresentativeSelect3;
    private javax.swing.JComboBox<String> disRepresentativeSelect4;
    private javax.swing.JComboBox<String> governorSelect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> mayorSelect;
    private javax.swing.JComboBox<String> presidentSelect;
    private javax.swing.JComboBox<String> senatorSelect1;
    private javax.swing.JComboBox<String> senatorSelect2;
    private javax.swing.JComboBox<String> senatorSelect3;
    private javax.swing.JComboBox<String> senatorSelect4;
    private javax.swing.JComboBox<String> senatorSelect5;
    private javax.swing.JComboBox<String> vPresidentSelect;
    private javax.swing.JButton voteBtn;
    // End of variables declaration//GEN-END:variables
}

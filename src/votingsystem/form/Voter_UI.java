package votingsystem.form;
import votingsystem.model.Storage;

public class Voter_UI extends javax.swing.JFrame {
    
    private String president;
    private String vPresident;
    private String senators[] = new String[5];
    private String distReps[] = new String[4];
    private String governor;
    private String mayor;
    
    public Voter_UI() {
        initComponents();
    }
    
    private String[] getCandidates(String type){
        switch(type){
            case "President":
                return new String[] {
                    Storage.getCandidate(0, "President").getFullName(),
                    Storage.getCandidate(1, "President").getFullName(),
                    Storage.getCandidate(2, "President").getFullName()
                };
            case "Vice_President": 
                return new String[] {
                    Storage.getCandidate(0, "Vice_President").getFullName(),
                    Storage.getCandidate(1, "Vice_President").getFullName(),
                    Storage.getCandidate(2, "Vice_President").getFullName()
                };
            case "Senator": 
            case "District_Representative": 
            case "Governor": 
                return new String[] {
                    Storage.getCandidate(0, "Governor").getFullName(),
                    Storage.getCandidate(1, "Governor").getFullName(),
                    Storage.getCandidate(2, "Governor").getFullName()
                };
            default: 
                return new String[] {
                    Storage.getCandidate(0, "Mayor").getFullName(),
                    Storage.getCandidate(1, "Mayor").getFullName(),
                    Storage.getCandidate(2, "Mayor").getFullName()
                };
        }
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

        senatorSelect2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Candidate"  }));

        senatorSelect3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Candidate" }));

        senatorSelect4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Candidate" }));

        senatorSelect5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Candidate" }));

        presidentSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Candidate" }));

        vPresidentSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Candidate" }));

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

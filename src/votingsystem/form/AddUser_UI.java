package votingsystem.form;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import votingsystem.model.Officer;
import votingsystem.model.Storage;
import votingsystem.model.User;
import votingsystem.model.Voter;

public class AddUser_UI extends javax.swing.JFrame {
    
    User u;
    
    public AddUser_UI() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        User_Name = new javax.swing.JTextField();
        User_Age = new javax.swing.JTextField();
        addCard = new javax.swing.JButton();
        returnMain = new javax.swing.JButton();
        warning = new javax.swing.JLabel();
        User_Type = new javax.swing.JComboBox<>();
        User_Pass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        back.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("User Type:");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Name:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Password:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Age:");

        User_Name.setToolTipText("");

        User_Age.setToolTipText("");

        addCard.setBackground(new java.awt.Color(51, 255, 51));
        addCard.setText("Add");
        addCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCardActionPerformed(evt);
            }
        });

        returnMain.setBackground(new java.awt.Color(255, 153, 0));
        returnMain.setText("Return");
        returnMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnMainActionPerformed(evt);
            }
        });

        warning.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        User_Type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Officer", "Voter" }));

        javax.swing.GroupLayout backLayout = new javax.swing.GroupLayout(back);
        back.setLayout(backLayout);
        backLayout.setHorizontalGroup(
            backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(User_Name, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                    .addComponent(User_Age, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                    .addComponent(User_Type, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(User_Pass))
                .addGap(20, 20, 20))
            .addGroup(backLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(addCard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(warning, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(returnMain)
                .addGap(49, 49, 49))
        );
        backLayout.setVerticalGroup(
            backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(User_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(User_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(User_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(User_Age, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(warning, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addCard)
                        .addComponent(returnMain)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCardActionPerformed
        String userType = (String) User_Type.getSelectedItem();
        boolean flag = false;
        int iage;
        String name, pass, age;
        name = User_Name.getText();
        pass = User_Pass.getText();
        age = User_Age.getText();
        
        if(!name.isEmpty() && !pass.isEmpty() && !age.isEmpty()){
                try{
                    iage = Integer.parseInt(age);
                    if("Add".equals(addCard.getText())){
                        if(userType.equals("Officer")){
                            try {
                                Storage.addUser(new Officer(name, pass, iage,new SimpleDateFormat("yyyy/MM/dd").parse("1987/02/01")));
                                flag = true;
                            } catch (ParseException ex) {
                                Logger.getLogger(AddUser_UI.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }else{
                            try {
                                Storage.addUser(new Voter(name, pass, iage, new SimpleDateFormat("yyyy/MM/dd").parse("1987/02/01")));
                                flag = true;
                            } catch (ParseException ex) {
                                Logger.getLogger(AddUser_UI.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }else{
                        if(userType.equals("Officer")){
                            Storage.getUserList().remove(u);
                            try {
                                Storage.addUser(new Officer(name, pass, iage,new SimpleDateFormat("yyyy/MM/dd").parse("1987/02/01")));
                                flag = true;
                            } catch (ParseException ex) {
                                Logger.getLogger(AddUser_UI.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }else{
                            try {
                                Storage.addUser(new Voter(name, pass, iage, new SimpleDateFormat("yyyy/MM/dd").parse("1987/02/01")));
                                flag = true;
                            } catch (ParseException ex) {
                                Logger.getLogger(AddUser_UI.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        this.dispose();
                    }
                } catch (Exception e) {
                    Logger.getLogger(AddUser_UI.class.getName()).log(Level.SEVERE, null, e);
                }
        }
        if(flag == true){
            warning.setText("");
            this.setVisible(false);
        } else {
            warning.setText("Error");
        }
    }//GEN-LAST:event_addCardActionPerformed

    private void returnMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnMainActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_returnMainActionPerformed
    public void setInit(int x, String name, String age, String pass, User p){
        addCard.setText("Edit");
        User_Type.setSelectedIndex(x);
        User_Pass.setText(pass);
        User_Name.setText(name);
        User_Age.setText(age);
        u = p;
    }

    public void open() {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUser_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddUser_UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField User_Age;
    private javax.swing.JTextField User_Name;
    private javax.swing.JPasswordField User_Pass;
    private javax.swing.JComboBox<String> User_Type;
    private javax.swing.JButton addCard;
    private javax.swing.JPanel back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton returnMain;
    private javax.swing.JLabel warning;
    // End of variables declaration//GEN-END:variables
}

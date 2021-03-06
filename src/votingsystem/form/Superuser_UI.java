package votingsystem.form;
import java.awt.Dimension;
import java.awt.Toolkit;
import votingsystem.model.Storage;
import javax.swing.table.DefaultTableModel;
import votingsystem.model.User;
import java.util.ArrayList;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Collections;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Superuser_UI extends javax.swing.JFrame {
 
    public String opt = "Delete";
    private DefaultTableModel tableModel;
    private DefaultTableModel model;
    
    public Superuser_UI() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        initComponents();
        initTab();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        UserTab = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        Toggle = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        update = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        UserTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "DOB", "Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        UserTab.setGridColor(new java.awt.Color(255, 204, 204));
        jScrollPane1.setViewportView(UserTab);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Toggle.setText("Delete");
        Toggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToggleActionPerformed(evt);
            }
        });

        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        logout.setText("Log-Out");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(update)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Toggle)
                .addGap(18, 18, 18)
                .addComponent(AddButton)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddButton)
                    .addComponent(Toggle)
                    .addComponent(logout)
                    .addComponent(update))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToggleActionPerformed
        // TODO add your handling code here:
        if("Delete".equals(Toggle.getText())){
            Toggle.setText("Edit");
            opt = "Edit";
        }else{
            Toggle.setText("Delete");
            opt = "Delete";
        }
        
    }//GEN-LAST:event_ToggleActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        AddUser_UI au = new AddUser_UI();
        au.pack();
        au.setLocationRelativeTo(null);
        au.open();
    }//GEN-LAST:event_AddButtonActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        new Login_UI().open();
        this.setVisible(false);
    }//GEN-LAST:event_logoutActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        this.UpdateTable();
    }//GEN-LAST:event_updateActionPerformed

    public void open() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Superuser_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            this.setVisible(true);
        });
    }
    
    private void clearRows() {
        int rowCount = UserTab.getRowCount();

        for (int i = rowCount - 1; i >= 0; i--) {
            this.model.removeRow(i);
        }
    }
    
    public void UpdateTable(){
        this.clearRows();
        ArrayList<User> Ulists = Storage.getUserList();
        int x = 0;
        for(User li: Ulists){
            String s = li.getClass().getName();
            s = s.replace("votingsystem.model.", "");
            if(!s.equals("Superuser")){
                Object[] row = {x ,li.getName(),li.getAge(),s};
                this.model.addRow(row);
            }
            x++;
        }
    }
    
   public void initTab(){
        UserTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Age", "Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        });
        
        
        this.model = (DefaultTableModel) UserTab.getModel();
        ArrayList<User> Ulists = Storage.getUserList();
        int x = 0;
        for(User li: Ulists){
            String s = li.getClass().getName();
            s = s.replace("votingsystem.model.", "");
            if(!s.equals("Superuser")){
                Object[] row = {x ,li.getName(),li.getAge(),s};
                model.addRow(row);
            }
            x++;
        }
        
        UserTab.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                JTable table =(JTable) mouseEvent.getSource();
                Point point = mouseEvent.getPoint();
                int row = table.rowAtPoint(point);
                int col = table.columnAtPoint(point);
                int x;
                Object id;
                 
                if (mouseEvent.getClickCount() == 2 ) {
                    
                    x = table.getSelectedRow();
                    id = table.getValueAt(x, 0);
                    
                    if("Delete".equals(opt)){
                        if(JOptionPane.showConfirmDialog(rootPane, "Delete: Are you sure?") == 0){
                            Storage.getUserList().remove((int)id);
                            UpdateTable();
                            JOptionPane.showMessageDialog(rootPane, "Deleted Succesfully");
                        }  
                    }else{
                        AddUser_UI au = new AddUser_UI(); 
                        User type = Storage.getUser((int)id);
                        String s = type.getClass().getName();
                        s = s.replace("votingsystem.model.", "");
                        int i = -1;
                        i = ("Officer".equals(s)? 0 : 1); 
                        au.setInit(i, type.getName(), type.getAge(), type.getPass(), type);
                        au.pack();
                        au.setLocationRelativeTo(null);
                        au.setVisible(true);
                    }
                    // Double click
//                    System.out.println("Col: "+col+" Row:"+row);
//                    System.out.println(table.getSelectedRow());
                }
            }
        });
   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton Toggle;
    private javax.swing.JTable UserTab;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}

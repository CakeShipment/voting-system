package votingsystem.form;
import java.awt.Dimension;
import java.awt.Toolkit;
import votingsystem.model.Candidate;
import votingsystem.model.Storage;

public class Officer_UI extends javax.swing.JFrame {

    public Officer_UI() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        initComponents();
        setPlaceholders();
        if(!Storage.editable()){
            disableEdit();
        }
    }
    
    private void setPlaceholders(){
        president1.setText(fillName(0, "President"));
        president2.setText(fillName(1, "President"));
        president3.setText(fillName(2, "President"));
        vPresident1.setText(fillName(0, "Vice_President"));
        vPresident2.setText(fillName(1, "Vice_President"));
        vPresident3.setText(fillName(2, "Vice_President"));
        senator1.setText(fillName(0, "Senator"));
        senator2.setText(fillName(1, "Senator"));
        senator3.setText(fillName(2, "Senator"));
        senator4.setText(fillName(3, "Senator"));
        senator5.setText(fillName(4, "Senator"));
        senator6.setText(fillName(5, "Senator"));
        senator7.setText(fillName(6, "Senator"));
        senator8.setText(fillName(7, "Senator"));
        senator9.setText(fillName(8, "Senator"));
        senator10.setText(fillName(9, "Senator"));
        disRepresentative1.setText(fillName(0, "District_Representative"));
        disRepresentative2.setText(fillName(1, "District_Representative"));
        disRepresentative3.setText(fillName(2, "District_Representative"));
        disRepresentative4.setText(fillName(3, "District_Representative"));
        disRepresentative5.setText(fillName(4, "District_Representative"));
        disRepresentative6.setText(fillName(5, "District_Representative"));
        disRepresentative7.setText(fillName(6, "District_Representative"));
        disRepresentative8.setText(fillName(7, "District_Representative"));
        disRepresentative9.setText(fillName(8, "District_Representative"));
        disRepresentative10.setText(fillName(9, "District_Representative"));
        governor1.setText(fillName(0, "Governor"));
        governor2.setText(fillName(1, "Governor"));
        governor3.setText(fillName(2, "Governor"));
        mayor1.setText(fillName(0, "Mayor"));
        mayor2.setText(fillName(1, "Mayor"));
        mayor3.setText(fillName(2, "Mayor"));
    }
    
    private String fillName(int indx, String type){
        return (indx < Storage.getCandList(type).size()) ? Storage.getCandidate(indx, type).getFullName() : "";
    }
    
    private void disableEdit(){
        president1.setEditable(false);
        president2.setEditable(false);
        president3.setEditable(false);
        vPresident1.setEditable(false);
        vPresident2.setEditable(false);
        vPresident3.setEditable(false);
        senator1.setEditable(false);
        senator2.setEditable(false);
        senator3.setEditable(false);
        senator4.setEditable(false);
        senator5.setEditable(false);
        senator6.setEditable(false);
        senator7.setEditable(false);
        senator8.setEditable(false);
        senator9.setEditable(false);
        senator10.setEditable(false);
        disRepresentative1.setEditable(false);
        disRepresentative2.setEditable(false);
        disRepresentative3.setEditable(false);
        disRepresentative4.setEditable(false);
        disRepresentative5.setEditable(false);
        disRepresentative6.setEditable(false);
        disRepresentative7.setEditable(false);
        disRepresentative8.setEditable(false);
        disRepresentative9.setEditable(false);
        disRepresentative10.setEditable(false);
        governor1.setEditable(false);
        governor2.setEditable(false);
        governor3.setEditable(false);
        mayor1.setEditable(false);
        mayor2.setEditable(false);
        mayor3.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        president1 = new javax.swing.JTextField();
        president2 = new javax.swing.JTextField();
        president3 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        vPresident1 = new javax.swing.JTextField();
        vPresident2 = new javax.swing.JTextField();
        vPresident3 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        disRepresentative1 = new javax.swing.JTextField();
        disRepresentative2 = new javax.swing.JTextField();
        disRepresentative3 = new javax.swing.JTextField();
        disRepresentative4 = new javax.swing.JTextField();
        disRepresentative5 = new javax.swing.JTextField();
        disRepresentative6 = new javax.swing.JTextField();
        disRepresentative7 = new javax.swing.JTextField();
        disRepresentative8 = new javax.swing.JTextField();
        disRepresentative9 = new javax.swing.JTextField();
        disRepresentative10 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        senator1 = new javax.swing.JTextField();
        senator2 = new javax.swing.JTextField();
        senator3 = new javax.swing.JTextField();
        senator4 = new javax.swing.JTextField();
        senator5 = new javax.swing.JTextField();
        senator6 = new javax.swing.JTextField();
        senator7 = new javax.swing.JTextField();
        senator8 = new javax.swing.JTextField();
        senator9 = new javax.swing.JTextField();
        senator10 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        mayor1 = new javax.swing.JTextField();
        mayor2 = new javax.swing.JTextField();
        mayor3 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        governor1 = new javax.swing.JTextField();
        governor2 = new javax.swing.JTextField();
        governor3 = new javax.swing.JTextField();
        closeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("President");

        president1.setText("jTextField1");

        president2.setText("jTextField1");

        president3.setText("jTextField1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(president1)
            .addComponent(president2)
            .addComponent(president3)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(president1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(president2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(president3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Vice President");

        vPresident1.setText("jTextField1");

        vPresident2.setText("jTextField1");

        vPresident3.setText("jTextField1");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vPresident1)
            .addComponent(vPresident2)
            .addComponent(vPresident3)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vPresident1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vPresident2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vPresident3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("District Representatives");

        disRepresentative1.setText("jTextField1");

        disRepresentative2.setText("jTextField1");

        disRepresentative3.setText("jTextField1");

        disRepresentative4.setText("jTextField1");

        disRepresentative5.setText("jTextField1");

        disRepresentative6.setText("jTextField1");

        disRepresentative7.setText("jTextField1");

        disRepresentative8.setText("jTextField1");

        disRepresentative9.setText("jTextField1");

        disRepresentative10.setText("jTextField1");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 173, Short.MAX_VALUE))
            .addComponent(disRepresentative1)
            .addComponent(disRepresentative2)
            .addComponent(disRepresentative3)
            .addComponent(disRepresentative4)
            .addComponent(disRepresentative5)
            .addComponent(disRepresentative6)
            .addComponent(disRepresentative7)
            .addComponent(disRepresentative8)
            .addComponent(disRepresentative9)
            .addComponent(disRepresentative10)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(disRepresentative1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(disRepresentative2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(disRepresentative3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(disRepresentative4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(disRepresentative5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(disRepresentative6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(disRepresentative7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(disRepresentative8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(disRepresentative9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(disRepresentative10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Senators");

        senator1.setText("jTextField1");

        senator2.setText("jTextField1");

        senator3.setText("jTextField1");

        senator4.setText("jTextField1");

        senator5.setText("jTextField1");

        senator6.setText("jTextField1");

        senator7.setText("jTextField1");

        senator8.setText("jTextField1");

        senator9.setText("jTextField1");

        senator10.setText("jTextField1");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(senator1, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
            .addComponent(senator2)
            .addComponent(senator3)
            .addComponent(senator4)
            .addComponent(senator5)
            .addComponent(senator6)
            .addComponent(senator7)
            .addComponent(senator8)
            .addComponent(senator9)
            .addComponent(senator10)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Mayors");

        mayor1.setText("jTextField1");

        mayor2.setText("jTextField1");

        mayor3.setText("jTextField1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mayor1)
            .addComponent(mayor2)
            .addComponent(mayor3)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mayor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mayor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mayor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Governors");

        governor1.setText("jTextField1");

        governor2.setText("jTextField1");

        governor3.setText("jTextField1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(governor1)
            .addComponent(governor2)
            .addComponent(governor3)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(governor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(governor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(governor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        closeButton.setText("Close / Update");
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(closeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(closeButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        new Login_UI().open();
        
        if(Storage.editable()){
            takeInput(president1.getText(), "President", 0);
            takeInput(president2.getText(), "President", 1);
            takeInput(president3.getText(), "President", 2);
            takeInput(vPresident1.getText(), "Vice_President", 0);
            takeInput(vPresident2.getText(), "Vice_President", 1);
            takeInput(vPresident3.getText(), "Vice_President", 2);
            takeInput(governor1.getText(), "Governor", 0);
            takeInput(governor2.getText(), "Governor", 1);
            takeInput(governor3.getText(), "Governor", 2);
            takeInput(mayor1.getText(), "Mayor", 0);
            takeInput(mayor2.getText(), "Mayor", 1);
            takeInput(mayor3.getText(), "Mayor", 2);
            takeInput(senator1.getText(), "Senator", 0);
            takeInput(senator2.getText(), "Senator", 1);
            takeInput(senator3.getText(), "Senator", 2);
            takeInput(senator4.getText(), "Senator", 3);
            takeInput(senator5.getText(), "Senator", 4);
            takeInput(senator6.getText(), "Senator", 5);
            takeInput(senator7.getText(), "Senator", 6);
            takeInput(senator8.getText(), "Senator", 7);
            takeInput(senator9.getText(), "Senator", 8);
            takeInput(senator10.getText(), "Senator", 9);
            takeInput(disRepresentative1.getText(), "District_Representative", 0);
            takeInput(disRepresentative2.getText(), "District_Representative", 1);
            takeInput(disRepresentative3.getText(), "District_Representative", 2);
            takeInput(disRepresentative4.getText(), "District_Representative", 3);
            takeInput(disRepresentative5.getText(), "District_Representative", 4);
            takeInput(disRepresentative6.getText(), "District_Representative", 5);
            takeInput(disRepresentative7.getText(), "District_Representative", 6);
            takeInput(disRepresentative8.getText(), "District_Representative", 7);
            takeInput(disRepresentative9.getText(), "District_Representative", 8);
            takeInput(disRepresentative10.getText(), "District_Representative", 9);
        }
        
        this.dispose();
    }//GEN-LAST:event_closeButtonMouseClicked

    private void takeInput(String in, String type, int indx){
        if(!in.equals("") && indx == Storage.getCandList(type).size()){
            Storage.addCandidate(new Candidate(in, Storage.stringToType(type), 0));
        }else if(in.equals("") && indx < Storage.getCandList(type).size()){
            Storage.removeCandidate(Storage.getCandidate(indx, type));
        }else if(!Storage.getCandidate(indx, type).getFullName().equals(in)){
            Storage.getCandidate(indx, type).setName(in);
        }
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
            java.util.logging.Logger.getLogger(Officer_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            this.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JTextField disRepresentative1;
    private javax.swing.JTextField disRepresentative10;
    private javax.swing.JTextField disRepresentative2;
    private javax.swing.JTextField disRepresentative3;
    private javax.swing.JTextField disRepresentative4;
    private javax.swing.JTextField disRepresentative5;
    private javax.swing.JTextField disRepresentative6;
    private javax.swing.JTextField disRepresentative7;
    private javax.swing.JTextField disRepresentative8;
    private javax.swing.JTextField disRepresentative9;
    private javax.swing.JTextField governor1;
    private javax.swing.JTextField governor2;
    private javax.swing.JTextField governor3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField mayor1;
    private javax.swing.JTextField mayor2;
    private javax.swing.JTextField mayor3;
    private javax.swing.JTextField president1;
    private javax.swing.JTextField president2;
    private javax.swing.JTextField president3;
    private javax.swing.JTextField senator1;
    private javax.swing.JTextField senator10;
    private javax.swing.JTextField senator2;
    private javax.swing.JTextField senator3;
    private javax.swing.JTextField senator4;
    private javax.swing.JTextField senator5;
    private javax.swing.JTextField senator6;
    private javax.swing.JTextField senator7;
    private javax.swing.JTextField senator8;
    private javax.swing.JTextField senator9;
    private javax.swing.JTextField vPresident1;
    private javax.swing.JTextField vPresident2;
    private javax.swing.JTextField vPresident3;
    // End of variables declaration//GEN-END:variables
}

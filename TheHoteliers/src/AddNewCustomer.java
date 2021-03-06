
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Shreyash Haritashya
 */
public class AddNewCustomer extends javax.swing.JFrame {

    /**
     * Creates new form AddNewCustomer
     */
    public AddNewCustomer() {
        initComponents();
        setCurrentLoginDetails();
        toggleEmployeeButton();
    }
    
    public void toggleEmployeeButton(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/hms?autoReconnect=true&useSSL=false", "root", "aman123456");
            Statement st = con.createStatement();
            String r = "select emp_id from logged_in_hotel_id";
            ResultSet rs0 = st.executeQuery(r);
            if(rs0.next()){
                r = "select is_admin from employee where emp_id = '"+ rs0.getString("emp_id") +"'";
                ResultSet rs1 = st.executeQuery(r);
                if(rs1.next()){
                    if(rs1.getString("is_admin").equals("0")){
                        EmployeeButton.setEnabled(false);
                    }
                }
            }
        } catch(Exception e){
            System.out.print(e);
        }
    }
    
    public void setCurrentLoginDetails(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/hms?autoReconnect=true&useSSL=false", "root", "aman123456");
            Statement st = con.createStatement();
            String r = "select emp_id from logged_in_hotel_id";
            ResultSet rs0 = st.executeQuery(r);
            if(rs0.next()){
                r = "select emp_name, is_admin, emp_id from employee where emp_id = '"+ rs0.getString("emp_id") +"'";
                ResultSet rs1 = st.executeQuery(r);
                if(rs1.next()){
                    if(rs1.getString("is_admin").equals("1")){
                        emp_name_label.setText("Admin Name -");
                    }
                    emp_name_detail.setText(rs1.getString("emp_name"));
                    emp_id_detail.setText(rs1.getString("emp_id"));
                }
            }
        } catch(Exception e){
            System.out.print(e);
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

        bg = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        AppIcon = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        sidePanel = new javax.swing.JPanel();
        HomeButton = new javax.swing.JButton();
        BookingButton = new javax.swing.JButton();
        CustomerButton = new javax.swing.JButton();
        PaymentButton = new javax.swing.JButton();
        EmployeeButton = new javax.swing.JButton();
        SubmitButton2 = new javax.swing.JButton();
        SubmitButton5 = new javax.swing.JButton();
        CenterPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        id_proof = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        SubmitButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        emp_name_detail = new javax.swing.JLabel();
        emp_name_label = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        emp_id_detail = new javax.swing.JLabel();

        setTitle("Add New Customer");
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(1260, 720));

        topPanel.setBackground(new java.awt.Color(89, 95, 239));
        topPanel.setAlignmentX(0.0F);
        topPanel.setAlignmentY(0.0F);

        AppIcon.setBackground(new java.awt.Color(255, 255, 255));
        AppIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjHoteliers/Images/AppIcon.jpg"))); // NOI18N
        AppIcon.setText("Image");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("The Hoteliers");

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Welcome to, Hotel Sinjara");

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(AppIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(14, 14, 14))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AppIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel14))
                .addGap(14, 14, 14))
        );

        sidePanel.setBackground(new java.awt.Color(45, 53, 69));
        sidePanel.setAlignmentX(0.0F);
        sidePanel.setAlignmentY(0.0F);

        HomeButton.setBackground(new java.awt.Color(45, 53, 69));
        HomeButton.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        HomeButton.setForeground(new java.awt.Color(255, 255, 255));
        HomeButton.setText("Home");
        HomeButton.setBorder(null);
        HomeButton.setContentAreaFilled(false);
        HomeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HomeButton.setFocusPainted(false);
        HomeButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        HomeButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });

        BookingButton.setBackground(new java.awt.Color(45, 53, 69));
        BookingButton.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        BookingButton.setForeground(new java.awt.Color(255, 255, 255));
        BookingButton.setText("Bookings");
        BookingButton.setBorder(null);
        BookingButton.setContentAreaFilled(false);
        BookingButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BookingButton.setFocusPainted(false);
        BookingButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BookingButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BookingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookingButtonActionPerformed(evt);
            }
        });

        CustomerButton.setBackground(new java.awt.Color(45, 53, 69));
        CustomerButton.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        CustomerButton.setForeground(new java.awt.Color(89, 95, 239));
        CustomerButton.setText("Customers");
        CustomerButton.setBorder(null);
        CustomerButton.setContentAreaFilled(false);
        CustomerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CustomerButton.setFocusPainted(false);
        CustomerButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CustomerButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerButtonActionPerformed(evt);
            }
        });

        PaymentButton.setBackground(new java.awt.Color(45, 53, 69));
        PaymentButton.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        PaymentButton.setForeground(new java.awt.Color(255, 255, 255));
        PaymentButton.setText("Rooms");
        PaymentButton.setBorder(null);
        PaymentButton.setContentAreaFilled(false);
        PaymentButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PaymentButton.setFocusPainted(false);
        PaymentButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PaymentButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PaymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentButtonActionPerformed(evt);
            }
        });

        EmployeeButton.setBackground(new java.awt.Color(45, 53, 69));
        EmployeeButton.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        EmployeeButton.setForeground(new java.awt.Color(255, 255, 255));
        EmployeeButton.setText("Employees");
        EmployeeButton.setBorder(null);
        EmployeeButton.setContentAreaFilled(false);
        EmployeeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EmployeeButton.setFocusPainted(false);
        EmployeeButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        EmployeeButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        EmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeButtonActionPerformed(evt);
            }
        });

        SubmitButton2.setBackground(new java.awt.Color(255, 51, 0));
        SubmitButton2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        SubmitButton2.setForeground(new java.awt.Color(255, 255, 255));
        SubmitButton2.setText("Log Out");
        SubmitButton2.setBorder(null);
        SubmitButton2.setBorderPainted(false);
        SubmitButton2.setContentAreaFilled(false);
        SubmitButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SubmitButton2.setFocusPainted(false);
        SubmitButton2.setOpaque(true);
        SubmitButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButton2ActionPerformed(evt);
            }
        });

        SubmitButton5.setBackground(new java.awt.Color(89, 95, 239));
        SubmitButton5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        SubmitButton5.setForeground(new java.awt.Color(255, 255, 255));
        SubmitButton5.setText("Update Password");
        SubmitButton5.setBorder(null);
        SubmitButton5.setBorderPainted(false);
        SubmitButton5.setContentAreaFilled(false);
        SubmitButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SubmitButton5.setFocusPainted(false);
        SubmitButton5.setOpaque(true);
        SubmitButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidePanelLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SubmitButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(EmployeeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                        .addComponent(PaymentButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CustomerButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BookingButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HomeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SubmitButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(HomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(BookingButton)
                .addGap(40, 40, 40)
                .addComponent(CustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(PaymentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(EmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(SubmitButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SubmitButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        CenterPanel.setBackground(new java.awt.Color(242, 242, 242));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(45, 53, 69));
        jLabel1.setText("Add New Customer");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(112, 112, 112));
        jLabel8.setText("First Name ");

        fname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fname.setForeground(new java.awt.Color(112, 112, 112));
        fname.setBorder(null);
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });

        lname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lname.setForeground(new java.awt.Color(112, 112, 112));
        lname.setBorder(null);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(112, 112, 112));
        jLabel9.setText("Last Name ");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(112, 112, 112));
        jLabel7.setText("Phone number ");

        phone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        phone.setForeground(new java.awt.Color(112, 112, 112));
        phone.setBorder(null);

        id_proof.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        id_proof.setForeground(new java.awt.Color(112, 112, 112));
        id_proof.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PAN", "Aadhar", "Driving Licience", "Voter ID" }));
        id_proof.setBorder(null);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(112, 112, 112));
        jLabel5.setText("Customer ID ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(112, 112, 112));
        jLabel4.setText("Address ");

        address.setColumns(20);
        address.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        address.setForeground(new java.awt.Color(112, 112, 112));
        address.setRows(5);
        address.setBorder(null);
        address.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(address);

        SubmitButton.setBackground(new java.awt.Color(87, 184, 148));
        SubmitButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        SubmitButton.setForeground(new java.awt.Color(255, 255, 255));
        SubmitButton.setText("ADD");
        SubmitButton.setBorder(null);
        SubmitButton.setBorderPainted(false);
        SubmitButton.setContentAreaFilled(false);
        SubmitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SubmitButton.setFocusPainted(false);
        SubmitButton.setOpaque(true);
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CenterPanelLayout = new javax.swing.GroupLayout(CenterPanel);
        CenterPanel.setLayout(CenterPanelLayout);
        CenterPanelLayout.setHorizontalGroup(
            CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CenterPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CenterPanelLayout.createSequentialGroup()
                        .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(25, 25, 25)
                        .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(phone)
                            .addComponent(id_proof, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lname)
                            .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SubmitButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        CenterPanelLayout.setVerticalGroup(
            CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CenterPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(id_proof, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(SubmitButton)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjHoteliers/Images/AddUser.jpg"))); // NOI18N

        emp_name_detail.setBackground(new java.awt.Color(255, 255, 255));
        emp_name_detail.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        emp_name_detail.setForeground(new java.awt.Color(112, 112, 112));
        emp_name_detail.setText("Shayam Singh");

        emp_name_label.setBackground(new java.awt.Color(255, 255, 255));
        emp_name_label.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        emp_name_label.setForeground(new java.awt.Color(112, 112, 112));
        emp_name_label.setText("Employee Name -");

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(112, 112, 112));
        jLabel26.setText("ID -");

        emp_id_detail.setBackground(new java.awt.Color(255, 255, 255));
        emp_id_detail.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        emp_id_detail.setForeground(new java.awt.Color(112, 112, 112));
        emp_id_detail.setText("10235");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(CenterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(30, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel26)
                            .addComponent(emp_name_label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emp_name_detail)
                            .addComponent(emp_id_detail))
                        .addGap(14, 14, 14))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emp_name_label)
                            .addComponent(emp_name_detail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(emp_id_detail))
                        .addGap(12, 12, 12)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CenterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 1281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        
        SubmitButton.setBorderPainted( false );
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/hms?autoReconnect=true&useSSL=false", "root", "aman123456");
        Statement st = con.createStatement();
        String r = "select id from logged_in_hotel_id";
        ResultSet rs0 = st.executeQuery(r);
        if (rs0.next()) {
            String q = "insert into customer(cust_hotel_id, cust_address, cust_id_type, cust_phone, cust_fname, cust_lname) values "
                   + "('"+ rs0.getString("id") +"', '"+ address.getText() +"', '"+ id_proof.getSelectedItem() +"', '"+ phone.getText() +"', '"+ fname.getText() +"', '"+ lname.getText() +"')";
            st.executeUpdate(q);
            String r1 = "select cust_id from customer order by cust_id desc limit 1";
            ResultSet rs2 = st.executeQuery(r1);
            if(rs2.next()){
                String cust_id = rs2.getString("cust_id");
                String q1 = "update logged_in_hotel_id set cust_id = '"+ cust_id +"'";
                st.executeUpdate(q1); 
                JOptionPane.showMessageDialog(null, "Created Customer Successfully");
                AddNewCustomer.this.setVisible(false);
                NewBooking h = new NewBooking();
                h.setVisible(true);
            }
//            
            
        } else {
            JOptionPane.showMessageDialog(null, "Some Error Occured!");
        }
        
        } catch(Exception e){
            System.out.print(e);
        }
    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        
        AddNewCustomer.this.setVisible(false);
            Home h = new Home();
            h.setVisible(true);
    }//GEN-LAST:event_HomeButtonActionPerformed

    private void BookingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookingButtonActionPerformed
        
        AddNewCustomer.this.setVisible(false);
            Bookings h = new Bookings();
            h.setVisible(true);
    }//GEN-LAST:event_BookingButtonActionPerformed

    private void CustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerButtonActionPerformed
        
        AddNewCustomer.this.setVisible(false);
            Customers h = new Customers();
            h.setVisible(true);
    }//GEN-LAST:event_CustomerButtonActionPerformed

    private void PaymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentButtonActionPerformed
        AddNewCustomer.this.setVisible(false);
            Rooms h = new Rooms();
            h.setVisible(true);
    }//GEN-LAST:event_PaymentButtonActionPerformed

    private void EmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeButtonActionPerformed
        AddNewCustomer.this.setVisible(false);
            Employees h = new Employees();
            h.setVisible(true);
    }//GEN-LAST:event_EmployeeButtonActionPerformed

    private void SubmitButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButton2ActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/hms?autoReconnect=true&useSSL=false", "root", "aman123456");
            Statement st = con.createStatement();
            String r = "delete from logged_in_hotel_id";
            st.executeUpdate(r);
            AddNewCustomer.this.setVisible(false);
            new LogInPage().setVisible(true);
        } catch(Exception e){
            System.out.print(e);
        }
    }//GEN-LAST:event_SubmitButton2ActionPerformed

    private void SubmitButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButton5ActionPerformed
            new UpdatePassword().setVisible(true);
    }//GEN-LAST:event_SubmitButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(AddNewCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AppIcon;
    private javax.swing.JButton BookingButton;
    private javax.swing.JPanel CenterPanel;
    private javax.swing.JButton CustomerButton;
    private javax.swing.JButton EmployeeButton;
    private javax.swing.JButton HomeButton;
    private javax.swing.JButton PaymentButton;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JButton SubmitButton2;
    private javax.swing.JButton SubmitButton5;
    private javax.swing.JTextArea address;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel emp_id_detail;
    private javax.swing.JLabel emp_name_detail;
    private javax.swing.JLabel emp_name_label;
    private javax.swing.JTextField fname;
    private javax.swing.JComboBox id_proof;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField phone;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}

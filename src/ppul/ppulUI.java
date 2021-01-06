package ppul;

import java.time.LocalDate;
import java.util.*;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ppulUI extends javax.swing.JFrame {
    static DefaultListModel<String> allChemicalsModel = new DefaultListModel<>();
    static DefaultListModel<String> selectedChemicalsModel = new DefaultListModel<>();
    static DefaultListModel<String> ragChemicalsModel = new DefaultListModel<>();
    static DefaultListModel<String> customersModel = new DefaultListModel<>();
    DefaultListModel <String> otherChemicalsModel = new DefaultListModel<>();
    static List<String> selectedChemicalsList = new ArrayList<>();    
    static List<String> cusomers;// list to hold customer names received from comparisonLists class
    static List<String> allChemicals; // list to hold chemicals received from comparisonLists class
    List<String> filteredChemicals  = new ArrayList<>();;// arrayList to hold chemical names containihng criteria of filter    
    static List <String> otherChemicalsAList = new ArrayList<>();//a list to hold chemical manually entered that are not in all chemicals list but appear on the PPUL 
    //Table models to load content into tables on Database View tab
    DefaultTableModel customerNameTableModel = new DefaultTableModel();
    DefaultTableModel chemicalNameTableModel = new DefaultTableModel();
    DefaultTableModel ragTableModel = new DefaultTableModel();
    
    comparisonLists cl; // class reads the db to get lists of data, poor naming :(, should have been dbRead or similar 
    dbWriter writer;// class writes to database.
    
   
    
    public ppulUI() {
        initComponents();       
          cl = new comparisonLists();
          cusomers =cl.getCustomerNamesList();
          allChemicals = cl.getmainChemicalsList();
          System.out.println(allChemicals.size());
          loadChemicalList();
          loadDbViewTableModels();
          loadCustomerListModel();
          dateTxtField.setText(LocalDate.now().toString());
          
          
          
    }
    
   private void loadChemicalList(){
        for ( int i = 0; i < allChemicals.size(); i++ ){
        allChemicalsModel.addElement( allChemicals.get(i).toString());
            }
        
        for ( int i = 0; i < allChemicals.size(); i++ ){
        ragChemicalsModel.addElement( allChemicals.get(i).toString());
            }
        }
   
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainTab = new javax.swing.JTabbedPane();
        checkPpulTab = new javax.swing.JPanel();
        searchMainActivesListField = new javax.swing.JTextField();
        mainActivesListSp = new javax.swing.JScrollPane();
        mainActivesList = new javax.swing.JList<>();
        selectedActivesListSp = new javax.swing.JScrollPane();
        SelectedActivesList = new javax.swing.JList<>();
        RemoveElementSelectedListbtn = new javax.swing.JButton();
        checkPPULbtn = new javax.swing.JButton();
        supplierName = new javax.swing.JTextField();
        SearchActivesListLbl = new javax.swing.JLabel();
        SuppierNameLbl = new javax.swing.JLabel();
        InspectionDateLbl = new javax.swing.JLabel();
        VersionLbl = new javax.swing.JLabel();
        SelectedActivesLbl = new javax.swing.JLabel();
        versionTxtField = new javax.swing.JTextField();
        dateTxtField = new javax.swing.JTextField();
        ClearListbtn = new javax.swing.JButton();
        otherChemicalsListSP = new javax.swing.JScrollPane();
        otherChemicalsList = new javax.swing.JList<>();
        otherChemicalsTxtField = new javax.swing.JTextField();
        addOtherChemicalBtn = new javax.swing.JButton();
        removeOtherChemicalBtn = new javax.swing.JButton();
        otherChemicalsLbl = new javax.swing.JLabel();
        addselectedChemicalbtn = new javax.swing.JButton();
        databaseAdminTab = new javax.swing.JPanel();
        NewCustomerTxtField = new javax.swing.JTextField();
        NewChemicalTxtField = new javax.swing.JTextField();
        NewCustomerBtn = new javax.swing.JButton();
        NewChemicalBtn = new javax.swing.JButton();
        NewCustomerLbl = new javax.swing.JLabel();
        NewChemicaLbl = new javax.swing.JLabel();
        updateRagLbl = new javax.swing.JLabel();
        searchRagMainListLbl = new javax.swing.JLabel();
        searchRagMainListTxtField = new javax.swing.JTextField();
        mainRagListSP = new javax.swing.JScrollPane();
        mainRagList = new javax.swing.JList<>();
        selectCustomerLbl = new javax.swing.JLabel();
        customerRagListSP = new javax.swing.JScrollPane();
        customerRagList = new javax.swing.JList<>();
        ragSelectLbl = new javax.swing.JLabel();
        ragStatusListSp = new javax.swing.JScrollPane();
        ragStatusList = new javax.swing.JList<>();
        actiondescriptionLbl = new javax.swing.JLabel();
        SelectionDisplayLbl = new javax.swing.JLabel();
        addToRagListBtn = new javax.swing.JButton();
        updateRagListBtn = new javax.swing.JButton();
        deleteRagBtn = new javax.swing.JButton();
        deleteCustomerBtn = new javax.swing.JButton();
        databaseViewTab = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        mainActivesTableData = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        ragTableData = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        CustomersTableData = new javax.swing.JTable();
        ExportRagTable = new javax.swing.JButton();
        ExportChemicalsTable = new javax.swing.JButton();
        ExportCustomerTable = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INSP(PUL)ECT");
        setResizable(false);

        mainTab.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        checkPpulTab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        checkPpulTab.setPreferredSize(new java.awt.Dimension(800, 600));

        searchMainActivesListField.setToolTipText("Filter chemicals list");
        searchMainActivesListField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchMainActivesListFieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchMainActivesListFieldKeyTyped(evt);
            }
        });

        mainActivesList.setModel(allChemicalsModel);
        mainActivesList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mainActivesListMouseClicked(evt);
            }
        });
        mainActivesListSp.setViewportView(mainActivesList);

        SelectedActivesList.setModel(selectedChemicalsModel);
        selectedActivesListSp.setViewportView(SelectedActivesList);

        RemoveElementSelectedListbtn.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        RemoveElementSelectedListbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ppul/Icons/remove.png"))); // NOI18N
        RemoveElementSelectedListbtn.setText("Remove Active");
        RemoveElementSelectedListbtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        RemoveElementSelectedListbtn.setMaximumSize(new java.awt.Dimension(75, 20));
        RemoveElementSelectedListbtn.setMinimumSize(new java.awt.Dimension(75, 20));
        RemoveElementSelectedListbtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        RemoveElementSelectedListbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveElementSelectedListbtnActionPerformed(evt);
            }
        });

        checkPPULbtn.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        checkPPULbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ppul/Icons/inspect.png"))); // NOI18N
        checkPPULbtn.setText("Inspect List");
        checkPPULbtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        checkPPULbtn.setMaximumSize(new java.awt.Dimension(75, 20));
        checkPPULbtn.setMinimumSize(new java.awt.Dimension(75, 20));
        checkPPULbtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        //checkPPULbtn.setVerticalTextPosition(SwingConstants.BOTTOM);
        //checkPPULbtn.setHorizontalTextPosition(SwingConstants.CENTER);
        checkPPULbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPPULbtnActionPerformed(evt);
            }
        });

        SearchActivesListLbl.setBackground(new java.awt.Color(102, 102, 255));
        SearchActivesListLbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SearchActivesListLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SearchActivesListLbl.setText("Search active ingredients list");
        SearchActivesListLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        SuppierNameLbl.setBackground(new java.awt.Color(102, 102, 255));
        SuppierNameLbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SuppierNameLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SuppierNameLbl.setText("Supplier name");
        SuppierNameLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        InspectionDateLbl.setBackground(new java.awt.Color(51, 102, 255));
        InspectionDateLbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        InspectionDateLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InspectionDateLbl.setText("Inspection date");
        InspectionDateLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        VersionLbl.setBackground(new java.awt.Color(51, 102, 255));
        VersionLbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        VersionLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VersionLbl.setText("PPUL Version ");
        VersionLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        SelectedActivesLbl.setBackground(new java.awt.Color(102, 102, 255));
        SelectedActivesLbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SelectedActivesLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SelectedActivesLbl.setText("Selected active ingredients");
        SelectedActivesLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        versionTxtField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        dateTxtField.setText("Date");

        ClearListbtn.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        ClearListbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ppul/Icons/clear.png"))); // NOI18N
        ClearListbtn.setText("Clear List");
        ClearListbtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ClearListbtn.setMaximumSize(new java.awt.Dimension(75, 20));
        ClearListbtn.setMinimumSize(new java.awt.Dimension(75, 20));
        ClearListbtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ClearListbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearListbtnActionPerformed(evt);
            }
        });

        otherChemicalsList.setModel(otherChemicalsModel);
        otherChemicalsListSP.setViewportView(otherChemicalsList);

        addOtherChemicalBtn.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        addOtherChemicalBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ppul/Icons/addsml.png"))); // NOI18N
        addOtherChemicalBtn.setText("Add chemical to list");
        addOtherChemicalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOtherChemicalBtnActionPerformed(evt);
            }
        });

        removeOtherChemicalBtn.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        removeOtherChemicalBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ppul/Icons/removesml.png"))); // NOI18N
        removeOtherChemicalBtn.setText("Remove chemicals from list");
        removeOtherChemicalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeOtherChemicalBtnActionPerformed(evt);
            }
        });

        otherChemicalsLbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        otherChemicalsLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        otherChemicalsLbl.setText("Other chemicals on PPUL");
        otherChemicalsLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        addselectedChemicalbtn.setText(">");
        addselectedChemicalbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addselectedChemicalbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout checkPpulTabLayout = new javax.swing.GroupLayout(checkPpulTab);
        checkPpulTab.setLayout(checkPpulTabLayout);
        checkPpulTabLayout.setHorizontalGroup(
            checkPpulTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkPpulTabLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(checkPpulTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(otherChemicalsLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(checkPpulTabLayout.createSequentialGroup()
                        .addGroup(checkPpulTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(otherChemicalsListSP)
                            .addComponent(SuppierNameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SearchActivesListLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchMainActivesListField)
                            .addComponent(mainActivesListSp, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                            .addComponent(supplierName))
                        .addGap(18, 18, 18)
                        .addComponent(addselectedChemicalbtn)
                        .addGap(33, 33, 33)
                        .addGroup(checkPpulTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(checkPpulTabLayout.createSequentialGroup()
                                .addComponent(addOtherChemicalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(removeOtherChemicalBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
                            .addGroup(checkPpulTabLayout.createSequentialGroup()
                                .addComponent(InspectionDateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dateTxtField))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, checkPpulTabLayout.createSequentialGroup()
                                .addComponent(VersionLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(versionTxtField))
                            .addComponent(SelectedActivesLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(selectedActivesListSp)
                            .addComponent(otherChemicalsTxtField)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, checkPpulTabLayout.createSequentialGroup()
                                .addComponent(RemoveElementSelectedListbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ClearListbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(checkPPULbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(75, 75, 75))
        );

        checkPpulTabLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ClearListbtn, RemoveElementSelectedListbtn, checkPPULbtn});

        checkPpulTabLayout.setVerticalGroup(
            checkPpulTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkPpulTabLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(checkPpulTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SuppierNameLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, checkPpulTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(VersionLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(versionTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(checkPpulTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InspectionDateLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(checkPpulTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dateTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(supplierName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(checkPpulTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchActivesListLbl)
                    .addComponent(SelectedActivesLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(checkPpulTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(checkPpulTabLayout.createSequentialGroup()
                        .addComponent(searchMainActivesListField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(checkPpulTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(checkPpulTabLayout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(addselectedChemicalbtn))
                            .addGroup(checkPpulTabLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mainActivesListSp))))
                    .addGroup(checkPpulTabLayout.createSequentialGroup()
                        .addComponent(selectedActivesListSp, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(checkPpulTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ClearListbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RemoveElementSelectedListbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(checkPPULbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39)
                .addComponent(otherChemicalsLbl)
                .addGap(18, 18, 18)
                .addGroup(checkPpulTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(checkPpulTabLayout.createSequentialGroup()
                        .addComponent(otherChemicalsTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(checkPpulTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addOtherChemicalBtn)
                            .addComponent(removeOtherChemicalBtn)))
                    .addComponent(otherChemicalsListSP, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        checkPpulTabLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ClearListbtn, RemoveElementSelectedListbtn, checkPPULbtn});

        mainTab.addTab("CheckPPUL", checkPpulTab);

        databaseAdminTab.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        databaseAdminTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                databaseAdminTabMouseClicked(evt);
            }
        });

        NewCustomerBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ppul/Icons/addsml.png"))); // NOI18N
        NewCustomerBtn.setText("Add Customer");
        NewCustomerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewCustomerBtnActionPerformed(evt);
            }
        });

        NewChemicalBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ppul/Icons/addsml.png"))); // NOI18N
        NewChemicalBtn.setText("Add Chemical");
        NewChemicalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewChemicalBtnActionPerformed(evt);
            }
        });

        NewCustomerLbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        NewCustomerLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NewCustomerLbl.setText("Add New Customer");
        NewCustomerLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        NewChemicaLbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        NewChemicaLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NewChemicaLbl.setText("Add New Chemical ");
        NewChemicaLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NewChemicaLbl.setMaximumSize(new java.awt.Dimension(100, 15));
        NewChemicaLbl.setMinimumSize(new java.awt.Dimension(100, 15));
        NewChemicaLbl.setPreferredSize(new java.awt.Dimension(100, 15));

        updateRagLbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        updateRagLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateRagLbl.setText("Update RAG List");
        updateRagLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        searchRagMainListLbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        searchRagMainListLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchRagMainListLbl.setText("Search List");
        searchRagMainListLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        searchRagMainListTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchRagMainListTxtFieldKeyTyped(evt);
            }
        });

        mainRagList.setModel(ragChemicalsModel);
        mainRagList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                mainRagListValueChanged(evt);
            }
        });
        mainRagListSP.setViewportView(mainRagList);

        selectCustomerLbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        selectCustomerLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selectCustomerLbl.setText("Select Customer");
        selectCustomerLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        customerRagList.setModel(customersModel);
        SelectionDisplayLbl.setText(customerRagList.getSelectedValue());
        customerRagList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                customerRagListValueChanged(evt);
            }
        });
        customerRagListSP.setViewportView(customerRagList);

        ragSelectLbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ragSelectLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ragSelectLbl.setText("Select RAG Status");
        ragSelectLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ragStatusList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Amber", "Red" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ragStatusList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ragStatusListValueChanged(evt);
            }
        });
        ragStatusListSp.setViewportView(ragStatusList);

        actiondescriptionLbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        actiondescriptionLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        actiondescriptionLbl.setText("RAG list will contain");
        actiondescriptionLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        SelectionDisplayLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SelectionDisplayLbl.setToolTipText("");
        SelectionDisplayLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        addToRagListBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ppul/Icons/addsml.png"))); // NOI18N
        addToRagListBtn.setText("Add To RAG List");
        addToRagListBtn.setEnabled(false);
        addToRagListBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToRagListBtnActionPerformed(evt);
            }
        });

        updateRagListBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ppul/Icons/updatesml.png"))); // NOI18N
        updateRagListBtn.setText("Update RAG List");
        updateRagListBtn.setEnabled(false);
        updateRagListBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateRagListBtnActionPerformed(evt);
            }
        });

        deleteRagBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ppul/Icons/deletesml.png"))); // NOI18N
        deleteRagBtn.setText("Delete From RAG List ");
        deleteRagBtn.setEnabled(false);
        deleteRagBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRagBtnActionPerformed(evt);
            }
        });

        deleteCustomerBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ppul/Icons/deletesml.png"))); // NOI18N
        deleteCustomerBtn.setText("Delete Customer From List");
        deleteCustomerBtn.setEnabled(false);
        deleteCustomerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCustomerBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout databaseAdminTabLayout = new javax.swing.GroupLayout(databaseAdminTab);
        databaseAdminTab.setLayout(databaseAdminTabLayout);
        databaseAdminTabLayout.setHorizontalGroup(
            databaseAdminTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(databaseAdminTabLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(databaseAdminTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(databaseAdminTabLayout.createSequentialGroup()
                        .addGroup(databaseAdminTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(NewCustomerLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NewCustomerTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchRagMainListLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchRagMainListTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mainRagListSP, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NewCustomerBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(85, 85, Short.MAX_VALUE)
                        .addGroup(databaseAdminTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(NewChemicaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectCustomerLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(customerRagListSP)
                            .addComponent(ragSelectLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ragStatusListSp, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(actiondescriptionLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SelectionDisplayLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addToRagListBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateRagListBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NewChemicalTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NewChemicalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteRagBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteCustomerBtn))
                        .addGap(61, 61, 61))
                    .addGroup(databaseAdminTabLayout.createSequentialGroup()
                        .addComponent(updateRagLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 61, Short.MAX_VALUE))))
        );

        databaseAdminTabLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {NewChemicaLbl, NewChemicalTxtField, NewCustomerBtn, NewCustomerLbl, NewCustomerTxtField, SelectionDisplayLbl, actiondescriptionLbl, addToRagListBtn, customerRagListSP, deleteCustomerBtn, deleteRagBtn, mainRagListSP, ragSelectLbl, ragStatusListSp, searchRagMainListLbl, searchRagMainListTxtField, selectCustomerLbl, updateRagListBtn});

        databaseAdminTabLayout.setVerticalGroup(
            databaseAdminTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(databaseAdminTabLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(databaseAdminTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewCustomerLbl)
                    .addComponent(NewChemicaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(databaseAdminTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewCustomerTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewChemicalTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(databaseAdminTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewCustomerBtn)
                    .addComponent(NewChemicalBtn))
                .addGap(18, 18, 18)
                .addComponent(updateRagLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(databaseAdminTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchRagMainListLbl)
                    .addComponent(selectCustomerLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(databaseAdminTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(databaseAdminTabLayout.createSequentialGroup()
                        .addComponent(searchRagMainListTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mainRagListSP, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(databaseAdminTabLayout.createSequentialGroup()
                        .addComponent(customerRagListSP, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ragSelectLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ragStatusListSp, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(actiondescriptionLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SelectionDisplayLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addToRagListBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateRagListBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteRagBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteCustomerBtn)))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        databaseAdminTabLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {NewChemicaLbl, NewChemicalTxtField, NewCustomerBtn, NewCustomerLbl, NewCustomerTxtField, actiondescriptionLbl, ragSelectLbl, searchRagMainListLbl, searchRagMainListTxtField, selectCustomerLbl});

        databaseAdminTabLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {NewChemicalBtn, updateRagLbl});

        databaseAdminTabLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {deleteCustomerBtn, deleteRagBtn, updateRagListBtn});

        mainTab.addTab("Database Admin", databaseAdminTab);

        mainActivesTableData.setModel(chemicalNameTableModel);
        mainActivesTableData.setEnabled(false);
        jScrollPane5.setViewportView(mainActivesTableData);
        if (mainActivesTableData.getColumnModel().getColumnCount() > 0) {
            mainActivesTableData.getColumnModel().getColumn(0).setResizable(false);
        }

        ragTableData.setModel(ragTableModel);
        ragTableData.setEnabled(false);
        jScrollPane6.setViewportView(ragTableData);

        //DefaultTableModel customersTableModel = new DefaultTableModel();
        //customersTableModel.addColumn("CustomerName",customers);
        CustomersTableData.setModel(customerNameTableModel);
        CustomersTableData.setEnabled(false);
        jScrollPane7.setViewportView(CustomersTableData);

        ExportRagTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ppul/Icons/export.png"))); // NOI18N
        ExportRagTable.setText("Export Table");
        ExportRagTable.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ExportRagTable.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ExportRagTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportRagTableActionPerformed(evt);
            }
        });

        ExportChemicalsTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ppul/Icons/export.png"))); // NOI18N
        ExportChemicalsTable.setText("Export Table");
        ExportChemicalsTable.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ExportChemicalsTable.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ExportChemicalsTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportChemicalsTableActionPerformed(evt);
            }
        });

        ExportCustomerTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ppul/Icons/export.png"))); // NOI18N
        ExportCustomerTable.setText("Export Table");
        ExportCustomerTable.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ExportCustomerTable.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ExportCustomerTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportCustomerTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout databaseViewTabLayout = new javax.swing.GroupLayout(databaseViewTab);
        databaseViewTab.setLayout(databaseViewTabLayout);
        databaseViewTabLayout.setHorizontalGroup(
            databaseViewTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(databaseViewTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(databaseViewTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(ExportCustomerTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(databaseViewTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ExportChemicalsTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(databaseViewTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                    .addComponent(ExportRagTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        databaseViewTabLayout.setVerticalGroup(
            databaseViewTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(databaseViewTabLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(databaseViewTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(databaseViewTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExportRagTable)
                    .addComponent(ExportChemicalsTable)
                    .addComponent(ExportCustomerTable))
                .addContainerGap(157, Short.MAX_VALUE))
        );

        mainTab.addTab("Database View", databaseViewTab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainTab)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainTab)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchMainActivesListFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchMainActivesListFieldKeyPressed
        // NOt USED
        
        
    }//GEN-LAST:event_searchMainActivesListFieldKeyPressed
// Search all chemicals list
    private void searchMainActivesListFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchMainActivesListFieldKeyTyped
      
       if(!searchMainActivesListField.getText().equalsIgnoreCase("")){ // if the search criteria is not blank
       allChemicalsModel.clear();
       for ( int i = 0; i < allChemicals.size(); i++ ){
            if(allChemicals.get(i).toLowerCase().contains(searchMainActivesListField.getText().toLowerCase())){
                allChemicalsModel.addElement( allChemicals.get(i).toString());
                
                } 
            } 
       } else{
           allChemicalsModel.clear();
           loadChemicalList();}
    }//GEN-LAST:event_searchMainActivesListFieldKeyTyped

    private void mainActivesListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainActivesListMouseClicked
        // TODO add your handling code here:
        
        //System.out.println(evt.getClickCount());
        if (evt.getClickCount()==2){           
        selectedChemicalsModel.addElement(mainActivesList.getSelectedValue());
        selectedChemicalsList.add(mainActivesList.getSelectedValue());
        }
    }//GEN-LAST:event_mainActivesListMouseClicked

    private void RemoveElementSelectedListbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveElementSelectedListbtnActionPerformed
        // TODO add your handling code here:
        selectedChemicalsList.remove(SelectedActivesList.getSelectedValue());
        selectedChemicalsModel.removeElement(SelectedActivesList.getSelectedValue());
        
    }//GEN-LAST:event_RemoveElementSelectedListbtnActionPerformed

    private void checkPPULbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPPULbtnActionPerformed
            listOperation lo = new listOperation();
            //System.out.println(selectedChemicalsList);
            // add otherchamicals (manualy entered chemicals) to the selected chemicals list so it can be checked againtst restriction lists
            for (int k=0;k<otherChemicalsAList.size();k++){selectedChemicalsList.add(otherChemicalsAList.get(k));}
            
            //inspects selectedChemicalslist and created data objects based on each customer's requirements
            lo.compareList(cusomers, selectedChemicalsList,cl.getAmberLists() , cl.getRedLists());// sort entered chemicals into customer specific RAG list
            
            //generate cutomer requirements based reports using data returned by lo object containing a list of repotData objects
            report rpt = new report(lo.getDataList()); // generate Japnels containing a piechart and data tables     
            //Generate the main report window and panel to which we add the panels returned by rpt object
            JFrame mainChartsFrame = new JFrame("RAG Charts"); // create a new frame
            JPanel mainChartsPanel = new JPanel(); // create a main panel that will have a box layout so we can place all customer reports below each other
            JScrollPane mainScrollPane = new JScrollPane();
            JPanel supplierDetailsPanel = new JPanel();
            supplierDetailsPanel.setLayout(new BoxLayout(supplierDetailsPanel,BoxLayout.X_AXIS));
            mainChartsPanel.setLayout(new BoxLayout(mainChartsPanel,BoxLayout.Y_AXIS)); // boxlayout added to mainGhartsPanel          
            mainChartsPanel.setSize(400, 600);     
           // mainChartsPanel.add(mainScrollPane);
           //mainScrollPane.add(mainChartsPanel);
            
            supplierDetailsPanel.add(new JLabel("Supplier: "+supplierName.getText()+"  "));
            supplierDetailsPanel.add(new JLabel("Version: "+versionTxtField.getText()+"  "));
            supplierDetailsPanel.add(new JLabel("Date: "+dateTxtField.getText()+"  "));
            JButton pdfExport = new JButton("Export to PDF");
            supplierDetailsPanel.add(pdfExport);                 
            pdfExport.addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.event.ActionEvent e){
                        
                        pdfExport pdfexport = new pdfExport(supplierDetailsPanel,rpt.getPanelList(),saveFileChooser.newSaveFileChooser("Save report", mainChartsFrame));
                }
            });
            
            mainChartsPanel.add(supplierDetailsPanel);
            
            // add panels containing the charts and data tables
            for (int i=0;i<rpt.getPanelList().size();i++){
                    mainChartsPanel.add(rpt.getPanelList().get(i));
            }
            
            mainChartsFrame.setVisible(true);
            mainChartsFrame.setSize(800,1200);            
            mainChartsFrame.getContentPane().add(mainChartsPanel);
            
                 
                        
        
    }//GEN-LAST:event_checkPPULbtnActionPerformed

    private void ClearListbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearListbtnActionPerformed
        // TODO add your handling code here:
        selectedChemicalsModel.clear();
        selectedChemicalsList.clear();
    }//GEN-LAST:event_ClearListbtnActionPerformed

    private void addselectedChemicalbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addselectedChemicalbtnActionPerformed
        selectedChemicalsModel.addElement(mainActivesList.getSelectedValue());
        selectedChemicalsList.add(mainActivesList.getSelectedValue());
    }//GEN-LAST:event_addselectedChemicalbtnActionPerformed

    private void addOtherChemicalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOtherChemicalBtnActionPerformed
        // TODO add your handling code here:
        otherChemicalsModel.addElement(otherChemicalsTxtField.getText());
        otherChemicalsAList.add(otherChemicalsTxtField.getText());
    }//GEN-LAST:event_addOtherChemicalBtnActionPerformed

    private void removeOtherChemicalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeOtherChemicalBtnActionPerformed
        // TODO add your handling code here:
        otherChemicalsModel.removeElement(otherChemicalsList.getSelectedValue());
        otherChemicalsAList.remove(otherChemicalsList.getSelectedValue());
    }//GEN-LAST:event_removeOtherChemicalBtnActionPerformed

    private void NewCustomerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewCustomerBtnActionPerformed
        // TODO add your handling code here:
        writer = new dbWriter();
        try{
        writer.insertOneValue("Customers", "CustomerName",NewCustomerTxtField.getText() );//insert a new chemical into the database
        cusomers.clear();
        customersModel.clear();
        cl.refresh();
        loadCustomerListModel();
        NewCustomerTxtField.setText("");//resret textfield to null
        } 
        catch(Exception e){
            infoBox.newErrorBox("Operation could not be executed!", "DB write error");
            }
        
    }//GEN-LAST:event_NewCustomerBtnActionPerformed

    private void addToRagListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToRagListBtnActionPerformed
        // TODO add your handling code here:
         writer = new dbWriter();
         try{
         writer.insertRagValue("CustomerLists", "CustomerName", "ChemicalName", "RAGStatus", customerRagList.getSelectedValue(), mainRagList.getSelectedValue(), ragStatusList.getSelectedValue());
         addToRagListBtn.setEnabled(false);
          allChemicals.clear(); // clear the list of chemicals currenty in memory
        cl.refresh(); // read database again        
        allChemicalsModel.clear(); // cler the current list
        ragChemicalsModel.clear();
         }
         catch(Exception e){
             infoBox.newErrorBox("Operation could not be executed!", "DB write error");
         }
         customerRagList.clearSelection();
        ragStatusList.clearSelection();
        mainRagList.clearSelection();
    }//GEN-LAST:event_addToRagListBtnActionPerformed

    private void updateRagListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateRagListBtnActionPerformed
        // TODO add your handling code here:
        writer = new dbWriter();
        try{
        writer.updateRagValue("CustomerLists", "CustomerName", "ChemicalName", "RAGStatus", customerRagList.getSelectedValue(), mainRagList.getSelectedValue(), ragStatusList.getSelectedValue());
        updateRagListBtn.setEnabled(false);
        allChemicals.clear(); // clear the list of chemicals currenty in memory
        cl.refresh(); // read database again        
        allChemicalsModel.clear(); // cler the current list
        ragChemicalsModel.clear();
        }
        catch(Exception e){
            infoBox.newErrorBox("Operation could not be executed!", "DB write error");
        }
        customerRagList.clearSelection();
        ragStatusList.clearSelection();
        mainRagList.clearSelection();
    }//GEN-LAST:event_updateRagListBtnActionPerformed

    private void NewChemicalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewChemicalBtnActionPerformed
    
        writer = new dbWriter();
        try{
        writer.insertOneValue("ChemicalsMain", "ChemicalName",NewChemicalTxtField.getText() );//insert a new chemical into the database
        allChemicals.clear(); // clear the list of chemicals currenty in memory
        cl.refresh(); // read database again        
        allChemicalsModel.clear(); // cler the current list
        ragChemicalsModel.clear();
        loadChemicalList();//load the list with new elements
        NewChemicalTxtField.setText("");//reset textbox to null
        }catch(Exception e){
            infoBox.newErrorBox("Operation could not be executed!", "DB write error");
        }
        
    }//GEN-LAST:event_NewChemicalBtnActionPerformed

    private void searchRagMainListTxtFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchRagMainListTxtFieldKeyTyped
        // TODO add your handling code here:
        if(!searchRagMainListTxtField.getText().equalsIgnoreCase("")){ // if the search criteria is not blank
       ragChemicalsModel.clear();
       for ( int i = 0; i < allChemicals.size(); i++ ){
            if(allChemicals.get(i).toLowerCase().contains(searchRagMainListTxtField.getText().toLowerCase())){
                ragChemicalsModel.addElement( allChemicals.get(i).toString());
                
                } 
            } 
       } else{
           ragChemicalsModel.clear();
           loadChemicalList();}
    
    }//GEN-LAST:event_searchRagMainListTxtFieldKeyTyped

    private void customerRagListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_customerRagListValueChanged
        // update values selectionDisplayLbl to show what changes will be made in the databas
        SelectionDisplayLbl.setText(customerRagList.getSelectedValue()+" "+mainRagList.getSelectedValue()+" "+ragStatusList.getSelectedValue()+" ");
        ragBtnSet();
        //only enable delete customer button if only a customer is selected 
        if(customerRagList.getSelectedIndex()!=-1&ragStatusList.getSelectedIndex()==-1&mainRagList.getSelectedIndex()==-1){deleteCustomerBtn.setEnabled(true);}else{deleteCustomerBtn.setEnabled(false);}
    }//GEN-LAST:event_customerRagListValueChanged

    private void ragStatusListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ragStatusListValueChanged
       // update values selectionDisplayLbl to show what changes will be made in the databas
        SelectionDisplayLbl.setText(customerRagList.getSelectedValue()+" "+mainRagList.getSelectedValue()+" "+ragStatusList.getSelectedValue()+" ");
        ragBtnSet();
        //only enable delete customer button if only a customer is selected 
        if(customerRagList.getSelectedIndex()!=-1&ragStatusList.getSelectedIndex()==-1&mainRagList.getSelectedIndex()==-1){deleteCustomerBtn.setEnabled(true);}else{deleteCustomerBtn.setEnabled(false);}
    }//GEN-LAST:event_ragStatusListValueChanged

    private void mainRagListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_mainRagListValueChanged
        // update values selectionDisplayLbl to show what changes will be made in the databas
        SelectionDisplayLbl.setText(customerRagList.getSelectedValue()+" "+mainRagList.getSelectedValue()+" "+ragStatusList.getSelectedValue()+" ");
        ragBtnSet();
        //only enable delete customer button if only a customer is selected 
        if(customerRagList.getSelectedIndex()!=-1&ragStatusList.getSelectedIndex()==-1&mainRagList.getSelectedIndex()==-1){deleteCustomerBtn.setEnabled(true);}else{deleteCustomerBtn.setEnabled(false);}
    }//GEN-LAST:event_mainRagListValueChanged

    private void ExportCustomerTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportCustomerTableActionPerformed
        tsvExport.exportTableToFile(CustomersTableData, saveFileChooser.newSaveFileChooser("Export Table", this));
    }//GEN-LAST:event_ExportCustomerTableActionPerformed

    private void ExportChemicalsTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportChemicalsTableActionPerformed
         tsvExport.exportTableToFile(mainActivesTableData, saveFileChooser.newSaveFileChooser("Export Table", this));
    }//GEN-LAST:event_ExportChemicalsTableActionPerformed

    private void ExportRagTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportRagTableActionPerformed
        tsvExport.exportTableToFile(ragTableData, saveFileChooser.newSaveFileChooser("Export Table", this));
    }//GEN-LAST:event_ExportRagTableActionPerformed

    private void deleteRagBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRagBtnActionPerformed
        writer = new dbWriter();
        try{
        writer.deleteRag("CustomerLists", customerRagList.getSelectedValue(), mainRagList.getSelectedValue(), ragStatusList.getSelectedValue());
         allChemicals.clear(); // clear the list of chemicals currenty in memory
        cl.refresh(); // read database again        
        allChemicalsModel.clear(); // cler the current list
        ragChemicalsModel.clear();
        }catch(Exception e){
            infoBox.newErrorBox("Operation could not be executed!", "DB write error");
        }
        customerRagList.clearSelection();
        ragStatusList.clearSelection();
        mainRagList.clearSelection();
    }//GEN-LAST:event_deleteRagBtnActionPerformed

    private void deleteCustomerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCustomerBtnActionPerformed
        writer = new dbWriter();
        try{
           
            writer.deletOneValue("Customers", "CustomerName", customerRagList.getSelectedValue());            
            customersModel.clear();
            cl.refresh(); // read database again        
            loadCustomerListModel();
            
        }catch(Exception e){
            infoBox.newErrorBox("Operation could not be executed!", "DB write error");
        }
        customerRagList.clearSelection();
        deleteCustomerBtn.setEnabled(false);
    }//GEN-LAST:event_deleteCustomerBtnActionPerformed

    private void databaseAdminTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_databaseAdminTabMouseClicked
        if(evt.getClickCount()==2){
            customerRagList.clearSelection();
            ragStatusList.clearSelection();
            mainRagList.clearSelection();
            ragBtnSet();
        }
    }//GEN-LAST:event_databaseAdminTabMouseClicked

    private void loadDbViewTableModels (){ // method to load data into the table models for the dataview tab
        Object [] customers = cusomers.toArray();
        customerNameTableModel.addColumn("Customer Name", customers);
        
        Object [] chemicals = allChemicals.toArray();
        chemicalNameTableModel.addColumn("Chemical Name", chemicals);
        
        ragTableModel.addColumn("Customer Name");
        ragTableModel.addColumn("Chemical Name");
        ragTableModel.addColumn("RAG");
        
        for (int i=0;i<cusomers.size();i++){ // iterate through the list of customers
            for (int j=0;j<cl.getAmberLists().get(cusomers.get(i)).size();j++){ // for each customer, retieve the amber list
                Object [] ambers = {cusomers.get(i),cl.getAmberLists().get(cusomers.get(i)).get(j),"Amber"};//create an Object array with customer name+chemical name+RAG status for all amber chemicals
                ragTableModel.addRow(ambers);                
            }
        }
        
        for (int i=0;i<cusomers.size();i++){ // iterate through the list of customers
            for (int j=0;j<cl.getRedLists().get(cusomers.get(i)).size();j++){ // for each customer, retieve the red list
                Object [] reds = {cusomers.get(i),cl.getRedLists().get(cusomers.get(i)).get(j),"Red"};//create an Object array with customer name+chemical name+RAG status for all red chemicals
                ragTableModel.addRow(reds);                
            }
        }
        
        
        
    }
    
    private void loadCustomerListModel(){
        for (int i = 0;i<cusomers.size();i++){
            customersModel.addElement(cusomers.get(i));
        }
    
    }
    
    private void ragBtnSet(){ //conditions to enable or disable "Add/Update RAG list" buttons 
        if(addToRagListBtn.isEnabled()&updateRagListBtn.isEnabled()){//the two buttons cannot both be enabled at the same time
            addToRagListBtn.setEnabled(false);
            updateRagListBtn.setEnabled(false);
        }
        
        if (customerRagList.getSelectedIndex()!=-1&ragStatusList.getSelectedIndex()!=-1&mainRagList.getSelectedIndex()!=-1){
            if(!cl.getAmberLists().get(customerRagList.getSelectedValue()).contains(mainRagList.getSelectedValue())&
                   !cl.getRedLists().get(customerRagList.getSelectedValue()).contains(mainRagList.getSelectedValue()) ){
            addToRagListBtn.setEnabled(true);}//if the active is not in any of the rag lists for the selected customer, add btn is enabled.
            else{
                addToRagListBtn.setEnabled(false);
                updateRagListBtn.setEnabled(true);//if the active is in any of the rag lists for the selected customer, update btn is enabled.
                deleteRagBtn.setEnabled(true);//if the active is in any of the rag lists for the selected customer, delete btn is enabled.
            }
        }else{// if nothing is selected dsable all buttons
            addToRagListBtn.setEnabled(false);
            updateRagListBtn.setEnabled(false);
            deleteRagBtn.setEnabled(false);
        }
    
    }
    
    

    public static void main(String args[]) {
         //load main chemical list into list <- for testing onlym separata into it's own method
          
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ppulUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ppulUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ppulUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ppulUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ppulUI().setVisible(true);
                
            }
        });
        
       
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearListbtn;
    private javax.swing.JTable CustomersTableData;
    private javax.swing.JButton ExportChemicalsTable;
    private javax.swing.JButton ExportCustomerTable;
    private javax.swing.JButton ExportRagTable;
    private javax.swing.JLabel InspectionDateLbl;
    private javax.swing.JLabel NewChemicaLbl;
    private javax.swing.JButton NewChemicalBtn;
    private javax.swing.JTextField NewChemicalTxtField;
    private javax.swing.JButton NewCustomerBtn;
    private javax.swing.JLabel NewCustomerLbl;
    private javax.swing.JTextField NewCustomerTxtField;
    private javax.swing.JButton RemoveElementSelectedListbtn;
    private javax.swing.JLabel SearchActivesListLbl;
    private javax.swing.JLabel SelectedActivesLbl;
    private javax.swing.JList<String> SelectedActivesList;
    private javax.swing.JLabel SelectionDisplayLbl;
    private javax.swing.JLabel SuppierNameLbl;
    private javax.swing.JLabel VersionLbl;
    private javax.swing.JLabel actiondescriptionLbl;
    private javax.swing.JButton addOtherChemicalBtn;
    private javax.swing.JButton addToRagListBtn;
    private javax.swing.JButton addselectedChemicalbtn;
    private javax.swing.JButton checkPPULbtn;
    private javax.swing.JPanel checkPpulTab;
    private javax.swing.JList<String> customerRagList;
    private javax.swing.JScrollPane customerRagListSP;
    private javax.swing.JPanel databaseAdminTab;
    private javax.swing.JPanel databaseViewTab;
    private javax.swing.JTextField dateTxtField;
    private javax.swing.JButton deleteCustomerBtn;
    private javax.swing.JButton deleteRagBtn;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JList<String> mainActivesList;
    private javax.swing.JScrollPane mainActivesListSp;
    private javax.swing.JTable mainActivesTableData;
    private javax.swing.JList<String> mainRagList;
    private javax.swing.JScrollPane mainRagListSP;
    private javax.swing.JTabbedPane mainTab;
    private javax.swing.JLabel otherChemicalsLbl;
    private javax.swing.JList<String> otherChemicalsList;
    private javax.swing.JScrollPane otherChemicalsListSP;
    private javax.swing.JTextField otherChemicalsTxtField;
    private javax.swing.JLabel ragSelectLbl;
    private javax.swing.JList<String> ragStatusList;
    private javax.swing.JScrollPane ragStatusListSp;
    private javax.swing.JTable ragTableData;
    private javax.swing.JButton removeOtherChemicalBtn;
    private javax.swing.JTextField searchMainActivesListField;
    private javax.swing.JLabel searchRagMainListLbl;
    private javax.swing.JTextField searchRagMainListTxtField;
    private javax.swing.JLabel selectCustomerLbl;
    private javax.swing.JScrollPane selectedActivesListSp;
    private javax.swing.JTextField supplierName;
    private javax.swing.JLabel updateRagLbl;
    private javax.swing.JButton updateRagListBtn;
    private javax.swing.JTextField versionTxtField;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hashtable;

import Hashtable.HashTable.PROBING_METHOD;
import static Hashtable.HashTable.PROBING_METHOD.LINEAR_PROBING;
import static Hashtable.HashTable.PROBING_METHOD.QUADRATIC_HASHING;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Graphical user interface for visualisation of a HashTable dataStructur
 *
 * @author Thomas Hunt
 * @author Josh Mullin HashFrame class creates the swing components to display
 * the visulations
 */
public class HashFrame extends javax.swing.JFrame implements ActionListener {

    private static HashTable hashtable;
    private int value;
    private int hash;
    private int count;
    private String collisionMethod = "linear";
    private int numCollisions;
    private String method;

    /**
     * Constructor, creates a new HashFrame and calls initComponents method to
     * initialise the frame
     */
    public HashFrame() {
        hashtable = new HashTable(LINEAR_PROBING);
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * Sets up the swing components of the frame
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        aboutButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        inputTextField = new javax.swing.JTextField();
        insertButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        linearButton = new javax.swing.JRadioButton();
        quadButton = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        aboutLinear = new javax.swing.JButton();
        aboutQuad = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        collisionsButton = new javax.swing.JLabel();
        numCollisionButton = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        errorLabel = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        alreadyLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));

        textArea.setEditable(false);
        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Hashtable Visualisation");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Index", "Contents"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setFillsViewportHeight(true);
        table.setMaximumSize(new java.awt.Dimension(2147483647, 220));
        table.setMinimumSize(new java.awt.Dimension(30, 150));
        table.setPreferredSize(new java.awt.Dimension(75, 100));
        table.setRowHeight(28);
        table.getTableHeader().setResizingAllowed(false);
        table.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(0).setPreferredWidth(40);
            table.getColumnModel().getColumn(1).setResizable(false);
        }
        for(int i = 0; i < 10; i++){
            table.setValueAt(null, i, 1);
        }

        //Sets index values
        for(int i = 0; i < 10; i++){
            table.setValueAt(i, i, 0);
        }

        aboutButton.setText("About");
        aboutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(270, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(218, 218, 218)
                .addComponent(aboutButton)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aboutButton)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel4.setText("Value");

        insertButton.setText("Insert");
        insertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButtonActionPerformed(evt);
            }
        });

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        nextButton.setText("Next");
        nextButton.setEnabled(false);
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(linearButton);
        linearButton.setSelected(true);
        linearButton.setText("Linear");
        linearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linearButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(quadButton);
        quadButton.setText("Quadratic");
        quadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quadButtonActionPerformed(evt);
            }
        });

        jLabel7.setText("Collision Resolution Method");

        aboutLinear.setText("?");
        aboutLinear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutLinearActionPerformed(evt);
            }
        });

        aboutQuad.setText("?");
        aboutQuad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutQuadActionPerformed(evt);
            }
        });

        jLabel8.setText("Hashing Function");

        collisionsButton.setText("Number of Collisions");

        numCollisionButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numCollisionButton.setText("0");

        jLabel9.setText("Hash = Value % Capacity");

        jLabel1.setText("Capacity");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("10");

        errorLabel.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        errorLabel.setForeground(new java.awt.Color(255, 0, 0));
        errorLabel.setText("Values must be an Integer greater than zero");

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        alreadyLabel.setForeground(new java.awt.Color(255, 0, 0));
        alreadyLabel.setText("Value is already in the HashTable");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(inputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(resetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(insertButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nextButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(closeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel4))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(quadButton)
                                    .addComponent(linearButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(aboutQuad)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(collisionsButton)
                                                .addGap(27, 27, 27))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(aboutLinear)
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addGap(76, 76, 76)
                                                        .addComponent(jLabel9)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                                                .addComponent(numCollisionButton)
                                                .addGap(70, 70, 70)))
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)))
                                        .addGap(26, 26, 26))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel8)
                                .addContainerGap())))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(errorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(alreadyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(collisionsButton)
                    .addComponent(jLabel1))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(insertButton)
                            .addComponent(nextButton)
                            .addComponent(linearButton)
                            .addComponent(aboutLinear))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchButton)
                            .addComponent(deleteButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(closeButton)
                            .addComponent(resetButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numCollisionButton)
                            .addComponent(jLabel9)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quadButton)
                            .addComponent(aboutQuad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(errorLabel)
                .addGap(2, 2, 2)
                .addComponent(alreadyLabel))
        );

        errorLabel.setVisible(false);
        alreadyLabel.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
        Controls the behaviour of the insert button
        First error checks that the inputed value is valid
        Then starts process for inserting value into the hashtable
     */
    private void insertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButtonActionPerformed
        // TODO add your handling code here:
        method = "insert";
        errorLabel.setVisible(false);
        alreadyLabel.setVisible(false);
        if (notInt(inputTextField.getText())) {
            errorLabel.setVisible(true);
            //ErrorDialog error = new ErrorDialog(this, true);
            //error.setLocationRelativeTo(this);
            //error.setVisible(true);
        } else if (Integer.parseInt(inputTextField.getText()) <= 0) {
            errorLabel.setVisible(true);
            //ErrorDialog error = new ErrorDialog(this, true);
            //error.setLocationRelativeTo(this);
            //error.setVisible(true);

        } else {
            numCollisions = 0;
            value = Integer.parseInt(inputTextField.getText());
            hash = value % 10;
            //int[] htable = hashtable.getTable();
            textArea.append("Hash Function = Input Value % Hashtable Size\n");
            textArea.append("Hash = " + inputTextField.getText() + " % 10 = " + hash + "\n");
            textArea.append("Trying to insert " + value + " at index " + hash + "\n");
            insertButton.setEnabled(false);
            nextButton.setEnabled(true);
            /*if(htable[hash] == 0){
            hashtable.put(value);
            htable = hashtable.getTable();
            table.setValueAt(htable[hash], hash, 0);
            textArea.append("Inserted " + value + " at position " + hash + "\n\n");
        }*/
        }


    }//GEN-LAST:event_insertButtonActionPerformed

    /*
       Controls behaviour of the reset button
       Resets gui and hashtable to default state on click
     */
    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        hashtable.clear();
        for (int i = 0; i < 10; i++) {
            table.setValueAt(null, i, 1);
        }
        count = 0;
        textArea.setText("");
        insertButton.setEnabled(true);
        nextButton.setEnabled(false);
        deleteButton.setEnabled(true);
        searchButton.setEnabled(true);
        numCollisions = 0;
        numCollisionButton.setText(String.valueOf(numCollisions));
    }//GEN-LAST:event_resetButtonActionPerformed

    /*
        controls behaviour of the next button 
        goes through step by step showing via the textArea how the value is
        being inserted into the hash table.
     */
    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // TODO add your handling code here:
        //int value = Integer.parseInt(inputTextField.getText());
        //int hash = value % 10;
        //int count = 0;
        if (method.equals("insert")) {
            if (numCollisions == 10) {
                textArea.append("HashTable is full, push reset to clear table");
                nextButton.setEnabled(false);
                insertButton.setEnabled(true);
                deleteButton.setEnabled(true);
                searchButton.setEnabled(true);
            } else if (hashtable.getTable()[hash] == value) {
                textArea.append("Value is already in the HashTable\n" + "\n");
                alreadyLabel.setVisible(true);
                nextButton.setEnabled(false);
                insertButton.setEnabled(true);
                searchButton.setEnabled(true);
                deleteButton.setEnabled(true);
                numCollisions = 0;
                numCollisionButton.setText(String.valueOf(numCollisions));

            } else if (hashtable.getTable()[hash] == 0) {
                hashtable.put(value);
                textArea.append("Inserted " + value + " at index " + hash + "\n" + "\n");
                table.setValueAt(hashtable.getTable()[hash], hash, 1);
                count++;
                numCollisions = 0;
                numCollisionButton.setText(String.valueOf(numCollisions));
                nextButton.setEnabled(false);
                insertButton.setEnabled(true);
                searchButton.setEnabled(true);
                deleteButton.setEnabled(true);
            } else if (hashtable.getTable()[hash] != 0 && hashtable.getTable()[hash] != value) {
                textArea.append("Index " + hash + " is already occupied\n");
                if (collisionMethod.equals("linear")) {
                    numCollisions++;
                    numCollisionButton.setText(String.valueOf(numCollisions));
                    hash++;
                    textArea.append("Incrementing hash value\n");
                    if (hash == 10) {
                        textArea.append("Hash value is now greater than the capacity of the Hashtable\n");
                        textArea.append("Setting hash to 0 \n");
                        hash = 0;
                    }
                    textArea.append("Trying to insert " + value + " at index " + hash + "\n");

                } else if (collisionMethod.equals("quad")) {
                    textArea.append("Calculating new hash value\n");
                    int oldHash = hash;
                    numCollisions++;
                    numCollisionButton.setText(String.valueOf(numCollisions));
                    hash = hashtable.quadHash(value, numCollisions);
                    textArea.append("New Hash = (" + value + " % 10) + (number of collisions ^ 2)\n");
                    textArea.append("New Hash value = " + hash + "\n");

                }
            }
        }
        else if (method.equals("delete")){
            if(numCollisions > 10){
                textArea.append("Number of collisions exceeds Hashtable capacity\n ");
                textArea.append(value + " is not in the Hashtable\n\n");
                numCollisions = 0;
                nextButton.setEnabled(false);
                insertButton.setEnabled(true);
                searchButton.setEnabled(true);
                deleteButton.setEnabled(true);
                numCollisionButton.setText(String.valueOf(numCollisions));
            }
            else if (hashtable.getTable()[hash] == value) {
                hashtable.remove(value);
                textArea.append(value + " has been deleted from position " + hash + "\n\n");
                table.setValueAt(null, hash, 1);
                nextButton.setEnabled(false);
                insertButton.setEnabled(true);
                searchButton.setEnabled(true);
                deleteButton.setEnabled(true);
                numCollisions = 0;
                numCollisionButton.setText(String.valueOf(numCollisions));

            }
            else if(hashtable.getTable()[hash] == 0){
                textArea.append("Position " + hash + " is emtpy\n");
                textArea.append(value + " does not appear to be in the hashtable\n\n");
                nextButton.setEnabled(false);
                insertButton.setEnabled(true);
                searchButton.setEnabled(true);
                deleteButton.setEnabled(true);
                numCollisions = 0;
                numCollisionButton.setText(String.valueOf(numCollisions));
            }
            
            else if (hashtable.getTable()[hash] != 0 && hashtable.getTable()[hash] != value) {
                textArea.append("Index " + hash + " is already occupied with a different value\n");
                if (collisionMethod.equals("linear")) {
                    numCollisions++;
                    numCollisionButton.setText(String.valueOf(numCollisions));
                    hash++;
                    textArea.append("Incrementing hash value\n");
                    if (hash == 10) {
                        textArea.append("Hash value is now greater than the capacity of the Hashtable\n");
                        textArea.append("Setting hash to 0 \n");
                        hash = 0;
                    }
                    textArea.append("Searching for " + value + " at index " + hash + "\n");

                } else if (collisionMethod.equals("quad")) {
                    textArea.append("Calculating new hash value\n");
                    int oldHash = hash;
                    numCollisions++;
                    numCollisionButton.setText(String.valueOf(numCollisions));
                    hash = hashtable.quadHash(value, numCollisions);
                    textArea.append("New Hash = (" + value + " % 10) + (number of collisions ^ 2)\n");
                    textArea.append("New Hash value = " + hash + "\n");
                    textArea.append("Searching for " + value + " at index " + hash + "\n");

                }
            }
        }
        else if(method.equals("search")){
            if(numCollisions > 10){
                textArea.append("Number of collisions exceeds Hashtable capacity\n ");
                textArea.append(value + " is not in the Hashtable\n\n");
                numCollisions = 0;
                nextButton.setEnabled(false);
                insertButton.setEnabled(true);
                searchButton.setEnabled(true);
                deleteButton.setEnabled(true);
                numCollisionButton.setText(String.valueOf(numCollisions));
            }
            else if (hashtable.getTable()[hash] == value) {
                textArea.append(value + " has been found at position " + hash + "\n\n");
                nextButton.setEnabled(false);
                insertButton.setEnabled(true);
                searchButton.setEnabled(true);
                deleteButton.setEnabled(true);
                numCollisions = 0;
                numCollisionButton.setText(String.valueOf(numCollisions));

            }
            else if(hashtable.getTable()[hash] == 0){
                textArea.append(value + " does not appear to be in the hashtable\n\n");
                nextButton.setEnabled(false);
                insertButton.setEnabled(true);
                searchButton.setEnabled(true);
                deleteButton.setEnabled(true);
                numCollisions = 0;
                numCollisionButton.setText(String.valueOf(numCollisions));
            }
            
            else if (hashtable.getTable()[hash] != 0 && hashtable.getTable()[hash] != value) {
                textArea.append("Index " + hash + " is already occupied with a different value\n");
                if (collisionMethod.equals("linear")) {
                    numCollisions++;
                    numCollisionButton.setText(String.valueOf(numCollisions));
                    hash++;
                    textArea.append("Incrementing hash value\n");
                    if (hash == 10) {
                        textArea.append("Hash value is now greater than the capacity of the Hashtable\n");
                        textArea.append("Setting hash to 0 \n");
                        hash = 0;
                    }
                    textArea.append("Searching for " + value + " at index " + hash + "\n");

                } else if (collisionMethod.equals("quad")) {
                    textArea.append("Calculating new hash value\n");
                    int oldHash = hash;
                    numCollisions++;
                    numCollisionButton.setText(String.valueOf(numCollisions));
                    hash = hashtable.quadHash(value, numCollisions);
                    textArea.append("New Hash = (" + value + " % 10) + (number of collisions ^ 2)\n");
                    textArea.append("New Hash value = " + hash + "\n");
                    textArea.append("Searching for " + value + " at index " + hash + "\n");

                }
            }
            
        }
        

    }//GEN-LAST:event_nextButtonActionPerformed

    /*
        Closes the program on button click
     */
    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeButtonActionPerformed

    /*
        displays a dialog with some extra information about Hashtables
     */
    private void aboutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutButtonActionPerformed
        // TODO add your handling code here:
        AboutDialog dialog = new AboutDialog(this, true);
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }//GEN-LAST:event_aboutButtonActionPerformed

    /**
     * Method that sets probing method to Linear when liner button is selected
     */
    private void linearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linearButtonActionPerformed
        // TODO add your handling code here:
        hashtable.setHashingT(LINEAR_PROBING);
        collisionMethod = "linear";

    }//GEN-LAST:event_linearButtonActionPerformed

    private void quadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quadButtonActionPerformed
        // TODO add your handling code here:
        hashtable.setHashingT(QUADRATIC_HASHING);
        collisionMethod = "quad";
        collisionsButton.setVisible(true);
        numCollisionButton.setVisible(true);

    }//GEN-LAST:event_quadButtonActionPerformed

    private void aboutLinearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutLinearActionPerformed
        // TODO add your handling code here:
        LinearDialog linearDialog = new LinearDialog(this, true);
        linearDialog.setLocationRelativeTo(this);
        linearDialog.setVisible(true);
    }//GEN-LAST:event_aboutLinearActionPerformed

    private void aboutQuadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutQuadActionPerformed
        // TODO add your handling code here:
        QuadDialog quadDialog = new QuadDialog(this, true);
        quadDialog.setLocationRelativeTo(this);
        quadDialog.setVisible(true);
    }//GEN-LAST:event_aboutQuadActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        method = "search";
        errorLabel.setVisible(false);
        if (notInt(inputTextField.getText())) {
            errorLabel.setVisible(true);
            //ErrorDialog error = new ErrorDialog(this, true);
            //error.setLocationRelativeTo(this);
            //error.setVisible(true);
        } else if (Integer.parseInt(inputTextField.getText()) <= 0) {
            errorLabel.setVisible(true);
            //ErrorDialog error = new ErrorDialog(this, true);
            //error.setLocationRelativeTo(this);
            //error.setVisible(true);

        } else {
            numCollisions = 0;
            value = Integer.parseInt(inputTextField.getText());
            hash = value % 10;
            //int[] htable = hashtable.getTable();
            textArea.append("Hash Function = Input Value % Hashtable Size\n");
            textArea.append("Hash = " + inputTextField.getText() + " % 10 = " + hash + "\n");
            textArea.append("Searching for " + value + " at index " + hash + "\n");
            insertButton.setEnabled(false);
            searchButton.setEnabled(false);
            deleteButton.setEnabled(false);
            nextButton.setEnabled(true);
            /*if(htable[hash] == 0){
            hashtable.put(value);
            htable = hashtable.getTable();
            table.setValueAt(htable[hash], hash, 0);
            textArea.append("Inserted " + value + " at position " + hash + "\n\n");
        }*/
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        method = "delete";
        errorLabel.setVisible(false);
        if (notInt(inputTextField.getText())) {
            errorLabel.setVisible(true);
            //ErrorDialog error = new ErrorDialog(this, true);
            //error.setLocationRelativeTo(this);
            //error.setVisible(true);
        } else if (Integer.parseInt(inputTextField.getText()) <= 0) {
            errorLabel.setVisible(true);
            //ErrorDialog error = new ErrorDialog(this, true);
            //error.setLocationRelativeTo(this);
            //error.setVisible(true);

        } else {
            numCollisions = 0;
            value = Integer.parseInt(inputTextField.getText());
            hash = value % 10;
            //int[] htable = hashtable.getTable();
            textArea.append("Hash Function = Input Value % Hashtable Size\n");
            textArea.append("Hash = " + inputTextField.getText() + " % 10 = " + hash + "\n");
            textArea.append("Searching for " + value + " at index " + hash + "\n");
            insertButton.setEnabled(false);
            deleteButton.setEnabled(false);
            searchButton.setEnabled(false);
            nextButton.setEnabled(true);
            /*if(htable[hash] == 0){
            hashtable.put(value);
            htable = hashtable.getTable();
            table.setValueAt(htable[hash], hash, 0);
            textArea.append("Inserted " + value + " at position " + hash + "\n\n");
        }*/
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

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
            java.util.logging.Logger.getLogger(HashFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HashFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HashFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HashFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HashFrame().setVisible(true);
            }
        });
    }

    // returns true if string does not represent and int value
    // used for determining if inputted values is an Integer or not
    public boolean notInt(String str) {
        try {
            value = Integer.parseInt(inputTextField.getText());
            return false;
        } catch (NumberFormatException e) {
            return true;
        } catch (NullPointerException e) {
            return true;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutButton;
    private javax.swing.JButton aboutLinear;
    private javax.swing.JButton aboutQuad;
    private javax.swing.JLabel alreadyLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel collisionsButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JTextField inputTextField;
    private javax.swing.JButton insertButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton linearButton;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel numCollisionButton;
    private javax.swing.JRadioButton quadButton;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTable table;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

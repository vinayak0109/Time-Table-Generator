
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TeacherSelection extends javax.swing.JFrame {
 
    Connection conn;
    Statement statements;
    ResultSet rs;
    String url="jdbc:mysql://localhost/";
    String dbName="teachers";   
    String driver="com.mysql.jdbc.Driver";
    String userName="root";
    String password="";
    static int teacherList[] = new int[7];
    static ArrayList<String> teacherName = new ArrayList<String>();
    static int timeTableID[][] = new int[6][7];
    /**
     * Creates new form second
     * @throws java.sql.SQLException
     */
    public TeacherSelection() throws SQLException {
        initComponents();
        try{
            Class.forName(driver);
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/teachers?zeroDateTimeBehavior=convertToNull", userName, password);
            statements=conn.createStatement();
            System.out.println("Connection Established");
        }
        catch(ClassNotFoundException | SQLException sqle){
            System.out.println("Connection Failed");
        }
        String query="select first_name, last_name from faculties where classes>0";
        rs = statements.executeQuery(query); 
        while(rs.next()){ 
            String fName=rs.getString("first_name");
            String lName=rs.getString("last_name");
            jComboBox2.addItem(fName + " " + lName);
            jComboBox3.addItem(fName + " " + lName);
            jComboBox5.addItem(fName + " " + lName);
            jComboBox6.addItem(fName + " " + lName);
            jComboBox7.addItem(fName + " " + lName);
            jComboBox8.addItem(fName + " " + lName);
            jComboBox9.addItem(fName + " " + lName);
        }
        
        //For testing
//                int col=j+1;
//                String query="select "+col+"s from `"+id+"`";
//                try {
//                    rs = statements.executeQuery(query);
//                    int row=i+1;
//                    while(rs.next() && row!=0){
//                        checkedValue=rs.getInt(1);
//                        row--;
//                    }
//                    System.out.println("Checked Value"+checkedValue);
//                } catch (SQLException ex) {
//                    Logger.getLogger(TeacherSelection.class.getName()).log(Level.SEVERE, null, ex);
//                }    
        //For testing
    }
    
    static int[][] TT = new int[6][7];
    //FOR CHANGE
        static int change=0;
    //FOR CHANGE
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        ss1 = new javax.swing.JLabel();
        ss2 = new javax.swing.JLabel();
        ss3 = new javax.swing.JLabel();
        ss4 = new javax.swing.JLabel();
        ss5 = new javax.swing.JLabel();
        ss6 = new javax.swing.JLabel();
        ss7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox7 = new javax.swing.JComboBox<>();
        jComboBox8 = new javax.swing.JComboBox<>();
        jComboBox9 = new javax.swing.JComboBox<>();

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Section");

        ss1.setBackground(new java.awt.Color(255, 102, 102));
        ss1.setText("asdff");

        ss2.setText("jLabel3");

        ss3.setText("jLabel4");

        ss4.setText("jLabel5");

        ss5.setText("jLabel6");

        ss6.setText("jLabel7");

        ss7.setText("jLabel8");

        jLabel9.setText("Teacher-Name");

        jButton1.setText("Generate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ss1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ss2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ss3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ss6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ss5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ss4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ss7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ss1))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ss2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ss3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ss4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ss5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ss6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ss7)
                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(24, 24, 24))
        );

        ss2.getAccessibleContext().setAccessibleName("j3");
        ss3.getAccessibleContext().setAccessibleName("");
        ss4.getAccessibleContext().setAccessibleName("j5");
        ss5.getAccessibleContext().setAccessibleName("");
        ss6.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        //For teacherList array and for storing the ID's of the selected teacher in the array
        String teacher1 = jComboBox2.getSelectedItem().toString();
        teacherName.add(teacher1);
        teacher1= teacher1.substring(0, teacher1.indexOf(" ")); 
        String teacher2 = jComboBox3.getSelectedItem().toString();
        teacherName.add(teacher2);
        teacher2= teacher2.substring(0, teacher2.indexOf(" "));
        String teacher3 = jComboBox5.getSelectedItem().toString();
        teacherName.add(teacher3);
        teacher3= teacher3.substring(0, teacher3.indexOf(" "));
        String teacher4 = jComboBox6.getSelectedItem().toString();
        teacherName.add(teacher4);
        teacher4= teacher4.substring(0, teacher4.indexOf(" "));
        String teacher5 = jComboBox7.getSelectedItem().toString();
        teacherName.add(teacher5);
        teacher5= teacher5.substring(0, teacher5.indexOf(" "));
        String teacher6 = jComboBox8.getSelectedItem().toString();
        teacherName.add(teacher6);
        teacher6= teacher6.substring(0, teacher6.indexOf(" "));
        String teacher7 = jComboBox9.getSelectedItem().toString();
        teacherName.add(teacher7);
        teacher7= teacher7.substring(0, teacher7.indexOf(" "));
        
        try { 
            String query="select teacher_id from faculties where first_name='" + teacher1 + "'";
            rs = statements.executeQuery(query);
            while(rs.next()){
                int id=rs.getInt("teacher_id");
                teacherList[0]=id;
            }
            query="select teacher_id from faculties where first_name='" + teacher2 + "'";
            rs = statements.executeQuery(query);
            while(rs.next()){
                int id=rs.getInt("teacher_id");
                teacherList[1]=id;
            }
            query="select teacher_id from faculties where first_name='" + teacher3 + "'";
            rs = statements.executeQuery(query);
            while(rs.next()){
                int id=rs.getInt("teacher_id");
                teacherList[2]=id;
            }
            query="select teacher_id from faculties where first_name='" + teacher4 + "'";
            rs = statements.executeQuery(query);
            while(rs.next()){
                int id=rs.getInt("teacher_id");
                teacherList[3]=id;
            }
            query="select teacher_id from faculties where first_name='" + teacher5 + "'";
            rs = statements.executeQuery(query);
            while(rs.next()){
                int id=rs.getInt("teacher_id");
                teacherList[4]=id;
            }
            query="select teacher_id from faculties where first_name='" + teacher6 + "'";
            rs = statements.executeQuery(query);
            while(rs.next()){
                int id=rs.getInt("teacher_id");
                teacherList[5]=id;
            }
            query="select teacher_id from faculties where first_name='" + teacher7 + "'";
            rs = statements.executeQuery(query);
            while(rs.next()){
                int id=rs.getInt("teacher_id");
                teacherList[6]=id;
            }
//            for(int i=0; i<7; i++){
//                System.out.println(teacherName.get(i));
//            }
        } catch (SQLException ex) {
            Logger.getLogger(TeacherSelection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int[][] periods = new int[7][3];
        //FOR CHANGE
            
            for(int i=0; i<5; i++){
                if(SubjectSelection.subject[i][2]==0){
                    change=i;
                    SubjectSelection.subject[i][2]=1;
                    SubjectSelection.list1.add(Integer.toString(i)+"2");
                    break;
                }
            }
        //FOR CHANGE
        for(int i=0; i<7; i++)
        {
          if(SubjectSelection.subject[i][0]==1)
          {
              periods[i][0]=5;
          }
          if(SubjectSelection.subject[i][1]==1)
          {
              if(SubjectSelection.subject[i][0]==1)
              {
                  periods[i][1]=2;
              }
              else
              {
                  periods[i][1]=4;
              }
          }
          if(SubjectSelection.subject[i][2]==1)
          {
              periods[i][2]=1;
          }
        }

        Random random = new Random();
        System.out.print(SubjectSelection.list1.toString());

        ////provide the dropdown list for the selection of teacher        DONE
        ////and for the selected teacher with particular subject, it is inserted in the list of teacher array as described below
        ////int teacher_list=new int[7];
        ////initialize them with the selected teacher id from the drop down list in the design section
        
        ////will create the list of teacher having their ID's
        ////will create a 2d array of size [6][7] initialized with zero for all the teacher's ID
        ////and if the particular lecture is assigned to some teacher with ID 2 for let say monday 3 theory lecture, so 
        ////we will go to table with ID 2 and check for the [0][2] 0 is for monday and 2 is for third lecture
        ////and if it is 1 then we have to select some other subject for that slot 
        ////and if it is 0 we are good to go and assign that lecture to the selected teacher and 
        
        //once the time table is successfully generated it get stored in the database in the form of table with name SemsterBranchSection 1CSB 
        //when the save button is clicked 1 semester form cse branch and for the b section 
        //one new frame for the display of time table
        //which will have the dropdown for semester branch and section with a button of show 
        //as soon as user selects the options and click the show button the time table will get displayed to the user
        //and if it is not present then the message will appear as the time table is not generated yet for the given input.
        
        //add the teacher name in the time table with the help of teacherName array
        //create tables for all the teachers with their ID number
        //change the column name of the existing table as 1s 2s 3s etc.
        //add one column to all the table with name row with auto increment feature
        //when the save button is clicked the generated time table get stored in the database
        ////when the save button is clicked in TimeTable frame all the selected teachers will be putted in the set and the count for the classes in the database get decreased by 1
        ////when the save button is clicked update the chart of teacher with 1, for let say ID 2 for [0][2] with the value 1 that means this slot for this teacher is now engazed
        
        for(int i=0; i<6; i++)
        {
              ArrayList<String> list = new ArrayList<String>();
              int counter=0;                                    //No two lab should come in the same day
              for(int j=0; j<7; j++)
              {
                      int x,y,flag=1;
                      String r="";
                      int checkedValue=1;
                      do
                      {
                          flag=1;

                          if(counter==0 && (j!=1 && j!=3 && j!=4 && j!=6))
                          {                                       //Anthing can come here as there is no boundation that the practical could not appear here.
                              int randomNumber=random.nextInt(SubjectSelection.list1.size());
                              r=SubjectSelection.list1.get(randomNumber);
                          }
                          else
                          {
                              do                                  //This is loop to ensure that here come the theory or tutorial only
                              {
                                  int randomNumber=random.nextInt(SubjectSelection.list1.size());
                                  r=SubjectSelection.list1.get(randomNumber);
                                  System.out.println("hey  i am r "+ r);
                                  y=Integer.parseInt(String.valueOf(r.charAt(1)));
                              }while(y==1);
                          }

                          if(list.size()!=0)
                          {
                              if(list.indexOf(r)!=-1)
                              {
                                  flag=0;                       //for not adding the subject which is already added for that day
                              }
                              for(int l=0;l<list.size();l++)
                              {
                                  Character c=new Character(list.get(l).charAt(0));
                                  Character d=new Character(list.get(l).charAt(1));
                                  //if(r.charAt(1)!=1)
                                  //{ 
                                  //Below code for ensuring that in a single day no two practical can come
                                  
                                      if(c.equals(new Character(r.charAt(0))) && !((new Character(r.charAt(1)).equals(new Character('1'))) || d.equals(new Character('1'))))
                                      {
                                          flag=0;
                                          break;
                                      }
                                  //}
                              }
                          }

                      x=Integer.parseInt(String.valueOf(r.charAt(0)));
                      y=Integer.parseInt(String.valueOf(r.charAt(1)));

                      //For checking if the selected slot for the teacher is availble or not by storing the value in the checkedValue variable
                      //For change
                      int id=teacherList[x];
//                      System.out.println("ID"+id);
                      timeTableID[i][j]=id;
                      int col=j+1;
                      int row=i+1;
                      String query="select "+col+"s from `"+id+"` where `row`="+row;
                          try {
                              rs = statements.executeQuery(query);
                              while(rs.next()){
                                  checkedValue=rs.getInt(1);
                              }
                              System.out.println("Checked Value"+checkedValue);
                              
                          } catch (SQLException ex) {
                              Logger.getLogger(TeacherSelection.class.getName()).log(Level.SEVERE, null, ex);
                          }
                        //For change
                      
                      }while(periods[x][y]<=0 || flag==0 || checkedValue==1);         //if there is no period available for the randoml selected subject then the do the whole thing again


                      if(y==1)
                      {
                              TT[i][j]=TT[i][j+1]=Integer.parseInt(r);   
                              timeTableID[i][j+1]=teacherList[x];
                              j+=1;
                              periods[x][y]-=2;
                              counter=1;
                      }
                      else
                      {
                              TT[i][j]=Integer.parseInt(r);
                              periods[x][y]-=1;
                      }

                      list.add(r);

                      if(periods[x][y]==0){
                          SubjectSelection.list1.remove(new String(r));
                      }
                          
                      //for checking
                      for(int k=0; k<7; k++)
                      {
                          System.out.print(periods[k][0]);
                          System.out.print(periods[k][1]);
                          System.out.println(periods[k][2]);
                      }
                      System.out.println(list.toString());
                      System.out.println(SubjectSelection.list1.toString());
                      //for checking

              }
              list.removeAll(list);
              System.out.println("");
              System.out.println("");
        }
        
        //just for checking
        System.out.println("Teachers ID");
        for(int i=0; i<7; i++){
            System.out.print(teacherList[i]+" ");
        }
        System.out.println();
        System.out.println("TIME TABLE");
        for(int i=0; i<6; i++){
            for(int j=0; j<7; j++){
                System.out.print(timeTableID[i][j]+" ");
            }
            System.out.println("");
        }
        //for checking
  
        Timetable s1=new Timetable();
        s1.setVisible(true);
  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox9ActionPerformed

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
            java.util.logging.Logger.getLogger(TeacherSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TeacherSelection().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(TeacherSelection.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JLabel ss1;
    public javax.swing.JLabel ss2;
    public javax.swing.JLabel ss3;
    public javax.swing.JLabel ss4;
    public javax.swing.JLabel ss5;
    public javax.swing.JLabel ss6;
    public javax.swing.JLabel ss7;
    // End of variables declaration//GEN-END:variables
}

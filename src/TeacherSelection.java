
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TeacherSelection extends javax.swing.JFrame {
 
    Connection conn;
    Statement statements;
    ResultSet rs;
    String url="jdbc:mysql://localhost/";
    String dbName="teachers";   
    String driver="com.mysql.jdbc.Driver";
    String userName="root";
    String password="";
    
    static int teacherList[] = new int[7];                                          //For storing the ID's for each selected teacher
    static ArrayList<String> teacherName = new ArrayList<String>();                 //For storing the names of the selected teacher
    static ArrayList<String> teacherShortName = new ArrayList<String>();            //For storing the short names of the selected teachers which is going to be used for giving the teacher name in the Timetable
    static int timeTableID[][] = new int[6][7];                                     //For storing all the slots alloted to which teacher for the purpose of changing their status in the database as 1 from 0
    static String section;                                                          //For storing the selected section 
    /**
     * Creates new form second
     * @throws java.sql.SQLException
     */
    public TeacherSelection() throws SQLException {
        initComponents();
        
        
        //For database connectivity
        try{
            Class.forName(driver);
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/teachers?zeroDateTimeBehavior=convertToNull", userName, password);
            statements=conn.createStatement();
            System.out.println("Connection Established");
        }
        catch(ClassNotFoundException | SQLException sqle){
            System.out.println("Connection Failed");
        }
        
        //For setting the comboBox list with all the available teachers from the database having count > 0
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
    
    static int[][] TT = new int[6][7];                                              //For storing the sample timetable for the testing purpose
    
    //For change
    static String[][] TTUpdated = new String[6][7];
    //For change
    
    static int change=0;                                                            //For getting the correct position for the Mentor/Library lecture
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox4 = new javax.swing.JComboBox<>();
        sectionName = new javax.swing.JComboBox();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Teacher Selection");

        sectionName.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C" }));
        sectionName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sectionNameActionPerformed(evt);
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
                        .addComponent(sectionName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(sectionName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        //For checking if time table for that sem, branch and section already exists or not
        String tableFullName="";
        section=sectionName.getSelectedItem().toString();                           //For getting the selected section
        tableFullName=tableFullName + SubjectSelection.semester + SubjectSelection.branch + section;
        DatabaseMetaData dbm;
        try {
            //For checking if "tableName" table is there
            dbm = conn.getMetaData();
            ResultSet tables = dbm.getTables(null, null, tableFullName, null);
            if (tables.next()) {
                System.out.println("Exists");       // Table exists
                JOptionPane.showMessageDialog(null, "Time-Table already exists!", "Error", JOptionPane.ERROR_MESSAGE);
                this.setVisible(false);
            } else{
                 
                //If not exist then do the following thing

                //For storing the names in teacherName array, for storing the short names in teacherShortName array
                //and for storing the ID's of the selected teacher in the teacherList array
                String shortName ="";
                String teacher1 = jComboBox2.getSelectedItem().toString();
                shortName ="";
                shortName=shortName+teacher1.charAt(0)+teacher1.charAt(teacher1.indexOf(" ")+1);
                teacherShortName.add(shortName);
                teacherName.add(teacher1);
                teacher1= teacher1.substring(0, teacher1.indexOf(" ")); 

                String teacher2 = jComboBox3.getSelectedItem().toString();
                shortName ="";
                shortName=shortName+teacher2.charAt(0)+teacher2.charAt(teacher2.indexOf(" ")+1);
                teacherShortName.add(shortName);
                teacherName.add(teacher2);
                teacher2= teacher2.substring(0, teacher2.indexOf(" "));

                String teacher3 = jComboBox5.getSelectedItem().toString();
                shortName ="";
                shortName=shortName+teacher3.charAt(0)+teacher3.charAt(teacher3.indexOf(" ")+1);
                teacherShortName.add(shortName);
                teacherName.add(teacher3);
                teacher3= teacher3.substring(0, teacher3.indexOf(" "));

                String teacher4 = jComboBox6.getSelectedItem().toString();
                shortName ="";
                shortName=shortName+teacher4.charAt(0)+teacher4.charAt(teacher4.indexOf(" ")+1);
                teacherShortName.add(shortName);
                teacherName.add(teacher4);
                teacher4= teacher4.substring(0, teacher4.indexOf(" "));

                String teacher5 = jComboBox7.getSelectedItem().toString();
                shortName ="";
                shortName=shortName+teacher5.charAt(0)+teacher5.charAt(teacher5.indexOf(" ")+1);
                teacherShortName.add(shortName);
                teacherName.add(teacher5);
                teacher5= teacher5.substring(0, teacher5.indexOf(" "));

                String teacher6 = jComboBox8.getSelectedItem().toString();
                shortName ="";
                shortName=shortName+teacher6.charAt(0)+teacher6.charAt(teacher6.indexOf(" ")+1);
                teacherShortName.add(shortName);
                teacherName.add(teacher6);
                teacher6= teacher6.substring(0, teacher6.indexOf(" "));

                String teacher7 = jComboBox9.getSelectedItem().toString();
                shortName ="";
                shortName=shortName+teacher7.charAt(0)+teacher7.charAt(teacher7.indexOf(" ")+1);
                teacherShortName.add(shortName);
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

                int[][] periods = new int[7][3];                                                    //Stores the count of each lecture

                //For getting the correct position for Mentor/Library lecture
                for(int i=0; i<5; i++){
                    if(SubjectSelection.subject[i][2]==0){
                        change=i;
                        SubjectSelection.subject[i][2]=1;
                        SubjectSelection.list1.add(Integer.toString(i)+"2");
                        break;
                    }
                }

                //For getting the count of each lecture according to its type and stores it in periods array
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

                Random random = new Random();                                                           //For the random object declaration

                System.out.print(SubjectSelection.list1.toString());

                //For change
                Map<String, Integer> m = new HashMap<String, Integer>();
                for(int i=0; i<SubjectSelection.list1.size(); i++){
                    String s=SubjectSelection.list1.get(i);
                        if(s.charAt(1)=='0'){
                                m.put(s, new Integer(5));
                        } else if(s.charAt(1)=='2'){
                                m.put(s, new Integer(1));
                        } else if(s.charAt(1)=='1' && (s.charAt(0)=='5' || s.charAt(0)=='6')){
                                m.put(s, new Integer(4));
                        } else{
                                m.put(s, new Integer(2));
                        }
                }

                // using for-each loop for iteration over Map.entrySet() 
                for (Map.Entry<String,Integer> entry : m.entrySet()){  
                    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue()); 
                }

                for(int i=0;i<6;i++){
                    for(int j=0;j<7;j++){
                        TTUpdated[i][j]="";
                    }
                }

                for(int j=0;j<14;j++){
                    System.out.print(SubjectSelection.list1.get(j)+" ");
                }System.out.println();

                Collections.shuffle(SubjectSelection.list1); 

                for(int j=0;j<14;j++){
                    System.out.print(SubjectSelection.list1.get(j)+" ");
                }System.out.println();

                generator(6, 7, 0, 0, SubjectSelection.list1, m);

                for(int i=0; i<6; i++){
                    for(int j=0; j<7; j++){
                        TT[i][j]=Integer.parseInt(TTUpdated[i][j]);
                        System.out.print(TT[i][j]+" ");
                    }
                    System.out.println();
                }
                //For change
                
                
                //For checking
                System.out.println("Teachers ID");
                for(int i=0; i<7; i++){
                    System.out.print(teacherList[i]+" ");
                }
                System.out.println();
                System.out.println("TIME TABLE");
                for(int i=0; i<6; i++){
                    for(int j=0; j<7; j++){
                        System.out.print(TT[i][j]+" ");
                    }
                    System.out.println("");
                }
                //for checking

                Timetable s1=new Timetable();
                s1.setVisible(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SavedTimeTable.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        ////For the to-do task
        
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
        
        ////once the time table is successfully generated it get stored in the database in the form of table with name SemsterBranchSection 1CSB 
        ////when the save button is clicked 1 semester form cse branch and for the b section 
        ////one new frame for the display of time table
        ////which will have the dropdown for semester branch and section with a button of show 
        ////as soon as user selects the options and click the show button the time table will get displayed to the user
        ////and if it is not present then the message will appear as the time table is not generated yet for the given input.
        
        ////add the teacher name in the time table with the help of teacherName array
        ////create tables for all the teachers with their ID number
        ////change the column name of the existing table as 1s 2s 3s etc.
        ////add one column to all the table with name row with auto increment feature
        ////when the save button is clicked the generated time table get stored in the database
        ////After generating the timetable we will create the two dimensional array which will contain the information of the time table
        ////to get stored in the database in the exact form
        ////and for that we will first set the values for each cell in the time table and after the completion of this task
        ////we will get the value of each cell with the help of JTable.getValueAt(row, col) and store that in the array
        ////and that array is going to store exactly in the database
        
        ////when the save button is clicked in TimeTable frame all the selected teachers will be putted in the set and the count for the classes in the database get decreased by 1
        ////when the save button is clicked update the chart of teacher with 1, for let say ID 2 for [0][2] with the value 1 that means this slot for this teacher is now engazed
        
        //Direct to SubjectSelection from TimeTable frame
        //Create a textarea in Timetable and SavedTimeTableDisplayer to display the full form of the subjects
        //check for tutorial condition
        
        
        
        //Actual algorithm for the time table generation
//        for(int i=0; i<6; i++)
//        {
//              ArrayList<String> list = new ArrayList<String>();                     //For keeping the track for all the selected subjects for that day FOR TESTING PURPOSE
//              int counter=0;                                                        //No two lab should come in the same day
//              for(int j=0; j<7; j++)
//              {
//                      int x,y,flag=1;                                               //flag variable is to ensure that no two lectures come in the same day
//                      String r="";                                                  //For storing the selcted lecture
//                      int checkedValue=1;                                           //For checking if the selected randomly teacher is available for that slot or not
//                      do
//                      {
//                          flag=1;
//
//                          //Anthing can come here as there is no boundation that the practical could not appear here.
//                          if(counter==0 && (j!=1 && j!=3 && j!=4 && j!=6))
//                          {                                       
//                              int randomNumber=random.nextInt(SubjectSelection.list1.size());
//                              r=SubjectSelection.list1.get(randomNumber);                           //Randomly selects any remaining lecture from the list1
//                          }
//                          else
//                          {
//                              //This loop is to ensure that here come the theory or tutorial only
//                              do                                  
//                              {
//                                  int randomNumber=random.nextInt(SubjectSelection.list1.size());
//                                  r=SubjectSelection.list1.get(randomNumber);                       //Randomly selects any remaining lecture from the list1
//                                  System.out.println("hey  i am r "+ r);
//                                  y=Integer.parseInt(String.valueOf(r.charAt(1)));
//                              }while(y==1);
//                          }
//
//                          if(list.size()!=0)
//                          {
//                              if(list.indexOf(r)!=-1)
//                              {
//                                  flag=0;                                                           //for not adding the subject which is already added for that day
//                              }
//                              for(int l=0;l<list.size();l++)
//                              {
//                                  Character c=new Character(list.get(l).charAt(0));
//                                  Character d=new Character(list.get(l).charAt(1));
//                                  
//                                    //For ensuring that in a single day no two practical can come
//                                    if(c.equals(new Character(r.charAt(0))) && !((new Character(r.charAt(1)).equals(new Character('1'))) || d.equals(new Character('1'))))
//                                    {
//                                        flag=0;
//                                        break;
//                                    }
//                              }
//                          }
//
//                      x=Integer.parseInt(String.valueOf(r.charAt(0)));                              //For storing which subject is selected
//                      y=Integer.parseInt(String.valueOf(r.charAt(1)));                              //For storing the selected lecture that it is theory, tut or practical
//
//                      //For checking if the selected slot for the teacher is availble or not by storing the value in the checkedValue variable
//                      int id=teacherList[x];                                                        //For storing the ID of the selected teacher
////                      System.out.println("ID"+id);
//                      timeTableID[i][j]=id;
//                      int col=j+1;
//                      int row=i+1;
//                      String query="select "+col+"f from `"+id+"` where `row`="+row;
//                          try {
//                              rs = statements.executeQuery(query);
//                              while(rs.next()){
//                                  checkedValue=rs.getInt(1);
//                              }
//                              System.out.println("Checked Value"+checkedValue);
//                              
//                          } catch (SQLException ex) {
//                              Logger.getLogger(TeacherSelection.class.getName()).log(Level.SEVERE, null, ex);
//                          }
//                      
//                      }while(periods[x][y]<=0 || flag==0 || checkedValue==1);         
//                      //if there is no period available for the randomly selected subject or if the selected subject teacher is not available for that slot, 
//                      //then the do the whole thing again
//
//                      //For giving two simultaneous lecture if it is a lab
//                      if(y==1)
//                      {
//                              TT[i][j]=TT[i][j+1]=Integer.parseInt(r);   
//                              timeTableID[i][j+1]=teacherList[x];
//                              j+=1;
//                              periods[x][y]-=2;
//                              counter=1;
//                      }
//                      else
//                      {
//                              TT[i][j]=Integer.parseInt(r);
//                              periods[x][y]-=1;
//                      }
//
//                      list.add(r);                                                      //For adding the selected lecture in the list
//                      
//                      //If for the selected period the lecures are over then we will delete them from our list1
//                      if(periods[x][y]==0){
//                          SubjectSelection.list1.remove(new String(r));
//                      }
//                          
//                      //for checking
//                      for(int k=0; k<7; k++)
//                      {
//                          System.out.print(periods[k][0]);
//                          System.out.print(periods[k][1]);
//                          System.out.println(periods[k][2]);
//                      }
//                      System.out.println(list.toString());
//                      System.out.println(SubjectSelection.list1.toString());
//                      //for checking
//
//              }
//              
//              list.removeAll(list);                                                 //We remove all the elements from the list as the day is over and another day will start with another list
//              System.out.println("");
//              System.out.println("");
//        }
       
  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void sectionNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sectionNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sectionNameActionPerformed

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
    private javax.swing.JComboBox sectionName;
    public javax.swing.JLabel ss1;
    public javax.swing.JLabel ss2;
    public javax.swing.JLabel ss3;
    public javax.swing.JLabel ss4;
    public javax.swing.JLabel ss5;
    public javax.swing.JLabel ss6;
    public javax.swing.JLabel ss7;
    // End of variables declaration//GEN-END:variables

    private boolean generator(int r, int c, int row, int col, ArrayList<String> list1, Map<String, Integer> m) {
        if(row==r){
            System.out.println("GENERATED TIME TABLE LOOK AT IT CLOSELY");
		for(int i=0;i<6;i++){
			for(int j=0;j<7;j++){
				System.out.print(TTUpdated[i][j]+" ");
			}
			System.out.println();
		}
		return true;		
	}
        if(row>=r || col>=c){
		return false;
	}
	for(int j=0;j<SubjectSelection.list1.size();j++){
		String s=SubjectSelection.list1.get(j);
		if(isPossible(r, c, row, col, s, m)){
		for(int i=0;i<6;i++){
			for(int k=0;k<7;k++){
				System.out.print(TTUpdated[i][k]+" ");
			}
			System.out.println();
		}                    
			if(s.charAt(1)=='1'){
				TTUpdated[row][col]=s;
				TTUpdated[row][col+1]=s;
                                int currentValue = m.get(s);
                                m.put(s, currentValue-2);
				if(col+2==c){
					Collections.shuffle(SubjectSelection.list1);
					boolean flag=generator(r, c, row+1, 0, list1, m);
					if(!flag){
						TTUpdated[row][col]="";
						TTUpdated[row][col+1]="";
                                                currentValue = m.get(s);
                                                m.put(s, currentValue+2);
					}else {
						return flag;
					}
				} else{
					boolean flag=generator(r, c, row, col+2, list1, m);
					if(!flag){
						TTUpdated[row][col]="";
						TTUpdated[row][col+1]="";
                                                currentValue = m.get(s);
                                                m.put(s, currentValue+2);
					}else {
						return flag;
					}
				}
			} else{
				TTUpdated[row][col]=s;
                                int currentValue = m.get(s);
                                m.put(s, currentValue-1);
				if(col+1==c){
					Collections.shuffle(SubjectSelection.list1); 
					boolean flag=generator(r, c, row+1,0, list1, m);
					if(!flag){
						TTUpdated[row][col]="";
                                                currentValue = m.get(s);
                                                m.put(s, currentValue+1);
					}else {
						return flag;
					}
				} else{
					boolean flag=generator(r, c, row,col+1, list1, m);
					if(!flag){
						TTUpdated[row][col]="";
                                                currentValue = m.get(s);
                                                m.put(s, currentValue+1);
					}else {
						return flag;
					}
				}
			}
		}
	}
	return false;
    }

    private boolean isPossible(int r, int c, int row, int col, String s, Map<String, Integer> m) {
        int currentValue = m.get(s);
        if(currentValue<1){
		return false;
	}
        int val1 = m.get("00");
        int val2 = m.get("10");
        int val3 = m.get("20");
        int val4 = m.get("30");
        int val5 = m.get("40");
        if(val1>(6-row) || val2>(6-row) || val3>(6-row) || val4>(6-row) || val5>(6-row)){
            return false;
	}
	for(int i=col-1;i>=0;i--){
		if(s.equals(TTUpdated[row][i])){
			return false;
		}
	}
	int checkedValue=getChecked(row, col, s);
	if(checkedValue==1){
		return false;
	}
	if(s.charAt(1)=='1'){
		for(int j=col-1;j>=0;j--){
			if(TTUpdated[row][j].charAt(1)=='1'){
				return false;
			}
		}
		if(col==0 || col==2 || col==5){
			checkedValue=getChecked(row, col+1, s);
			if(checkedValue==1){
				return false;
			}
		} else{
			return false;
		}
	}
	if(col==5){
		int temp=0;
		if(s.charAt(1)!='1'){
			for(int j=col-1; j>=0; j--){
				String sTemp=TTUpdated[row][j];
				if(sTemp.charAt(1)=='1'){
					temp=1;
					break;
				}
			}
			if(temp==0){
				return false;
			}
		}
	}
	return true;
    }

    private int getChecked(int row, int col, String s) {
        int checkedValue=1;
        int id=teacherList[Character.getNumericValue(s.charAt(0))];                                                        //For storing the ID of the selected teacher
        timeTableID[row][col]=id;
        int c=col+1;
        int r=row+1;
        String query="select "+c+"f from `"+id+"` where `row`="+r;
        try {
            rs = statements.executeQuery(query);
            while(rs.next()){
                checkedValue=rs.getInt(1);
            }
//            System.out.println("Checked Value"+checkedValue);                  
        } catch (SQLException ex) {
            Logger.getLogger(TeacherSelection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return checkedValue;              
    }
}



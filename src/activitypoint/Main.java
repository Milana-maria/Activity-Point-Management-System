package activitypoint;

import javax.swing.*;
import java.util.ArrayList;
import java.awt.BorderLayout;
import java.awt.Dimension;
public class Main {

    public static void main(String[] args) {
    	ArrayList<Application> applications = new ArrayList<>();
    	User teacher = new Teacher("Activity Point Teacher");
    	FileManager.loadApplications(applications);
    	Student s1 = new Student(1, "Student 1", 0);
    	Student s2 = new Student(2, "Student 2", 0);
    	Student s3 = new Student(3, "Student 3", 0);
    	ArrayList<Student> students = new ArrayList<>();

    	students.add(new Student(1, "ABHINAV SHINOJ", 0));
    	students.add(new Student(2, "ABHISHEK P NAIR", 0));
    	students.add(new Student(3, "ABIYA PRAKASH A B", 0));
    	students.add(new Student(4, "ADWAITH ANIL", 0));
    	students.add(new Student(5, "ADWAITH D NAIR", 0));
    	students.add(new Student(6, "AFIA S", 0));
    	students.add(new Student(7, "ALAN BAIJU", 0));
    	students.add(new Student(8, "ALBIN ANTONY", 0));
    	students.add(new Student(9, "ALBIN BINU", 0));
    	students.add(new Student(10, "ALONA CINTO", 0));
    	students.add(new Student(11, "AMITHA P A", 0));
    	students.add(new Student(12, "ANNS MARIA GINS", 0));
    	students.add(new Student(13, "ARCHANA SUDEEP", 0));
    	students.add(new Student(14, "ASHIN JOSEPH SOL", 0));
    	students.add(new Student(15, "ASWIN BIJU", 0));
    	students.add(new Student(16, "ATHUL R NAIR", 0));
    	students.add(new Student(17, "AUGUSTINE JOMON", 0));
    	students.add(new Student(18, "CHRIS JOSEPH SHINE", 0));
    	students.add(new Student(19, "CYRIAC JOSE", 0));
    	students.add(new Student(20, "DIYA GOPAKUMAR", 0));
    	students.add(new Student(21, "DONA VINCENT", 0));
    	students.add(new Student(22, "EFINOVA SABU", 0));
    	students.add(new Student(23, "ELAINE ROSE SUNIL", 0));
    	students.add(new Student(24, "ELSA ROSE JIMMY", 0));
    	students.add(new Student(25, "EMMANUEL THOMAS ARUN", 0));
    	students.add(new Student(26, "EVANGELY MARIAM SHANTIS", 0));
    	students.add(new Student(27, "GANGA P G", 0));
    	students.add(new Student(28, "GAUTHAM DAS", 0));
    	students.add(new Student(29, "GEO MATHEW SAJU", 0));
    	students.add(new Student(30, "GEORGE THOMAS", 0));
    	students.add(new Student(31, "GOUTHAM KRISHNA V V", 0));
    	students.add(new Student(32, "HARJAYANTH S", 0));
    	students.add(new Student(33, "HARITHA ROY", 0));
    	students.add(new Student(34, "IRIN GEORGE", 0));
    	students.add(new Student(35, "JAIDIN MEJE", 0));
    	students.add(new Student(36, "JEES REJI", 0));
    	students.add(new Student(37, "JEREMY JOI", 0));
    	students.add(new Student(38, "JEROME ABRAHAM PIOUS", 0));
    	students.add(new Student(39, "JESTO JOHNSON", 0));
    	students.add(new Student(40, "JESVIN JOIES", 0));
    	students.add(new Student(41, "JEWEL MARIYA VARGHESE", 0));
    	students.add(new Student(42, "JOEL JOSE", 0));
    	students.add(new Student(43, "JOEL JOSEPH", 0));
    	students.add(new Student(44, "JOHAN P MANOJ", 0));
    	students.add(new Student(45, "JOICE BENNY", 0));
    	students.add(new Student(46, "JOSEPH MICHAEL", 0));
    	students.add(new Student(47, "JOSU JAISON", 0));
    	students.add(new Student(48, "KARTHIK S GOPAL", 0));
    	students.add(new Student(49, "KRISHNAJITH A", 0));
    	students.add(new Student(50, "LEKSHMI SREEKUMAR", 0));
    	students.add(new Student(51, "LIYA TOMY", 0));
    	students.add(new Student(52, "MADHAV SURESH", 0));
    	students.add(new Student(53, "MICHAEL JAMES", 0));
    	students.add(new Student(54, "MILANA MARIA MATHEW", 0));
    	students.add(new Student(55, "MINNA AUGUSTIN", 0));
    	students.add(new Student(56, "MIRON VINCENT", 0));
    	students.add(new Student(57, "MRUDUL R NAIR", 0));
    	students.add(new Student(58, "NIRANJAN MANOJ", 0));
    	students.add(new Student(59, "NISSIMOL SABU", 0));
    	students.add(new Student(60, "PRIYADARSHINI M R", 0));
    	students.add(new Student(61, "RHEA THOMAS", 0));
    	students.add(new Student(62, "RONY SIBY", 0));
    	students.add(new Student(63, "SALMAN S", 0));
    	students.add(new Student(64, "SIVAPRIYA M", 0));
    	students.add(new Student(65, "SREEHARI S", 0));
    	students.add(new Student(66, "THEJUS TOM PIOUS", 0));
    	students.add(new Student(67, "TISSA ROSE MATHEW", 0));
    	students.add(new Student(68, "VYGA SAJIKUMAR", 0));
    	FileManager.loadStudents(students);
    	System.out.println(s1.getName() + " - " + s1.getActivityPoints());
    	System.out.println(s2.getName() + " - " + s2.getActivityPoints());
    	System.out.println(s3.getName() + " - " + s3.getActivityPoints());
        JFrame frame = new JFrame("Activity Point Management System");

        JLabel title = new JLabel("Activity Point Management System");
        title.setBounds(100, 50, 300, 30);

        JButton studentButton = new JButton("Student");
        studentButton.setPreferredSize(new Dimension(120, 40));
        
        studentButton.addActionListener(e -> {

            JFrame studentFrame = new JFrame("Student Activity Points");

            JLabel heading = new JLabel("Student Activity Points");
            

            String[] columns = {"Roll No.", "Name", "Activity Points"};

            Object[][] data = new Object[students.size()][3];

            for (int i = 0; i < students.size(); i++) {
                Student student = students.get(i);

                data[i][0] = student.getRollNumber();
                data[i][1] = student.getName();
                data[i][2] = student.getActivityPoints();
            }

            JTable studentTable = new JTable(data, columns);

            studentTable.getColumnModel().getColumn(0).setPreferredWidth(80);
            studentTable.getColumnModel().getColumn(1).setPreferredWidth(300);
            studentTable.getColumnModel().getColumn(2).setPreferredWidth(120);

            JScrollPane studentScrollPane = new JScrollPane(studentTable);
       

            

            JButton applyButton = new JButton("Apply");
            
            applyButton.addActionListener(event -> {

                JFrame applyFrame = new JFrame("Activity Application");

                JLabel applyHeading = new JLabel("Activity Application");
                applyHeading.setHorizontalAlignment(JLabel.CENTER);
                applyHeading.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 28));

                applyFrame.setLayout(new BorderLayout());
                applyFrame.add(applyHeading, BorderLayout.NORTH);

                JPanel formPanel = new JPanel(new java.awt.GridBagLayout());

                java.awt.GridBagConstraints gbc = new java.awt.GridBagConstraints();
                gbc.insets = new java.awt.Insets(15, 15, 15, 15);
                gbc.fill = java.awt.GridBagConstraints.HORIZONTAL;

                JLabel nameLabel = new JLabel("Student Name:");
                nameLabel.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 18));

                JTextField nameField = new JTextField(20);
                nameField.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 17));

                JLabel rollLabel = new JLabel("Roll Number:");
                rollLabel.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 18));

                JTextField rollField = new JTextField(20);
                rollField.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 17));

                JLabel dateLabel = new JLabel("Activity Date:");
                dateLabel.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 18));

                JTextField dateField = new JTextField(20);
                dateField.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 17));
                dateField.setEditable(false);

                JButton dateButton = new JButton("Select Date");
                dateButton.setPreferredSize(new Dimension(150, 40));
                dateButton.addActionListener(dateEvent -> {

                    JDialog dateDialog = new JDialog(
                            applyFrame,
                            "Select Activity Date",
                            true
                    );

                    dateDialog.setLayout(new java.awt.GridLayout(4, 2, 10, 10));

                    JLabel dayLabel = new JLabel("Day:");
                    JLabel monthLabel = new JLabel("Month:");
                    JLabel yearLabel = new JLabel("Year:");

                    Integer[] days = new Integer[31];
                    for (int i = 0; i < 31; i++) {
                        days[i] = i + 1;
                    }

                    String[] months = {
                            "01", "02", "03", "04", "05", "06",
                            "07", "08", "09", "10", "11", "12"
                    };

                    Integer[] years = new Integer[27];
                    int currentYear = java.time.LocalDate.now().getYear();

                    for (int i = 0; i < 27; i++) {
                        years[i] = currentYear - 5 + i;
                    }

                    JComboBox<Integer> dayBox = new JComboBox<>(days);
                    JComboBox<String> monthBox = new JComboBox<>(months);
                    JComboBox<Integer> yearBox = new JComboBox<>(years);

                    JButton selectButton = new JButton("Select");

                    dateDialog.add(dayLabel);
                    dateDialog.add(dayBox);

                    dateDialog.add(monthLabel);
                    dateDialog.add(monthBox);

                    dateDialog.add(yearLabel);
                    dateDialog.add(yearBox);

                    dateDialog.add(new JLabel());
                    dateDialog.add(selectButton);

                    selectButton.addActionListener(selectEvent -> {

                        int day = (Integer) dayBox.getSelectedItem();
                        String month = (String) monthBox.getSelectedItem();
                        int year = (Integer) yearBox.getSelectedItem();

                        java.time.LocalDate selectedDate;

                        try {

                            selectedDate = java.time.LocalDate.of(
                                    year,
                                    Integer.parseInt(month),
                                    day
                            );

                        } catch (java.time.DateTimeException ex) {

                            JOptionPane.showMessageDialog(
                                    dateDialog,
                                    "Invalid date. Please select a valid date."
                            );

                            return;
                        }

                        String formattedDate =
                                String.format(
                                        "%02d-%02d-%04d",
                                        selectedDate.getDayOfMonth(),
                                        selectedDate.getMonthValue(),
                                        selectedDate.getYear()
                                );

                        dateField.setText(formattedDate);

                        dateDialog.dispose();
                    });

                    dateDialog.setSize(350, 220);
                    dateDialog.setLocationRelativeTo(applyFrame);
                    dateDialog.setVisible(true);
                });

                String[] certificatePath = {""};

                JButton uploadButton = new JButton("Upload Certificate");
                uploadButton.setPreferredSize(new Dimension(200, 45));

                JButton submitButton = new JButton("Submit");
                submitButton.setPreferredSize(new Dimension(160, 45));

                gbc.gridx = 0;
                gbc.gridy = 0;
                formPanel.add(nameLabel, gbc);

                gbc.gridx = 1;
                formPanel.add(nameField, gbc);

                gbc.gridx = 0;
                gbc.gridy = 1;
                formPanel.add(rollLabel, gbc);

                gbc.gridx = 1;
                formPanel.add(rollField, gbc);

                gbc.gridx = 0;
                gbc.gridy = 2;
                formPanel.add(dateLabel, gbc);

                gbc.gridx = 1;
                formPanel.add(dateField, gbc);

                gbc.gridx = 2;
                formPanel.add(dateButton, gbc);

                gbc.gridx = 0;
                gbc.gridy = 3;
                gbc.gridwidth = 2;
                formPanel.add(uploadButton, gbc);

                gbc.gridx = 0;
                gbc.gridy = 4;
                gbc.gridwidth = 2;
                formPanel.add(submitButton, gbc);

                applyFrame.add(formPanel, BorderLayout.CENTER);

                uploadButton.addActionListener(uploadevent -> {

                    JFileChooser fileChooser = new JFileChooser();

                    int result = fileChooser.showOpenDialog(applyFrame);

                    if (result == JFileChooser.APPROVE_OPTION) {

                        java.io.File selectedFile = fileChooser.getSelectedFile();

                        java.io.File certificatesFolder =
                                new java.io.File("certificates");

                        if (!certificatesFolder.exists()) {
                            certificatesFolder.mkdirs();
                        }

                        String newFileName =
                                System.currentTimeMillis() + "_" +
                                selectedFile.getName();

                        java.io.File destination =
                                new java.io.File(certificatesFolder, newFileName);

                        try {

                            java.nio.file.Files.copy(
                                    selectedFile.toPath(),
                                    destination.toPath(),
                                    java.nio.file.StandardCopyOption.REPLACE_EXISTING
                            );

                            certificatePath[0] = destination.getPath();

                            JOptionPane.showMessageDialog(
                                    applyFrame,
                                    "Certificate uploaded successfully!"
                            );

                        } catch (java.io.IOException ex) {

                            JOptionPane.showMessageDialog(
                                    applyFrame,
                                    "Unable to save certificate."
                            );
                        }
                    }
                });

                submitButton.addActionListener(submitEvent -> {

                    String name = nameField.getText();
                    String roll = rollField.getText();
                    String date = dateField.getText();

                    if (certificatePath[0].isEmpty()) {

                        JOptionPane.showMessageDialog(
                                applyFrame,
                                "Please upload a certificate."
                        );

                        return;
                    }

                    if (name.isEmpty() || roll.isEmpty() || date.isEmpty()) {

                        JOptionPane.showMessageDialog(
                                applyFrame,
                                "Please fill all the fields."
                        );

                    } else {

                        boolean matchFound = false;

                        for (Student student : students) {

                            if (student.getName().equalsIgnoreCase(name)
                                    && String.valueOf(student.getRollNumber()).equals(roll)) {

                                matchFound = true;
                                break;
                            }
                        }

                        if (!matchFound) {

                            JOptionPane.showMessageDialog(
                                    applyFrame,
                                    "Student name and roll number do not match.\nPlease check again."
                            );

                            return;
                        }

                        Application application =
                                new Application(
                                        name,
                                        roll,
                                        date,
                                        certificatePath[0]
                                );

                        applications.add(application);

                        FileManager.saveApplications(applications);

                        JOptionPane.showMessageDialog(
                                applyFrame,
                                "Application submitted successfully!"
                        );

                        applyFrame.dispose();
                    }
                });

                applyFrame.setSize(800, 550);
                applyFrame.setLocationRelativeTo(studentFrame);
                applyFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                applyFrame.setVisible(true);
            });
            studentFrame.setLayout(new BorderLayout());
            studentFrame.add(heading, BorderLayout.NORTH);
            studentFrame.add(studentScrollPane, BorderLayout.CENTER);
            studentFrame.add(applyButton, BorderLayout.SOUTH);
           
            studentFrame.setSize(680, 450);
            
            studentFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            studentFrame.setVisible(true);
        });

        JButton teacherButton = new JButton("Teacher");
        teacherButton.setPreferredSize(new Dimension(120, 40));
      
        teacherButton.addActionListener(e -> {

            String password = JOptionPane.showInputDialog(
                frame,
                "Enter Teacher Password:"
            );

            if (password != null && password.equals("teacher123")) {
            	
            	JFrame teacherFrame = new JFrame("Teacher - Activity Applications");

            	JLabel heading = new JLabel(teacher.displayRole() + " Applications");
            	

            	JPanel applicationsPanel = new JPanel();
            	applicationsPanel.setLayout(new BoxLayout(applicationsPanel, BoxLayout.Y_AXIS));

            	if (applications.isEmpty()) {

            	    JLabel noApplications = new JLabel("No applications submitted yet.");
            	    applicationsPanel.add(noApplications);

            	} else {

            	    for (Application app : applications) {

            	        JPanel appPanel = new JPanel();
            	        appPanel.setLayout(null);
            	        appPanel.setPreferredSize(new java.awt.Dimension(650, 180));

            	        JLabel nameLabel = new JLabel("Name: " + app.getName());
            	        nameLabel.setBounds(20, 10, 300, 25);

            	        JLabel rollLabel = new JLabel("Roll Number: " + app.getRollNumber());
            	        rollLabel.setBounds(20, 40, 300, 25);

            	        JLabel dateLabel = new JLabel("Date: " + app.getDate());
            	        dateLabel.setBounds(20, 70, 300, 25);

            	        JLabel statusLabel = new JLabel(
            	            "Status: " + (app.isApproved() ? "Approved" : "Pending")
            	        );
            	        statusLabel.setBounds(20, 100, 300, 25);

            	        JButton openButton = new JButton("Open Certificate");
            	        openButton.setBounds(350, 30, 160, 35);

            	        openButton.addActionListener(openEvent -> {
            	            try {
            	                java.awt.Desktop.getDesktop().open(
            	                    new java.io.File(app.getCertificatePath())
            	                );
            	            } catch (Exception ex) {
            	                JOptionPane.showMessageDialog(
            	                    teacherFrame,
            	                    "Unable to open certificate."
            	                );
            	            }
            	        });

            	        JButton approveButton = new JButton("Approve");
            	        approveButton.setBounds(350, 80, 160, 35);

            	        approveButton.addActionListener(approveEvent -> {

            	            if (app.isApproved()) {
            	                JOptionPane.showMessageDialog(
            	                    teacherFrame,
            	                    "This application is already approved."
            	                );
            	                return;
            	            }

            	            String pointsText = JOptionPane.showInputDialog(
            	                teacherFrame,
            	                "Enter activity points:"
            	            );

            	            if (pointsText != null) {

            	                try {

            	                    int points = Integer.parseInt(pointsText);

            	                    if (points <= 0) {
            	                        JOptionPane.showMessageDialog(
            	                            teacherFrame,
            	                            "Points must be greater than 0."
            	                        );
            	                        return;
            	                    }

            	                    app.setPoints(points);
            	                    app.setApproved(true);
            	                 
            	                    FileManager.saveApplications(applications);

            	                    for (Student student : students) {

            	                        if (app.getRollNumber().equals(
            	                                String.valueOf(student.getRollNumber()))) {

            	                        	student.addActivityPoints(points);
            	                        	FileManager.saveStudents(students);
            	                        	break;
            	                        }
            	                    }

            	                    statusLabel.setText(
            	                        "Status: Approved - " + points + " points"
            	                    );

            	                    approveButton.setEnabled(false);

            	                    JOptionPane.showMessageDialog(
            	                        teacherFrame,
            	                        "Application approved successfully!"
            	                    );

            	                } catch (NumberFormatException ex) {

            	                    JOptionPane.showMessageDialog(
            	                        teacherFrame,
            	                        "Please enter a valid number."
            	                    );
            	                }
            	            }
            	        });

            	        appPanel.add(nameLabel);
            	        appPanel.add(rollLabel);
            	        appPanel.add(dateLabel);
            	        appPanel.add(statusLabel);
            	        appPanel.add(openButton);
            	        appPanel.add(approveButton);

            	        applicationsPanel.add(appPanel);
            	    }
            	}

            	JScrollPane scrollPane = new JScrollPane(applicationsPanel);
            
            	teacherFrame.setLayout(new BorderLayout());
            	teacherFrame.add(heading, BorderLayout.NORTH);
            	teacherFrame.add(scrollPane, BorderLayout.CENTER);
            
            	teacherFrame.setSize(700, 450);
            	
            	teacherFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            	teacherFrame.setVisible(true);
            	
            	
             
            	               
            } else {
                JOptionPane.showMessageDialog(frame, "Incorrect password!");
            }
        });

        frame.setLayout(new BorderLayout());

        title.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 28));

        frame.add(title, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new java.awt.GridBagLayout());

        java.awt.GridBagConstraints gbc = new java.awt.GridBagConstraints();
        gbc.insets = new java.awt.Insets(20, 20, 20, 20);

        studentButton.setPreferredSize(new Dimension(180, 70));
        teacherButton.setPreferredSize(new Dimension(180, 70));

        gbc.gridx = 0;
        gbc.gridy = 0;
        buttonPanel.add(studentButton, gbc);

        gbc.gridx = 1;
        buttonPanel.add(teacherButton, gbc);

        frame.add(buttonPanel, BorderLayout.CENTER);

        frame.setSize(700, 450);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
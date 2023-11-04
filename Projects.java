//---------- import packages ----------//
import java.awt.*; import java.awt.event.*; import javax.swing.*;
//---------- project class -----------//
public class Projects extends javax.swing.JFrame
{
int attempt=3,scr=0,op=0,amt=0;
private JFrame fClub; private JPanel pStudent,pAtm,pNumber;
private JComboBox cbChoice;
private JLabel lTask2,lSub1,lSub2,lSub3,lTot,lAvg,lGr,lTotres,lAvgres,lGrres,lRes;
private JLabel lTask1,lNum1,lOutput,lScore,lAtt,lOutres,lScoreres,lAttres;
private JLabel lTask3,lAcno,lOpb,lAmt,lResult;
private JTextField tSub1,tSub2,tSub3,tNum1,tNum2; private JButton bMarks,bRepeat,lNum2;
private JTextField tAcno,tOpb,tAmt; private JButton bDep, bWit,bCb;

//--------- constructor -------------//
public Projects() 
{
//------- frame 1 ---------//
fClub=new JFrame("Three Projects at a Glance - Nidhi Pathak");fClub.setDefaultCloseOperation(EXIT_ON_CLOSE);
fClub.setLayout(new BorderLayout());fClub.setContentPane(new JLabel(new ImageIcon("d:\\background.jpg")));
fClub.setSize(700,800);fClub.setVisible(true);cbChoice = new JComboBox();cbChoice.setFont(new Font("Broadway", 1, 18));
cbChoice.setModel(new DefaultComboBoxModel(new String[] { "1. Number Game", "2. Student Grade Calculator", "3. ATM Machine"}));
cbChoice.setBounds(70,25,500,25);
cbChoice.addActionListener(new ActionListener()
{public void actionPerformed(ActionEvent evt)
{if(cbChoice.getSelectedItem().toString().equals("1. Number Game")==true)
{    pNumber.setVisible(true);pAtm.setVisible(false); pStudent.setVisible(false);}
else if(cbChoice.getSelectedItem().toString().equals("2. Student Grade Calculator")==true)
{    pNumber.setVisible(false);pAtm.setVisible(false); pStudent.setVisible(true);}
else
{    pNumber.setVisible(false);pAtm.setVisible(true); pStudent.setVisible(false);}}});

//------- panel 1 -----------//
pStudent = new JPanel();pStudent.setBackground(Color.cyan); pStudent.setBounds(120,80,450,600);
//-------- panel 1 components ----// 
lTask2 = new JLabel("Student Grade Calculator"); lTask2.setFont(new Font("Bradley Hand ITC", 3, 20)); 
lTask2.setBounds(100,5,300,25);lTask2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
lSub1 = new javax.swing.JLabel("Physics Marks :");lSub1.setFont(new java.awt.Font("Bradley Hand ITC", 1, 18)); 
lSub1.setBounds(25,70,300,25);lSub1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
lSub2 = new JLabel("Chemistry Marks :");lSub2.setFont(new java.awt.Font("Bradley Hand ITC", 1, 18)); 
lSub2.setBounds(25,130,300,25);lSub2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
lSub3 = new javax.swing.JLabel("Mathematics Marks :");lSub3.setFont(new java.awt.Font("Bradley Hand ITC", 1, 18)); 
lSub3.setBounds(25,190,300,25);lSub3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
lTot = new javax.swing.JLabel("Aggregate :");lTot.setFont(new java.awt.Font("Bradley Hand ITC", 1, 18)); 
lTot.setBounds(25,400,300,25);lTot.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
lAvg = new javax.swing.JLabel("Average Marks :");lAvg.setFont(new java.awt.Font("Bradley Hand ITC", 1, 18)); 
lAvg.setBounds(25,450,300,25);lAvg.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
lGr = new javax.swing.JLabel("Your Grade :");lGr.setFont(new java.awt.Font("Bradley Hand ITC", 1, 18)); 
lGr.setBounds(25,500,300,25);
tSub1= new javax.swing.JTextField(7);tSub1.setFont(new java.awt.Font("Bradley Hand ITC", 1, 18)); 
tSub1.setBounds(300,70,100,25);tSub1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
tSub2= new javax.swing.JTextField(7);tSub2.setFont(new java.awt.Font("Bradley Hand ITC", 1, 18)); 
tSub2.setBounds(300,130,100,25);tSub2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
tSub3= new javax.swing.JTextField(7);tSub3.setFont(new java.awt.Font("Bradley Hand ITC", 1, 18)); 
tSub3.setBounds(300,190,100,25);tSub3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
lTotres = new javax.swing.JLabel(".");lTotres.setFont(new Font("Bradley Hand ITC", 1, 18)); 
lTotres.setBounds(250,400,50,25);lTotres.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
lAvgres = new JLabel(".");lAvgres.setFont(new Font("Bradley Hand ITC", 1, 18)); 
lAvgres.setBounds(250,450,50,25);lAvgres.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
lGrres = new JLabel(".");lGrres.setFont(new Font("Bradley Hand ITC", 1, 18)); 
lGrres.setBounds(200,500,100,25);lGrres.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
lRes = new JLabel(" Your Result.... ");lRes.setFont(new Font("Bradley Hand ITC", 1, 18)); 
lRes.setBounds(125,300,300,25);lRes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
bMarks= new javax.swing.JButton("Submit Marks");bMarks.setBounds(80,250,300,25);
bMarks.setFont(new java.awt.Font("Bradley Hand ITC", 1, 18)); 
bMarks.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent evt) {bMarksActionPerformed(evt);}});
pStudent.add(lTask2); pStudent.add(lSub1);pStudent.add(lSub2);pStudent.add(lSub3);pStudent.add(lTot);
pStudent.add(lAvg);pStudent.add(lGr);pStudent.add(tSub1);pStudent.add(tSub2);pStudent.add(tSub3);
pStudent.add(bMarks);pStudent.add(lTotres);pStudent.add(lAvgres);pStudent.add(lGrres);pStudent.add(lRes);pStudent.setLayout(null);
fClub.add(cbChoice); fClub.add(pStudent);
//------- end of panel 1----------//

//------- panel 2 -----------//
pAtm= new JPanel();pAtm.setBackground(Color.magenta); pAtm.setBounds(120,80,450,600);
pNumber = new JPanel();pNumber.setBackground(Color.green); pNumber.setBounds(120,80,450,600);
pNumber.setLayout(null);
//-------- panel 2 components ----// 
lTask1 = new JLabel("Number Game "); lTask1.setFont(new Font("Book Antiqua", 3, 20)); 
lTask1.setBounds(100,5,300,25);lTask1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
lNum1 = new javax.swing.JLabel("Guess Number :");lNum1.setFont(new java.awt.Font("Book Antiqua", 1, 18)); 
lNum1.setBounds(25,70,300,25);lNum1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
lNum2 = new JButton("Generate Number :");lNum2.setFont(new Font("Book Antiqua", 1, 18)); 
lNum2.setBounds(25,130,200,25);lNum2.setHorizontalAlignment(SwingConstants.LEFT);
lNum2.addActionListener(new ActionListener()
{public void actionPerformed(ActionEvent evt)
{
if(attempt==1)
bRepeat.setEnabled(true);
int m = Integer.parseInt(tNum1.getText());
int n =(int) (Math.random()*100);
tNum2.setText(Integer.toString(n));
if(m==n)
{lOutres.setText("Correct");scr+=3;}
else if(m>n)
{lOutres.setText("Too High");scr+=1;}
else
{lOutres.setText("Too Low");scr+=1;}
lScoreres.setText(Integer.toString(scr));
if(attempt>0)
lAttres.setText(Integer.toString(--attempt));
else
attempt=3;
}});

lOutput = new JLabel("Your Result :");lOutput.setFont(new Font("Book Antiqua", 1, 18)); 
lOutput.setBounds(25,190,200,25);lOutput.setHorizontalAlignment(SwingConstants.LEFT);
lScore = new JLabel("Score :");lScore.setFont(new Font("Book Antiqua", 1, 18)); 
lScore.setBounds(25,250,200,25);lScore.setHorizontalAlignment(SwingConstants.LEFT);
lAtt = new JLabel("Attempt Left :");lAtt.setFont(new Font("Book Antiqua", 1, 18)); 
lAtt.setBounds(25,310,300,25);lAtt.setHorizontalAlignment(SwingConstants.LEFT);
tNum1= new javax.swing.JTextField(8);tNum1.setFont(new java.awt.Font("Book Antiqua", 1, 18)); 
tNum1.setBounds(300,70,100,25);tNum1.setHorizontalAlignment(SwingConstants.RIGHT);
tNum2= new javax.swing.JTextField(8);tNum2.setFont(new Font("Book Antiqua", 1, 18)); 
tNum2.setBounds(300,130,100,25);tNum2.setHorizontalAlignment(SwingConstants.RIGHT);
lOutres = new JLabel(".");lOutres.setFont(new Font("Book Antiqua", 1, 18)); 
lOutres.setBounds(200,190,150,25);lOutres.setHorizontalAlignment(SwingConstants.RIGHT);
lScoreres = new JLabel(".");lScoreres.setFont(new Font("Book Antiqua", 1, 18)); 
lScoreres.setBounds(200,250,50,25);lScoreres.setHorizontalAlignment(SwingConstants.RIGHT);
lAttres = new JLabel(".");lAttres.setFont(new Font("Book Antiqua", 1, 18)); 
lAttres.setBounds(200,310,50,25);lAttres.setHorizontalAlignment(SwingConstants.RIGHT);
bRepeat= new JButton("Repeat Game");bRepeat.setBounds(80,500,300,25);
bRepeat.setFont(new java.awt.Font("Book Antiqua", 1, 18)); bRepeat.setEnabled(false);
bRepeat.addActionListener(new ActionListener()
{public void actionPerformed(ActionEvent evt)
{attempt=3; tNum1.setText("");tNum2.setText("");lOutres.setText("");lScoreres.setText("");lAttres.setText("");
tNum1.nextFocus();bRepeat.setEnabled(false);}});
pStudent.add(lTask2); pStudent.add(lSub1);pStudent.add(lSub2);pStudent.add(lSub3);pStudent.add(lTot);
pStudent.add(lAvg);pStudent.add(lGr);pStudent.add(tSub1);pStudent.add(tSub2);pStudent.add(tSub3);
pStudent.add(bMarks);
pStudent.add(lTotres);pStudent.add(lAvgres);pStudent.add(lGrres);pStudent.add(lRes);pStudent.setLayout(null);
pNumber.add(lTask1);pNumber.add(lNum1);pNumber.add(lNum2);pNumber.add(lOutput);pNumber.add(lOutres);
pNumber.add(lScore);pNumber.add(lScoreres);pNumber.add(lAtt);pNumber.add(lAttres);pNumber.add(tNum1);
pNumber.add(tNum2);pNumber.add(bRepeat);
fClub.add(pStudent);fClub.add(pAtm);fClub.add(pNumber);
//-----------------------Panel 3 ---//


pAtm.setLayout(null);
lTask3 = new JLabel("ATM Machine"); lTask3.setFont(new Font("Book Antiqua", 3, 20)); 
lTask3.setBounds(100,5,300,25);lTask3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
lAcno = new JLabel("Account Number :");lAcno.setFont(new java.awt.Font("Book Antiqua", 1, 18)); 
lAcno.setBounds(25,70,300,25);lAcno.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
lOpb = new JLabel("Opening Balnace :");lOpb.setFont(new Font("Book Antiqua", 1, 18)); 
lOpb.setBounds(25,130,200,25);lOpb.setHorizontalAlignment(SwingConstants.LEFT);
lAmt = new JLabel("Amount :");lAmt.setFont(new Font("Book Antiqua", 1, 18)); 
lAmt.setBounds(25,190,200,25);lAmt.setHorizontalAlignment(SwingConstants.LEFT);
lResult = new JLabel(". ");lResult.setFont(new Font("Book Antiqua", 1, 18)); 
lResult.setBounds(25,280,300,25);lResult.setHorizontalAlignment(SwingConstants.LEFT);
tAcno= new javax.swing.JTextField(8);tAcno.setFont(new java.awt.Font("Book Antiqua", 1, 18)); 
tAcno.setBounds(300,70,100,25);tAcno.setHorizontalAlignment(SwingConstants.RIGHT);
tOpb= new javax.swing.JTextField(8);tOpb.setFont(new Font("Book Antiqua", 1, 18)); 
tOpb.setBounds(300,130,100,25);tOpb.setHorizontalAlignment(SwingConstants.RIGHT);
tAmt= new javax.swing.JTextField(8);tAmt.setFont(new Font("Book Antiqua", 1, 18)); 
tAmt.setBounds(300,190,100,25);tAmt.setHorizontalAlignment(SwingConstants.RIGHT);
bDep= new JButton("Deposit");bDep.setBounds(80,550,300,25);
bDep.setFont(new java.awt.Font("Book Antiqua", 1, 18)); 
bDep.addActionListener(new ActionListener()
{public void actionPerformed(ActionEvent evt)
{
amt=Integer.parseInt(tOpb.getText())+Integer.parseInt(tAmt.getText());
lResult.setText("Deposit Successful");
}});
bWit= new JButton("Withdrawal");bWit.setBounds(80,500,300,25);
bWit.setFont(new java.awt.Font("Book Antiqua", 1, 18)); 
bWit.addActionListener(new ActionListener()
{public void actionPerformed(ActionEvent evt)
{
if(Integer.parseInt(tOpb.getText())>Integer.parseInt(tAmt.getText()))
{   
amt=Integer.parseInt(tOpb.getText())-Integer.parseInt(tAmt.getText());
lResult.setText("Withdrawal Successful");
}
else{lResult.setText("No Money");}
}});
bCb= new JButton("Check Balabce");bCb.setBounds(80,450,300,25);
bCb.setFont(new java.awt.Font("Book Antiqua", 1, 18)); 
bCb.addActionListener(new ActionListener()
{public void actionPerformed(ActionEvent evt)
{
    lResult.setText("Closing Balance is "+Integer.toString(amt));}});

pStudent.add(lTask2); pStudent.add(lSub1);pStudent.add(lSub2);pStudent.add(lSub3);pStudent.add(lTot);
pStudent.add(lAvg);pStudent.add(lGr);pStudent.add(tSub1);pStudent.add(tSub2);pStudent.add(tSub3);
pStudent.add(bMarks);
pStudent.add(lTotres);pStudent.add(lAvgres);pStudent.add(lGrres);pStudent.add(lRes);pStudent.setLayout(null);
pNumber.add(lTask1);pNumber.add(lNum1);pNumber.add(lNum2);pNumber.add(lOutput);pNumber.add(lOutres);
pNumber.add(lScore);pNumber.add(lScoreres);pNumber.add(lAtt);pNumber.add(lAttres);pNumber.add(tNum1);
pNumber.add(tNum2);pNumber.add(bRepeat);
pAtm.add(lTask3);pAtm.add(lAcno);pAtm.add(lOpb);pAtm.add(lAmt);pAtm.add(lResult);pAtm.add(tAcno);pAtm.add(tOpb);
pAtm.add(lAmt);pAtm.add(bDep);pAtm.add(bWit);pAtm.add(bCb);pAtm.add(tAmt);
fClub.add(pStudent);fClub.add(pAtm);fClub.add(pNumber);
}
private void bMarksActionPerformed(ActionEvent evt)
{   if(tSub1.getText().length()>0 && tSub2.getText().length()>0 && tSub3.getText().length()>0)
    {
        int tot=Integer.parseInt(tSub1.getText())+Integer.parseInt(tSub2.getText())+Integer.parseInt(tSub3.getText());
        int avg=tot/3;
        lTotres.setText(Integer.toString(tot));
        lAvgres.setText(Integer.toString(avg));
        if(avg>=80)
        lGrres.setText("Excellent");
        else if(avg>=60)
        lGrres.setText("Good");
        else
        lGrres.setText("Bad");
    }
}
//------- end of panel 1----------//
public static void main(String args[])
{
new Projects();
}
}

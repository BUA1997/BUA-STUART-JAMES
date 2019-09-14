package basiccalculator;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Basiccalculator extends JFrame implements ActionListener{
JButton btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
JButton btnplus,btnminus,btnpdt,btnclear,btndiv,btnequals;
JTextArea txtvalue;
JPanel txtpanel;
JPanel mainpan;
JPanel btnpan1;
JPanel btnpan2;
JPanel btnpan3;
JPanel btnpan4;

int firstnum,secondnum,result;
String operations;

Basiccalculator(){
    super("Bua Calculator");
    txtvalue=new JTextArea(2,18);
    txtpanel=new JPanel();
    txtpanel.add(txtvalue);
   
    btnpan1 =new JPanel();
    btnplus=new JButton("+");
    btn1=new JButton("1");
    btn2=new JButton("2");
    btn3=new JButton("3");
   // getContentPane().setLayout(new FlowLayout());
    btnpan1.add(btnplus);
    btnpan1.add(btn1);
    btnpan1.add(btn2);
    btnpan1.add(btn3);
    //adding action listeners
    btn1.addActionListener(this);
    btn2.addActionListener(this);
    btn3.addActionListener(this);
    btnplus.addActionListener(this) ;
    
    
    btnpan2 =new JPanel();
    btnminus=new JButton("-");
    btn4=new JButton("4");
    btn5=new JButton("5");
    btn6=new JButton("6");
       getContentPane().setLayout(new FlowLayout());
    btnpan2.add(btnminus);
    btnpan2.add(btn4);
    btnpan2.add(btn5);
    btnpan2.add(btn6);
    btn4.addActionListener(this);
    btn5.addActionListener(this);
    btn6.addActionListener(this);
    btnminus.addActionListener(this);
    
    btnpan3=new JPanel();
    btnpdt=new JButton("*");
    btn7=new JButton("7");
    btn8=new JButton("8");
    btn9=new JButton("9");
       getContentPane().setLayout(new FlowLayout());
    btnpan3.add(btnpdt);
    btnpan3.add(btn7);
    btnpan3.add(btn8);
    btnpan3.add(btn9);
    btn7.addActionListener(this);
    btn8.addActionListener(this);
    btn9.addActionListener(this);
    btnpdt.addActionListener(this) ;
    
    btnpan4=new JPanel();
    btnclear=new JButton("C");
    btndiv=new JButton("/");
    btn0=new JButton("0");
    btnequals=new JButton("=");
       getContentPane().setLayout(new FlowLayout());
    btnpan4.add(btnclear);
    btnpan4.add(btndiv);
    btnpan4.add(btn0);
    btnpan4.add(btnequals);
    btn0.addActionListener(this);
    btnclear.addActionListener(this);
    btndiv.addActionListener(this);
    btnequals.addActionListener(this) ;
      
    
    
    mainpan=new JPanel();
    mainpan.add(txtpanel);
    mainpan.add(btnpan1);
    mainpan.add(btnpan2);
    mainpan.add(btnpan3);
    mainpan.add(btnpan4);
  //  mainpan.setBackground(Color.gray);
    
    getContentPane().setLayout(new  BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
    getContentPane().add(mainpan);
    
}
   
    public static void main(String[] args) {
        // TODO code application logic here
        Basiccalculator calc=new Basiccalculator();
        calc.setVisible(true);
        calc.setSize(240,250);
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calc.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//         if (e.getSource()==btnclear) {            
String click=e.getActionCommand();
 if(click.equals("C")){
          txtvalue.setText("");                         
          txtvalue.requestFocus();                    
        }
         else  if (e.getActionCommand().equals("1")) {
            txtvalue.setText(txtvalue.getText() +"1");
            txtvalue.requestFocusInWindow();
        }
        else if (e.getActionCommand().equals("2")) {
            txtvalue.setText(txtvalue.getText() +"2");
            txtvalue.requestFocusInWindow();
        }
        else if (e.getActionCommand().equals("3")) {
            txtvalue.setText(txtvalue.getText() +"3");
            txtvalue.requestFocusInWindow();
        }
        else if (e.getActionCommand().equals("4")) {
            txtvalue.setText(txtvalue.getText() +"4");
            txtvalue.requestFocusInWindow();
        }
        else if (e.getActionCommand().equals("5")) {
            txtvalue.setText(txtvalue.getText() +"5");
            txtvalue.requestFocusInWindow();
        }
        else if (e.getActionCommand().equals("6")) {
            txtvalue.setText(txtvalue.getText() +"6");
            txtvalue.requestFocusInWindow();
        }
        else if (e.getActionCommand().equals("7")) {
            txtvalue.setText(txtvalue.getText() +"7");
            txtvalue.requestFocusInWindow();
        }
        else if (e.getActionCommand().equals("8")) {
            txtvalue.setText(txtvalue.getText() +"8");
            txtvalue.requestFocusInWindow();
        }
        else if (e.getActionCommand().equals("9")) {
            txtvalue.setText(txtvalue.getText() +"9");
            txtvalue.requestFocusInWindow();
        }
        else if (e.getActionCommand().equals("0")) {
            txtvalue.setText(txtvalue.getText() +"0");
            txtvalue.requestFocusInWindow();
        }
          else if (e.getActionCommand().equals("+")) {
            firstnum=Integer.parseInt(txtvalue.getText());
            txtvalue.setText("");
            txtvalue.requestFocusInWindow();
            operations=("add");
        }
           else if (e.getActionCommand().equals("-")) {
            firstnum=Integer.parseInt(txtvalue.getText());
            txtvalue.setText("");
            operations=("-");
        }
            else if (e.getActionCommand().equals("*")) {
            firstnum=Integer.parseInt(txtvalue.getText());
            txtvalue.setText("");
            operations=("*");
        }
             else if (e.getActionCommand().equals("/")) {
            firstnum=Integer.parseInt(txtvalue.getText());
            txtvalue.setText("");
            operations=("/");
        }
         else if (e.getActionCommand().equals("=")) {
            secondnum=Integer.parseInt(txtvalue.getText());
            if(operations.equals("add"))
                result=firstnum+secondnum;
             if(operations.equals("-"))
                result=firstnum-secondnum;
              if(operations.equals("*"))
                result=firstnum*secondnum;
               if(operations.equals("/"))
                result=firstnum/secondnum;
            txtvalue.setText(result+"");
        }
     
    }
    
}
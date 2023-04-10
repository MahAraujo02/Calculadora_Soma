

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.*;
import javax.swing.*;

public class Calculadora extends JFrame 
implements ActionListener
{

JLabel lV1;
JLabel lV2;
JLabel lSoma;
JTextField tfV1, tfV2, tfSoma;
JButton  bSoma;

Calculo cal = new Calculo();

  public Calculadora () {
    setLayout(new FlowLayout());
    setSize(400,400);
    setVisible(true);

    lV1 = new JLabel("valor 1");
    add(lV1);

    tfV1 = new JTextField(5);
    tfV1.addActionListener(this);
    add(tfV1);

    lV2 = new JLabel("valor 2");
    add(lV2);

    tfV2 = new JTextField(5);
    tfV2.addActionListener(this);
    add(tfV2);

    lSoma = new JLabel("resultado");
    add(lSoma);

    tfSoma = new JTextField(5);
    add(tfSoma);

    bSoma = new JButton("Somar");
    bSoma.addActionListener(this);
    add(bSoma);

  }

public static void main(String[] args) 
  {
    Calculadora app = new Calculadora();
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
  }

@Override
public void actionPerformed(ActionEvent e)
 {  if(e.getSource() == bSoma)
    {
        int a = Integer.parseInt(tfV1.getText());
        int b = Integer.parseInt(tfV2.getText());
        int s = cal.soma(a, b);
        tfSoma.setText(String.valueOf(s));
    }

    if(e.getSource() == tfV1){
        tfV2.requestFocus();
    }


    throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
 }

}
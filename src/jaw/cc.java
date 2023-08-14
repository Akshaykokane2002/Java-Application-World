package jaw;

/* Decompiler 23ms, total 532ms, lines 148 */


import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager.LookAndFeelInfo;

public class cc extends JFrame {
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private JButton Convert;
   private JButton jButton1;
   private JComboBox<String> jComboBox2;
   private JLabel jLabel1;
   private JLabel jLabel2;
   private JLabel jLabel3;
   private JPanel jPanel1;
   private JTextField txtAmount;
   private JComboBox<String> txtFrom;
   private JComboBox<String> txtTo;
 public cc() {
      this.initComponents();
   }
 @SuppressWarnings("unchecked")
   private void initComponents() {
      this.jComboBox2 = new JComboBox();
      this.jPanel1 = new JPanel();
      this.jButton1 = new JButton();
      this.txtAmount = new JTextField();
      this.jLabel1 = new JLabel();
      this.jLabel2 = new JLabel();
      this.jLabel3 = new JLabel();
      this.Convert = new JButton();
      this.txtFrom = new JComboBox();
      this.txtTo = new JComboBox();
      this.jComboBox2.setModel(new DefaultComboBoxModel(new String[]{"Item 1", "Item 2", "Item 3", "Item 4"}));
      this.setDefaultCloseOperation(3);
      this.jButton1.setFont(new Font("Tahoma", 1, 18));
      this.jButton1.setText("Currency Converter");
      this.jButton1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            cc.this.jButton1ActionPerformed(evt);
         }
      });
      this.txtAmount.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            cc.this.txtAmountActionPerformed(evt);
         }
      });
      this.jLabel1.setFont(new Font("Tahoma", 1, 14));
      this.jLabel1.setText("Amount");
      this.jLabel2.setFont(new Font("Tahoma", 1, 14));
      this.jLabel2.setText("From");
      this.jLabel3.setFont(new Font("Tahoma", 1, 14));
      this.jLabel3.setText("To");
      this.Convert.setBackground(new Color(255, 204, 102));
      this.Convert.setText("Convert");
      this.Convert.addActionListener(new ActionListener() 
	{
	 @SuppressWarnings("unchecked")
         public void actionPerformed(ActionEvent evt) {
            cc.this.ConvertActionPerformed(evt);
         }
      });
      this.txtFrom.setModel(new DefaultComboBoxModel(new String[]{"USD", "EUR","Indian Rupees"}));
      this.txtTo.setModel(new DefaultComboBoxModel(new String[]{"BD TK", "Indian Rupees","EUR"}));
      GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
      this.jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(35, 35, 35).addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING, false).addComponent(this.jLabel3, -1, -1, 32767).addComponent(this.jLabel2, Alignment.LEADING, -1, -1, 32767).addComponent(this.jLabel1, -1, 88, 32767)).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false).addComponent(this.jButton1, -2, 210, -2).addComponent(this.txtAmount).addComponent(this.txtFrom, 0, -1, 32767).addComponent(this.txtTo, 0, -1, 32767))).addGroup(jPanel1Layout.createSequentialGroup().addGap(151, 151, 151).addComponent(this.Convert, -2, 171, -2))).addContainerGap(125, 32767)));
      jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jButton1, -2, 57, -2).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.txtAmount, -2, 45, -2).addComponent(this.jLabel1, -2, 45, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel2, -2, 47, -2).addComponent(this.txtFrom, -2, 42, -2)).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false).addComponent(this.jLabel3, -2, 56, -2).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.txtTo).addGap(18, 18, 18))).addGap(78, 78, 78).addComponent(this.Convert, -2, 54, -2).addContainerGap(23, 32767)));
      GroupLayout layout = new GroupLayout(this.getContentPane());
      this.getContentPane().setLayout(layout);
      layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel1, -1, -1, 32767).addContainerGap()));
      layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel1, -1, -1, 32767).addContainerGap()));
      this.pack();
      this.setLocationRelativeTo((Component)null);
   }
	 @SuppressWarnings("unchecked")
   private void jButton1ActionPerformed(ActionEvent evt) {
   }
	 @SuppressWarnings("unchecked")
   private void txtAmountActionPerformed(ActionEvent evt) {
   }
	 @SuppressWarnings("unchecked")
   private void ConvertActionPerformed(ActionEvent evt) {
      Double amount = Double.parseDouble(this.txtAmount.getText());
      Double convert;
      if (this.txtFrom.getSelectedItem().toString() == "USD" && this.txtTo.getSelectedItem().toString() == "BD TK") {
         convert = amount * 84.05D;
         JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + " BD TK");
      } else if (this.txtFrom.getSelectedItem().toString() == "USD" && this.txtTo.getSelectedItem().toString() == "Indian Rupees") {
         convert = amount * 75.05D;
         JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + " INR");
      } else if (this.txtFrom.getSelectedItem().toString() == "EUR" && this.txtTo.getSelectedItem().toString() == "BD TK") {
         convert = amount * 100.03D;
         JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + " BD TK");
      } else if (this.txtFrom.getSelectedItem().toString() == "EUR" && this.txtTo.getSelectedItem().toString() == "Indian Rupees") {
         convert = amount * 95.2D;
         JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + " INR");
      }else if (this.txtFrom.getSelectedItem().toString() == "Indian Rupees" && this.txtTo.getSelectedItem().toString() == "EUR") {
          convert = amount / 95.2D;
          JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + " EUR");
       }

   }
 @SuppressWarnings("unchecked")
   public static void main(String[] args) {
      try {
         LookAndFeelInfo[] var1 = UIManager.getInstalledLookAndFeels();
         int var2 = var1.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            LookAndFeelInfo info = var1[var3];
            if ("Nimbus".equals(info.getName())) {
               UIManager.setLookAndFeel(info.getClassName());
               break;
            }
         }
      } catch (ClassNotFoundException var5) {
         Logger.getLogger(cc.class.getName()).log(Level.SEVERE, (String)null, var5);
      } catch (InstantiationException var6) {
         Logger.getLogger(cc.class.getName()).log(Level.SEVERE, (String)null, var6);
      } catch (IllegalAccessException var7) {
         Logger.getLogger(cc.class.getName()).log(Level.SEVERE, (String)null, var7);
      } catch (UnsupportedLookAndFeelException var8) {
         Logger.getLogger(cc.class.getName()).log(Level.SEVERE, (String)null, var8);
      }

      EventQueue.invokeLater(new Runnable() {
         public void run() {
            (new cc()).setVisible(true);
         }
      });
      
   }
  		
}
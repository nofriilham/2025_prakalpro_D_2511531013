package pekan8_2511531013;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TugasPekan8_2511531013 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBoolean1;
	private JTextField txtBoolean2;
	private JTextField txtHasil;
	private void pesanPeringatan(String pesan) {
		JOptionPane.showMessageDialog(this, pesan ,"Peringatan",JOptionPane.WARNING_MESSAGE);
	}
	private void pesanEror(String pesan) {
		JOptionPane.showMessageDialog(this, pesan ,"Peringatan",JOptionPane.WARNING_MESSAGE);
	}


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TugasPekan8_2511531013 frame = new TugasPekan8_2511531013();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TugasPekan8_2511531013() {
		setTitle("Operator Logika");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Operator Logika");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(124, 10, 185, 18);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Boolean 1");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(22, 49, 68, 18);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Boolean 2");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(22, 80, 68, 18);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Operator");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(22, 126, 68, 18);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Hasil");
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1_1_2.setBounds(22, 181, 68, 18);
		contentPane.add(lblNewLabel_1_1_2);
		
		JComboBox cbOperator = new JComboBox();
		cbOperator.setModel(new DefaultComboBoxModel(new String[] {"Konjungsi", "Disjungsi", "Negasi"}));
		cbOperator.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		cbOperator.setBounds(110, 125, 79, 20);
		contentPane.add(cbOperator);
		
		JButton btnNewButton = new JButton("Hitung");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtBoolean1.getText().trim().isEmpty()) {
					pesanPeringatan("Inputkan Boolean pertama");
				}	else if(txtBoolean2.getText().trim().isEmpty()) {
						pesanPeringatan("Inputkan Boolean kedua");
				}	else {
					try {
						boolean a= Boolean.valueOf(txtBoolean1.getText());
						boolean b= Boolean.parseBoolean(txtBoolean2.getText());
						int c= cbOperator.getSelectedIndex();
						boolean hasil = false;

						if (c == 0) { hasil = a && b; }
						if (c == 1) { hasil = a || b; }
						if (c == 2) { hasil = !a; }

						txtHasil.setText(String.valueOf(hasil));

												
					}
						catch (NumberFormatException ex) {
							pesanEror("Angka 1 dan 2 tidak Valid");
						}
					}



				

			}
		});
		btnNewButton.setBounds(225, 125, 84, 20);
		contentPane.add(btnNewButton);
		
		txtBoolean1 = new JTextField();
		txtBoolean1.setHorizontalAlignment(SwingConstants.CENTER);
		txtBoolean1.setBounds(110, 49, 79, 18);
		contentPane.add(txtBoolean1);
		txtBoolean1.setColumns(10);
		
		txtBoolean2 = new JTextField();
		txtBoolean2.setHorizontalAlignment(SwingConstants.CENTER);
		txtBoolean2.setColumns(10);
		txtBoolean2.setBounds(110, 80, 79, 18);
		contentPane.add(txtBoolean2);
		
		txtHasil = new JTextField();
		txtHasil.setHorizontalAlignment(SwingConstants.CENTER);
		txtHasil.setColumns(10);
		txtHasil.setBounds(110, 181, 79, 18);
		contentPane.add(txtHasil);

	}
}

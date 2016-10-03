package AppQLgiay;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class appQLgiay extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					appQLgiay frame = new appQLgiay();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the panel.
	 */
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table;
	private JTextField textField_6;

	/**
	 * Create the panel.
	 */
	public appQLgiay() {
		setBackground(new Color(255, 255, 255));
		setForeground(Color.BLUE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LO\u1EA0I");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(70, 61, 35, 22);
		getContentPane().add(lblNewLabel);
		
		JLabel lblQunLBn = new JLabel("QU\u1EA2N L\u00DD B\u00C1N GI\u00C0Y");
		lblQunLBn.setBounds(189, 11, 218, 22);
		lblQunLBn.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblQunLBn.setForeground(Color.RED);
		getContentPane().add(lblQunLBn);
		
		textField = new JTextField();
		textField.setBounds(115, 60, 170, 29);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblM = new JLabel("M\u00C3");
		lblM.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblM.setForeground(new Color(0, 0, 255));
		lblM.setBounds(352, 61, 35, 23);
		getContentPane().add(lblM);
		
		textField_1 = new JTextField();
		textField_1.setBounds(397, 60, 176, 29);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblMuSc = new JLabel("M\u00C0U S\u1EAEC");
		lblMuSc.setForeground(Color.BLUE);
		lblMuSc.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMuSc.setBounds(40, 107, 67, 11);
		getContentPane().add(lblMuSc);
		
		textField_2 = new JTextField();
		textField_2.setBounds(115, 100, 176, 29);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("SIZE");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(341, 105, 46, 14);
		getContentPane().add(lblNewLabel_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(397, 100, 176, 29);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblSoLuong = new JLabel("SO LUONG");
		lblSoLuong.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSoLuong.setForeground(Color.BLUE);
		lblSoLuong.setBounds(24, 151, 84, 22);
		getContentPane().add(lblSoLuong);
		
		textField_4 = new JTextField();
		textField_4.setBounds(115, 150, 176, 29);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblGia = new JLabel("GIA");
		lblGia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGia.setForeground(Color.BLUE);
		lblGia.setBounds(341, 151, 46, 22);
		getContentPane().add(lblGia);
		
		textField_5 = new JTextField();
		textField_5.setBounds(397, 150, 176, 29);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(24, 209, 549, 157);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(55, 25, 452, 110);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
			},
			new String[] {
				"LOAI", "MA", "MAU SAC", "SIZE", "SO LUONG", "DON GIA"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnThem = new JButton("THEM");
		btnThem.setForeground(Color.BLUE);
	
		btnThem.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnThem.setBounds(24, 395, 81, 36);
		getContentPane().add(btnThem);
		
		JButton btnSua = new JButton("SUA");
		btnSua.setForeground(Color.BLUE);
		btnSua.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSua.setBounds(115, 395, 72, 36);
		getContentPane().add(btnSua);
		
		JButton btnNewButton = new JButton("XOA");
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(197, 396, 72, 34);
		getContentPane().add(btnNewButton);
		
		textField_6 = new JTextField();
		textField_6.setBounds(397, 395, 176, 36);
		getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblTimKiem = new JLabel("TIM KIEM");
		lblTimKiem.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTimKiem.setForeground(Color.BLUE);
		lblTimKiem.setBounds(303, 395, 84, 36);
		getContentPane().add(lblTimKiem);

	}


}

package Imc;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class IMC extends JFrame {

	private JPanel contentPane;
	private JTextField txtPeso;
	private JTextField txtAltura;
	private JTextField txtIMC;
	private JLabel lblStatus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IMC frame = new IMC();
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
	public IMC() {
		setTitle("Calculadora de IMC");
		setIconImage(Toolkit.getDefaultToolkit().getImage(IMC.class.getResource("/icones/calc2.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 456);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPeso.setBounds(10, 28, 128, 23);
		contentPane.add(lblPeso);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAltura.setBounds(10, 81, 113, 23);
		contentPane.add(lblAltura);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblResultado.setBounds(10, 195, 332, 23);
		contentPane.add(lblResultado);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//objeto formatador
				DecimalFormat formatador = new DecimalFormat("#0.0");
				//variaveis
				double altura,peso,imc;
				//entrada
				altura = Double.parseDouble(txtAltura.getText().replace(",", "."));
				peso = Double.parseDouble(txtPeso.getText().replace(",", "."));
				//processamento
				imc = peso / (altura*altura);
				//saida
				txtIMC.setText("" + formatador.format(imc));
				//estrutura de controle (Acima do Peso / Abaixo do Peso / Peso Ideal)
				if (imc < 17) {
					//lblResultado.setText("Muito abaixo do peso!");
					lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/imc1.png")));
				} else if (imc >= 17 && imc < 18.5){
					//lblResultado.setText("Abaixo do peso!");
					lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/imc2.png")));
				} else if (imc >= 18.5 && imc < 25) {
					//lblResultado.setText("Peso Normal!");
					lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/imc3.png")));
				} else if (imc >= 25 && imc < 30) {
					//lblResultado.setText("Resultado: Acima do peso");
					lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/imc4.png")));
				} else if (imc >= 30 && imc < 35) {
					//lblResultado.setText("Resultado: Obesidade I");
					lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/imc5.png")));
				} else if (imc >= 35 && imc < 40) {
					//lblResultado.setText("Resultado: Obesidade II (Severa)");
					lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/imc6.png")));
				} else {
					//lblResultado.setText("Resultado: Obesidade III (Mórbida)");
					lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/imc7.png")));
				}
				}
			}
		);
		btnCalcular.setIcon(new ImageIcon(IMC.class.getResource("/icones/calculator.png")));
		btnCalcular.setToolTipText("calcular");
		btnCalcular.setBounds(10, 264, 128, 128);
		contentPane.add(btnCalcular);
		
		JButton btnLimpar = new JButton("Limpar campos");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtAltura.setText(null);
				txtPeso.setText(null);
				txtIMC.setText(null);
				lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/imc0.png")));
			}
		});
		btnLimpar.setIcon(new ImageIcon(IMC.class.getResource("/icones/borracha.png")));
		btnLimpar.setToolTipText("Limpar Campos");
		btnLimpar.setBounds(175, 264, 128, 128);
		contentPane.add(btnLimpar);
		
		JLabel lblIMC = new JLabel("C\u00E1lculo do IMC");
		lblIMC.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblIMC.setBounds(10, 133, 128, 23);
		contentPane.add(lblIMC);
		
		txtPeso = new JTextField();
		txtPeso.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtPeso.setBounds(174, 28, 149, 25);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);
				
		txtAltura = new JTextField();
		txtAltura.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtAltura.setColumns(10);
		txtAltura.setBounds(174, 81, 149, 25);
		contentPane.add(txtAltura);
		
		txtIMC = new JTextField();
		txtIMC.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtIMC.setEditable(false);
		txtIMC.setColumns(10);
		txtIMC.setBounds(174, 133, 149, 25);
		contentPane.add(txtIMC);
		
		JButton btnInformacao = new JButton("Informa\u00E7\u00E3o");
		btnInformacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Calculadora de IMC ver 1.0\nAutor: Tarcisio Ribeiro de Oliveira","Status", JOptionPane.DEFAULT_OPTION);
			}
		});
		btnInformacao.setIcon(new ImageIcon(IMC.class.getResource("/icones/info.png")));
		btnInformacao.setBounds(498, 5, 56, 46);
		contentPane.add(btnInformacao);
		
		lblStatus = new JLabel("");
		lblStatus.setIcon(new ImageIcon(IMC.class.getResource("/icones/imc0.png")));
		lblStatus.setBounds(404, 80, 150, 300);
		contentPane.add(lblStatus);
		
		
	}
}

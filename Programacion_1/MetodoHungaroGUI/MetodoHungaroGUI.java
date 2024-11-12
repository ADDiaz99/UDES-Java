package Programacion_1.MetodoHungaroGUI;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;

public class MetodoHungaroGUI extends JFrame {
    private JTextField[][] inputFields = new JTextField[5][5];
    private JLabel resultLabel = new JLabel("Resultado: ");
    private JButton calculateButton = new JButton("Calcular");
    private JButton predeterminadoButton = new JButton("Asignar Valores");
    
    public MetodoHungaroGUI() {
        setTitle("Método Húngaro - Asignación 5x5");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel matrixPanel = new JPanel(new GridLayout(5, 5));
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                inputFields[i][j] = new JTextField(3);
                matrixPanel.add(inputFields[i][j]);
            }
        }

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateAssignment();
            }
        });
        predeterminadoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                assignNumeros();
            }
        });

        add(matrixPanel, BorderLayout.CENTER);
        add(calculateButton, BorderLayout.SOUTH);
        add(predeterminadoButton, BorderLayout.EAST);
        add(resultLabel, BorderLayout.NORTH);
    }

    private void calculateAssignment() {
        SwingWorker<int[], Void> worker = new SwingWorker<>() {
            @Override
            protected int[] doInBackground() {
                int[][] matrix = new int[5][5];
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        matrix[i][j] = Integer.parseInt(inputFields[i][j].getText());
                    }
                }
                return MetodoHungaro.solve(matrix);
            }

            @Override
            protected void done() {
                try {
                    int[] result = get();
                    resultLabel.setText("Resultado óptimo: " + java.util.Arrays.toString(result));
                } catch (Exception ex) {
                    resultLabel.setText("Error: " + ex.getMessage());
                }
            }
        };
        worker.execute();
    }
    
    private void assignNumeros(){
        // Primera Linea
        inputFields[0][0].setText("10");
        inputFields[0][1].setText("15");
        inputFields[0][2].setText("20");
        inputFields[0][3].setText("25");
        inputFields[0][4].setText("30");
        
        // Segunda Linea
        inputFields[1][0].setText("20");
        inputFields[1][1].setText("25");
        inputFields[1][2].setText("10");
        inputFields[1][3].setText("15");
        inputFields[1][4].setText("30");
        // Tercera Linea
        inputFields[2][0].setText("30");
        inputFields[2][1].setText("10");
        inputFields[2][2].setText("25");
        inputFields[2][3].setText("20");
        inputFields[2][4].setText("15");
        // Cuarta Linea
        inputFields[3][0].setText("25");
        inputFields[3][1].setText("30");
        inputFields[3][2].setText("15");
        inputFields[3][3].setText("10");
        inputFields[3][4].setText("20");
        // Quinta Linea
        inputFields[4][0].setText("15");
        inputFields[4][1].setText("20");
        inputFields[4][2].setText("30");
        inputFields[4][3].setText("25");
        inputFields[4][4].setText("10");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MetodoHungaroGUI().setVisible(true));
    }
}

/* public class BOOOOMMM11 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 30; i >= 0; i--) {
            if (i == 0) {
                System.out.println("EXPLOSÃO");
            } else {
                System.out.println(i);
            }
            Thread.sleep(1000); // Aguarda 1 segundo entre cada contagem
        }
    }
}
 */
/* import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BOOOOMMM11 {
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Relógio");
        JLabel label = new JLabel();
        frame.getContentPane().add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        int frameWidth = frame.getWidth();
        int frameHeight = frame.getHeight();
        int x = (screenWidth - frameWidth) / 2;
        int y = (screenHeight - frameHeight) / 2;
        frame.setLocation(x, y);
        
        frame.setPreferredSize(new Dimension(200, 100)); // Define tamanho preferencial da janela
        
        for (int i = 30; i >= 0; i--) {
            if (i == 0) {
                label.setText("EXPLOSÃO");
            } else {
                label.setText(String.valueOf(i));
            }
            Thread.sleep(1000); // Aguarda 1 segundo entre cada contagem
        }
        
        frame.dispose();
    }
}
 */
/* import javax.swing.JOptionPane;

public class BOOOOMMM11 {
    public static void main(String[] args) throws InterruptedException {
        JOptionPane.showMessageDialog(null, "", "Relógio", JOptionPane.PLAIN_MESSAGE);
        
        for (int i = 30; i >= 0; i--) {
            if (i == 0) {
                JOptionPane.showMessageDialog(null, "EXPLOSÃO", "Relógio", JOptionPane.PLAIN_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, i, "Relógio", JOptionPane.PLAIN_MESSAGE);
            }
            Thread.sleep(1000); // Aguarda 1 segundo entre cada contagem
        }
    }
}
 */
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingWorker;

public class BOOOOMMM11 {
    public static void main(String[] args) {
        // Cria e exibe a janela de diálogo personalizada
        JDialog dialog = new JDialog();
        JLabel label = new JLabel();
        dialog.add(label);
        dialog.setSize(200, 100);
        dialog.setLocationRelativeTo(null);
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.setVisible(true);

        // Inicia a contagem regressiva em uma thread separada
        SwingWorker<Void, Integer> worker = new SwingWorker<Void, Integer>() {
            @Override
            protected Void doInBackground() throws Exception {
                for (int i = 30; i >= 0; i--) {
                    Thread.sleep(1000);
                    publish(i); // Publica o valor atual para atualizar a interface gráfica
                }
                return null;
            }

            @Override
            protected void process(java.util.List<Integer> chunks) {
                // Atualiza o valor exibido na janela de diálogo
                int lastValue = chunks.get(chunks.size() - 1);
                label.setText(String.valueOf(lastValue));
            }

            @Override
            protected void done() {
                // Exibe a mensagem de "EXPLOSÃO" após a contagem regressiva
                label.setText("EXPLOSÃO");
            }
        };

        worker.execute(); // Inicia o worker
    }
}

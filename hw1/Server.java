import javax.swing.*;
import java.awt.*;

public class Server extends JFrame {
    private static final int WINDOW_HEIGHT = 555;
    private static final int WINDOW_WIDTH = 507;
    private static final int WINDOW_POSX = 800;
    private static final int WINDOW_POSY = 300;
    JButton btnStart = new JButton("Start Server");
    JButton btnStop = new JButton("Stop Server");
    boolean isServerWorking;

    Server() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(WINDOW_POSX, WINDOW_POSY);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("TicTacToe");
        setResizable(false);

        btnStart.addActionListener(e -> toggleServerStatus(true));
        btnStop.addActionListener(e -> toggleServerStatus(false));

        setLayout(new GridLayout(1, 2));
        add(btnStart);
        add(btnStop);
        setVisible(true);
    }

    private void toggleServerStatus(boolean status) {
        isServerWorking = status;
        System.out.println("Статус сервера: " + isServerWorking);
    }

    public static void main(String[] args) {
        new Server();
    }
}

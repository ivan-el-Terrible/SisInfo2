package interfaces;

import javax.swing.*;
import java.awt.*;

public class PantallaPrincipal extends JFrame {

    public PantallaPrincipal() {

        setTitle("Sistema XP");
        setSize(700, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setBackground(new Color(240, 248, 255));
        panelPrincipal.setLayout(new BorderLayout());

        JLabel titulo = new JLabel("SISTEMA XP - PAIR PROGRAMMING");
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 28));

        JLabel subtitulo = new JLabel("Gestión de Historias de Usuario");
        subtitulo.setHorizontalAlignment(SwingConstants.CENTER);
        subtitulo.setFont(new Font("Arial", Font.PLAIN, 18));

        JPanel panelTitulo = new JPanel();
        panelTitulo.setBackground(new Color(240, 248, 255));
        panelTitulo.setLayout(new GridLayout(2, 1));

        panelTitulo.add(titulo);
        panelTitulo.add(subtitulo);

        JButton btnHU1 = new JButton("Historia de Usuario 1");
        btnHU1.setFont(new Font("Arial", Font.BOLD, 18));
        btnHU1.setPreferredSize(new Dimension(300, 60));

        JButton btnHU2 = new JButton("Historia de Usuario 2");
        btnHU2.setFont(new Font("Arial", Font.BOLD, 18));
        btnHU2.setPreferredSize(new Dimension(300, 60));

        btnHU2.addActionListener(e -> {

            new Formulario1();

            dispose();
        });

     btnHU1.addActionListener(e -> {

    frame f = new frame();
    f.setVisible(true);

    dispose();
});

        JPanel panelBotones = new JPanel();
        panelBotones.setBackground(new Color(240, 248, 255));
        panelBotones.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.insets = new Insets(15, 15, 15, 15);

        gbc.gridx = 0;
        gbc.gridy = 0;
        panelBotones.add(btnHU1, gbc);

        gbc.gridy = 1;
        panelBotones.add(btnHU2, gbc);

        JLabel integrantes = new JLabel(
                "<html><center>" +
                "Proyecto XP y Pair Programming<br>" +
                "</center></html>"
        );

        integrantes.setHorizontalAlignment(SwingConstants.CENTER);
        integrantes.setFont(new Font("Arial", Font.PLAIN, 14));

        panelPrincipal.add(panelTitulo, BorderLayout.NORTH);
        panelPrincipal.add(panelBotones, BorderLayout.CENTER);
        panelPrincipal.add(integrantes, BorderLayout.SOUTH);

        add(panelPrincipal);

        setVisible(true);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new PantallaPrincipal();
        });
    }
}
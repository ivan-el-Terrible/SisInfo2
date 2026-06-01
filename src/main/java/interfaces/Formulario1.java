package interfaces;

import clases.Usuario;
import clases.TipoRefactorizacion;
import clases.Refactorizacion;
import clases.HistorialRefactorizaciones;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Formulario1 extends JFrame {

    private JTextField txtDesarrollador;
    private JTextField txtModulo;
    private JTextArea txtDescripcion;
    private JTextArea txtComentario;
    private JComboBox<String> cmbTipo;
    private JButton btnRegistrar;
    private JTable tabla;

    private HistorialRefactorizaciones historial;

    public Formulario1() {

        historial = new HistorialRefactorizaciones();

        initComponents();

        setTitle("Registro de Refactorizaciones");
        setSize(900, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void initComponents() {

        JLabel lblTitulo = new JLabel("REGISTRO DE REFACTORIZACIÓN");
        lblTitulo.setFont(new java.awt.Font("Arial", 1, 20));

        JLabel lblDesarrollador = new JLabel("Desarrollador:");
        JLabel lblModulo = new JLabel("Módulo:");
        JLabel lblTipo = new JLabel("Tipo de Refactorización:");
        JLabel lblDescripcion = new JLabel("Descripción:");
        JLabel lblComentario = new JLabel("Comentario:");

        txtDesarrollador = new JTextField();
        txtModulo = new JTextField();

        txtDescripcion = new JTextArea(4, 20);
        txtComentario = new JTextArea(4, 20);

        JScrollPane spDescripcion =
                new JScrollPane(txtDescripcion);

        JScrollPane spComentario =
                new JScrollPane(txtComentario);

        cmbTipo = new JComboBox<>();

        for (String tipo :
                TipoRefactorizacion.obtenerTiposDisponibles()) {

            cmbTipo.addItem(tipo);
        }

        btnRegistrar = new JButton("Registrar");

        tabla = new JTable();

        tabla.setModel(new DefaultTableModel(
                new Object[][]{},
                new String[]{
                        "ID",
                        "Desarrollador",
                        "Módulo",
                        "Tipo"
                }
        ));

        JScrollPane spTabla = new JScrollPane(tabla);

        btnRegistrar.addActionListener(e -> registrar());

        GroupLayout layout =
                new GroupLayout(getContentPane());

        getContentPane().setLayout(layout);

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(
                layout.createParallelGroup()

                        .addComponent(lblTitulo)

                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup()
                                        .addComponent(lblDesarrollador)
                                        .addComponent(lblModulo)
                                        .addComponent(lblTipo)
                                        .addComponent(lblDescripcion)
                                        .addComponent(lblComentario))
                                .addGroup(layout.createParallelGroup()
                                        .addComponent(txtDesarrollador)
                                        .addComponent(txtModulo)
                                        .addComponent(cmbTipo)
                                        .addComponent(spDescripcion)
                                        .addComponent(spComentario)
                                        .addComponent(btnRegistrar)))

                        .addComponent(spTabla)
        );

        layout.setVerticalGroup(
                layout.createSequentialGroup()

                        .addComponent(lblTitulo)

                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(lblDesarrollador)
                                .addComponent(txtDesarrollador))

                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(lblModulo)
                                .addComponent(txtModulo))

                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(lblTipo)
                                .addComponent(cmbTipo))

                        .addGroup(layout.createParallelGroup()
                                .addComponent(lblDescripcion)
                                .addComponent(spDescripcion))

                        .addGroup(layout.createParallelGroup()
                                .addComponent(lblComentario)
                                .addComponent(spComentario))

                        .addComponent(btnRegistrar)

                        .addComponent(spTabla)
        );
    }

    private void registrar() {

        try {

            String nombre = txtDesarrollador.getText();
            String modulo = txtModulo.getText();
            String descripcion = txtDescripcion.getText();
            String comentario = txtComentario.getText();

            String tipoSeleccionado =
                    cmbTipo.getSelectedItem().toString();

            Usuario usuario =
                    new Usuario(1, nombre);

            TipoRefactorizacion tipo =
                    new TipoRefactorizacion(
                            1,
                            tipoSeleccionado,
                            "Tipo de refactorización"
                    );

            Refactorizacion ref =
                    new Refactorizacion(
                            usuario,
                            tipo,
                            modulo,
                            descripcion,
                            comentario
                    );

            ref.registrar(historial);

            DefaultTableModel modelo =
                    (DefaultTableModel) tabla.getModel();

            modelo.addRow(new Object[]{
                    ref.getId(),
                    usuario.getNombre(),
                    ref.getModulo(),
                    tipo.obtenerTipo()
            });

            txtDesarrollador.setText("");
            txtModulo.setText("");
            txtDescripcion.setText("");
            txtComentario.setText("");

            JOptionPane.showMessageDialog(
                    this,
                    "Refactorización registrada correctamente"
            );

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(
                    this,
                    ex.getMessage()
            );
        }
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(
                Formulario1::new
        );
    }
}

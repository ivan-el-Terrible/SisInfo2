package interfaces;

import clases.Usuario;
import clases.TipoRefactorizacion;
import clases.Refactorizacion;
import clases.HistorialRefactorizaciones;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
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

    JScrollPane spDescripcion = new JScrollPane(txtDescripcion);
    JScrollPane spComentario = new JScrollPane(txtComentario);

    cmbTipo = new JComboBox<>();

    for (String tipo : TipoRefactorizacion.obtenerTiposDisponibles()) {
        cmbTipo.addItem(tipo);
    }

    btnRegistrar = new JButton("Registrar");

    JButton btnEliminarComentarios =
            new JButton("Eliminar Comentarios");

    JButton btnVolver =
            new JButton("Volver al Menú");

    btnRegistrar.addActionListener(e -> registrar());

    btnEliminarComentarios.addActionListener(
            e -> eliminarComentarios()
    );

    btnVolver.addActionListener(e -> {

        new PantallaPrincipal();

        dispose();
    });

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

                                    .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnRegistrar)
                                            .addComponent(btnEliminarComentarios)
                                            .addComponent(btnVolver)
                                    )
                            )
                    )

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

                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegistrar)
                            .addComponent(btnEliminarComentarios)
                            .addComponent(btnVolver))

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
    private void eliminarComentarios() {

    try {

        File carpeta = new File("codigos");

        File[] archivos = carpeta.listFiles(
                (dir, nombre) ->
                        nombre.endsWith(".java")
        );

        if (archivos == null || archivos.length == 0) {

            JOptionPane.showMessageDialog(
                    this,
                    "No existen archivos Java en la carpeta codigos"
            );

            return;
        }

        String[] nombres =
                new String[archivos.length];

        for (int i = 0; i < archivos.length; i++) {

            nombres[i] = archivos[i].getName();
        }

        String archivoSeleccionado =
                (String) JOptionPane.showInputDialog(
                        this,
                        "Seleccione un archivo:",
                        "Eliminar Comentarios",
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        nombres,
                        nombres[0]
                );

        if (archivoSeleccionado == null) {
            return;
        }

        Path ruta =
                Path.of("codigos/" + archivoSeleccionado);

        String codigo =
                Files.readString(ruta);

        codigo = codigo.replaceAll(
                "/\\*.*?\\*/",
                ""
        );

        Files.writeString(ruta, codigo);

        JOptionPane.showMessageDialog(
                this,
                "Comentarios eliminados correctamente"
        );

        registrarRefactorizacionAutomatica(
                archivoSeleccionado
        );

    } catch (Exception ex) {

        JOptionPane.showMessageDialog(
                this,
                ex.getMessage()
        );
    }
}
    private void registrarRefactorizacionAutomatica(
        String archivo) {

    try {

        Usuario usuario =
                new Usuario(
                        0,
                        txtDesarrollador.getText()
                );

        TipoRefactorizacion tipo =
                new TipoRefactorizacion(
                        99,
                        "Eliminación de comentarios",
                        "Refactorización automática"
                );

        Refactorizacion ref =
                new Refactorizacion(
                        usuario,
                        tipo,
                        archivo,
                        "Se eliminaron comentarios del código",
                        "Generado automáticamente"
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

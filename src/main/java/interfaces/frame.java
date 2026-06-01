package interfaces;

import clases.AnalisisEstatico;
import clases.CambioCodigo;
import clases.IntegracionCodigo;
import clases.PruebaAutomatizada;
import clases.RevisionCodigo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.DefaultListModel;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class frame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(frame.class.getName());
    private CambioCodigo cambioActual;
    private RevisionCodigo revisionActual;
    /**
     * Ivan el terrible
     */
    public frame() {
    
        initComponents();
        areaCodigo.setEditable(false);
        cargarListaArchivos();

        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnautor = new javax.swing.JButton();
        btnrevisor = new javax.swing.JButton();
        txtTitulo = new javax.swing.JTextField();
        panelGlobal = new javax.swing.JPanel();
        listaPanel = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnguardar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        areaCodigo = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtnomArchivo = new javax.swing.JTextField();
        txtnomAutor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtversion = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnaprobarAutor = new javax.swing.JButton();
        btnaprobarRevisor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        codigoaprobar = new javax.swing.JTextArea();
        rechazar = new javax.swing.JButton();
        btnPruebas = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        areaResultados = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnautor.setText("AUTOR");
        btnautor.addActionListener(this::btnautorActionPerformed);
        getContentPane().add(btnautor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 110, -1));

        btnrevisor.setText("REVISOR");
        btnrevisor.addActionListener(this::btnrevisorActionPerformed);
        getContentPane().add(btnrevisor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 110, -1));

        txtTitulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtTitulo.setText("BIENBENIDOS DESARROLLADORES ");
        txtTitulo.addActionListener(this::txtTituloActionPerformed);
        getContentPane().add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 31, 628, 47));

        panelGlobal.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        btnguardar.setText("guardar");
        btnguardar.addActionListener(this::btnguardarActionPerformed);

        areaCodigo.setColumns(20);
        areaCodigo.setRows(5);
        jScrollPane3.setViewportView(areaCodigo);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnguardar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnguardar)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        listaPanel.addTab("codigo", jPanel1);

        jLabel4.setText("nombre del archivo");

        txtnomArchivo.addActionListener(this::txtnomArchivoActionPerformed);

        jLabel5.setText("nombre autor");

        jLabel6.setText("version");

        jButton4.setText("confirmar");
        jButton4.addActionListener(this::jButton4ActionPerformed);

        jButton5.setText("cancelar");
        jButton5.addActionListener(this::jButton5ActionPerformed);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(11, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(txtnomAutor)
                                .addGap(14, 14, 14))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtversion, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnomArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 3, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addGap(47, 47, 47))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnomArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnomAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtversion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap(184, Short.MAX_VALUE))
        );

        listaPanel.addTab("registro", jPanel3);

        btnaprobarAutor.setText("aprobar");
        btnaprobarAutor.addActionListener(this::btnaprobarAutorActionPerformed);

        btnaprobarRevisor.setText("aprobarRevisor");
        btnaprobarRevisor.addActionListener(this::btnaprobarRevisorActionPerformed);

        codigoaprobar.setColumns(20);
        codigoaprobar.setRows(5);
        jScrollPane1.setViewportView(codigoaprobar);

        rechazar.setText("rechazar");
        rechazar.addActionListener(this::rechazarActionPerformed);

        btnPruebas.setText("ver pruebas");
        btnPruebas.addActionListener(this::btnPruebasActionPerformed);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(rechazar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPruebas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnaprobarRevisor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnaprobarAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(167, 167, 167))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnaprobarAutor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(btnaprobarRevisor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rechazar)
                    .addComponent(btnPruebas))
                .addContainerGap())
        );

        listaPanel.addTab("aprobar", jPanel4);

        jButton2.setText("confirmar y salir ");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        areaResultados.setColumns(20);
        areaResultados.setRows(5);
        jScrollPane4.setViewportView(areaResultados);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(162, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(156, 156, 156))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(50, 50, 50))
        );

        listaPanel.addTab("resultado de pruebas ", jPanel2);

        lista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(lista);

        javax.swing.GroupLayout panelGlobalLayout = new javax.swing.GroupLayout(panelGlobal);
        panelGlobal.setLayout(panelGlobalLayout);
        panelGlobalLayout.setHorizontalGroup(
            panelGlobalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlobalLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(listaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelGlobalLayout.setVerticalGroup(
            panelGlobalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlobalLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 281, Short.MAX_VALUE))
            .addGroup(panelGlobalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        listaPanel.getAccessibleContext().setAccessibleName("codigo");

        getContentPane().add(panelGlobal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 570, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnautorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnautorActionPerformed
        btnautor.setVisible(true);
        btnrevisor.setVisible(false);
        btnaprobarRevisor.setVisible(false);
        areaCodigo.setEditable(true);

        btnguardar.setVisible(true);

        listaPanel.setEnabledAt(0, true);
    }//GEN-LAST:event_btnautorActionPerformed

    private void btnrevisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrevisorActionPerformed
        btnautor.setVisible(false);   
        btnrevisor.setVisible(true);
        areaCodigo.setEditable(false);
        btnaprobarAutor.setVisible(false);
        btnguardar.setVisible(false);
        listaPanel.setSelectedIndex(2);
        listaPanel.setEnabledAt(0, false);
        listaPanel.setEnabledAt(1, false);


    }//GEN-LAST:event_btnrevisorActionPerformed

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed
        txtTitulo.setEditable(false);
    }//GEN-LAST:event_txtTituloActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
         listaPanel.setSelectedIndex(1); 
    }//GEN-LAST:event_btnguardarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int confirmacion = javax.swing.JOptionPane.showConfirmDialog(
        this, 
        "¿Estás seguro de que deseas salir?", 
        "Confirmar Salida", 
        javax.swing.JOptionPane.YES_NO_OPTION);

        // 2. Si el usuario elige "Sí", cerrar el programa
        if (confirmacion == javax.swing.JOptionPane.YES_OPTION) {
            System.exit(0); // El 0 indica una salida exitosa sin errores
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        guardarArchivo();
        areaCodigo.setText("");
        listaPanel.setSelectedIndex(2); 

    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtnomArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomArchivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomArchivoActionPerformed

    private void listaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaMouseClicked
        try {

            String archivoSeleccionado =
                    lista.getSelectedValue().toString();

            File archivo =
                    new File("codigos/" + archivoSeleccionado);

            BufferedReader br =
                    new BufferedReader(
                            new FileReader(archivo));

            StringBuilder contenido =
                    new StringBuilder();

            String linea;

            while ((linea = br.readLine()) != null) {

                contenido.append(linea)
                         .append("\n");

            }

            br.close();
            cambioActual = new CambioCodigo( 1, "v2", archivoSeleccionado);
            revisionActual = new RevisionCodigo(1, "AUTOR", "REVISOR", cambioActual);
            PruebaAutomatizada prueba = new PruebaAutomatizada( 1, "PASSED", 85);// ultimos añadidos
            AnalisisEstatico analisis = new AnalisisEstatico(1, "Sin advertencias", 1);

            cambioActual.asociarResultadosPruebas(prueba);
            cambioActual.asociarResultadosAnalisis(analisis);
            codigoaprobar.setText(contenido.toString());

        } catch (Exception e) {

            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_listaMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        areaCodigo.setText("");
        txtnomAutor.setText("");
        txtnomArchivo.setText("");
        txtversion.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnaprobarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaprobarAutorActionPerformed
         if (revisionActual == null) {
        JOptionPane.showMessageDialog(this, "Primero seleccione o cree un archivo.");
        return;
        }
        revisionActual.aprobarAutor();
        try {
            String contenido = codigoaprobar.getText();
            contenido = contenido.replace(
                    "APROBADO_AUTOR=false",
                    "APROBADO_AUTOR=true"
            );
            String archivoSeleccionado =
                    lista.getSelectedValue().toString();
            FileWriter writer =
                    new FileWriter(
                            "codigos/" + archivoSeleccionado
                    );

            writer.write(contenido);
            writer.close();

            codigoaprobar.setText(contenido);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(
                revisionActual.isAprobacionAutor()
        );

        JOptionPane.showMessageDialog(
                this,
                "Autor aprobó el cambio."
        );
        System.out.println(
                revisionActual.isAprobacionAutor()
        );

    }//GEN-LAST:event_btnaprobarAutorActionPerformed

    private void btnaprobarRevisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaprobarRevisorActionPerformed
        if(revisionActual == null){
            JOptionPane.showMessageDialog(this, "Seleccione un archivo." );
        return;
        }
        String contenido = codigoaprobar.getText();
        if(!contenido.contains("APROBADO_AUTOR=true")){
            JOptionPane.showMessageDialog(this, "El autor aún no aprobó el cambio.");
            return;
        }
        revisionActual.aprobarAutor();
        revisionActual.aprobarRevisor();
        contenido = contenido.replace(
                "APROBADO_REVISOR=false",
                "APROBADO_REVISOR=true"
        );
        contenido = contenido.replace(
                "ESTADO=PENDIENTE",
                "ESTADO=APROBADO"
        );
        try {

            String archivoSeleccionado = lista.getSelectedValue().toString();

            FileWriter writer = new FileWriter("codigos/" + archivoSeleccionado);
            writer.write(contenido);
            writer.close();
            codigoaprobar.setText(contenido);
        } catch(Exception e){
            e.printStackTrace();
        }

        boolean aprobado =
                revisionActual.consultarResultadosPruebas();

        if(aprobado){

            IntegracionCodigo integracion =
                    new IntegracionCodigo(
                            1,
                            txtversion.getText()
                    );

            integracion.IntegrarCambios(
                    revisionActual
            );

            JOptionPane.showMessageDialog(
                    this,
                    "Código aprobado e integrado."
            );

        }else{

            JOptionPane.showMessageDialog(
                    this,
                    "Código rechazado."
            );
        }
    }//GEN-LAST:event_btnaprobarRevisorActionPerformed

    private void rechazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechazarActionPerformed
        JOptionPane.showMessageDialog(this, "Cambio rechazado.");
    }//GEN-LAST:event_rechazarActionPerformed

    private void btnPruebasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPruebasActionPerformed
        codigoaprobar.setEditable(false);
        listaPanel.setSelectedIndex(3); 
        if(cambioActual == null){
            JOptionPane.showMessageDialog(this,  "Seleccione un archivo primero.");
            return;
        }
        String resultado = "===== RESULTADOS =====\n\n";
        // Pruebas Automatizadas
        for(PruebaAutomatizada prueba : cambioActual.getPruebasAsociadas()){
            resultado += "PRUEBA #" + prueba.getIdPrueba() + "\n";
            resultado += "Resultado: " + prueba.getResultado() + "\n";
            resultado += "Cobertura: " + prueba.getCobertura() + "%\n";
            resultado += "Cobertura válida: " + prueba.validarCobertura() +  "\n\n";
        }

        // Análisis Estático
        for(AnalisisEstatico analisis : cambioActual.getAnalisisAsociados()){
            
            resultado += "ANÁLISIS #" +  analisis.getIdAnalisis() + "\n";
            resultado += "Duplicaciones: " + analisis.getDuplicaciones() + "\n";
            resultado += "Validación: " + analisis.ejecutarValidaciones() + "\n\n";
        }

        areaResultados.setText(resultado);
        areaResultados.setEditable(false);
    }//GEN-LAST:event_btnPruebasActionPerformed
    
    
    private void cargarListaArchivos() {

        DefaultListModel<String> modelo = new DefaultListModel<>();

        File carpeta = new File("codigos");

        File[] archivos = carpeta.listFiles();

        if (archivos != null) {
            for (File archivo : archivos) {

                if (archivo.isFile()) {
                    modelo.addElement(archivo.getName());
                }

            }
        }
        System.out.println(System.getProperty("user.dir"));
        lista.setModel(modelo);
    }
    
    /*guardar archivos creados */
    private void guardarArchivo() {
        try {

            String nombre = txtnomArchivo.getText().trim();
            if (!nombre.endsWith(".java")) {
                nombre += ".java";
            }

            cambioActual = new CambioCodigo( 1,txtversion.getText(), txtnomArchivo.getText());
            PruebaAutomatizada prueba = new PruebaAutomatizada(1, "PASSED", 85);
            prueba.registrarResultados();

            AnalisisEstatico analisis = new AnalisisEstatico(1, "Sin advertencias", 1);
            analisis.detectarDuplicaciones();
            analisis.registrarAdvertencias();
            cambioActual.asociarResultadosPruebas(
                    prueba
            );

            cambioActual.asociarResultadosAnalisis(
                    analisis
            );
            revisionActual = new RevisionCodigo( 1, txtnomAutor.getText(), "REVISOR", cambioActual);
            revisionActual.registrarRevision(); // ultimo añadido

            FileWriter writer =
                    new FileWriter("codigos/" + nombre);
           writer.write("AUTOR=" + txtnomAutor.getText() + "\n");
            writer.write("VERSION=" + txtversion.getText() + "\n");
            writer.write("APROBADO_AUTOR=false\n");
            writer.write("APROBADO_REVISOR=false\n");
            writer.write("ESTADO=PENDIENTE\n");
            writer.write("====================================\n");

            writer.write(areaCodigo.getText());

            writer.close();
            cargarListaArchivos();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new frame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaCodigo;
    private javax.swing.JTextArea areaResultados;
    private javax.swing.JButton btnPruebas;
    private javax.swing.JButton btnaprobarAutor;
    private javax.swing.JButton btnaprobarRevisor;
    private javax.swing.JButton btnautor;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnrevisor;
    private javax.swing.JTextArea codigoaprobar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> lista;
    private javax.swing.JTabbedPane listaPanel;
    private javax.swing.JPanel panelGlobal;
    private javax.swing.JButton rechazar;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtnomArchivo;
    private javax.swing.JTextField txtnomAutor;
    private javax.swing.JTextField txtversion;
    // End of variables declaration//GEN-END:variables
}

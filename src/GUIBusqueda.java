
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GUIBusqueda extends javax.swing.JFrame {

    //Variables
    ArrayList<Preso> misPresos;
    DefaultTableModel tablaBusqueda;

    //Método para la tabla de búsqueda
    public void tablaBusqueda() {
        tablaBusqueda = new DefaultTableModel();
        tablaBusqueda.addColumn("ID");
        tablaBusqueda.addColumn("Nombre");
        tablaBusqueda.addColumn("Apellido");
        tablaBusqueda.addColumn("Estado de sentencia");
        tablaBusqueda.addColumn("Delito");
        tablaBusqueda.addColumn("Nivel de peligrosidad");
        tablaBusqueda.addColumn("Descripción del arresto");
        tblBusqueda.setModel(tablaBusqueda);
    }

    //Constructores
    public GUIBusqueda() {
        initComponents();
    }

    public GUIBusqueda(ArrayList<Preso> misPresos) {
        initComponents();
        tablaBusqueda();

        //ArrayList misPresos
        this.misPresos = misPresos;

        //Variables
        String mat[][] = new String[misPresos.size()][7];

        //Presentación de datos
        for (int i = 0; i < misPresos.size(); i++) {
            mat[i][0] = String.valueOf(misPresos.get(i).getDocumentoDeIdentidad());
            mat[i][1] = misPresos.get(i).getNombre();
            mat[i][2] = misPresos.get(i).getApellido();
            mat[i][3] = misPresos.get(i).getEstadoDeSentencia();
            mat[i][4] = misPresos.get(i).getDelito();
            mat[i][5] = Integer.toString(misPresos.get(i).getNivelDePeligrosidad());
            mat[i][6] = misPresos.get(i).arresto();
        }

        tblInformacion.setModel(new javax.swing.table.DefaultTableModel(
                mat,
                new String[]{
                    "ID", "Nombre", "Apellido", "Estado de sentencia",
                    "Delito", "Nivel de peligrosidad", "Descripción del arresto"
                }
        ));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBusqueda = new javax.swing.JTextField();
        lblidentidad = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblInformacion = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBusqueda = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblidentidad.setText("Documento de identidad");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Registro");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        tblInformacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblInformacion);

        tblBusqueda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblBusqueda);

        jLabel2.setText("Resultados de la búsqueda:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblidentidad)
                                .addGap(18, 18, 18)
                                .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(270, 270, 270)
                                .addComponent(jLabel1)))
                        .addGap(34, 34, 34)
                        .addComponent(btnBuscar)
                        .addGap(25, 25, 25)
                        .addComponent(btnRegresar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
                                .addComponent(jScrollPane1)))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblidentidad)
                    .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(btnRegresar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:

        //Abre el sistema principal
        GUIPreso principal = new GUIPreso(misPresos);
        principal.setVisible(true);

        //Desaparece la GUI de búsqueda
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:

        //Parámetros de búsqueda
        int idPreso = 0;
        tablaBusqueda();
        PresoCondenaAplicada pca1;
        PresoCumpliendoCondena pcc1;
        PresoLibertadCondicional plc1;
        String estadoDeSentencia = "";

        try {
            //Identificación del preso
            idPreso = Integer.parseInt(txtBusqueda.getText());

            for (int i = 0; i < misPresos.size(); i++) {
                //Estado de sentencia
                estadoDeSentencia = misPresos.get(i).getEstadoDeSentencia();

                if (misPresos.get(i).getDocumentoDeIdentidad() == idPreso) {
                    //Tabla de búsqueda
                    tablaBusqueda.addRow(
                            new Object[]{
                                misPresos.get(i).getDocumentoDeIdentidad(),
                                misPresos.get(i).getNombre(),
                                misPresos.get(i).getApellido(),
                                misPresos.get(i).getEstadoDeSentencia(),
                                misPresos.get(i).getDelito(),
                                misPresos.get(i).getNivelDePeligrosidad(),
                                misPresos.get(i).arresto()}
                    );
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Algo anda mal");
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIBusqueda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblidentidad;
    private javax.swing.JTable tblBusqueda;
    private javax.swing.JTable tblInformacion;
    private javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables
}

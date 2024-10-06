package Vista;

import Conf.Conexion;
import java.sql.Connection;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Bolivar
 */
public class Principal extends javax.swing.JFrame {

    Conexion con = new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    int id;

    /**
     * Creates new form Formulario
     *
     */
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        Listar();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtIdentificacion = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        Nombres = new javax.swing.JLabel();
        Apellidos = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        Nombres.setText("Nombres");

        Apellidos.setText("Apellidos");

        jLabel3.setText("Identificacion");

        jLabel4.setText("Correo");

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Crud\\src\\Imagenes\\Java 128p.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Nombres)
                                .addComponent(Apellidos))
                            .addComponent(jLabel3))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIdentificacion, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(txtCorreo)
                            .addComponent(txtApellidos)
                            .addComponent(txtNombres))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nombres))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Apellidos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Operacion"));

        btnAgregar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Crud\\src\\Imagenes\\Agregar 48p.png")); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Crud\\src\\Imagenes\\Guardar 48p.png")); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Crud\\src\\Imagenes\\Eliminar 24p.png")); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnNuevo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Crud\\src\\Imagenes\\Nuevo 48p.png")); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Crud\\src\\Imagenes\\Buscar 48P.png")); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnModificar)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addGap(31, 31, 31)
                .addComponent(btnNuevo)
                .addGap(19, 19, 19))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNuevo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Listar"));

        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombres", "Apellidos", "Identificacion", "Correos"
            }
        ));
        TablaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaDatos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("crud Aplication");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Agregar();
        Listar();
        Nuevo();
    }//GEN-LAST:event_btnAgregarActionPerformed
    private void limpiar() {
        txtNombres.setText("");
        txtApellidos.setText("");
        txtCorreo.setText("");
        txtIdentificacion.setText("");
    }

//Para seleccionar

    private void TablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDatosMouseClicked
        int fila = TablaDatos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Usuario no Seleccionado");

        } else {
            int Identificacion = Integer.parseInt((String) TablaDatos.getValueAt(fila, 2).toString());
            String Nombres = (String) TablaDatos.getValueAt(fila, 0);
            String Apellidos = (String) TablaDatos.getValueAt(fila, 1);
            String Correo = (String) TablaDatos.getValueAt(fila, 3);
            txtNombres.setText(Nombres);
            txtApellidos.setText(Apellidos);
            txtCorreo.setText(Correo);
            txtIdentificacion.setText("" + Identificacion);

        }
    }//GEN-LAST:event_TablaDatosMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        Modificar();
        Listar();


    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Eliminar();
        Listar();

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiar();

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Buscar();
        Listar();

    }//GEN-LAST:event_btnBuscarActionPerformed
    void Modificar() {
        String Nombres = txtNombres.getText();
        String Apellidos = txtApellidos.getText();
        String Identificacion = txtIdentificacion.getText();
        String Correo = txtCorreo.getText();
        String sql = "update usuarios set Nombres='" + Nombres + "',Apellidos='" + Apellidos + "',Correo='" + Correo + "' "
                + "where Identificacion='" + Identificacion + "'";
        if (Nombres.equals("") || Apellidos.equals("") || Identificacion.equals("") || Correo.equals("")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar datos");
        } else {
            try {
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Usuario Actualizado");
                limpiarTabla();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);

            }
        });
    }

    void Listar() {
        String sql = "select * from usuarios";
        try {
            cn = con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            Object[] usuarios = new Object[4];
            modelo = (DefaultTableModel) TablaDatos.getModel();
            limpiarTabla();

            /*if (modelo.getRowCount() > 0) {
                for (int i = modelo.getRowCount() - 1; i > -1; i--) {
                    modelo.removeRow(i);
                }
            }*/
            while (rs.next()) {
                usuarios[0] = rs.getString("Nombres");
                usuarios[1] = rs.getString("Apellidos");
                usuarios[2] = rs.getInt("Identificacion");
                usuarios[3] = rs.getString("Correo");
                modelo.addRow(usuarios);
            }
            TablaDatos.setModel(modelo);
            //Listar();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    void Agregar() {
        String Nombres = txtNombres.getText();
        String Apellidos = txtApellidos.getText();
        String Identificacion = txtIdentificacion.getText();
        String Correo = txtCorreo.getText();
        if (Nombres.equals("") || Apellidos.equals("") || Identificacion.equals("") || Correo.equals("")) {
            JOptionPane.showMessageDialog(null, "cajas estan  vacias...!!!");
        } else {
            String sql = "insert into usuarios(Nombres,Apellidos,Identificacion,Correo)values('" + Nombres + "','" + Apellidos + "'," + Identificacion + ",'" + Correo + "')";
            try {
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Usuario Agregado");

                Listar();
            } catch (Exception e) {
                e.printStackTrace();
            }
            limpiar();

        }
    }

    void limpiarTabla() {
        if (modelo.getRowCount() > 0) {
            for (int i = modelo.getRowCount() - 1; i > -1; i--) {
                modelo.removeRow(i);
            }

        }

    }

    void Eliminar() {
        int filaseleccionado = TablaDatos.getSelectedRow();
        if (filaseleccionado == -1) {
            JOptionPane.showMessageDialog(null, "Debe Seleccionar filas");
        } else {
            String Identificacion = txtIdentificacion.getText();
            String sql = "delete from usuarios where Identificacion ='" + Identificacion + "'";
            try {

                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Usuario Eliminado");
                limpiar();
                limpiarTabla();

            } catch (Exception e) {
                e.printStackTrace();
            }

            // void limpiarTabla() {
            // if (modelo.getRowCount() > 0) {
            // for(int i = 0;i<=TablaDatos.getRowCount(); i++) {
            //modelo.removeRow(i);
            // i=i-1;
            /*if (modelo.getRowCount() > 0) {
            for (int i = 0; i <= modelo.getRowCount(); i++) {
                model.removeRow(i);
                i = i - 1;
            }
        }*/
        }
    }

    void Buscar() {
        //String txtNombre = txtBuscar.getText();
        //String sql = "select * from usuarios where Nombres like '%"+txtNombre+"%'";
        
        String txtId = txtBuscar.getText();
        String sql = "select * from usuarios where Identificacion like '%"+txtId+"%'";
        try {
            cn = con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            
            if (rs.next()) {
                txtNombres.setText(rs.getString("Nombres"));
                txtApellidos.setText(rs.getString("Apellidos"));
                txtIdentificacion.setText(rs.getString("Identificacion"));
                txtCorreo.setText(rs.getString("Correo"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void Nuevo() {
        txtApellidos.setText("");
        txtIdentificacion.setText("");
        txtNombres.setText("");
        txtCorreo.setText("");
        txtIdentificacion.requestFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellidos;
    private javax.swing.JLabel Nombres;
    private javax.swing.JTable TablaDatos;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}

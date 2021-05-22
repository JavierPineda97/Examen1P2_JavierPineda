/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import javax.swing.JOptionPane;
import sun.security.util.Password;

/**
 *
 * @author Dell
 */
public class BibliotecaNacional extends javax.swing.JFrame {

    /**
     * Creates new form BibliotecaNacional
     */
    public BibliotecaNacional() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Genero = new javax.swing.ButtonGroup();
        pnlRegistro = new javax.swing.JPanel();
        lblDatos = new javax.swing.JPanel();
        lblNombredeUsuario = new javax.swing.JLabel();
        lblContra = new javax.swing.JLabel();
        lblFechadeNacimiento = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblCorreoElectronico = new javax.swing.JLabel();
        lblNombreCompleto = new javax.swing.JLabel();
        lblGeneroFavorito = new javax.swing.JLabel();
        lblColecciondeLibros = new javax.swing.JLabel();
        lblAmigos = new javax.swing.JLabel();
        txtNombredeUsuario = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCorreoElectronico = new javax.swing.JTextField();
        txtNombreCompleto = new javax.swing.JTextField();
        txtColecciondeLibros = new javax.swing.JTextField();
        txtAmigos = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        rbtHombre = new javax.swing.JRadioButton();
        rbtMujer = new javax.swing.JRadioButton();
        lblGenero = new javax.swing.JLabel();
        cboGeneroFavorito = new javax.swing.JComboBox<>();
        btnCrear = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        pnlLogin = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblContaAccesso = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        cuadContra = new javax.swing.JPasswordField();
        lblBibliotecaNacional = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlRegistro.setBackground(new java.awt.Color(0, 204, 204));

        lblDatos.setBackground(new java.awt.Color(102, 255, 204));
        lblDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        lblNombredeUsuario.setText("Nombre de usuario:");

        lblContra.setText("Contraseña:");

        lblFechadeNacimiento.setText("Fecha de nacimiento:");

        lblTelefono.setText("Telefono:");

        lblCorreoElectronico.setText("Correo Electronico:");

        lblNombreCompleto.setText("Nombre Completo:");

        lblGeneroFavorito.setText("Genero de lectura favorito:");

        lblColecciondeLibros.setText("Coleccion de libros:");

        lblAmigos.setText("Amigos:");

        Genero.add(rbtHombre);
        rbtHombre.setText("Hombre");

        Genero.add(rbtMujer);
        rbtMujer.setText("Mujer");

        lblGenero.setText("Genero:");

        cboGeneroFavorito.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Horror", "Suspeso", "Comedia", "Romance", "Comedia Romatica", "Accion", "Articulos cientificos", "Comics", "Manga", "Fantasia", "Ciencia ficcion" }));

        btnCrear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCrear.setText("Crear");
        btnCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout lblDatosLayout = new javax.swing.GroupLayout(lblDatos);
        lblDatos.setLayout(lblDatosLayout);
        lblDatosLayout.setHorizontalGroup(
            lblDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lblDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lblDatosLayout.createSequentialGroup()
                        .addComponent(lblGeneroFavorito)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboGeneroFavorito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(lblColecciondeLibros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtColecciondeLibros))
                    .addGroup(lblDatosLayout.createSequentialGroup()
                        .addComponent(lblFechadeNacimiento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTelefono)
                        .addGap(10, 10, 10)
                        .addComponent(txtTelefono))
                    .addGroup(lblDatosLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lblAmigos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAmigos))
                    .addGroup(lblDatosLayout.createSequentialGroup()
                        .addComponent(lblCorreoElectronico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(lblNombreCompleto)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(lblDatosLayout.createSequentialGroup()
                        .addGroup(lblDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lblDatosLayout.createSequentialGroup()
                                .addComponent(lblNombredeUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombredeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85)
                                .addComponent(lblContra)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPasswordField1))
                            .addGroup(lblDatosLayout.createSequentialGroup()
                                .addComponent(lblGenero)
                                .addGap(18, 18, 18)
                                .addComponent(rbtHombre)
                                .addGap(18, 18, 18)
                                .addComponent(rbtMujer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCrear)))
                        .addContainerGap())))
        );
        lblDatosLayout.setVerticalGroup(
            lblDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lblDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombredeUsuario)
                    .addComponent(lblContra)
                    .addComponent(txtNombredeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(lblDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lblDatosLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(lblDatosLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(lblDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(lblDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblFechadeNacimiento)))))
                .addGap(18, 18, 18)
                .addGroup(lblDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreoElectronico)
                    .addComponent(lblNombreCompleto)
                    .addComponent(txtCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(lblDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGeneroFavorito)
                    .addComponent(lblColecciondeLibros)
                    .addComponent(txtColecciondeLibros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboGeneroFavorito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(lblDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAmigos)
                    .addComponent(txtAmigos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(lblDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblDatosLayout.createSequentialGroup()
                        .addGroup(lblDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGenero)
                            .addComponent(rbtHombre)
                            .addComponent(rbtMujer))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblDatosLayout.createSequentialGroup()
                        .addComponent(btnCrear)
                        .addContainerGap())))
        );

        pnlLogin.setBackground(new java.awt.Color(0, 255, 204));
        pnlLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingresar:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        lblUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblUsuario.setText("Usuario:");

        lblContaAccesso.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblContaAccesso.setText("Contrasena:");

        btnIngresar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsuario)
                            .addComponent(lblContaAccesso))
                        .addGap(34, 34, 34)
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                            .addComponent(cuadContra)))
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnIngresar)))
                .addGap(18, 18, 18))
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContaAccesso)
                    .addComponent(cuadContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnIngresar)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        lblBibliotecaNacional.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblBibliotecaNacional.setText("Biblioteca Nacional");

        javax.swing.GroupLayout pnlRegistroLayout = new javax.swing.GroupLayout(pnlRegistro);
        pnlRegistro.setLayout(pnlRegistroLayout);
        pnlRegistroLayout.setHorizontalGroup(
            pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistroLayout.createSequentialGroup()
                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegistroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlRegistroLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblBibliotecaNacional))
                    .addGroup(pnlRegistroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        pnlRegistroLayout.setVerticalGroup(
            pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegistroLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(lblBibliotecaNacional)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(44, 44, 44)
                .addComponent(lblDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseClicked
        String Usuario = "admin";
        String Contrasena = "1234";

        String Pass=new String(cuadContra.getPassword());

        if(txtNombreUsuario.getText().equals(Usuario) && Pass.equals(Contrasena)){

            GestionUsuario GU = new GestionUsuario();
            GU.setVisible(true);
            dispose();

        }else
        JOptionPane.showMessageDialog(this,"!Usuario o Contrasena son incorrectas! Intente de nuevo o cree un usuario");
    }//GEN-LAST:event_btnIngresarMouseClicked

    private void btnCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearMouseClicked
        String usuario=txtNombreUsuario.getText();
        String Pass=new String(cuadContra.getPassword());
        
        InformacionUsuario crear = new InformacionUsuario();
        crear.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCrearMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Genero;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JComboBox<String> cboGeneroFavorito;
    private javax.swing.JPasswordField cuadContra;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lblAmigos;
    private javax.swing.JLabel lblBibliotecaNacional;
    private javax.swing.JLabel lblColecciondeLibros;
    private javax.swing.JLabel lblContaAccesso;
    private javax.swing.JLabel lblContra;
    private javax.swing.JLabel lblCorreoElectronico;
    private javax.swing.JPanel lblDatos;
    private javax.swing.JLabel lblFechadeNacimiento;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblGeneroFavorito;
    private javax.swing.JLabel lblNombreCompleto;
    private javax.swing.JLabel lblNombredeUsuario;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlRegistro;
    private javax.swing.JRadioButton rbtHombre;
    private javax.swing.JRadioButton rbtMujer;
    private javax.swing.JTextField txtAmigos;
    private javax.swing.JTextField txtColecciondeLibros;
    private javax.swing.JTextField txtCorreoElectronico;
    private javax.swing.JTextField txtNombreCompleto;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JTextField txtNombredeUsuario;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}

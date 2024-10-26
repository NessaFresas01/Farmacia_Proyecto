package framesInterfaz;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
public class FmPrincipal extends javax.swing.JFrame {

	// Constructor del formulario principal de inicio de sesión
    public FmPrincipal() {
    	setResizable(false);
        initComponents();
    }
    // Método para inicializar los componentes del formulario
    private void initComponents() {
  
    	 
    	 
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField1.setForeground(new Color(255, 255, 255));
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField1.setForeground(new Color(255, 255, 255));
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        
        
     // Configuración de la ventana principal
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(50, 151, 179));
        jPanel1.setBackground(new java.awt.Color(50, 151, 179));
        

     // Configuración de campo de texto de usuario
        jTextField1.setBackground(new java.awt.Color(56, 160, 190));
        jTextField1.setFont(new java.awt.Font("Lucida Sans", 1, 14)); 
        jTextField1.setBorder(null);

     // Configuración de etiquetas y otros componentes de la interfaz
        jLabel1.setBackground(new java.awt.Color(50, 151, 179));
        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 24)); 
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Inicio de Sesión");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/userLogin.png"))); 

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 1, 14)); 
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuario:");
        jLabel3.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 1, 14));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contraseña:");
        jLabel4.setToolTipText("");

        jPasswordField1.setBackground(new java.awt.Color(56, 160, 190));
        jPasswordField1.setFont(new java.awt.Font("Lucida Sans", 1, 14)); 
        jPasswordField1.setToolTipText("");
        jPasswordField1.setBorder(null);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/userLabel.png")));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/key.png")));

        // Botón para iniciar sesión
        jButton1.setFont(new java.awt.Font("Lucida Sans", 1, 14));
        jButton1.setForeground(new java.awt.Color(50, 151, 179));
        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        
     // Botón para registrarse
        jButton2.setFont(new java.awt.Font("Lucida Sans", 1, 14));
        jButton2.setForeground(new java.awt.Color(50, 151, 179));
        jButton2.setText("Registrarse");
        jButton2.addActionListener(new java.awt.event.ActionListener() { // Agregar ActionListener
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt); // Llamar al método que maneja el registro
            }
        });

        // Configuración del diseño del panel
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(84)
        					.addComponent(jLabel1))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(30)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(jLabel7)
        						.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jPasswordField1, GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
        						.addComponent(jSeparator2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jTextField1)))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(135)
        					.addComponent(jLabel3))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(101)
        					.addComponent(jLabel2))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(127)
        					.addComponent(jButton1)))
        			.addContainerGap(52, Short.MAX_VALUE))
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(0, 110, Short.MAX_VALUE)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(jLabel4)
        					.addGap(121))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(jButton2)
        					.addGap(101))))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(24)
        			.addComponent(jLabel1)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(jLabel3)
        			.addGap(34)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addComponent(jLabel4))
        				.addComponent(jLabel5))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jLabel7)
        				.addComponent(jPasswordField1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jSeparator2, GroupLayout.PREFERRED_SIZE, 8, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(jButton1)
        			.addGap(18)
        			.addComponent(jButton2)
        			.addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1.setLayout(jPanel1Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        
        );

        pack();
    }

    // Evento del botón "Ingresar"
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        String usuario = jTextField1.getText();
        String clave = jPasswordField1.getText();

        // Consulta SQL con parámetros
        String sql = "SELECT usuario, clave, tipoUsuario FROM usuarios WHERE estado = 1 AND usuario = ?";
        
        try (Connection con = Conexion.obtenerConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, usuario); // Configura el primer parámetro con el valor del usuario
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                // Si existe el usuario
                String u = rs.getString("usuario");
                String c = rs.getString("clave");
                String priv = rs.getString("tipoUsuario");
                
                // Validar Contraseña
                if (clave.equals(c)) {
                    // Ir a JFrame Administrador o Empleado
                    if (priv.equals("Administrador")) {
                        FmAdmin ventanaAdmin = new FmAdmin();
                        ventanaAdmin.setVisible(true);
                    } else if (priv.equals("Empleado")) {
                        FmEmpleado ventanaEmpleado = new FmEmpleado();
                        ventanaEmpleado.setVisible(true);
                    }
                } else {
                    // Clave incorrecta
                    JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
                }
            } else {
                // El usuario no existe
                JOptionPane.showMessageDialog(null, "El usuario no existe, por favor registrese.");
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            JOptionPane.showMessageDialog(null, "Error de conexión con la base de datos.");
        }
    }
    
    //Evento del botón registrar.
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        this.setVisible(false);
        FmRegistro form = new FmRegistro();
        form.setVisible(true);
    }                                            



    public static void main(String args[]) {
    	 // Establece el aspecto visual Nimbus
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        //Crea y muestra el formulario principal
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration 
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration
}




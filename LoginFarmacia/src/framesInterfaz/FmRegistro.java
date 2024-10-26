package framesInterfaz;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.awt.Color;

//Clase principal de la interfaz de registro que extiende JFrame
public class FmRegistro extends javax.swing.JFrame {

	// Constructor de la clase FmRegistro
   public FmRegistro() {
	   initComponents(); // Llama al método que inicializa los componentes de la interfaz
       this.setLocationRelativeTo(this); // Centra la ventana en la pantalla
   }

   // Método que inicializa y configura todos los componentes de la interfaz
   private void initComponents() {
	   
	// Inicialización de componentes gráficos
       jPanel1 = new javax.swing.JPanel();
       jLabel1 = new javax.swing.JLabel();
       jLabel2 = new javax.swing.JLabel();
       jLabel3 = new javax.swing.JLabel();
       jSeparator2 = new javax.swing.JSeparator();
       jTextClave = new javax.swing.JTextField();
       jbtnGuardar = new javax.swing.JButton();
       jbtnVolver = new javax.swing.JButton();
       jSeparator3 = new javax.swing.JSeparator();
       jTextUsuario = new javax.swing.JTextField();
       jLabel4 = new javax.swing.JLabel();
       jSeparator4 = new javax.swing.JSeparator();
       jTexttipoUsuario = new javax.swing.JTextField();

       //Configura la operación al cerrar la ventana
       setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    // Configura la etiqueta del título
       jPanel1.setBackground(new Color(50, 151, 179));
       jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 18)); 
       jLabel1.setForeground(new java.awt.Color(255, 255, 255));
       jLabel1.setText("Regístrese");

    // Configura la etiqueta para el campo clave
       jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 14)); 
       jLabel2.setForeground(new java.awt.Color(255, 255, 255));
       jLabel2.setText("Clave (25 Carácteres):");

    // Configura la etiqueta para el campo nombre
       jLabel3.setFont(new java.awt.Font("Lucida Sans", 1, 14)); 
       jLabel3.setForeground(new java.awt.Color(255, 255, 255));
       jLabel3.setText("Nombre:");
       
    // Configura el separador visual
       jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
       jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
       
    // Configura el campo de texto para la clave
       jTextClave.setBackground(new Color(50, 151, 179));
       jTextClave.setForeground(new java.awt.Color(255, 255, 255));
       jTextClave.setHorizontalAlignment(javax.swing.JTextField.LEFT);
       jTextClave.setBorder(null);

    // Configura el botón guardar
       jbtnGuardar.setBackground(new java.awt.Color(81, 84, 255));
       jbtnGuardar.setFont(new java.awt.Font("Lucida Sans", 1, 14)); 
       jbtnGuardar.setForeground(new java.awt.Color(255, 255, 255));
       jbtnGuardar.setText("Guardar");
       jbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               jbtnGuardarActionPerformed(evt);// Llama al método de acción guardar
           }
       });

       jbtnVolver.setBackground(new java.awt.Color(81, 84, 255));
       jbtnVolver.setFont(new java.awt.Font("Lucida Sans", 1, 14)); 
       jbtnVolver.setForeground(new java.awt.Color(255, 255, 255));
       jbtnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/previous.png"))); 
       jbtnVolver.setText("Volver ");
       jbtnVolver.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               jbtnVolverActionPerformed(evt);
           }
       });

       jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
       jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

       jTextUsuario.setBackground(new Color(50, 151, 179));
       jTextUsuario.setForeground(new java.awt.Color(255, 255, 255));
       jTextUsuario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
       jTextUsuario.setBorder(null);

       jLabel4.setFont(new java.awt.Font("Lucida Sans", 1, 14)); 
       jLabel4.setForeground(new java.awt.Color(255, 255, 255));
       jLabel4.setText("Tipo de usuario:");

       jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
       jSeparator4.setForeground(new java.awt.Color(255, 255, 255));

       jTexttipoUsuario.setBackground(new Color(50, 151, 179));
       jTexttipoUsuario.setForeground(new java.awt.Color(255, 255, 255));
       jTexttipoUsuario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
       jTexttipoUsuario.setBorder(null);

    // Configura el diseño del panel utilizando GroupLayout
       javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
       jPanel1.setLayout(jPanel1Layout);
       jPanel1Layout.setHorizontalGroup(
           jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(jPanel1Layout.createSequentialGroup()
               .addGap(175, 175, 175)
               .addComponent(jLabel1)
               .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
           .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
               .addGap(0, 42, Short.MAX_VALUE)
               .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                   .addGroup(jPanel1Layout.createSequentialGroup()
                       .addComponent(jLabel2)
                       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                       .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(jTextClave, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                   .addGroup(jPanel1Layout.createSequentialGroup()
                       .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                               .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                               .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                           .addGroup(jPanel1Layout.createSequentialGroup()
                               .addGap(33, 33, 33)
                               .addComponent(jbtnVolver)))
                       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                       .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(jTextUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(jbtnGuardar, javax.swing.GroupLayout.Alignment.TRAILING))))
               .addGap(51, 51, 51))
           .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
               .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                   .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addComponent(jTexttipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGap(57, 57, 57))
       );
       jPanel1Layout.setVerticalGroup(
           jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(jPanel1Layout.createSequentialGroup()
               .addGap(19, 19, 19)
               .addComponent(jLabel1)
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
               .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(jLabel3)
                   .addComponent(jTextUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGap(7, 7, 7)
               .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addGap(18, 18, 18)
               .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                   .addGroup(jPanel1Layout.createSequentialGroup()
                       .addComponent(jLabel4)
                       .addGap(44, 44, 44)
                       .addComponent(jLabel2))
                   .addGroup(jPanel1Layout.createSequentialGroup()
                       .addComponent(jTexttipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                       .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                       .addGap(18, 18, 18)
                       .addComponent(jTextClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                       .addGap(3, 3, 3)
                       .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
               .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(jbtnGuardar)
                   .addComponent(jbtnVolver))
               .addGap(7, 7, 7))
       );
       // Configura el diseño del panel principal
       javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
       getContentPane().setLayout(layout);
       layout.setHorizontalGroup(
           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
       );
       layout.setVerticalGroup(
           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
       );

       pack();// Ajusta el tamaño de la ventana según sus componentes
   }
    
   //Funcionamiento de los botones Guardar y Volver
   private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {
	    String usuario = jTextUsuario.getText();
	    String clave = jTextClave.getText();
	    String tipoUsuario = jTexttipoUsuario.getText(); // Obtiene el valor de tipoUsuario

	    // Conexión y ejecución de la consulta SQL
	    Conexion db = new Conexion();
	    Connection conexion = null;
	    // Intento de guardar los datos del usuario en la base de datos
	    try {
	        conexion = db.obtenerConexion(); // Obtener conexión
	        if (conexion != null) {
	            String sql = "INSERT INTO usuarios (usuario, clave, tipoUsuario) VALUES (?, ?, ?);";
	            PreparedStatement pst = conexion.prepareStatement(sql);
	            
	            // Establecer los valores de los parámetros
	            pst.setString(1, usuario); // Cambiar 'nombre' por 'usuario'
	            pst.setString(2, clave);
	            pst.setString(3, tipoUsuario);
	            
	            int rs = pst.executeUpdate(); // Ejecutar la consulta
	            if (rs > 0) {
	                JOptionPane.showMessageDialog(this, "Usuario guardado correctamente.");
	            }
	        } else {
	            JOptionPane.showMessageDialog(this, "Error: No se pudo establecer la conexión a la base de datos.");
	        }
	    } catch (SQLException e) {
	        JOptionPane.showMessageDialog(this, "Error al guardar: " + e.getMessage());
	    } finally {
	        // Cerrar la conexión y otros recursos
	        try {
	            if (conexion != null) {
	                conexion.close();
	            }
	        } catch (SQLException e) {
	            JOptionPane.showMessageDialog(this, "Error al cerrar la conexión: " + e.getMessage());
	        }
	    }
	}
   // Método que se llama al hacer clic en el botón volver
   private void jbtnVolverActionPerformed(java.awt.event.ActionEvent evt) {
       this.setVisible(false);
       FmPrincipal login = new FmPrincipal();
       login.setVisible(true);
   }

   // Método principal que ejecuta la aplicación
   public static void main(String args[]) {
      
       try {
           for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
               if ("Nimbus".equals(info.getName())) {
                   javax.swing.UIManager.setLookAndFeel(info.getClassName());
                   break;
               }
           }
       } catch (ClassNotFoundException ex) {
           java.util.logging.Logger.getLogger(FmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (InstantiationException ex) {
           java.util.logging.Logger.getLogger(FmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (IllegalAccessException ex) {
           java.util.logging.Logger.getLogger(FmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (javax.swing.UnsupportedLookAndFeelException ex) {
           java.util.logging.Logger.getLogger(FmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       }
      
      
       java.awt.EventQueue.invokeLater(new Runnable() {
           public void run() {
               new FmRegistro().setVisible(true);
           }
       });
   }

   // Variables declaration
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JSeparator jSeparator2;
   private javax.swing.JSeparator jSeparator3;
   private javax.swing.JSeparator jSeparator4;
   private javax.swing.JTextField jTextClave;
   private javax.swing.JTextField jTextUsuario;
   private javax.swing.JTextField jTexttipoUsuario;
   private javax.swing.JButton jbtnGuardar;
   private javax.swing.JButton jbtnVolver;
   // End of variables declarations
}



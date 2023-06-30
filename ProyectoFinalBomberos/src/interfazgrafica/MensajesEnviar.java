/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfazgrafica;

import conexion.ConexionBaseDatos;
import herencias.Idiomas;
import interfacespropias.Sonidos;
import java.applet.AudioClip;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.sql.Timestamp;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author ShibaXpath
 */
public final class MensajesEnviar extends Idiomas implements Sonidos {

    private String nombreUsuario, usuarioEnviar;
    private final Plataforma plata;

    /**
     * Creates new form InicioApp
     */
    public MensajesEnviar() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Kizuna App");
        setResizable(false);
        setIconImage(getIconImage());
        nombreUsuario = "";
        plata = new Plataforma();
        enviar.setMnemonic(KeyEvent.VK_ENTER);
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setUsuarioEnviar(String usuarioEnviar) {
        this.usuarioEnviar = usuarioEnviar;
    }

    @Override
    public Image getIconImage() {
        Image icono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/miicono.jpg"));

        return icono;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        enviar = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        separador1 = new javax.swing.JSeparator();
        scroll1 = new javax.swing.JScrollPane();
        campoMensaje = new javax.swing.JTextField();
        separador2 = new javax.swing.JSeparator();
        titulo = new javax.swing.JLabel();
        menuSesion = new javax.swing.JMenuBar();
        archivo = new javax.swing.JMenu();
        salida = new javax.swing.JMenuItem();
        idiomas = new javax.swing.JMenu();
        español = new javax.swing.JMenuItem();
        japones = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(515, 437));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo.setBackground(new java.awt.Color(204, 204, 204));
        fondo.setPreferredSize(new java.awt.Dimension(510, 380));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enviar.setBackground(new java.awt.Color(255, 0, 51));
        enviar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        enviar.setForeground(new java.awt.Color(255, 255, 255));
        enviar.setText("ENVIAR MENSAJE");
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });
        fondo.add(enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 200, 60));

        volver.setBackground(new java.awt.Color(255, 0, 51));
        volver.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        volver.setForeground(new java.awt.Color(255, 255, 255));
        volver.setText("VOLVER");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        fondo.add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 140, 60));
        fondo.add(separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 510, 20));

        campoMensaje.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        campoMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoMensajeActionPerformed(evt);
            }
        });
        scroll1.setViewportView(campoMensaje);

        fondo.add(scroll1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 490, 200));
        fondo.add(separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 510, 20));

        titulo.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 0, 0));
        titulo.setText("MENSAJERIA EXPRESS:");
        fondo.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 380));

        archivo.setText("Archivo");

        salida.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        salida.setText("Salir");
        salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salidaActionPerformed(evt);
            }
        });
        archivo.add(salida);

        menuSesion.add(archivo);

        idiomas.setText("Idiomas");

        español.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_DOWN_MASK));
        español.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/espaicon.png"))); // NOI18N
        español.setText("Español");
        español.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                españolActionPerformed(evt);
            }
        });
        idiomas.add(español);

        japones.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.ALT_DOWN_MASK));
        japones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/japoicon.png"))); // NOI18N
        japones.setText("日本語");
        japones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                japonesActionPerformed(evt);
            }
        });
        idiomas.add(japones);

        menuSesion.add(idiomas);

        setJMenuBar(menuSesion);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void japonesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_japonesActionPerformed
        cambiarIdioma(false);
        super.setBandera(false);
    }//GEN-LAST:event_japonesActionPerformed

    private void españolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_españolActionPerformed
        cambiarIdioma(true);
        super.setBandera(true);
    }//GEN-LAST:event_españolActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        reproducirSonidoBoton();
        plata.setBandera(super.isBandera());
        plata.cambiarIdioma(super.isBandera());
        plata.setNombreUsuario(nombreUsuario);
        this.dispose();
        plata.setVisible(true);
    }//GEN-LAST:event_volverActionPerformed

    private void salidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salidaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salidaActionPerformed

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
        reproducirSonidoBoton();
        if (campoMensaje.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(null, "No has introducido ningún texto a su mensaje a enviar.", "Mensaje de advertencia", JOptionPane.WARNING_MESSAGE);
        } else
        {
            ConexionBaseDatos cn = new ConexionBaseDatos();
            // Obtener la fecha y hora actual
            Date date = new Date();

            // Crear un objeto Timestamp utilizando la fecha y hora actual
            Timestamp timestamp = new Timestamp(date.getTime());
            boolean mensajeAnteriorVacio = cn.devolverMensaje1(usuarioEnviar).equals("Sin contenido");
            boolean mensajeAnteriorVacio2 = cn.devolverMensaje2(usuarioEnviar).equals("Sin contenido");
            boolean mensajeAnteriorVacio3 = cn.devolverMensaje3(usuarioEnviar).equals("Sin contenido");
            cn.insetarMensajes(campoMensaje.getText(), nombreUsuario, usuarioEnviar, cn.devolverID_Usuario(usuarioEnviar),timestamp.toString());
            if (mensajeAnteriorVacio)
            {
                cn.modificarMensaje1(campoMensaje.getText(), nombreUsuario, cn.devolverSexo(nombreUsuario), usuarioEnviar);
            } else if (!mensajeAnteriorVacio && mensajeAnteriorVacio2)
            {
                cn.modificarMensaje2(cn.devolverMensaje1(usuarioEnviar), cn.devolverUser1(usuarioEnviar), cn.devolverSexo(cn.devolverUser1(usuarioEnviar)), usuarioEnviar);
                cn.modificarMensaje1(campoMensaje.getText(), nombreUsuario, cn.devolverSexo(nombreUsuario), usuarioEnviar);

            } else if (!mensajeAnteriorVacio && !mensajeAnteriorVacio2 && mensajeAnteriorVacio3)
            {
                cn.modificarMensaje3(cn.devolverMensaje2(usuarioEnviar), cn.devolverUser2(usuarioEnviar), cn.devolverSexo(cn.devolverUser2(usuarioEnviar)), usuarioEnviar);
                cn.modificarMensaje2(cn.devolverMensaje1(usuarioEnviar), cn.devolverUser1(usuarioEnviar), cn.devolverSexo(cn.devolverUser1(usuarioEnviar)), usuarioEnviar);
                cn.modificarMensaje1(campoMensaje.getText(), nombreUsuario, cn.devolverSexo(nombreUsuario), usuarioEnviar);
            } else if (!mensajeAnteriorVacio && !mensajeAnteriorVacio2 && !mensajeAnteriorVacio3)
            {
                cn.modificarMensaje3(cn.devolverMensaje2(usuarioEnviar), cn.devolverUser2(usuarioEnviar), cn.devolverSexo(cn.devolverUser2(usuarioEnviar)), usuarioEnviar);
                cn.modificarMensaje2(cn.devolverMensaje1(usuarioEnviar), cn.devolverUser1(usuarioEnviar), cn.devolverSexo(cn.devolverUser1(usuarioEnviar)), usuarioEnviar);
                cn.modificarMensaje1(campoMensaje.getText(), nombreUsuario, cn.devolverSexo(nombreUsuario), usuarioEnviar);
            }
            plata.setBandera(super.isBandera());
            plata.cambiarIdioma(super.isBandera());
            plata.setNombreUsuario(nombreUsuario);
            this.dispose();
            plata.setVisible(true);
        }
    }//GEN-LAST:event_enviarActionPerformed

    private void campoMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoMensajeActionPerformed
        enviar.doClick();
    }//GEN-LAST:event_campoMensajeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu archivo;
    private javax.swing.JTextField campoMensaje;
    private javax.swing.JButton enviar;
    private javax.swing.JMenuItem español;
    private javax.swing.JPanel fondo;
    private javax.swing.JMenu idiomas;
    private javax.swing.JMenuItem japones;
    private javax.swing.JMenuBar menuSesion;
    private javax.swing.JMenuItem salida;
    private javax.swing.JScrollPane scroll1;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    private javax.swing.JLabel titulo;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables

    @Override
    public void cambiarIdioma(boolean idioma) {

        if (idioma)
        {
            archivo.setText("Archivo");
            idiomas.setText("Idiomas");
            salida.setText("Desconectar");
            volver.setFont(new java.awt.Font("Roboto", 0, 18));
            volver.setText("VOLVER");
            enviar.setText("ENVIAR MENSAJE");
            enviar.setFont(new java.awt.Font("Roboto", 0, 18));
            titulo.setFont(new java.awt.Font("Roboto", 0, 24));
            titulo.setText("MENSAJERIA EXPRESS:");
        } else
        {
            archivo.setText("アーカイブ");
            idiomas.setText("語");
            salida.setText("ディスコネクト");
            volver.setFont(new java.awt.Font("Dialog", 0, 18));
            volver.setText("戻る");
            enviar.setText("メッセージの送信");
            enviar.setFont(new java.awt.Font("Dialog", 0, 18));
            titulo.setText("エクスプレスクーリエ:");
            titulo.setFont(new java.awt.Font("Dialog", 0, 24));
        }
    }

    @Override
    public AudioClip obtenerSonido() {
        AudioClip sonidoBoton;
        URL url = getClass().getResource("/sonidos/raton.wav");
        sonidoBoton = java.applet.Applet.newAudioClip(url);
        return sonidoBoton;
    }

    @Override
    public void reproducirSonidoBoton() {
        obtenerSonido().play();
    }
}
package UI;

import java.util.TreeMap;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Inicio extends javax.swing.JFrame {
    TreeMap<String, String> agendas = UI.CargarListaAgendas();
    
    public Inicio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        crearAgenda = new javax.swing.JButton();
        abrirAgenda = new javax.swing.JButton();
        seleccion = new JComboBox(UI.agendasDisponibles());
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        abrirAgendaMenu = new javax.swing.JMenuItem();
        Salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador de agendas");
        setLocationByPlatform(true);

        crearAgenda.setText("Crear nueva agenda");
        crearAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearAgendaActionPerformed(evt);
            }
        });

        abrirAgenda.setText("Abrir agenda");
        abrirAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirAgendaActionPerformed(evt);
            }
        });

        seleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        abrirAgendaMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        abrirAgendaMenu.setText("Abrir Agenda");
        abrirAgendaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirAgendaMenuActionPerformed(evt);
            }
        });
        jMenu1.add(abrirAgendaMenu);

        Salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jMenu1.add(Salir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(crearAgenda, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(seleccion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(abrirAgenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(crearAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(seleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(abrirAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abrirAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirAgendaActionPerformed
        String agendaSelect = (String) seleccion.getSelectedItem();
        
        if (agendaSelect != "Seleccione Agenda"){
            AplicacionAgenda agenda1 = new AplicacionAgenda(agendaSelect, agendas.get(agendaSelect));
            agenda1.setVisible(true);
            agenda1.setLocationRelativeTo(null);
            dispose();
        }
        else{
            JOptionPane.showMessageDialog(null, "Selecciona una agenda valida");
        }
    }//GEN-LAST:event_abrirAgendaActionPerformed

    private void seleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionActionPerformed
        
    }//GEN-LAST:event_seleccionActionPerformed

    private void crearAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearAgendaActionPerformed
        try{
            String nombreAgenda = JOptionPane.showInputDialog(null, "Inserta el nobre de la agenda:");
            if(nombreAgenda.equals("")){
                JOptionPane.showMessageDialog(null, "Inserta un nombre valido");
            }
            else{
                AplicacionAgenda agenda1 = new AplicacionAgenda(nombreAgenda, nombreAgenda+".obj");
                agenda1.setVisible(true);
                agenda1.setLocationRelativeTo(null);
                dispose();
            }
        }catch(NullPointerException e){
            return;
        }
    }//GEN-LAST:event_crearAgendaActionPerformed

    private void abrirAgendaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirAgendaMenuActionPerformed
        try{
            JFileChooser seleccionador = new JFileChooser();
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de agenda", "obj");
            seleccionador.setFileFilter(filtro);
            seleccionador.setDialogTitle("Abrir Agenda");
            seleccionador.showOpenDialog(seleccionador);
            String archivo = seleccionador.getSelectedFile().getAbsolutePath();
            String nomAgenda = seleccionador.getSelectedFile().getName();
            AplicacionAgenda agenda1 = new AplicacionAgenda(nomAgenda, archivo);
            agenda1.setVisible(true);
            agenda1.setLocationRelativeTo(null);
            dispose();
        }catch(Exception e){
        }
    }//GEN-LAST:event_abrirAgendaMenuActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Salir;
    private javax.swing.JButton abrirAgenda;
    private javax.swing.JMenuItem abrirAgendaMenu;
    private javax.swing.JButton crearAgenda;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JComboBox seleccion;
    // End of variables declaration//GEN-END:variables
}

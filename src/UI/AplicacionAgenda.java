package UI;

import Data.Agenda;
import Data.Contacto;
import java.util.ArrayList;
import java.util.TreeMap;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class AplicacionAgenda extends javax.swing.JFrame {
    Agenda agenda;
    String nombreAntiguo;
    
    public AplicacionAgenda(String nombre, String ubicacion) {
        agenda = UI.cargarAgenda(nombre, ubicacion);
        initComponents();
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Contactos = new JList<>(UI.nombreContactos(UI.mapaContactos(agenda.getContactos())))
        ;
        jLabel1 = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        numero = new javax.swing.JLabel();
        Correo = new javax.swing.JLabel();
        entradaNombre = new javax.swing.JTextField();
        entradaNumero = new javax.swing.JTextField();
        entradaCorreo = new javax.swing.JTextField();
        barraBusqueda = new javax.swing.JTextField();
        Buscar = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        ver = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        guardarAgenda = new javax.swing.JButton();
        resultado = new javax.swing.JLabel();
        resultado2 = new javax.swing.JLabel();
        Limpiar = new javax.swing.JButton();
        Editar = new javax.swing.JButton();
        Nuevo = new javax.swing.JButton();
        guardarCambios = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuGuardar = new javax.swing.JMenuItem();
        menuGuardarComo = new javax.swing.JMenuItem();
        menuAbrir = new javax.swing.JMenuItem();
        volverInicio = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        eliminarAgenda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(agenda.getNombre());
        setForeground(new java.awt.Color(68, 216, 247));
        setIconImages(null);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        Contactos.setMinimumSize(new java.awt.Dimension(246, 356));
        Contactos.setName(""); // NOI18N
        jScrollPane1.setViewportView(Contactos);

        jLabel1.setText("Lista de Contactos");

        nombre.setText("Nombre:");

        numero.setText("Numero Telefonico:");

        Correo.setText("Correo Electronico:");

        entradaNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        entradaNumero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        entradaCorreo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        barraBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barraBusquedaActionPerformed(evt);
            }
        });

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        ver.setText("Ver");
        ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verActionPerformed(evt);
            }
        });

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        guardarAgenda.setText("Guardar Agenda");
        guardarAgenda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        guardarAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarAgendaActionPerformed(evt);
            }
        });

        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        Editar.setText("Editar");
        Editar.setEnabled(false);
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        Nuevo.setText("Nuevo");
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });

        guardarCambios.setText("Guardar Cambios");
        guardarCambios.setEnabled(false);
        guardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarCambiosActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.setEnabled(false);
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        menuGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        menuGuardar.setText("Guardar");
        menuGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGuardarActionPerformed(evt);
            }
        });
        jMenu1.add(menuGuardar);

        menuGuardarComo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menuGuardarComo.setText("Guardar Como");
        menuGuardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGuardarComoActionPerformed(evt);
            }
        });
        jMenu1.add(menuGuardarComo);

        menuAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        menuAbrir.setText("Abrir");
        menuAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAbrirActionPerformed(evt);
            }
        });
        jMenu1.add(menuAbrir);

        volverInicio.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        volverInicio.setText("Volver a inicio");
        volverInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverInicioActionPerformed(evt);
            }
        });
        jMenu1.add(volverInicio);

        menuSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        menuSalir.setText("Salir");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        jMenu1.add(menuSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        eliminarAgenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, java.awt.event.InputEvent.CTRL_MASK));
        eliminarAgenda.setText("Eliminar Datos de Agenda");
        eliminarAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarAgendaActionPerformed(evt);
            }
        });
        jMenu2.add(eliminarAgenda);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(barraBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(resultado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(resultado2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(numero, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                            .addComponent(Correo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(ver, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(entradaNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                                        .addComponent(entradaNumero)
                                        .addComponent(entradaCorreo)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                            .addComponent(Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(guardarAgenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(guardar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(guardarCambios)
                        .addGap(48, 48, 48)
                        .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(barraBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(entradaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(entradaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(entradaCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ver, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(guardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(guardarAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(resultado2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        ArrayList<Contacto> contactos = agenda.getContactos();
        String nombreloc = entradaNombre.getText();
        int numeroloc;
        String correoloc = entradaCorreo.getText();
        try{
            numeroloc = Integer.parseInt(entradaNumero.getText());
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Ingresa un numero valido");
            return;
        }
        if (nombreloc.isEmpty() || correoloc.isEmpty()){
            JOptionPane.showMessageDialog(null, "Completa todos los espacios");
        }
        else{
            Contacto nuevo = new Contacto(nombreloc, numeroloc, correoloc);
            try{
                contactos.add(nuevo);
                agenda.setContactos(contactos);
            }catch(NullPointerException ex){
                contactos = new ArrayList<>();
                contactos.add(nuevo);
                agenda.setContactos(contactos);
            }
            finally{
                Contactos.setListData(UI.nombreContactos(UI.mapaContactos(agenda.getContactos())));
            }
            entradaNombre.setText("");
            entradaCorreo.setText("");
            entradaNumero.setText("");
        }
    }//GEN-LAST:event_guardarActionPerformed

    private void guardarAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarAgendaActionPerformed
        if ((UI.mapaContactos(agenda.getContactos())) == null){
            JOptionPane.showMessageDialog(null, "La agenda está vacía");
        }
        else{
            resultado.setText(UI.guardarAgenda(agenda));
            resultado2.setText(UI.guardarNombre(agenda.getNombre(), agenda.getUbicacion()));
        }
    }//GEN-LAST:event_guardarAgendaActionPerformed

    private void menuGuardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGuardarComoActionPerformed
        if ((UI.mapaContactos(agenda.getContactos())) == null){
            JOptionPane.showMessageDialog(null, "La agenda está vacía");
        }
        else{
            JFileChooser guardarComo = new JFileChooser();
            guardarComo.setApproveButtonText("Guardar");
            guardarComo.showSaveDialog(null);
            if (guardarComo.getSelectedFile() == null){
                guardarComo.cancelSelection();
            }
            else{
                agenda.setUbicacion(guardarComo.getSelectedFile().getAbsolutePath() + ".obj");
                agenda.setNombre(guardarComo.getName(guardarComo.getSelectedFile()));
                resultado.setText(UI.guardarAgenda(agenda));
                resultado2.setText(UI.guardarNombre(agenda.getNombre(), agenda.getUbicacion()));
            }
        }
    }//GEN-LAST:event_menuGuardarComoActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        String busqueda = barraBusqueda.getText();
        String[] nombres = UI.nombreContactos(UI.mapaContactos(agenda.getContactos()));
        ArrayList<String> coincidencias = new ArrayList<>();
        for (String nombre1 : nombres) {
            if (nombre1.contains(busqueda)) {
                coincidencias.add(nombre1);
            }
        }
        String[] resultados = new String[coincidencias.size()];
        resultados = coincidencias.toArray(resultados);
        Contactos.setListData(resultados);
    }//GEN-LAST:event_BuscarActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        barraBusqueda.setText("");
        Contactos.setListData(UI.nombreContactos(UI.mapaContactos(agenda.getContactos())));
    }//GEN-LAST:event_LimpiarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        try{
            TreeMap<String, Contacto> mapContactos = UI.mapaContactos(agenda.getContactos());
            String seleccion = Contactos.getSelectedValue();
            Contacto elemento = mapContactos.get(seleccion);
            ArrayList<Contacto> listaContactos = agenda.getContactos();
            listaContactos.remove(elemento);
            agenda.setContactos(listaContactos);
            if (listaContactos.isEmpty()){
                agenda = new Agenda(agenda.getUbicacion(), agenda.getNombre(), null);
            }
            Contactos.setListData(UI.nombreContactos(UI.mapaContactos(agenda.getContactos())));
            entradaNombre.setText("");
            entradaNumero.setText("");
            entradaCorreo.setText("");
            guardar.setEnabled(true);
            entradaCorreo.setEnabled(true);
            entradaNombre.setEnabled(true);
            entradaNumero.setEnabled(true);
            Editar.setEnabled(false);
        } catch (NullPointerException el) {
            JOptionPane.showMessageDialog(null, "Seleccione un contacto");
        }
        
    }//GEN-LAST:event_eliminarActionPerformed

    private void verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verActionPerformed
        try{
            TreeMap<String, Contacto> mapContactos = UI.mapaContactos(agenda.getContactos());
            String seleccion = Contactos.getSelectedValue();
            String nombreC = mapContactos.get(seleccion).getNombre();
            int numeroC = mapContactos.get(seleccion).getNumeroTel();
            String correoC = mapContactos.get(seleccion).getCorreo();
            entradaNombre.setText(nombreC);
            entradaNumero.setText(String.valueOf(numeroC));
            entradaCorreo.setText(correoC);
            guardar.setEnabled(false);
            entradaCorreo.setEnabled(false);
            entradaNombre.setEnabled(false);
            entradaNumero.setEnabled(false);
            Editar.setEnabled(true);
        } catch (NullPointerException vea){
            JOptionPane.showMessageDialog(null, "Seleccione un contacto");
        }
    }//GEN-LAST:event_verActionPerformed

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
        entradaNombre.setText("");
        entradaNumero.setText("");
        entradaCorreo.setText("");
        guardar.setEnabled(true);
        entradaCorreo.setEnabled(true);
        entradaNombre.setEnabled(true);
        entradaNumero.setEnabled(true);
        Editar.setEnabled(false);
    }//GEN-LAST:event_NuevoActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        entradaCorreo.setEnabled(true);
        entradaNombre.setEnabled(true);
        entradaNumero.setEnabled(true);
        cancelar.setEnabled(true);
        guardarCambios.setEnabled(true);
        nombreAntiguo = entradaNombre.getText();
    }//GEN-LAST:event_EditarActionPerformed

    private void guardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarCambiosActionPerformed
        TreeMap<String, Contacto> mapContactos = UI.mapaContactos(agenda.getContactos());
        String seleccion = nombreAntiguo;
        Contacto elemento = mapContactos.get(seleccion);
        ArrayList<Contacto> listaContactos = agenda.getContactos();
        listaContactos.remove(elemento);
        String nombreloc = entradaNombre.getText();
        int numeroloc;
        String correoloc = entradaCorreo.getText();
        try{
            numeroloc = Integer.parseInt(entradaNumero.getText());
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Ingresa un numero valido");
            return;
        }
        if (nombreloc.isEmpty() || correoloc.isEmpty()){
            JOptionPane.showMessageDialog(null, "Completa todos los espacios");
        }
        else{
            Contacto nuevo = new Contacto(nombreloc, numeroloc, correoloc);
            try{
                listaContactos.add(nuevo);
                agenda.setContactos(listaContactos);
            }catch(NullPointerException ex){
                listaContactos = new ArrayList<>();
                listaContactos.add(nuevo);
                agenda.setContactos(listaContactos);
            }
            finally{
                Contactos.setListData(UI.nombreContactos(UI.mapaContactos(agenda.getContactos())));
            }
            agenda.setContactos(listaContactos);
            Contactos.setListData(UI.nombreContactos(UI.mapaContactos(agenda.getContactos())));
            entradaNombre.setText("");
            entradaNumero.setText("");
            entradaCorreo.setText("");
            guardar.setEnabled(true);
            guardarCambios.setEnabled(false);
            cancelar.setEnabled(false);
            Editar.setEnabled(false);
        }
    }//GEN-LAST:event_guardarCambiosActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        entradaNombre.setText("");
        entradaNumero.setText("");
        entradaCorreo.setText("");
        guardar.setEnabled(true);
        guardarCambios.setEnabled(false);
        cancelar.setEnabled(false);
        Editar.setEnabled(false);
    }//GEN-LAST:event_cancelarActionPerformed

    private void volverInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverInicioActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea guardar los cambios efectuados?", "Confirmacion de guardado", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null);
        if(opcion == JOptionPane.YES_OPTION){
            if ((UI.mapaContactos(agenda.getContactos())) == null){
                JOptionPane.showMessageDialog(null, "La agenda está vacía");
            }
            else{
            resultado.setText(UI.guardarAgenda(agenda));
            resultado2.setText(UI.guardarNombre(agenda.getNombre(), agenda.getUbicacion()));
            Inicio ventana = new Inicio();
            ventana.setVisible(true);
            ventana.setLocationRelativeTo(null);
            dispose();
            }
        }
        else if(opcion == JOptionPane.NO_OPTION){
            Inicio ventana = new Inicio();
            ventana.setVisible(true);
            ventana.setLocationRelativeTo(null);
            dispose();
        }
    }//GEN-LAST:event_volverInicioActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea guardar los cambios efectuados?", "Confirmacion de guardado", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null);
        if(opcion == JOptionPane.YES_OPTION){
            if ((UI.mapaContactos(agenda.getContactos())) == null){
                JOptionPane.showMessageDialog(null, "La agenda está vacía");
            }
            else{
            resultado.setText(UI.guardarAgenda(agenda));
            resultado2.setText(UI.guardarNombre(agenda.getNombre(), agenda.getUbicacion()));
            System.exit(0);
            }
        }
        else if (opcion == JOptionPane.NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void eliminarAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarAgendaActionPerformed
        agenda = new Agenda(agenda.getUbicacion(), agenda.getNombre(), null);
        Contactos.setListData(UI.nombreContactos(UI.mapaContactos(agenda.getContactos())));
    }//GEN-LAST:event_eliminarAgendaActionPerformed

    private void menuGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGuardarActionPerformed
        if ((UI.mapaContactos(agenda.getContactos())) == null){
            JOptionPane.showMessageDialog(null, "La agenda está vacía");
        }
        else{
            resultado.setText(UI.guardarAgenda(agenda));
            resultado2.setText(UI.guardarNombre(agenda.getNombre(), agenda.getUbicacion()));
        }
    }//GEN-LAST:event_menuGuardarActionPerformed

    private void menuAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAbrirActionPerformed
        JFileChooser seleccionador = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de agenda", "obj");
        seleccionador.setFileFilter(filtro);
        seleccionador.setDialogTitle("Abrir Agenda");
        seleccionador.showOpenDialog(seleccionador);
        String archivo = seleccionador.getSelectedFile().getAbsolutePath();
        String nomAgenda = seleccionador.getSelectedFile().getName();
        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea guardar los cambios efectuados?", "Confirmacion de guardado", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null);
        if(opcion == JOptionPane.YES_OPTION){
            if ((UI.mapaContactos(agenda.getContactos())) == null){
                JOptionPane.showMessageDialog(null, "La agenda está vacía");
            }
            else{
            resultado.setText(UI.guardarAgenda(agenda));
            resultado2.setText(UI.guardarNombre(agenda.getNombre(), agenda.getUbicacion()));
            AplicacionAgenda agenda1 = new AplicacionAgenda(nomAgenda, archivo);
            agenda1.setVisible(true);
            agenda1.setLocationRelativeTo(null);
            dispose();
            }
        }
        else if(opcion == JOptionPane.NO_OPTION){
            AplicacionAgenda agenda1 = new AplicacionAgenda(nomAgenda, archivo);
            agenda1.setVisible(true);
            agenda1.setLocationRelativeTo(null);
            dispose();
        }
    }//GEN-LAST:event_menuAbrirActionPerformed

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuSalirActionPerformed

    private void barraBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barraBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_barraBusquedaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JList<String> Contactos;
    private javax.swing.JLabel Correo;
    private javax.swing.JButton Editar;
    private javax.swing.JButton Limpiar;
    private javax.swing.JButton Nuevo;
    private javax.swing.JTextField barraBusqueda;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton eliminar;
    private javax.swing.JMenuItem eliminarAgenda;
    private javax.swing.JTextField entradaCorreo;
    private javax.swing.JTextField entradaNombre;
    private javax.swing.JTextField entradaNumero;
    private javax.swing.JButton guardar;
    private javax.swing.JButton guardarAgenda;
    private javax.swing.JButton guardarCambios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menuAbrir;
    private javax.swing.JMenuItem menuGuardar;
    private javax.swing.JMenuItem menuGuardarComo;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel numero;
    private javax.swing.JLabel resultado;
    private javax.swing.JLabel resultado2;
    private javax.swing.JButton ver;
    private javax.swing.JMenuItem volverInicio;
    // End of variables declaration//GEN-END:variables
}

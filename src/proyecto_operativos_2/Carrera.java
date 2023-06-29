/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_operativos_2;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author rober
 */
public class Carrera extends javax.swing.JFrame {

    /**
     * Creates new form Carrera
     */
    
    DefaultListModel colaNivel1C1 = new DefaultListModel();
    DefaultListModel colaNivel2C1 = new DefaultListModel();
    DefaultListModel colaNivel3C1 = new DefaultListModel();
    DefaultListModel colaRefuerzo1 = new DefaultListModel();    
    DefaultListModel colaNivel1C2 = new DefaultListModel();
    DefaultListModel colaNivel2C2 = new DefaultListModel();
    DefaultListModel colaNivel3C2 = new DefaultListModel();
    DefaultListModel colaRefuerzo2 = new DefaultListModel();  
    public Carrera() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

public DefaultListModel escribirLista(Colas cola, Nodos nodo, DefaultListModel cola2) {
    for (int i = 0; i < cola.getSize(); i++) {
        Vehiculos vehi = (Vehiculos) nodo.getData();
        if (vehi.marca == 1){
            cola2.addElement("ID: " + "B" + vehi.id + " Puntos: " + vehi.puntos);
            nodo = nodo.getNext();
        } else {
            cola2.addElement("ID: " + "L" +vehi.id + " Puntos: " + vehi.puntos);
            nodo = nodo.getNext();
        }
        
    }
    return cola2;
} 

public void actualizarColaC1(Colas cola1, Colas cola2, Colas cola3, Colas refuerzo) {           

    resultado.setText(IA.resultado);
    winsLambo.setText(Integer.toString(IA.wL));
    winsBuga.setText(Integer.toString(IA.wB));
    lambo.setText(IA.carro2);
    buga.setText(IA.carro1);
    
    Nodos primer1 = cola1.getFirst();
    Nodos primer2 = cola2.getFirst();
    Nodos primer3 = cola3.getFirst();
    Nodos primerR = refuerzo.getFirst();

    
    colaNivel1C1.removeAllElements();
    colaNivel1C1 = escribirLista(cola1, primer1, colaNivel1C1);
    bugaC1.setModel(colaNivel1C1);
    
    colaNivel2C1.removeAllElements();
    colaNivel2C1 = escribirLista(cola2, primer2, colaNivel2C1);
    bugaC2.setModel(colaNivel2C1);
    
    colaNivel3C1.removeAllElements();
    colaNivel3C1 = escribirLista(cola3, primer3, colaNivel3C1);
    bugaC3.setModel(colaNivel3C1);
    
    colaRefuerzo1.removeAllElements();
    colaRefuerzo1 = escribirLista(refuerzo, primerR, colaRefuerzo1);
    bugaR.setModel(colaRefuerzo1);
    
}   

public void actualizarColaC2(Colas cola1, Colas cola2, Colas cola3, Colas refuerzo) {           

    Nodos primer1 = cola1.getFirst();
    Nodos primer2 = cola2.getFirst();
    Nodos primer3 = cola3.getFirst();
    Nodos primerR = refuerzo.getFirst();

    
    colaNivel1C2.removeAllElements();
    colaNivel1C2 = escribirLista(cola1, primer1, colaNivel1C2);
    lamboC1.setModel(colaNivel1C2);
    
    colaNivel2C2.removeAllElements();
    colaNivel2C2 = escribirLista(cola2, primer2, colaNivel2C2);
    lamboC2.setModel(colaNivel2C2);
    
    colaNivel3C2.removeAllElements();
    colaNivel3C2 = escribirLista(cola3, primer3, colaNivel3C2);
    lamboC3.setModel(colaNivel3C2);
    
    colaRefuerzo2.removeAllElements();
    colaRefuerzo2 = escribirLista(refuerzo, primerR, colaRefuerzo2);
    lamboR.setModel(colaRefuerzo2);
    
} 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nameL = new javax.swing.JLabel();
        nameB = new javax.swing.JLabel();
        c2 = new javax.swing.JLabel();
        c3 = new javax.swing.JLabel();
        c4 = new javax.swing.JLabel();
        c5 = new javax.swing.JLabel();
        c6 = new javax.swing.JLabel();
        c7 = new javax.swing.JLabel();
        c8 = new javax.swing.JLabel();
        c9 = new javax.swing.JLabel();
        resultado = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        vLambo = new javax.swing.JLabel();
        winsLambo = new javax.swing.JLabel();
        vBuga = new javax.swing.JLabel();
        winsBuga = new javax.swing.JLabel();
        labelTiempo = new javax.swing.JLabel();
        tiempoSimu = new javax.swing.JTextField();
        labelTiempo1 = new javax.swing.JLabel();
        enviar = new javax.swing.JButton();
        buga = new javax.swing.JLabel();
        lambo = new javax.swing.JLabel();
        vs = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        lamboC1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lamboC2 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lamboC3 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        lamboR = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        bugaC1 = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        bugaC2 = new javax.swing.JList<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        bugaC3 = new javax.swing.JList<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        bugaR = new javax.swing.JList<>();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameL.setBackground(new java.awt.Color(102, 102, 102));
        nameL.setFont(new java.awt.Font("8BIT WONDER", 1, 20)); // NOI18N
        nameL.setForeground(new java.awt.Color(255, 255, 255));
        nameL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameL.setText("Lamborghini");
        nameL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.white, null, null));
        nameL.setOpaque(true);
        jPanel1.add(nameL, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 250, 40));

        nameB.setBackground(new java.awt.Color(102, 102, 102));
        nameB.setFont(new java.awt.Font("8BIT WONDER", 1, 20)); // NOI18N
        nameB.setForeground(new java.awt.Color(255, 255, 255));
        nameB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameB.setText("Bugatti");
        nameB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.white, null, null));
        nameB.setOpaque(true);
        jPanel1.add(nameB, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 10, 250, 40));

        c2.setBackground(new java.awt.Color(102, 102, 102));
        c2.setFont(new java.awt.Font("8BIT WONDER", 1, 20)); // NOI18N
        c2.setForeground(new java.awt.Color(255, 255, 255));
        c2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c2.setText("r");
        c2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.white, null, null));
        c2.setOpaque(true);
        jPanel1.add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 70, 40));

        c3.setBackground(new java.awt.Color(102, 102, 102));
        c3.setFont(new java.awt.Font("8BIT WONDER", 1, 20)); // NOI18N
        c3.setForeground(new java.awt.Color(255, 255, 255));
        c3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c3.setText("C1");
        c3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.white, null, null));
        c3.setOpaque(true);
        jPanel1.add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 70, 40));

        c4.setBackground(new java.awt.Color(102, 102, 102));
        c4.setFont(new java.awt.Font("8BIT WONDER", 1, 20)); // NOI18N
        c4.setForeground(new java.awt.Color(255, 255, 255));
        c4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c4.setText("C2");
        c4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.white, null, null));
        c4.setOpaque(true);
        jPanel1.add(c4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 70, 40));

        c5.setBackground(new java.awt.Color(102, 102, 102));
        c5.setFont(new java.awt.Font("8BIT WONDER", 1, 20)); // NOI18N
        c5.setForeground(new java.awt.Color(255, 255, 255));
        c5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c5.setText("C3");
        c5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.white, null, null));
        c5.setOpaque(true);
        jPanel1.add(c5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 70, 40));

        c6.setBackground(new java.awt.Color(102, 102, 102));
        c6.setFont(new java.awt.Font("8BIT WONDER", 1, 20)); // NOI18N
        c6.setForeground(new java.awt.Color(255, 255, 255));
        c6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c6.setText("C1");
        c6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.white, null, null));
        c6.setOpaque(true);
        jPanel1.add(c6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 100, 70, 40));

        c7.setBackground(new java.awt.Color(102, 102, 102));
        c7.setFont(new java.awt.Font("8BIT WONDER", 1, 20)); // NOI18N
        c7.setForeground(new java.awt.Color(255, 255, 255));
        c7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c7.setText("C2");
        c7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.white, null, null));
        c7.setOpaque(true);
        jPanel1.add(c7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 250, 70, 40));

        c8.setBackground(new java.awt.Color(102, 102, 102));
        c8.setFont(new java.awt.Font("8BIT WONDER", 1, 20)); // NOI18N
        c8.setForeground(new java.awt.Color(255, 255, 255));
        c8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c8.setText("C3");
        c8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.white, null, null));
        c8.setOpaque(true);
        jPanel1.add(c8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 400, 70, 40));

        c9.setBackground(new java.awt.Color(102, 102, 102));
        c9.setFont(new java.awt.Font("8BIT WONDER", 1, 20)); // NOI18N
        c9.setForeground(new java.awt.Color(255, 255, 255));
        c9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c9.setText("r");
        c9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.white, null, null));
        c9.setOpaque(true);
        jPanel1.add(c9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 550, 70, 40));

        resultado.setBackground(new java.awt.Color(102, 102, 102));
        resultado.setFont(new java.awt.Font("8BIT WONDER", 1, 20)); // NOI18N
        resultado.setForeground(new java.awt.Color(255, 255, 255));
        resultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.white, null, null));
        resultado.setOpaque(true);
        jPanel1.add(resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 480, 40));

        jLabel11.setBackground(new java.awt.Color(102, 102, 102));
        jLabel11.setFont(new java.awt.Font("8BIT WONDER", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Resultado");
        jLabel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.white, null, null));
        jLabel11.setOpaque(true);
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 200, 40));

        vLambo.setBackground(new java.awt.Color(102, 102, 102));
        vLambo.setFont(new java.awt.Font("8BIT WONDER", 1, 20)); // NOI18N
        vLambo.setForeground(new java.awt.Color(255, 255, 255));
        vLambo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vLambo.setText("VIctorias");
        vLambo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.white, null, null));
        vLambo.setOpaque(true);
        jPanel1.add(vLambo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 210, 40));

        winsLambo.setBackground(new java.awt.Color(102, 102, 102));
        winsLambo.setFont(new java.awt.Font("8BIT WONDER", 1, 20)); // NOI18N
        winsLambo.setForeground(new java.awt.Color(255, 255, 255));
        winsLambo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        winsLambo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.white, null, null));
        winsLambo.setOpaque(true);
        jPanel1.add(winsLambo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, 70, 40));

        vBuga.setBackground(new java.awt.Color(102, 102, 102));
        vBuga.setFont(new java.awt.Font("8BIT WONDER", 1, 20)); // NOI18N
        vBuga.setForeground(new java.awt.Color(255, 255, 255));
        vBuga.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vBuga.setText("VIctorias");
        vBuga.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.white, null, null));
        vBuga.setOpaque(true);
        jPanel1.add(vBuga, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 350, 210, 40));

        winsBuga.setBackground(new java.awt.Color(102, 102, 102));
        winsBuga.setFont(new java.awt.Font("8BIT WONDER", 1, 20)); // NOI18N
        winsBuga.setForeground(new java.awt.Color(255, 255, 255));
        winsBuga.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        winsBuga.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.white, null, null));
        winsBuga.setOpaque(true);
        jPanel1.add(winsBuga, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 410, 70, 40));

        labelTiempo.setBackground(new java.awt.Color(102, 102, 102));
        labelTiempo.setFont(new java.awt.Font("8BIT WONDER", 1, 20)); // NOI18N
        labelTiempo.setForeground(new java.awt.Color(255, 255, 255));
        labelTiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTiempo.setText("Tiempo de simulacion");
        labelTiempo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.white, null, null));
        labelTiempo.setOpaque(true);
        jPanel1.add(labelTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 520, 410, 40));

        tiempoSimu.setFont(new java.awt.Font("8BIT WONDER", 0, 18)); // NOI18N
        tiempoSimu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tiempoSimu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiempoSimuActionPerformed(evt);
            }
        });
        jPanel1.add(tiempoSimu, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 580, 70, 30));

        labelTiempo1.setBackground(new java.awt.Color(102, 102, 102));
        labelTiempo1.setFont(new java.awt.Font("8BIT WONDER", 1, 20)); // NOI18N
        labelTiempo1.setForeground(new java.awt.Color(255, 255, 255));
        labelTiempo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTiempo1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.white, null, null));
        labelTiempo1.setOpaque(true);
        jPanel1.add(labelTiempo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 570, 90, 50));

        enviar.setBackground(new java.awt.Color(102, 102, 102));
        enviar.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        enviar.setForeground(new java.awt.Color(255, 255, 255));
        enviar.setText("↑");
        enviar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.white, null, null));
        enviar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });
        jPanel1.add(enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 570, 50, 50));

        buga.setBackground(new java.awt.Color(102, 102, 102));
        buga.setFont(new java.awt.Font("8BIT WONDER", 1, 20)); // NOI18N
        buga.setForeground(new java.awt.Color(255, 255, 255));
        buga.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buga.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.white, null, null));
        buga.setOpaque(true);
        jPanel1.add(buga, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 100, 310, 40));

        lambo.setBackground(new java.awt.Color(102, 102, 102));
        lambo.setFont(new java.awt.Font("8BIT WONDER", 1, 20)); // NOI18N
        lambo.setForeground(new java.awt.Color(255, 255, 255));
        lambo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lambo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.white, null, null));
        lambo.setOpaque(true);
        jPanel1.add(lambo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 310, 40));

        vs.setBackground(new java.awt.Color(102, 102, 102));
        vs.setFont(new java.awt.Font("8BIT WONDER", 1, 20)); // NOI18N
        vs.setForeground(new java.awt.Color(255, 255, 255));
        vs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vs.setText("vs");
        vs.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.white, null, null));
        vs.setOpaque(true);
        jPanel1.add(vs, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 90, 40));

        jScrollPane.setViewportView(lamboC1);

        jPanel1.add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 130, 130));

        jScrollPane2.setViewportView(lamboC2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 130, 130));

        jScrollPane3.setViewportView(lamboC3);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 130, 130));

        jScrollPane4.setViewportView(lamboR);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, 130, 130));

        jScrollPane5.setViewportView(bugaC1);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 70, 130, 130));

        jScrollPane6.setViewportView(bugaC2);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 220, 130, 130));

        jScrollPane7.setViewportView(bugaC3);

        jPanel1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 370, 130, 130));

        jScrollPane8.setViewportView(bugaR);

        jPanel1.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 520, 130, 130));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_operativos_2/4f92741f75da74ce45f5bdd86933e9c8 (1).png"))); // NOI18N
        jPanel1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tiempoSimuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiempoSimuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tiempoSimuActionPerformed

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed

        if(tiempoSimu.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Asegurese que el campo no este vacio");
        }
        else{
            String tiempoSimuInput = tiempoSimu.getText();
            int tiempoSimuInputInt;
            tiempoSimuInputInt = Integer.parseInt(tiempoSimuInput);
            main.tiempo = tiempoSimuInputInt;
            lectorTXT.escribir();
        }

    }//GEN-LAST:event_enviarActionPerformed

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
            java.util.logging.Logger.getLogger(Carrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Carrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Carrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carrera().setVisible(true);                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel buga;
    private javax.swing.JList<String> bugaC1;
    private javax.swing.JList<String> bugaC2;
    private javax.swing.JList<String> bugaC3;
    private javax.swing.JList<String> bugaR;
    private javax.swing.JLabel c2;
    private javax.swing.JLabel c3;
    private javax.swing.JLabel c4;
    private javax.swing.JLabel c5;
    private javax.swing.JLabel c6;
    private javax.swing.JLabel c7;
    private javax.swing.JLabel c8;
    private javax.swing.JLabel c9;
    private javax.swing.JButton enviar;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JLabel labelTiempo;
    private javax.swing.JLabel labelTiempo1;
    private javax.swing.JLabel lambo;
    private javax.swing.JList<String> lamboC1;
    private javax.swing.JList<String> lamboC2;
    private javax.swing.JList<String> lamboC3;
    private javax.swing.JList<String> lamboR;
    private javax.swing.JLabel nameB;
    private javax.swing.JLabel nameL;
    private javax.swing.JLabel resultado;
    private javax.swing.JTextField tiempoSimu;
    private javax.swing.JLabel vBuga;
    private javax.swing.JLabel vLambo;
    private javax.swing.JLabel vs;
    private javax.swing.JLabel winsBuga;
    private javax.swing.JLabel winsLambo;
    // End of variables declaration//GEN-END:variables
}

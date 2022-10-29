/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import java.awt.Color;
import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author anastasiakim
 */
public class form3 extends javax.swing.JFrame {
    
    Random rnd = new Random();
    String[][] cartas = new String[4][13];
    int[][] repite = new int[4][13];
    int cartaActual = 0;
    String turno;
    int puntajeJugador = 0, puntajeDealer = 0;
    int respuesta;

    /**
     * Creates new form form3
     */
    public form3() {
        initComponents();
        
        turno = "jugador";
        
        for (int i = 0; i < 13; i++) {
            cartas[0][i] = "/imagenes/corazon/" + (i + 1) + "-c.png";
            cartas[1][i] = "/imagenes/diamante/" + (i + 1) + "-d.png";
            cartas[2][i] = "/imagenes/trebol/" + (i + 1) + "-t.png";
            cartas[3][i] = "/imagenes/pica/" + (i + 1) + "-p.png";
        }
        
        for (int i = 0; i < 13; i++) {
            repite[0][i] = 0;
            repite[1][i] = 0;
            repite[2][i] = 0;
            repite[3][i] = 0;
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Black Jack");
        setBackground(new java.awt.Color(51, 153, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/espalda.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/espalda.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/espalda.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/espalda.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/espalda.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/espalda.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/espalda.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/espalda.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/espalda.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/espalda.png"))); // NOI18N

        jLabel11.setText("Puntos:");

        jLabel12.setText("Puntos:");

        jButton1.setText("Pedir carta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Plantarse");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(107, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(331, 331, 331)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel12))
                    .addComponent(jLabel10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(88, 88, 88))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int palo = rnd.nextInt(4);
        int numeroCarta = rnd.nextInt(13);
        
        while (repite[palo][numeroCarta] != 0) {
            palo = rnd.nextInt(4);
            numeroCarta = rnd.nextInt(13);
        }
        repite[palo][numeroCarta] = 1;
        
        if (turno.equalsIgnoreCase("jugador")) {
            switch (cartaActual) {
                case 0:
                    jLabel1.setIcon(new ImageIcon(getClass().getResource(cartas[palo][numeroCarta])));
                    if (numeroCarta == 10 || numeroCarta == 11 || numeroCarta == 12) {
                        puntajeJugador += 10;
                        
                    } else if (numeroCarta == 0) {
                        int as = Integer.parseInt(JOptionPane.showInputDialog("As! Según su conveniencia, ¿vale 1 u 11?"));
                        
                        while (as != 1 && as != 11) {
                            as = Integer.parseInt(JOptionPane.showInputDialog("Error, ingrese su valor 1 u 11"));
                        }
                        puntajeJugador += as;
                        
                    } else {
                        puntajeJugador += (numeroCarta + 1);
                    }
                    break;
                case 1:
                    jLabel2.setIcon(new ImageIcon(getClass().getResource(cartas[palo][numeroCarta])));
                    if (numeroCarta == 10 || numeroCarta == 11 || numeroCarta == 12) {
                        puntajeJugador += 10;
                        
                    } else if (numeroCarta == 0) {
                        int as = Integer.parseInt(JOptionPane.showInputDialog("As! Según su conveniencia, ¿vale 1 u 11?"));
                        
                        while (as != 1 && as != 11) {
                            as = Integer.parseInt(JOptionPane.showInputDialog("Error, ingrese su valor 1 u 11"));
                        }
                        puntajeJugador += as;
                        
                    } else {
                        puntajeJugador += (numeroCarta + 1);
                    }
                    break;
                case 2:
                    jLabel3.setIcon(new ImageIcon(getClass().getResource(cartas[palo][numeroCarta])));
                    if (numeroCarta == 10 || numeroCarta == 11 || numeroCarta == 12) {
                        puntajeJugador += 10;
                        
                    } else if (numeroCarta == 0) {
                        int as = Integer.parseInt(JOptionPane.showInputDialog("As! Según su conveniencia, ¿vale 1 u 11?"));
                        
                        while (as != 1 && as != 11) {
                            as = Integer.parseInt(JOptionPane.showInputDialog("Error, ingrese su valor 1 u 11"));
                        }
                        puntajeJugador += as;
                        
                    } else {
                        puntajeJugador += (numeroCarta + 1);
                    }
                    break;
                case 3:
                    jLabel4.setIcon(new ImageIcon(getClass().getResource(cartas[palo][numeroCarta])));
                    if (numeroCarta == 10 || numeroCarta == 11 || numeroCarta == 12) {
                        puntajeJugador += 10;
                        
                    } else if (numeroCarta == 0) {
                        int as = Integer.parseInt(JOptionPane.showInputDialog("As! Según su conveniencia, ¿vale 1 u 11?"));
                        
                        while (as != 1 && as != 11) {
                            as = Integer.parseInt(JOptionPane.showInputDialog("Error, ingrese su valor 1 u 11"));
                        }
                        puntajeJugador += as;
                        
                    } else {
                        puntajeJugador += (numeroCarta + 1);
                    }
                    break;
                case 4:
                    jLabel5.setIcon(new ImageIcon(getClass().getResource(cartas[palo][numeroCarta])));
                    if (numeroCarta == 10 || numeroCarta == 11 || numeroCarta == 12) {
                        puntajeJugador += 10;
                        
                    } else if (numeroCarta == 0) {
                        int as = Integer.parseInt(JOptionPane.showInputDialog("As! Según su conveniencia, ¿vale 1 u 11?"));
                        
                        while (as != 1 && as != 11) {
                            as = Integer.parseInt(JOptionPane.showInputDialog("Error, ingrese su valor 1 u 11"));
                        }
                        puntajeJugador += as;
                        
                    } else {
                        puntajeJugador += (numeroCarta + 1);
                    }
                    break;
                
            }
            
            cartaActual++;
            
            if (puntajeJugador > 21) {
                respuesta = JOptionPane.showConfirmDialog(null, "Usted perdió. ¿Quiere volver a jugar?", null, JOptionPane.YES_NO_OPTION);
                if (respuesta == 0) {
                    
                    cartaActual = 0;
                    
                    turno = "jugador";
                    
                    puntajeJugador = 0;
                    
                    jLabel1.setIcon(new ImageIcon(getClass().getResource("/imagenes/espalda.png")));
                    jLabel2.setIcon(new ImageIcon(getClass().getResource("/imagenes/espalda.png")));
                    jLabel3.setIcon(new ImageIcon(getClass().getResource("/imagenes/espalda.png")));
                    jLabel4.setIcon(new ImageIcon(getClass().getResource("/imagenes/espalda.png")));
                    jLabel5.setIcon(new ImageIcon(getClass().getResource("/imagenes/espalda.png")));
                    jLabel6.setIcon(new ImageIcon(getClass().getResource("/imagenes/espalda.png")));
                    jLabel7.setIcon(new ImageIcon(getClass().getResource("/imagenes/espalda.png")));
                    jLabel8.setIcon(new ImageIcon(getClass().getResource("/imagenes/espalda.png")));
                    jLabel9.setIcon(new ImageIcon(getClass().getResource("/imagenes/espalda.png")));
                    jLabel10.setIcon(new ImageIcon(getClass().getResource("/imagenes/espalda.png")));
                    
                    this.jButton2.setVisible(true);
                    
                } else {
                    System.exit(0);
                }
                
            }
        } else {
            switch (cartaActual) {
                case 5:
                    jLabel6.setIcon(new ImageIcon(getClass().getResource(cartas[palo][numeroCarta])));
                    if (numeroCarta == 10 || numeroCarta == 11 || numeroCarta == 12) {
                        puntajeDealer += 10;
                        
                    } else if (numeroCarta == 0) {
                        int as = Integer.parseInt(JOptionPane.showInputDialog("As! Según su conveniencia, ¿vale 1 u 11?"));
                        
                        while (as != 1 && as != 11) {
                            as = Integer.parseInt(JOptionPane.showInputDialog("Error, ingrese su valor 1 u 11"));
                        }
                        puntajeDealer += as;
                        
                    } else {
                        puntajeDealer += (numeroCarta + 1);
                    }
                    break;
                case 6:
                    jLabel7.setIcon(new ImageIcon(getClass().getResource(cartas[palo][numeroCarta])));
                    if (numeroCarta == 10 || numeroCarta == 11 || numeroCarta == 12) {
                        puntajeDealer += 10;
                        
                    } else if (numeroCarta == 0) {
                        int as = Integer.parseInt(JOptionPane.showInputDialog("As! Según su conveniencia, ¿vale 1 u 11?"));
                        
                        while (as != 1 && as != 11) {
                            as = Integer.parseInt(JOptionPane.showInputDialog("Error, ingrese su valor 1 u 11"));
                        }
                        puntajeDealer += as;
                        
                    } else {
                        puntajeDealer += (numeroCarta + 1);
                    }
                    break;
                case 7:
                    jLabel8.setIcon(new ImageIcon(getClass().getResource(cartas[palo][numeroCarta])));
                    if (numeroCarta == 10 || numeroCarta == 11 || numeroCarta == 12) {
                        puntajeDealer += 10;
                        
                    } else if (numeroCarta == 0) {
                        int as = Integer.parseInt(JOptionPane.showInputDialog("As! Según su conveniencia, ¿vale 1 u 11?"));
                        
                        while (as != 1 && as != 11) {
                            as = Integer.parseInt(JOptionPane.showInputDialog("Error, ingrese su valor 1 u 11"));
                        }
                        puntajeDealer += as;
                        
                    } else {
                        puntajeDealer += (numeroCarta + 1);
                    }
                    break;
                case 8:
                    jLabel9.setIcon(new ImageIcon(getClass().getResource(cartas[palo][numeroCarta])));
                    if (numeroCarta == 10 || numeroCarta == 11 || numeroCarta == 12) {
                        puntajeDealer += 10;
                        
                    } else if (numeroCarta == 0) {
                        int as = Integer.parseInt(JOptionPane.showInputDialog("As! Según su conveniencia, ¿vale 1 u 11?"));
                        
                        while (as != 1 && as != 11) {
                            as = Integer.parseInt(JOptionPane.showInputDialog("Error, ingrese su valor 1 u 11"));
                        }
                        puntajeDealer += as;
                        
                    } else {
                        puntajeDealer += (numeroCarta + 1);
                    }
                    break;
                case 9:
                    jLabel10.setIcon(new ImageIcon(getClass().getResource(cartas[palo][numeroCarta])));
                    if (numeroCarta == 10 || numeroCarta == 11 || numeroCarta == 12) {
                        puntajeDealer += 10;
                        
                    } else if (numeroCarta == 0) {
                        int as = Integer.parseInt(JOptionPane.showInputDialog("As! Según su conveniencia, ¿vale 1 u 11?"));
                        
                        while (as != 1 && as != 11) {
                            as = Integer.parseInt(JOptionPane.showInputDialog("Error, ingrese su valor 1 u 11"));
                        }
                        puntajeDealer += as;
                        
                    } else {
                        puntajeDealer += (numeroCarta + 1);
                    }
                    break;
            }
            
            cartaActual++;
            
            if (puntajeDealer >= puntajeJugador && puntajeDealer <= 21) {
                JOptionPane.showMessageDialog(null, "Gana el dealer, usted perdió");
                
                respuesta = JOptionPane.showConfirmDialog(null, "Juego finalizado. ¿Quiere volver a jugar?", null, JOptionPane.YES_NO_OPTION);
                if (respuesta == 0) {
                    
                    cartaActual = 0;
                    
                    turno = "jugador";
                    
                    puntajeJugador = 0;
                    puntajeDealer = 0;
                    
                    jLabel1.setIcon(new ImageIcon(getClass().getResource("/imagenes/espalda.png")));
                    jLabel2.setIcon(new ImageIcon(getClass().getResource("/imagenes/espalda.png")));
                    jLabel3.setIcon(new ImageIcon(getClass().getResource("/imagenes/espalda.png")));
                    jLabel4.setIcon(new ImageIcon(getClass().getResource("/imagenes/espalda.png")));
                    jLabel5.setIcon(new ImageIcon(getClass().getResource("/imagenes/espalda.png")));
                    jLabel6.setIcon(new ImageIcon(getClass().getResource("/imagenes/espalda.png")));
                    jLabel7.setIcon(new ImageIcon(getClass().getResource("/imagenes/espalda.png")));
                    jLabel8.setIcon(new ImageIcon(getClass().getResource("/imagenes/espalda.png")));
                    jLabel9.setIcon(new ImageIcon(getClass().getResource("/imagenes/espalda.png")));
                    jLabel10.setIcon(new ImageIcon(getClass().getResource("/imagenes/espalda.png")));
                    
                    this.jButton2.setVisible(true);
                    
                } else {
                    System.exit(0);
                }
            } else if (puntajeJugador <= 21 && puntajeDealer > 21) {
                JOptionPane.showMessageDialog(null, "Usted ganó");
                respuesta = JOptionPane.showConfirmDialog(null, "Juego finalizado. ¿Quiere volver a jugar?", null, JOptionPane.YES_NO_OPTION);
                if (respuesta == 0) {
                    
                    cartaActual = 0;
                    
                    turno = "jugador";
                    
                    puntajeJugador = 0;
                    puntajeDealer = 0;
                    
                    jLabel1.setIcon(new ImageIcon(getClass().getResource("/imagenes/espalda.png")));
                    jLabel2.setIcon(new ImageIcon(getClass().getResource("/imagenes/espalda.png")));
                    jLabel3.setIcon(new ImageIcon(getClass().getResource("/imagenes/espalda.png")));
                    jLabel4.setIcon(new ImageIcon(getClass().getResource("/imagenes/espalda.png")));
                    jLabel5.setIcon(new ImageIcon(getClass().getResource("/imagenes/espalda.png")));
                    jLabel6.setIcon(new ImageIcon(getClass().getResource("/imagenes/espalda.png")));
                    jLabel7.setIcon(new ImageIcon(getClass().getResource("/imagenes/espalda.png")));
                    jLabel8.setIcon(new ImageIcon(getClass().getResource("/imagenes/espalda.png")));
                    jLabel9.setIcon(new ImageIcon(getClass().getResource("/imagenes/espalda.png")));
                    jLabel10.setIcon(new ImageIcon(getClass().getResource("/imagenes/espalda.png")));
                    
                    this.jButton2.setVisible(true);
                    
                } else {
                    System.exit(0);
                }
                
            }
            
        }
        
        jLabel11.setText("Puntos: " + puntajeJugador);
        jLabel12.setText("Puntos: " + puntajeDealer);
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        turno = "dealer";
        
        cartaActual = 5;
        
        this.jButton2.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.getContentPane().setBackground(Color.decode("#008037"));
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(form3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}

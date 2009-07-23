/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AboutBox.java
 *
 * Created on Jul 23, 2009, 10:32:03 AM
 */
package org.kamusi;

import javax.swing.ImageIcon;

/**
 *
 * @author arthur
 */
public class AboutBox extends javax.swing.JDialog
{

    /** Creates new form AboutBox */
    public AboutBox(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
        updateAboutBox();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonPanel = new javax.swing.JPanel();
        okButton = new javax.swing.JButton();
        contentPanel = new javax.swing.JPanel();
        imagePanel = new javax.swing.JPanel();
        imageLabel = new javax.swing.JLabel();
        contentPane = new javax.swing.JScrollPane();
        contentArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("About");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(null);
        setMinimumSize(new java.awt.Dimension(500, 250));
        setResizable(false);

        okButton.setFont(new java.awt.Font("Dialog", 0, 12));
        okButton.setMnemonic('C');
        okButton.setText("Close");
        okButton.setToolTipText("Close this dialog");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(okButton);

        getContentPane().add(buttonPanel, java.awt.BorderLayout.SOUTH);

        contentPanel.setLayout(new java.awt.BorderLayout());

        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/kamusi/resources/logo.png"))); // NOI18N
        imagePanel.add(imageLabel);

        contentPanel.add(imagePanel, java.awt.BorderLayout.NORTH);

        contentArea.setColumns(20);
        contentArea.setFont(new java.awt.Font("Monospaced", 2, 10)); // NOI18N
        contentArea.setLineWrap(true);
        contentArea.setRows(5);
        contentArea.setWrapStyleWord(true);
        contentPane.setViewportView(contentArea);

        contentPanel.add(contentPane, java.awt.BorderLayout.CENTER);

        getContentPane().add(contentPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_okButtonActionPerformed
    {//GEN-HEADEREND:event_okButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_okButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JTextArea contentArea;
    private javax.swing.JScrollPane contentPane;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JButton okButton;
    // End of variables declaration//GEN-END:variables

    private void updateAboutBox()
    {
        final String about =
                "Product Version: " + "Kamusi Project Desktop Build 7" + "\n" +
                "Java: " + System.getProperty("java.version") + "\n" +
                "System: " + System.getProperty("os.name") + " version " + System.getProperty("os.version") + "\n";

        final String disclaimer =
                "\nKamusi Desktop and Kamusi Project are based on software from kamusi.org" +
                "which has been licensed under the GNU General Public License version 2." +
                "For more information, please visit www.kamusi.org.\n\n";

        contentArea.setEditable(false);
        contentArea.setText(about + disclaimer);

        setIconImage(new ImageIcon("favicon.png").getImage());
    }
}

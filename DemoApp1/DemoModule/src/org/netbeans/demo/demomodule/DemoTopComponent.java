/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.demo.demomodule;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.logging.Logger;
import org.netbeans.api.settings.ConvertAsProperties;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.windows.TopComponent;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.WindowManager;

/**
 * Top component which displays something.
 */
@ConvertAsProperties(
        dtd = "-//org.netbeans.demo.demomodule//Demo//EN",
        autostore = false
)
@TopComponent.Description(
        preferredID = "DemoTopComponent",
        //iconBase="SET/PATH/TO/ICON/HERE", 
        persistenceType = TopComponent.PERSISTENCE_ALWAYS
)
@TopComponent.Registration(mode = "explorer", openAtStartup = true)
@ActionID(category = "Window", id = "org.netbeans.demo.demomodule.DemoTopComponent")
@ActionReference(path = "Menu/Window" /*, position = 333 */)
@TopComponent.OpenActionRegistration(
        displayName = "#CTL_DemoAction",
        preferredID = "DemoTopComponent"
)
@Messages({
    "CTL_DemoAction=Demo",
    "CTL_DemoTopComponent=Demo Window",
    "HINT_DemoTopComponent=This is a Demo window"
})
public final class DemoTopComponent extends TopComponent {
    
    private static DemoTopComponent instance;
    /**path to the icon used by the component and its open action */
    //static final String ICON_PATH = "SET/PATH/TO/ICON/HERE"
    
    private static final String PREFERRED_ID = "DemoTopComponent";
    
    public DemoTopComponent() {
        initComponents();
        setName(Bundle.CTL_DemoTopComponent());
        setToolTipText(Bundle.HINT_DemoTopComponent());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(DemoTopComponent.class, "DemoTopComponent.jLabel1.text")); // NOI18N

        jTextField1.setText(org.openide.util.NbBundle.getMessage(DemoTopComponent.class, "DemoTopComponent.jTextField1.text")); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(269, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
    /**Gets default instance. Do not use directly: reserved for *.settings files
     * i.e. deserialization routines; otherwise you could get a non-deserialized i
     * To obtain the singleton instance, use (@link #findInstance)
    **/
    public static synchronized DemoTopComponent getDefault() {
        if (instance == null) {
            instance = new DemoTopComponent();
        }
        return instance;
    }
    
    /** Obtain the DemoTopComponent instance. Never call (@link #getDefault) directly
     * 
     */
    public static synchronized DemoTopComponent findInstance() {
        TopComponent win = WindowManager.getDefault().findTopComponent(PREFERRED_ID);
        if (win == null) {
            Logger.getLogger(DemoTopComponent.class.getName()).warning(
                    "Cannot find" + PREFERRED_ID + "component. it will not be lo..");
            return getDefault();
        }
        if (win instanceof DemoTopComponent) {
            return (DemoTopComponent) win;
        }
        Logger.getLogger(DemoTopComponent.class.getName()).warning(
                "There  seem to be multiple components with the" + PREFERRED_ID +
                "ID That is potencial source of errors and unexpected behavior");
        return getDefault();
    }

    @Override
    public int getPersistenceType() {
        return TopComponent.PERSISTENCE_ALWAYS;
    }
    
    @Override
    public void componentOpened() {
        // TODO add custom code on component opening
        System.out.println("componentOpened()");
    }

    @Override
    public void componentClosed() {
        // TODO add custom code on component closing
        System.out.println("componentClosed()");
    }

    void writeProperties(java.util.Properties p) {
        // better to version settings since initial version as advocated at
        // http://wiki.apidesign.org/wiki/PropertyFiles
        p.setProperty("version", "1.0");
        // TODO store your settings
    }

    void readProperties(java.util.Properties p) {
        String version = p.getProperty("version");
        // TODO read your settings according to their version
    }

    @Override
    protected Object writeReplace() throws ObjectStreamException {
        System.out.println("*************Estoy en writeReplace*******");
        ResolvableHelper rh;
        rh = new ResolvableHelper(jTextField1.getText());
        return rh;        
        //return new ResolvableHelper(jTextField1.getText());
    }

    @Override
    protected String preferredID() {
        return PREFERRED_ID; //To change body of generated methods, choose Tools | Templates.
    }
    
    final static class ResolvableHelper implements Serializable {
        private static final long serialVersionID = 1L;
        private String text;

        private ResolvableHelper(String text) {
            System.out.println("ResolvableHelper on ACTION");
            this.text = text;
        }
        public Object readResolve() {
            System.out.println("readResolve on ACTION");
            DemoTopComponent tc = DemoTopComponent.getDefault();
            tc.jTextField1.setText(text);
            return tc;
        }
    }
}
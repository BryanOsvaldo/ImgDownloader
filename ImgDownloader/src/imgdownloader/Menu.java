
// Author Bryan Pourie

package imgdownloader;

import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


    
public class Menu extends javax.swing.JFrame implements MouseListener{
    
    URL link;
    
     @Override
    public void mouseClicked(MouseEvent e){
        
        //Here can add code for when you click on some image so something
       
        panel temp = (panel) e.getSource();        
        JOptionPane.showMessageDialog(null, "The location of image > " + temp.getloc());
        
    }
    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        txtX = new javax.swing.JTextField();
        txtY = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(102, 102, 102));
        panel.setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jButton1.setBackground(new java.awt.Color(51, 255, 51));
        jButton1.setFont(new java.awt.Font("OCR A Std", 1, 14)); // NOI18N
        jButton1.setText("Start >");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtX.setFont(new java.awt.Font("OCR A Std", 1, 14)); // NOI18N

        txtY.setFont(new java.awt.Font("OCR A Std", 1, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("OCR A Std", 1, 14)); // NOI18N
        jLabel1.setText("Rows");

        jLabel2.setFont(new java.awt.Font("OCR A Std", 1, 14)); // NOI18N
        jLabel2.setText("Columns");

        jLabel3.setFont(new java.awt.Font("OCR A Std", 0, 24)); // NOI18N
        jLabel3.setText("Photos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 330, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(txtY, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtX, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(txtX.getText().equals("") || txtY.getText().equals("")){
            txtX.setText("0");
            txtY.setText("0");            
        }
        
        if(!(txtX.getText().equals("0")) && !((txtY.getText()).equals("0"))){
            Grahp(Integer.parseInt(txtX.getText()),Integer.parseInt(txtY.getText()));
        }else{
            JOptionPane.showMessageDialog(null,"Set the sizes for Rows and Columns");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed
    
        //graphed the field
    public void Grahp(int x, int y){ 
        
        panel.removeAll();         
        
        int tx = x;
        int ty = y; 
        int cont= 0;
        
        int W = panel.getWidth() / tx;
        int H = panel.getHeight() / ty;
        
        for (int i = 0; i < ty; i++) {
            for (int j = 0; j < tx; j++) {
                 
                cont++;
                panel Jl = new panel();
                Jl.addMouseListener(this);
                    
                 Jl.setSize(W , H); //Width, Height           
                 Jl.setLocation(j * W, H*i); // X , Y    
                 
                 //Download images
                        try {
                            this.link = new URL("http://lorempixel.com/" + W + "/" + H + "/");                                               
                            InputStream in = link.openStream();
                            OutputStream out = new FileOutputStream("Repository\\image_"+ cont+".png");
                            byte[] photos = new byte[1024];
                            int res = 0;
                            
                            while((res = in.read(photos)) != -1){
                                out.write(photos,0,res);
                            }
                            
                            Jl.setLoc("Repository\\image_"+ cont+".png");
                            
                            in.close();
                            out.close();
                            
                            
                        } catch (Exception e) {System.out.println(e);}
                 
                    //Add image for all of this
                    ImageIcon image = new ImageIcon("Repository\\image_"+ cont+".png"); 
                    Icon icon = new ImageIcon(image.getImage().getScaledInstance(Jl.getWidth(), Jl.getHeight(), Image.SCALE_DEFAULT));
                    
                    Jl.setIcon(icon);
                 
                 
                 Jl.setVisible(true);            
                 panel.add(Jl);                
            }        
        }
       panel.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField txtX;
    private javax.swing.JTextField txtY;
    // End of variables declaration//GEN-END:variables

   

    @Override
    public void mousePressed(MouseEvent e) {
       
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
       
    }

    
}

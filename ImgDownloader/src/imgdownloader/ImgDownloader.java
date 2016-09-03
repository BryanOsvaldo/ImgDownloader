package imgdownloader;

//  Author Bryan Pourie

import java.io.File;

 
public class ImgDownloader {

   
    public static void main(String[] args) {
       
        Menu menu = new Menu();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        
        File rep = new File("Repository");
        rep.mkdir();
        
    }
    
}

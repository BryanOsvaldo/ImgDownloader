
// Author Bryan Pourie

package imgdownloader;

import javax.swing.JLabel;

        //That class is for make a buttons
    public class panel extends JLabel {
        
        private String photo;
        
      public panel(){
        super();  
       }
      
        //Setter and Getter
      public void setLoc(String root){
          this.photo = root;
      }
      
      public String getloc(){
          return photo;
      }  
}

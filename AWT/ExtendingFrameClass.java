import java.awt.*; 
 class Myframe extends Frame 
 { 
      Myframe() 
      { 
         FlowLayout layout = new FlowLayout();  
         setLayout(layout);  
         Button ok = new Button("OK"); 
         Button cancel = new Button("Cancel"); 
         add(ok);     
         add(cancel); 
      } 
 } 
 class ExtendingFrameClass  
 { 
      public static void main(String args[]) 
      { 
          Myframe frame = new Myframe(); 
          frame.setTitle("Extending Frame Class in Java Example"); 
          frame.setSize(350,150); 
          frame.setVisible(true); 
      } 
 } 
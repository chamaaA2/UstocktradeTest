/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHAMATH
 */
public class TESTJavaApplication1 extends Thread{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TESTJavaApplication1 r = new TESTJavaApplication1();
        TESTJavaApplication1 rs = new TESTJavaApplication1();
        //Thread tr = new Thread(r);
        //Thread tdr = new Thread(rs);
           System.out.println(r.getName());
           System.out.println(rs.getName());
          //   System.out.println(tr.getName());
          // System.out.println(tdr.getName());
        r.start();
       rs.start();
      //  tr.run();
       // tdr.run();
  
        // TODO code application logic here
    }
    
    
    public void pass(){    
        for(int i=1;i<6;i++)  
            System.out.println(i);    
         
    }  

    @Override
     public void run(){    
        for(int i=1;i<6;i++)  
            System.out.println(i);    
         
    } 
}

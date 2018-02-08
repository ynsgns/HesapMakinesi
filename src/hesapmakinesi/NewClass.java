/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hesapmakinesi;


import java.lang.reflect.Array;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;

/**
 *
 * @author Bilal
 */
public class NewClass implements Initializable {
    
    @FXML
    private Label label;
    
  
    @FXML
    private TextArea text,text1;
    
    @FXML
    private Button bir,iki,uc,dort,bes,alti,yedi,sekiz,dokuz,sifir,arti,eksi,carpi,bol,virgul,esittir;
    
    
    
    
    
    @FXML
    String sayi[ ] = new String [ 999999 ];
               @FXML
               private int is=0;
               private int bsmk=10,bsmkv=10;
               
    @FXML
    String sayiy[ ] = new String [ 999999 ]; 
    
    @FXML
    String sons;
    
    @FXML
    String sb = new String();
    
    @FXML
    private int sayia,nt;
    
    @FXML
    private String bb;
    
    @FXML
    private int i=0,syc=0,syct=0;
    
    @FXML
    private float x=4,y=1;
    
    @FXML
    private float asayi=6;
    
    @FXML
    private boolean k=true,kc=false,kt=false,ke=true;
    
    @FXML
    private boolean asayik=false;
    
    
    @FXML
    private int ops=0,yops=0,aa=1,ck=0;
    
    @FXML
    private void sayi_bsmk(String al)
    {
        
    }
        
   
    @FXML
    private void sayi_yaz(String al)
    {
        if (sayi[is]==",") 
        {
           float vv=((Integer.parseInt(sayi[is-1])*bsmkv)+Integer.parseInt(sayi[is+1]));
           
        }
        
        if (is!=0) {
        if ((sayi[is-1]=="+")||(sayi[is-1]=="-")||(sayi[is-1]=="*")||(sayi[is-1]=="/")) //yanyana indis değeri için.
        {
            if ((al=="+")||(al=="-")||(al=="*")||(al=="/")) 
            {
                sayi[is-1]=al;
                
              
                
                is--;
    
                
                
             
            }
        } }
        
        if (k==true) {
            
        
        
        if (is>=1) {
            
        
        if ((sayi[is-1]=="+")||(sayi[is-1]=="-")||(sayi[is-1]=="*")||(sayi[is-1]=="/")) {
            sayi[is]=al;
            bsmk=10;
        }
        
        else{
        if ((al=="+")||(al=="-")||(al=="*")||(al=="/")) {
            sayi[is]=al;
        }
        else
        {
         sayi[is-1]=Integer.toString(bsmk*Integer.parseInt(sayi[is-1])); 
         int kd=1;
            kd = (Integer.parseInt(sayi[is-1]))+(Integer.parseInt(al));
         sayi[is-1]=Integer.toString(kd);
         bsmk=bsmk*10;
         is=is-1;
        }
        }
        }
        else sayi[is]=al;
        
        is++;
        }
        
        k=true;
        
        syc=is;
    }
    
    @FXML
    private void hesap_sayi()
    {
    
        
        sayi[syc]="";
        sayi[syc+1]="";
        int dd=syc;
       if ((sayi[syc-1]=="+")||(sayi[syc-1]=="-")||(sayi[syc-1]=="*")||(sayi[syc-1]=="/"))
       {
        sayi[syc-1]="";    
        }
        
        for (int j = 0; j < syc; j++) 
        {
            sayiy[j]=sayi[j];
        }
        
        while(i < is) 
        {
            System.out.println(i);
            
            
            
                        if (i!=0) {

            
            
            if (sayi[i]=="*"||sayi[i]=="/" ) {
                System.out.println("çarpma x="+sayi[i-1]);
                System.out.println("çarpma y="+sayi[i+1]);
                x=Float.parseFloat(sayi[i-1]);
                y=Float.parseFloat(sayi[i+1]);
               
                if (sayi[i]=="*") {
                    asayi=x*y;
                    
                }
                if (sayi[i]=="/") {
                    asayi=x/y;
                    
                }
                
                System.out.println(" x="+x+" y="+y+" sayi="+asayi);
                System.out.println("sayi[i-1] "+sayi[i-1]);
                sayi[i-1]=Float.toString(asayi);
                
                for (int j = i; j < syc; j++) {
                     sayi[j]=sayi[j+2];
                }
                
                dd=dd-2;
                
                sayi[dd]="";
                sayi[dd+1]="";
                i--;
               
                
            }
            }
             i++;
           
                                   
        }
        
        i=0;
        
        while(i < is) 
        {
            
            System.out.println(i);
            
            if (i!=0) {
                
            
            
            
            if (sayi[i]=="+"||sayi[i]=="-" ) {
                System.out.println("toplama x="+sayi[i-1]);
                System.out.println("toplama y="+sayi[i+1]);
                x=Float.parseFloat(sayi[i-1]);
                
                y=Float.parseFloat(sayi[i+1]);
               
               
                if (sayi[i]=="+") {
                    asayi=x+y;
                    
                }
                if (sayi[i]=="-") {
                    asayi=x-y;
                    
                }
                System.out.println(" x="+x+" y="+y+" sayi="+asayi);
                sayi[i-1]=Float.toString(asayi);
                
                for (int j = i; j < syc; j++) {
                       sayi[j]=sayi[j+2];
                }
                
                dd=dd-2;
                
                sayi[dd]="";
                sayi[dd+1]="";
                i--;
                
            }
            } 
              i++;
                   
        }
        
        
        i=0;
        
       float v=Float.parseFloat(sayi[0]);
       nt=(int)v;
       
        if (nt==v)
        {
            
                                 
            text1.setText(Integer.toString(nt));

               //System.out.println("");
        }
        
        if(nt!=v)   
        {
             text1.setText((sayi[0]));
        }
        
        
        
        
     
        
           for (int j = 0; j < syc; j++) 
           {
            sayi[j]=sayiy[j];
           }
        
       
     
             
     
     }
    
     @FXML
    private void hesap()
    {
     
     
    
    }
    
    
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
    }
    
  
  @FXML
    private void hesapla(ActionEvent event) {
     
      //  sayia=Integer.parseInt(text.getText());
    }
  
    
    @FXML
    private void topla(ActionEvent event) {
     
        if (is!=0) {
            sayi_yaz("+");
            }
        if (kc==true)
        {
             text.setText(text.getText()+"+");
        }
         else
        {
         bb=text.getText();
        
        
         text.setText(bb.substring(0, bb.length()-1));
         text.setText(text.getText()+"+");
        }
        kc=false;
    }
    @FXML
    private void cikar(ActionEvent event) {
     
        if (is!=0) {
       sayi_yaz("-");}
        if (kc==true)
        {
             text.setText(text.getText()+"-");
        }
        
         else
        {
         bb=text.getText();
        
        
         text.setText(bb.substring(0, bb.length()-1));
         text.setText(text.getText()+"-");
         
            
        }
        kc=false;
    }
    @FXML
    private void carp(ActionEvent event) {
        if (is!=0) {
        sayi_yaz("*");}
        if (kc==true)
        {
             text.setText(text.getText()+"*");
        }
        
         else
        {
         bb=text.getText();
        
        
         text.setText(bb.substring(0, bb.length()-1));
         text.setText(text.getText()+"*");
            
        }
        
        kc=false;
    }
    @FXML
    private void bol(ActionEvent event) {
        if (is!=0) {
        sayi_yaz("/");}
        if (kc==true)
        {
             text.setText(text.getText()+"/");
        }
        else
        {
      bb=text.getText();
        
        
         text.setText(bb.substring(0, bb.length()-1));
         text.setText(text.getText()+"/");
            
        }
        
        kc=false;
    }
    @FXML
    private void bir(ActionEvent event) {
        
        ke=true;
       sayi_yaz("1");
        
       text.setText(text.getText()+"1");
        
      kc=true;
        if (is>=2) {
            hesap_sayi();
            
        }
      
    }
    @FXML
    private void iki(ActionEvent event) {
        ke=true;
      sayi_yaz("2");
      text.setText(text.getText()+"2");
      kc=true;
      if (is>=2) {
            hesap_sayi();
            
       }
        
    }
    @FXML
    private void uc(ActionEvent event) {
        ke=true;
      sayi_yaz("3");
      text.setText(text.getText()+"3");
       kc=true;
       if (is>=2) {
           hesap_sayi();
            
        }
      
        
    }
    @FXML
    private void dort(ActionEvent event) {
        
        ke=true;
        sayi_yaz("4");
        text.setText(text.getText()+"4");
         kc=true;
        if (is>=2) {
           hesap_sayi();
            
       }
    }
    @FXML
    private void bes(ActionEvent event) {
        
        ke=true;
        sayi_yaz("5");
        text.setText(text.getText()+"5");
         kc=true;
       if (is>=2) {
          hesap_sayi();
            
      }
    }
    @FXML
    private void alti(ActionEvent event) {
        
        ke=true;
        sayi_yaz("6");
        text.setText(text.getText()+"6");
        
        kc=true;
      if (is>=2) {
           hesap_sayi();
            
        }
    }
    @FXML
    private void yedi(ActionEvent event) {
        ke=true;
        sayi_yaz("7");
        text.setText(text.getText()+"7");
       kc=true;
       if (is>=2) {
          hesap_sayi();
            
        }
    }
    @FXML
    private void sekiz(ActionEvent event) {
        
        ke=true;
       sayi_yaz("8");
       text.setText(text.getText()+"8");
        kc=true;
        if (is>=2) {
           hesap_sayi();
            
        }
    }
    @FXML
    private void dokuz(ActionEvent event) {
        ke=true;
       sayi_yaz("9");
       text.setText(text.getText()+"9");
        kc=true;
        if (is>=2) {
            hesap_sayi();
            
        }
    }
    @FXML
    private void sifir(ActionEvent event) {
        
        ke=true;
       sayi_yaz("0");
       text.setText(text.getText()+"0");
       kc=true;
       if (is>=2) {
            hesap_sayi();
            
        }
    }
    @FXML
    private void virgul(ActionEvent event) {
        
        
        
    }
    
    @FXML
    private void esittir(ActionEvent event) {
        
       ke=false;
      
        hesap_sayi();
        sayi[0]=Float.toString(asayi);
        float v=Float.parseFloat(sayi[0]);
        
        text.setText(sayi[0]);
        
        
       nt=(int)v;
       
        if (nt==v)
        {
            
                                 
            text.setText(Integer.toString(nt));

               //System.out.println("");
        }
        
        if(nt!=v)   
        {
             text.setText((sayi[0]));
        }
        
        
        for (int j = 1; j <=syc; j++)
        {
            sayi[j]="";
        }
       is=1;
       
        
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

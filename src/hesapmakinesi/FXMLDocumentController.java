/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hesapmakinesi;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.TextArea;
import java.awt.*;  
import java.io.*; 
import java.util.*;  
import java.awt.*;
import java.awt.event.*;


/**
 *
 * @author yunus
 */
public class FXMLDocumentController implements Initializable {
    

    @FXML
    private TextArea islemEkrani;
    @FXML
    private Button sifir;
    @FXML
    private Button bir;
    @FXML
    private Button iki;
    @FXML
    private Button uc;
    @FXML
    private Button dort;
    @FXML
    private Button bes;
    @FXML
    private Button alti;
    @FXML
    private Button yedi;
    @FXML
    private Button sekiz;
    @FXML
    private Button dokuz;
    @FXML
    private Button toplama;
    @FXML
    private Button cikarma;
    @FXML
    private Button carpma;
    @FXML
    private Button bolme;
    @FXML
    private Button virgul;
    @FXML
    private Button esittir;
      @FXML 
    private Label lbl;
    
    @FXML public void sifirr(){  islemEkrani.setText(islemEkrani.getText()+"0"); }
    @FXML public void birr(){islemEkrani.setText(islemEkrani.getText()+"1"); }
    @FXML public void ikii(){  islemEkrani.setText(islemEkrani.getText()+"2"); }
    @FXML public void ucc(){  islemEkrani.setText(islemEkrani.getText()+"3"); }
    @FXML public void dortt(){  islemEkrani.setText(islemEkrani.getText()+"4"); }
    @FXML public void bess(){  islemEkrani.setText(islemEkrani.getText()+"5"); }
    @FXML public void altii(){  islemEkrani.setText(islemEkrani.getText()+"6"); }
    @FXML public void yedii(){  islemEkrani.setText(islemEkrani.getText()+"7"); }
    @FXML public void sekizz(){  islemEkrani.setText(islemEkrani.getText()+"8"); }
    @FXML public void dokuzz(){  islemEkrani.setText(islemEkrani.getText()+"9"); }    
    @FXML public void artii() {  islemEkrani.setText(islemEkrani.getText()+"+"); }
    @FXML public void eksii(){  islemEkrani.setText(islemEkrani.getText()+"-"); }
    @FXML public void carpmaa(){  islemEkrani.setText(islemEkrani.getText()+"*"); }
    @FXML public void bolmee(){  islemEkrani.setText(islemEkrani.getText()+"/"); }
    @FXML public void virgull(){  islemEkrani.setText(islemEkrani.getText()+".");}
    @FXML public void pAc(){  islemEkrani.setText(islemEkrani.getText()+"(");}
    @FXML public void pKapat(){  islemEkrani.setText(islemEkrani.getText()+")");}
    @FXML public void esittirr(){  islemEkrani.setText(islemEkrani.getText()+"");toplamaIslemi();}
    @FXML public void temizle(){islemEkrani.clear(); lbl.setText("0");}    
    @FXML public void toplamaIslemi(){
       String isl = islemEkrani.getText();
       char[] dizi=isl.toCharArray();
       int sira=0,operatorsayisi=0;
       for (int i = 0; i < dizi.length; i++) {
            if(dizi[i]=='+' ||dizi[i]=='-'||dizi[i]=='*'||dizi[i]=='/'||dizi[i]=='('||dizi[i]==')'){
                operatorsayisi++;
            }
        }
        String[] islem= new String[operatorsayisi*2+1];
            int ApIndis[] = new int[islem.length];
            int KpIndis[] = new int[islem.length];
       int acikpi=0,kpi=0;
        for (int i = 0; i < dizi.length; i++) {          
            switch (dizi[i]) {
                case '+':
                    sira++;
                    islem[sira]="+";
                    sira++;
                    break;
                case '-':
                    sira++;            
                    islem[sira]="-";
                    sira++;
                    break;
                case '*':
                    sira++;
                    islem[sira]="*";
                    sira++;
                    break;
                case '/':
                    sira++;
                    islem[sira]="/";
                    sira++;
                    break;
                case '(':
                    islem[sira]="(";
                    ApIndis[acikpi]=i;
                    acikpi++;                      
                    sira++;
                    break;
                case ')':
                    sira++;
                    islem[sira]=")";
                    KpIndis[kpi]=i;
                    kpi++;                 
                    break;
                default:
                    if(islem[sira]==null)islem[sira]=Character.toString(dizi[i]);
                    else islem[sira]+= Character.toString(dizi[i]);
                    break;
            }
        }
               
    
      String[] sonislem= oncelikHesapla(islem);
      lbl.setText(sonucHesapla(sonislem)+"");
      islemEkrani.setText(sonucHesapla(sonislem)+"");
    }

  
    @FXML public float toplamaIslemi(float a, float b){return a+b;}
    @FXML public float cikarmaIslemi(float a, float b){return a-b;}
    @FXML public float carpmaIslemi(float a, float b){return a*b;}
    @FXML public float bolmeIslemi(float a, float b){return a/b;}
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

    }    
    
    public float sonucHesapla(String[] dizi){
     //2+3*2
     float snc=Float.parseFloat(dizi[0]);
        for (int i = 0; i < dizi.length; i++) {
            if(dizi[i]=="+") snc=toplamaIslemi(snc, Float.parseFloat(dizi[i+1]));
            else if(dizi[i]=="-") snc=cikarmaIslemi(snc, Float.parseFloat(dizi[i+1]));
        }
        
    return snc;
    }
    
     public String[] oncelikHesapla(String[] dizi){
        //2+3*2    operatorsayisi
        String[] ydk= new String[dizi.length];
        for (int i = 0; i < dizi.length; i++) {
            if(dizi[i]=="*"){
                dizi[i+1]=String.valueOf(carpmaIslemi(Float.parseFloat(dizi[i-1]), Float.parseFloat(dizi[i+1]))); 
                dizi[i]=null;
                dizi[i-1]=null;
            }
            if(dizi[i]=="/"){
                dizi[i+1]=String.valueOf(bolmeIslemi(Float.parseFloat(dizi[i-1]), Float.parseFloat(dizi[i+1])));
                dizi[i]=null;
                dizi[i-1]=null;
            } 
        }
        int a=0;
        for(int i=0;i<dizi.length;i++){
            if(dizi[i]!=null){
                ydk[a]=dizi[i];
                a++;
            }
        }
        
    return ydk;
    }
}


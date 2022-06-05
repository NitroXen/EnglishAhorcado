/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package english;

import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author Admin
 */
public class Frases {
    
    private HashMap<String, String> listaFrases = new HashMap<>();
    private int num;
    
    
    public Frases(){
        String fraseS1 = "welcome to the time machine";
        String fraseE1 = "bienvenido a la maquina del tiempo";
        String fraseS2 = "how did you know i was coming from paris?";
        String fraseE2 = "¿como supo que venia de paris?";
        
        listaFrases.put(fraseE1, fraseS1);
        listaFrases.put(fraseE2, fraseS2);
        listaFrases.put("it's time to fun", "es hora de divertirse");
        listaFrases.put("fry, it's me, bender", "fry, soy yo, bender");
        
        num = new Random().nextInt(listaFrases.size());
    }
    
    public String getFrase(){
        Object[] fraseEsp = listaFrases.keySet().toArray();
        return (String)fraseEsp[num];
    }
    
    public String getTranslation(){
        Object[] frase = listaFrases.values().toArray();
        return (String)frase[num];
    }
    
    
}

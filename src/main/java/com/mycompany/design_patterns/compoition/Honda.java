/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.design_patterns.compoition;

/**
 *
 * @author hp
 */
public class Honda  extends car{
   public void HondaStart() {
   
   CarEngine Honda_Engine = new CarEngine();
   Honda_Engine.StartEngine();
   } 
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplociclos;

/**
 *
 * @author camilo
 */
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Ejemplociclos extends Applet implements ActionListener {
TextField tfSueldo,tfPorcentaje;//entradas de texto
Label lSueldo,lPorcentaje;//label de los textos de entrada
Button boton;
TextArea txtResultado;//Campo de texto para mostrar el resultado
//método constructor,donde se crean los objetos a dibujar en el applet
public Ejemplociclos() {
//Damos la instruccion que no se usará ningun layout para poder dibujar con setBounds
this.setLayout((null));
//setBounds(posicionx, posiciony, ancho, alto)
lSueldo= new Label("Sueldo: ");
lSueldo.setBounds(20, 20, 100, 20);
lPorcentaje= new Label("% Aumento: ");
lPorcentaje.setBounds(20, 40, 100, 20);
tfSueldo = new TextField();
tfSueldo.setBounds(120, 20, 100, 20);
tfPorcentaje = new TextField();
tfPorcentaje.setBounds(120, 40, 100, 20);
boton = new Button("Calcular");
boton.setBounds(120,80,100,20);
txtResultado=new TextArea();
txtResultado.setBounds(20,120,300,200);
//agregamos los elementos a la pantalla
add(lSueldo);
add(lPorcentaje);
add(tfSueldo);
add(tfPorcentaje);
add(txtResultado);
add(boton);
boton. addActionListener(this); // se le añade al boton la facilidad de
// ser escuchado
}
//método paint en el cual se pone lo que se quiere dibujar
public void paint(Graphics g) {
this.setSize(340, 600);
}
// método para realizar las opciones al oprimir un botón
public void actionPerformed(ActionEvent ae) {
txtResultado.append("RESULTADO: " + "\n");
// COMPLETAR ACA EL CODIGO DEL CICLO REPETITIVO
double numsuel = Integer.parseInt(tfSueldo.getText());
double numpor = Integer.parseInt(tfPorcentaje.getText());

int año = 1;

while (año < 11) {
numsuel = numsuel + (numsuel*(numpor/100));
txtResultado.append(" Año " + año + " $ " + numsuel + "\n");
año ++;
}

}
}
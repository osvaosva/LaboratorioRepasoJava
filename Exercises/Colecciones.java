package Exercises;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.LinkedHashSet;


public class Colecciones {
   public ArrayList<String> cars;
    public String[] bikes;
    public Set<String> bicicles;
    public HashMap<Integer, String> transport;

    public Colecciones(){
        this.cars = new ArrayList<String>();
        this.bikes = new String[10];
        this.bicicles = new HashSet<String>();
        this.transport= new HashMap<Integer, String>();
    }

    public void inicializar(){
        //carros
        cars.add("VW Vento");
        cars.add("Nisan Versa");
        cars.add("Ford Fiesta");
        cars.add("Mazda 2");
        //motos
        this.bikes[1]="Yamaha V-Star 250";
        this.bikes[2]="Royal Enfield Meteor 350";
        this.bikes[3]="Kawasaki Eliminator";
        this.bikes[4]="Honda CMX500A2 SE Rebel.";
        //bicicletas 
        this.bicicles.add("TREK MADONE 7 DIAMOND");
        this.bicicles.add("TREK MADONE 7 DIAMOND");
        this.bicicles.add("TREK MADONE 7 DIAMOND");
        this.bicicles.add("AURUMANIA CRYSTAL EDITION GOLD BIKE");
        this.bicicles.add("AURUMANIA CRYSTAL EDITION GOLD BIKE");
        this.bicicles.add("AURUMANIA CRYSTAL EDITION GOLD BIKE");
    }

    public HashMap<Integer, String>  obtenerHash(){
            LinkedHashSet<String> elementos = new LinkedHashSet<>();

            for (String c : this.cars){
                agregarSiValido (elementos, c);
            }
            for (String b : this.bikes){
                agregarSiValido (elementos, b);
            }
            for (String bi : this.bicicles){
                agregarSiValido (elementos, bi);
            }

            this.transport.clear();
            int count = 1;
            for (String elemento : elementos) {
                this.transport.put(count, elemento);
                count++;
            }

        //this.transport.forEach((key, value) -> System.out.println(key + " " + value)); //imprimir para pruebas
        return this.transport;
    }

    private void agregarSiValido(Set<String> destino, String valor) {
        if (valor != null && !valor.isEmpty()) {
            destino.add(valor);
        }
    }
}

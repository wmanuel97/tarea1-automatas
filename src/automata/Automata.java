/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automata;

/**
 *
 * @author Johan
 */
public class Automata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conjunto ca = new Conjunto();
        //Operaciones basicas----operaciones conjuntivistas
        for(int i=1; i<=10; i++){
            ca.inserta((Integer)i);
        }
        System.out.println("Elunto A es: "+ca.getA());
        ca.inserta(6); //Inserta de nuevo el 6 y avisa que está repetido
        ca.elimina(3); //Elimina el numero 3
        System.out.println("Elunto A es: "+ca.getA());
        
        
        //Operaciones de subconjuntos
        System.out.println("Subconjuntoos mayores:"+ca.subconjuntosup(5)); //Muestra del 5 y superiores
        System.out.println("Subconjuntoos menores:"+ca.subconjuntoinf(8)); //Muestra del 8 e inferiores
        System.out.println("Subconjuntoe:"+ca.subconjuntoentre(2,9)); //Muestra entre el 2 y el 9
        
        
        //Operaciones con conjuntos
        Conjunto cb=new Conjunto(); //Nuevo conjunto
        cb.inserta(6);
        cb.inserta(11);
        cb.inserta(12);
        System.out.println("\nConjunto B: "+cb.getA());
        System.out.println("UNION: B ∪ A: "+ca.union(ca.a, cb.a));
        System.out.println("Conjuntocca.getA()");
        //System.out.println("Conjunto:" +ca.getA());
        
        
        Conjunto cc=new Conjunto(); //Nuevo conjunto
        cc.inserta(7);
        cc.inserta(8);
        cc.inserta(15);
        System.out.println("\nConjunto C: "+cc.getA());
        System.out.println("INTERSECCION: C ∩ A :"+ca.interseccion(ca.a, cc.a));
        //System.out.println("C:"+cc.diferencia(cc.a, ca.a)+"\n");
        
        
        Conjunto cd=new Conjunto(); //Nuevo conjunto
        cd.inserta(7);
        cd.inserta(8);
        cd.inserta(15);
        System.out.println("\nConjunto D: "+cd.getA());
        System.out.println("DIFERENCIA: D \\ A: "+cc.diferencia(cc.a, ca.a));
                                                //cc
        
        Conjunto ce=new Conjunto(); //Nuevo conjunto
        ce.inserta(8);
        ce.inserta(9);
        ce.inserta(10);
        System.out.println("\nConjunto E: "+ce.getA());
        System.out.println("COMPLEMENTO: E: "+ca.complemento(ca.a, cc.a));
        
        Conjunto cf=new Conjunto();
        Conjunto cg=new Conjunto(); //Nuevos conjuntos
        Conjunto ch=new Conjunto();
        cf.inserta(1);
        cf.inserta(2);
        cf.inserta(3);
        /////////////////////
        cg.inserta(1);
        cg.inserta(2);
        cg.inserta(3);
        ////////////////////
        ch.inserta(4);
        ch.inserta(5);
        ch.inserta(6);
        System.out.println("\nConjunto F: "+cf.getA());
        System.out.println("Conjunto G: "+cg.getA());
        System.out.println("Conjunto H: "+ch.getA());
        System.out.println("IGUALDAD: F=G: "+cf.igualdad(cf.a, cg.a));
        System.out.println("IGUALDAD: G=H: "+cg.igualdad(ch.a, cg.a));
        
        /*Conjunto ce=new Conjunto(); //Nuevo conjunto
        ce.inserta(3);
        ce.inserta(8);
        ce.inserta(12);
        System.out.println("\nConjunto E: "+ce.getA());
        System.out.println("Complemento de E con A: "+ce.complemento(ce.a, ca.a));
        */
        
        
        
        
        System.out.println("\nConjuntocca.getA()");
        System.out.println("Conjuntoccb.getA()");
        System.out.println("Conjuntoccc.getA()");
    }
    
}

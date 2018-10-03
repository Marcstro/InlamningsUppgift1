/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
{licensePrefix} MARCUS DU AER AWESOME!!!
 */

package dag5u1;



public class Dag5U1 {

    public enum Romersk {I(1), V(5), X(10), L (50), C(100), D(500), M(1000);
    public final int varde;
    protected String test1; 
    Romersk(int varde){
        this.varde=varde;
    }
    public void setTest(String test){
        test1=test;
    }
    public String getTest(){
        return test1;
    }
    }
    
    
    
    
    public static void main(String[] args) {
        
        
        Romersk rom1 = Romersk.I;
        Romersk rom2 = Romersk.V;
        Romersk rom3 = Romersk.X;
        Romersk rom4 = Romersk.L;
        Romersk rom5 = Romersk.C;
        Romersk rom6 = Romersk.D;
        Romersk rom7 = Romersk.M;
        
        Romersk[] romare = {Romersk.I, Romersk.V, Romersk.X, Romersk.L, 
        Romersk.C, Romersk.D, Romersk.M };
        
        
        for(Romersk r: romare){
            System.out.println(r.varde);
        }
        
        Romersk roma = Romersk.L;
        roma.setTest("varde 68");
        System.out.println(roma.getTest());
        System.out.println(roma.ordinal());
        
    

    }

}

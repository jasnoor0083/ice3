/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;
public class Employee {
       private String name ;
       private int noofhours ;
       private int rate ;
       
       public Employee(String s , int n , int r){
           this.name = s ;
           this.noofhours = n ;
           this.rate = r ;
       }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the noofhours
     */
    public int getNoofhours() {
        return noofhours;
    }

    /**
     * @param noofhours the noofhours to set
     */
    public void setNoofhours(int noofhours) {
        this.noofhours = noofhours;
    }

    /**
     * @return the rate
     */
    public int getRate() {
        return rate;
    }

    /**
     * @param rate the rate to set
     */
    public void setRate(int rate) {
        this.rate = rate;
    }
       
    public double calculatePay(){
        double pay ;
        pay = getNoofhours() * getRate() ;
        
        return pay ;
       
    }
}




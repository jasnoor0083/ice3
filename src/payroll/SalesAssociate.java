/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;
public class SalesAssociate extends Employee {
  
        private int vacPay;

    public SalesAssociate(String s, int n, int b, int r , int v) {
        super(s, n, r);
        
        this.vacPay =v;
    }
 public void getvacPay(int vacPay) {
        this.vacPay = vacPay;
     }
     
     public int setvacPay(int vacPay) {
        return vacPay;
    }
    
    @Override
    public double calculatePay()
    {
        double pay ;
        pay = super.calculatePay() + vacPay ;
        return pay ;
    }
}




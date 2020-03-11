/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;


public class Manager extends Employee {
    private int bonus ;
    private int vacPay;

    public Manager(String s, int n, int r , int b, int v) {
        super(s, n, r);
        this.bonus = b;
        this.vacPay =v;
    }
    /**
     * @return the bonus
     */
    public int getBonus() {
        return bonus;
    }

    /**
     * @param bonus the bonus to set
     */
    public void setBonus(int bonus) {
        this.bonus = bonus;
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
        pay = super.calculatePay() + bonus + vacPay ;
        return pay ;
    }
}
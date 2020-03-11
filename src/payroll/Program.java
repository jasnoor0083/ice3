/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

/**
 *
 * @author JASNOOR
 */
public class Program {
     
    public static void main(String[] args){
        Employee e1 = new Employee("rita",35,100);
        Manager m1 = new Manager("tanu", 35,100,1000,1000);
        SalesAssociate sl=new SalesAssociate("john",35,100,1000,1000);
        System.out.println("\n"+e1.calculatePay());
        System.out.println("\n"+m1.calculatePay());
       System.out.println("\n"+sl.calculatePay());
    }
}

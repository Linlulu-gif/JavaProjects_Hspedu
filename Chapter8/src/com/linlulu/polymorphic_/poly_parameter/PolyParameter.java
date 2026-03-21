package com.linlulu.polymorphic_.poly_parameter;

public class PolyParameter {
    public static void main(String[] args) {
        Employee employee = new Worker("张三", 5000);
        Employee employee1 = new Manager("李四", 20000, 40000);

        Test test = new Test();

        test.showEmpAnnal(employee);
        test.showEmpAnnal(employee1);

        test.testWork(employee);
        test.testWork(employee1);
    }
}

class Test {
    public void showEmpAnnal(Employee e) {
        System.out.println(e.getName() + "今年工资" + e.getAnnual());
    }

    public void testWork(Employee e) {
        if (e instanceof Worker) {
            ((Worker) e).work();
        } else if (e instanceof Manager) {
            ((Manager) e).manage();
        }
    }
}

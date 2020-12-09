package com.tekwill.learning.basics.accesmodifiers.software;

public class Meeting {
    Employee employee;

    public void nothing(){
        employee.publicfirstName ="Brian";
        employee.publicdoWork();
    }

    public void nothing2(){
        employee.protectedfirstName ="Brian";
        employee.protecteddoWork();
    }

    public void nothing3(){
        employee.defaultfirstName ="Brian";
        employee.defaultdoWork();
    }

    public void nothing4(){
        // employee.privatefirstName ="Brian"; no access
        // employee.privatedoWork(); no access
    }
}

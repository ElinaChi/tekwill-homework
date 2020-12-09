package com.tekwill.learning.basics.accesmodifiers.software;

public class Developer extends Employee {
    Employee employee;

    public void nothing(){
        publicfirstName = "John"; //without reference
        publicdoWork(); //without reference

        employee.publicfirstName = "John"; //with reference
        employee.publicdoWork(); //with reference

    }
    public void nothing2(){
        protectedfirstName = "John"; //without reference
        protecteddoWork(); //without reference

        employee.protectedfirstName = "John"; //with reference
        employee.protecteddoWork(); //with reference
    }
    public void nothing3(){
        defaultfirstName = "John"; //without reference
        defaultdoWork(); //without reference

        employee.defaultfirstName = "John"; //with reference
        employee.defaultdoWork(); //with reference
    }
    public void nothing4 (){
         // privatefirstName = "John"; without reference, no access
        // privatedoWork(); without reference, no access

         // employee.privatefirstName = "John"; with reference, no access
         // employee.privatedoWork(); with reference, no access
    }
}

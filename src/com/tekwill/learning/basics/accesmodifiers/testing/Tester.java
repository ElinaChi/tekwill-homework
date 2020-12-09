package com.tekwill.learning.basics.accesmodifiers.testing;

import com.tekwill.learning.basics.accesmodifiers.software.Employee;

public class Tester extends Employee {
    Employee employee;

    public void nothing (){
        publicfirstName = "Tom"; //without reference
        publicdoWork();         //without reference

        employee.publicfirstName = "Tom"; //with reference
        employee.publicdoWork();         //with reference
    }
    public void nothing2 (){
         // employee.protectedfirstName = "Tom"; //with reference, no access
         // employee.protecteddoWork();    //with reference, no access

        protectedfirstName= "Tom";      //without reference
        protecteddoWork();             //without reference

    }
    public void nothing3 (){
         // employee.defaultfirstName = "Tom"; with reference, no access
          // employee.defaultdoWork();    with reference, no access

         // defaultfirstName= "Tom";      without reference, no access
         // defaultdoWork();              without reference, no access
    }
    public void nothing4 (){
          // employee.privatefirstName = "Tom"; with reference, no access
         // employee.privatedoWork();    with reference, no access

         // privatefirstName= "Tom"; without reference, no access
         // privatedoWork(); without reference, no access
    }
}


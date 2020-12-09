package com.tekwill.learning.basics.accesmodifiers.testing;

import com.tekwill.learning.basics.accesmodifiers.software.Employee;

public class Documentation {
    Employee employee;

    public void nothing (){
        employee.publicfirstName ="Smith";
        employee.publicdoWork();
    }
    public void nothing2 (){
        // employee.protectedfirstName ="Smith"; no access
        // employee.protecteddoWork(); no access
    }
    public void nothing3 (){
        // employee.defaultfirstName ="Smith";  no access
         // employee.defaultdoWork();  no access
    }
    public void nothing4 (){
        // employee.privatefirstName ="Smith";  no access
        //employee.privatedoWork();  no access
    }
}

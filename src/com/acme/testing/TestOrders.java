package com.acme.testing;

import com.acme.domain.*;
import com.acme.domain.Good.UnitOfMeasureType;
import com.acme.utils.MyDate;

public class TestOrders {

    public static void main(String[] args) {
        System.out.println("ORDER1");

        // good is abstract can't create and instance
        //Good g = new Good("Acme Earthquake Pills", 1304, 0.15,
        //        UnitOfMeasureType.CUBIC_FEET, false, 1);


        MyDate date1 = new MyDate(20, 1, 2008);
        Liquid glue = new Liquid("Acme Glue", 2334, 4, UnitOfMeasureType.LITER,
                false, 15, 6);

        MyDate date2 = new MyDate(20, 4, 2008);
        Solid anvil = new Solid("Acme Anvil", 1668, 0.3, UnitOfMeasureType.CUBIC_METER, false, 5000, 0.5,
                0.5);

        //double x=1;
        System.out.println("ORDER1");
        Order anvilOrder = new Order(anvil, 5, 100.00, date1, "aaaa");
        System.out.println("The total bill for: " + anvil + " is " +
                anvilOrder.computeTotal());

        System.out.println("ORDER2");
        Order glueOrder = new Order(glue, 1000, 2000.00, date2, "aaaa");
        System.out.println("The total bill for: " + glueOrder + " is " +
                glueOrder.computeTotal());


        ServiceRendered plumbingService = new ServiceRendered("plumbing", 5, true);
        /**Because both Service and Good objects share the same interface, they can
        be used interchangeably (to some extent) with Orders. This is
        polymorphism through interfaces!
         */
        System.out.println("ORDER3");
        Order plumbingServiceOrder = new Order(plumbingService, 1, 2000.00, date2, "bbbb");
        System.out.println("The total bill for: " + plumbingServiceOrder + " is " +
                plumbingServiceOrder.computeTotal());

    }
}

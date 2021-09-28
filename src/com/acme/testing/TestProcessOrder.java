package com.acme.testing;

import com.acme.domain.Good;
import com.acme.domain.Liquid;
import com.acme.domain.ProcessOrderService;
import com.acme.domain.Solid;

public class TestProcessOrder
{
    public static void main(String[] args) {


        Liquid glue = new Liquid("Acme Glue", 2334, 4, Good.UnitOfMeasureType.LITER,
                false, 15, 6);
        Liquid paint = new Liquid("Acme Invisible Paint", 2490, 0.65,
                Good.UnitOfMeasureType.GALLON, true, 0.70, 12);
        Solid anvil = new Solid("Acme Anvil", 1668, 0.3, Good.UnitOfMeasureType.CUBIC_METER, false, 5000, 0.5,
                0.5);

        ProcessOrderService processOrderService = new ProcessOrderService();

        System.out.println(processOrderService.chooseContainer(glue));
        System.out.println(processOrderService.chooseContainer(anvil));
    }
}

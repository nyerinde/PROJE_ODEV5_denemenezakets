package com.universal_yazilim.bid.ysm.odev5.program;

import com.universal_yazilim.bid.ysm.odev5.model.entity.Fatura;
import com.universal_yazilim.bid.ysm.odev5.utility.Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Main2
{
    public static void main(String[] args)
    {
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-yyyy");
            Date date1 = formatter.parse("19-04-1988");
            Date date2 = formatter.parse("19-04-1988");
            Date date3 = formatter.parse("26-07-1986");
            Date date4 = formatter.parse("05-03-1990");
            Date date5 = formatter.parse("18-07-1999");


            Fatura[] faturaArr1 = new Fatura[5];
            faturaArr1[0] = new Fatura(109, "A1", date1, 100.0, 80.0);
            faturaArr1[1] = new Fatura(110, "B2", date2, 100.0, 150.0);
            faturaArr1[2] = new Fatura(111, "B3", date3, 50.0, 40.0);
            faturaArr1[3] = new Fatura(112, "B4", date4, 50.0, 50.0);
            faturaArr1[4] = new Fatura(113, "C3", date5, 80.0, 70.0);

            List<Fatura> studentList1 = Arrays.asList(faturaArr1);

            System.out.println("faturaList1:");
            Util.showList(studentList1);
            Collections.sort(studentList1);
            System.out.println("\nSorted");
            Util.showList(studentList1);
        }
        catch (ParseException e)
        {
            Util.showGeneralExceptionInfo(e);
        }
    }
}

package com.universal_yazilim.bid.ysm.odev5.program;

import com.universal_yazilim.bid.ysm.odev5.model.entity.Fatura;
import com.universal_yazilim.bid.ysm.odev5.ornek_hibernate.model.dal.CalisanDAL;
import com.universal_yazilim.bid.ysm.odev5.ornek_hibernate.model.entity.Calisan;
import com.universal_yazilim.bid.ysm.odev5.ornek_hibernate.model.utility.HibernateUtil;
import com.universal_yazilim.bid.ysm.odev5.utility.Util;

import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Main_hiber
{
    public static void main(String[] args)
    {
        Calisan calisan1 = new Calisan("Ali", "Bilen", 25000.0, new Date());

        Calisan calisan2 = new Calisan("Ali", "Bilir", 25000.0, new Date());

        Calisan calisan3 = new Calisan("Mine", "Bulut", 25000.0, new Date());

        Calisan calisan4= new Calisan("Ahmet", "Yalın", 30000.0, new Date());

        Calisan calisan5 = new Calisan("Gamze", "Çelik", 40000.0, new Date());


        CalisanDAL calisanDAL1 = new CalisanDAL();
        calisanDAL1.ekle(calisan1);
        calisanDAL1.ekle(calisan2);
        calisanDAL1.ekle(calisan3);

        calisanDAL1.ekle(calisan4);
        calisanDAL1.ekle(calisan5);


        List<Calisan> calisanList = calisanDAL1.getAllByName();
        Collections.sort(calisanList);
        Util.showList(calisanList);
        HibernateUtil.closeSessionFactory();
    }
}

package com.universal_yazilim.bid.ysm.odev5.ornek_hibernate.model.dal;

import com.universal_yazilim.bid.ysm.odev5.model.utility.*;
import com.universal_yazilim.bid.ysm.odev5.ornek_hibernate.model.entity.Calisan;
import com.universal_yazilim.bid.ysm.odev5.ornek_hibernate.model.utility.HibernateUtil;
import com.universal_yazilim.bid.ysm.odev5.ornek_hibernate.model.utility.Sorgu;
import com.universal_yazilim.bid.ysm.odev5.ornek_hibernate.model.utility.TabloAd;
import com.universal_yazilim.bid.ysm.odev5.utility.Util;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CalisanDAL
{

    private TabloAd tabloAd;
    private Connection connection;
    private Session session;
    private Transaction transaction;

    public boolean sil(Integer calisanID)
    {
        return false;
    }

    public List<Calisan> getAllByName()
    {
        try
        {
            Calisan calisan=new Calisan();
            session = HibernateUtil.getSession();
            transaction = HibernateUtil.getTransaction();

            SQLQuery sqlQuery = session.createSQLQuery(Sorgu.TUM_VARLIKLARI_CEK + TabloAd.CALISANLAR+Sorgu.ORDER_BY_CALISAN);

            return sqlQuery.addEntity(Calisan.class).list();
        }
        catch (Exception e)
        {
            Util.showGeneralExceptionInfo(e);

            return null;
        }
    }
    public boolean ekle(Calisan calisan)
    {
        try
        {
            session = HibernateUtil.getSession();
            transaction = HibernateUtil.getTransaction();

            session.save(calisan);
            transaction.commit();

            return true;
        }
        catch (Exception e)
        {
            Util.showGeneralExceptionInfo(e);

            if(transaction != null)  transaction.rollback();

            return false;
        }
    }




}

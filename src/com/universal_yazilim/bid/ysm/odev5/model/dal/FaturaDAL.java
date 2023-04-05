package com.universal_yazilim.bid.ysm.odev5.model.dal;

import com.universal_yazilim.bid.ysm.odev5.model.entity.Fatura;
import com.universal_yazilim.bid.ysm.odev5.model.utility.DBUtil;
import com.universal_yazilim.bid.ysm.odev5.model.utility.FaturalarColumnName;
import com.universal_yazilim.bid.ysm.odev5.model.utility.Query;
import com.universal_yazilim.bid.ysm.odev5.model.utility.TableName;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FaturaDAL
{


    private Connection connection;



    public FaturaDAL(String username, String password) {

            connection = DBUtil.createConnection(username, password);

    }


    public List<Fatura> getAllByDate()
    {
        List<Fatura> entityList = new ArrayList<>();

        try
        {
            Statement statement = null;
            ResultSet resultSet = null;
            if(connection != null)
            {
                statement = connection.createStatement();
                resultSet = statement.executeQuery(Query.GET_ALL+TableName.FATURALAR+ Query.ORDER_BY);

                while (resultSet.next())
                {
                    entityList.add(createEntity(resultSet));
                }
            }
        }
        catch (SQLException e)
        {
            DBUtil.showSQLException(e);
        }

        return entityList;
    }

    public List<Fatura> getAll()
    {
        List<Fatura> entityList = new ArrayList<>();

        try
        {
            Statement statement = null;
            ResultSet resultSet = null;
            if(connection != null)
            {
                statement = connection.createStatement();
                resultSet = statement.executeQuery(Query.GET_ALL + TableName.FATURALAR);

                while (resultSet.next())
                {
                    entityList.add(createEntity(resultSet));
                }
            }
        }
        catch (SQLException e)
        {
            DBUtil.showSQLException(e);
        }

        return entityList;
    }

    protected Fatura createEntity(ResultSet resultSet) throws SQLException
    {
        Fatura fatura = new Fatura();
        fatura.setFaturaID( resultSet.getInt(FaturalarColumnName.FATURA_ID.toString()) );
        fatura.setFaturaNo( resultSet.getString(FaturalarColumnName.FATURA_NO.toString() ) );
        fatura.setFaturaTarihi( resultSet.getDate(FaturalarColumnName.FATURA_TARIHI.toString() ) );
        fatura.setOdemeTutari( resultSet.getDouble(FaturalarColumnName.ODEME_TUTARI.toString() ) );
        fatura.setOdenenTutar( resultSet.getDouble(FaturalarColumnName.ODENEN_TUTAR.toString() ) );

        return  fatura;
    }
}

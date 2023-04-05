package com.universal_yazilim.bid.ysm.odev5.model.utility;

public final class Query
{
    public static final String GET_ALL = "SELECT * FROM ";
    public static final String ORDER_BY = " order by fatura_tarihi desc, odeme_tutari desc, odenen_tutar desc" ;

    private Query() {}
}

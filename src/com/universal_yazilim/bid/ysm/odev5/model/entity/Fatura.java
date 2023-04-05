package com.universal_yazilim.bid.ysm.odev5.model.entity;

import java.util.Date;

public class Fatura implements Comparable<Fatura>
{
   private int faturaID;

   private String faturaNo;

   private Date faturaTarihi;

   private Double odemeTutari;

   private Double odenenTutar;

    public Fatura(int faturaID, String faturaNo, Date faturaTarihi, Double odemeTutari, Double odenenTutar) {
        this.faturaID = faturaID;
        this.faturaNo = faturaNo;
        this.faturaTarihi = faturaTarihi;
        this.odemeTutari = odemeTutari;
        this.odenenTutar = odenenTutar;
    }

    public Fatura() {
    }

    public int getFaturaID() {
        return faturaID;
    }

    public void setFaturaID(int faturaID) {
        this.faturaID = faturaID;
    }

    public String getFaturaNo() {
        return faturaNo;
    }

    public void setFaturaNo(String faturaNo) {
        this.faturaNo = faturaNo;
    }

    public Date getFaturaTarihi() {
        return faturaTarihi;
    }

    public void setFaturaTarihi(Date faturaTarihi) {
        this.faturaTarihi = faturaTarihi;
    }

    public Double getOdemeTutari() {
        return odemeTutari;
    }

    public void setOdemeTutari(Double odemeTutari) {
        this.odemeTutari = odemeTutari;
    }

    public Double getOdenenTutar() {
        return odenenTutar;
    }

    public void setOdenenTutar(Double odenenTutar) {
        this.odenenTutar = odenenTutar;
    }

    @Override
    public String toString() {
        return "Fatura{" +
                "faturaID=" + faturaID +
                ", faturaNo='" + faturaNo + '\'' +
                ", faturaTarihi=" + faturaTarihi +
                ", odemeTutari=" + odemeTutari +
                ", odenenTutar=" + odenenTutar +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fatura fatura = (Fatura) o;

        return faturaID == fatura.faturaID;
    }

    @Override
    public int hashCode() {
        return faturaID;
    }

    @Override
    public int compareTo(Fatura fatura)
    {
        if (faturaTarihi.compareTo(fatura.faturaTarihi) > 0)
        {
            return -1;
        } else if (faturaTarihi.compareTo(fatura.faturaTarihi) < 0)
        {
            return 1;
        } else
        {
            if (odemeTutari > fatura.odemeTutari)
                return -1;
            else if (odemeTutari < fatura.odemeTutari)
                return 1;
            else
            {
                if (odenenTutar > fatura.odenenTutar)
                    return -1;
                else if (odenenTutar < fatura.odenenTutar)
                    return 1;
            }

        }
        return 1;
    }
}

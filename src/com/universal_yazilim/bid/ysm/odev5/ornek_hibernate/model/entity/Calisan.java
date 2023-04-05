package com.universal_yazilim.bid.ysm.odev5.ornek_hibernate.model.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;


@SequenceGenerator(name = "CALISANLAR_SEQUENCE", sequenceName = "CALISANLAR_SEQ", initialValue = 1, allocationSize = 1)
@Table(name = "CALISANLAR")
@Entity
public class Calisan implements  Comparable<Calisan>
{
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CALISANLAR_SEQUENCE")
    @Column(name = "CALISAN_ID")
    @Id
    private Integer calisanID;

    private String isim;

    private String soyisim;

    private Double maas;

    @Column(name = "ISE_GIRIS_TARIHI")
    private Date iseGirisTarihi;

    public Calisan(String isim, String soyisim, Double maas, Date iseGirisTarihi)
    {
        this.isim = isim;
        this.soyisim = soyisim;
        this.maas = maas;
        this.iseGirisTarihi = iseGirisTarihi;
    }

    public Calisan() {
    }



    public Integer getCalisanID() {
        return calisanID;
    }

    public void setCalisanID(Integer calisanID) {
        this.calisanID = calisanID;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public Double getMaas() {
        return maas;
    }

    public void setMaas(Double maas) {
        this.maas = maas;
    }

    public Date getIseGirisTarihi() {
        return iseGirisTarihi;
    }

    public void setIseGirisTarihi(Date iseGirisTarihi) {
        this.iseGirisTarihi = iseGirisTarihi;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "calisanID=" + calisanID +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", maas=" + maas +
                ", iseGirisTarihi=" + iseGirisTarihi +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Calisan calisan = (Calisan) o;

        return Objects.equals(calisanID, calisan.calisanID);
    }

    @Override
    public int hashCode() {
        return calisanID != null ? calisanID.hashCode() : 0;
    }

    @Override
    public int compareTo(Calisan calisan) {
        if (isim.compareTo(calisan.isim)>0)
            return 1;
        else if (isim.compareTo(calisan.isim)<0)
            return -1;
        else
        {
            if (soyisim.compareTo(calisan.soyisim)>0)
                return 1;
            else if (soyisim.compareTo(calisan.soyisim)<0)
                return -1;
            else return 0;
        }


    }
}

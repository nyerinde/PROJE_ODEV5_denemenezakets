package com.universal_yazilim.bid.ysm.odev5.program;

import com.universal_yazilim.bid.ysm.odev5.model.dal.FaturaDAL;
import com.universal_yazilim.bid.ysm.odev5.model.entity.Fatura;
import com.universal_yazilim.bid.ysm.odev5.utility.Util;

import javax.swing.*;
import java.util.List;

public class Main1 {

    public static void main(String[] args)
    {

        String username = JOptionPane.showInputDialog("Oracle kullanıcı adını giriniz:");
        String password = JOptionPane.showInputDialog("Oracle kullanıcı şifresini giriniz:");

        FaturaDAL faturaDAL1 = new FaturaDAL(username, password);
        List<Fatura> faturalar1 = faturaDAL1.getAllByDate();
        Util.showList( faturalar1);


        System.out.println("\n");



    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unibar;

import org.hibernate.Session;
import persistencia.HibernateUtil;

/**
 *
 * @author jaimedias
 */
public class Unibar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Session session = HibernateUtil.getSession();
        HibernateUtil.beginTransaction();
        HibernateUtil.commitTransaction();
        HibernateUtil.closeSession();

        System.out.println("Banco sincronizado com Hibernate!");
    }

}

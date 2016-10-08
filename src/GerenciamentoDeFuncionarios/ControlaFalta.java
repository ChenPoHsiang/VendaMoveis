/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GerenciamentoDeFuncionarios;

import Controle.Faltas;
import Controle.Funcionario;
import Util.HibernateUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import javax.swing.JOptionPane;
import org.hibernate.Session;

/**
 *
 * @author rafael
 */
public class ControlaFalta {

    public boolean persisteFalta(Faltas falta, Integer justificativaFlag, String justificativatextual, Date datafalta) {
        falta.setJustificativaFlag(justificativaFlag);
        falta.setJustificativatextual(justificativatextual);
        falta.setDatafalta(datafalta);
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        try {
            s.saveOrUpdate(falta);
            s.getTransaction().commit();
            return true;
        } catch (Exception e) {
            s.getTransaction().commit();
            return false;
        }
    }

    public Faltas criarFalta(String idFaltas, Funcionario funcionario, Integer justificativaFlag, String justificativatextual, Date datafalta) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Faltas falta = new Faltas(idFaltas, funcionario, justificativaFlag, justificativatextual, datafalta);
        s.save(falta);
        s.getTransaction().commit();
        return falta;
    }

    public ArrayList<Faltas> getListaFaltas() {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        ArrayList<Faltas> listaFaltas = (ArrayList<Faltas>) s.createQuery("From Faltas").list();
        s.getTransaction().commit();
        Collections.sort(listaFaltas, new Comparator<Faltas>() {
            @Override
            public int compare(Faltas o1, Faltas o2) {
                return o1.getDatafalta().compareTo(o2.getDatafalta());
            }
        });
        return listaFaltas;
    }

    public boolean faltaCadastrada(String cpf_funcionario, Date data) {
        ArrayList<Faltas> listaFaltas = getListaFaltas();
        HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
        for (Faltas f : listaFaltas) {
            if (f.getFuncionario().getCpf().equals(cpf_funcionario) && f.getDatafalta().equals(data)) {
                JOptionPane.showMessageDialog(null, "Ja ha falta cadastrada nesse dia para esse funcionario!");
                HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
                return true;
            }
        }
        HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
        return false;
    }
}

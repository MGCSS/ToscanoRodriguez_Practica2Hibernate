/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Experto;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author david
 */
public class ManejaExperto {
    
    private Session sesion;
    private Transaction tx; 
    
    public ManejaExperto() {}
    
    public void guardaExperto(Experto e) {
        try {
            iniciaOperacion();
            sesion.save(e);
            System.out.println("Experto insertado correctamente");
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        }
        finally {
            finalizaOperacion();
        }
    }
    
    public void eliminaExperto(Experto e) {
        try {
            iniciaOperacion();
            sesion.delete(e);
            System.out.println("Experto eliminado correctamente");
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        }
        finally {
            finalizaOperacion();
        }
    }
    
    public void actualizaExperto(Experto e) {
        try {
            iniciaOperacion();
            sesion.update(e);
            System.out.println("Experto actualizado correctamente");
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        }
        finally {
            finalizaOperacion();
        }
    }
    
    public Experto obtenerExperto(String idExperto) {
        try {
            iniciaOperacion();
            return (Experto) sesion.get(Experto.class, idExperto);
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        }
        finally {
            finalizaOperacion();
        }
    }
    
    public void iniciaOperacion() throws HibernateException {
        System.out.println("Comenzando con Hibernate");
        
        sesion = hibernate.HibernateUtil.getSessionFactory().openSession(); // inicia una sesion hibernate
        tx = sesion.beginTransaction(); // comienza la transaccion
    }
    
    public void finalizaOperacion() throws HibernateException {
        System.out.println("Finalizando con Hibernate");
        
        tx.commit();
        sesion.close();
    }
    
    public void manejaExcepcion(HibernateException he) throws HibernateException {
        tx.rollback();
        System.out.println("Ocurrio un error en la capa de acceso a datos: " + he.getMessage());
        System.exit(0);
    }
    
}

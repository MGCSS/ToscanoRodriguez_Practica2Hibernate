/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import modelo.Experto;
import org.hibernate.HibernateException;
import org.hibernate.Query;
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
    
    public void obtenerNombresyEspeciaidad() {
        try {
            iniciaOperacion();
            String hql = "from Experto";
            Query query = sesion.createQuery(hql);
            List<Experto> listaExpertos = query.list();
            for(Experto e : listaExpertos) {
                System.out.println("Nombre: " + e.getNombre() + "\t\tEspecialidad: " + e.getEspecialidad());
            }
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        }
        finally {
            finalizaOperacion();
        }
    }
    
    public void expertosConEspecialidadX(String especialidad) {
        try {
            iniciaOperacion();
            String hql = "from Experto as e where e.especialidad = :especialidad";
            Query query = sesion.createQuery(hql);
            query.setParameter("especialidad", especialidad);
            List<Experto> listaExpertos = query.list();
            for(Experto e : listaExpertos) {
                System.out.println(e.getNombre());
            }
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        }
        finally {
            finalizaOperacion();
        }
    }
    
    public void obtenerCasos() {
        try {
            iniciaOperacion();
            String hql = "SELECT distinct e.nombre, cp.nombre FROM Experto as e, CasoPolicial as cp"
                + " INNER JOIN e.colaboras inner join cp.colaboras";
            Query query = sesion.createQuery(hql);
            List<Object[]> listaResultados = query.list();
            for (int i = 0; i < listaResultados.size(); i++) {
                System.out.println("Nombre: " + listaResultados.get(i)[0] + "\t\tCaso Policial: " 
                        + listaResultados.get(i)[1]);
            }
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

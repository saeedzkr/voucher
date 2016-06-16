package org.voucher.model.dao;

import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by s.zakipour on 12/27/2015.
 */


@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class BaseDAOImpl<T> {

    @PersistenceContext(unitName = "kernelPU")
    protected EntityManager em;
    @Resource
    protected SessionContext ctx;

    public SessionContext getSessionContext() {
        return ctx;
    }

    public void setSessionContext(SessionContext ctx) {
        this.ctx = ctx;
    }

    public T update(T entity) {
        try {
            return em.merge(entity);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void delete(T entity) {
        try {
            em.remove(em.merge(entity));
        } catch (Exception e) {
            System.out.println("Deleted Entity Error is ===========" +e.getMessage());
        }
    }

    public T create(T entity) {
        try {
            em.persist(entity);
            return entity;
        } catch (Exception e) {
            System.out.println("Created Entity Error is ==========" + e.getMessage());
            return null;
        }
    }

    public List<T> createList(List<T> entityList) {

        for (T t : entityList) {
            em.persist(t);
        }
        return entityList;

    }

}
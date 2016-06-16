package org.voucher.model.dao;

import org.voucher.model.entity.Device;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Created by crusader on 6/3/16.
 */
@LocalBean
@Stateless
public class DeviceDAOImpl extends BaseDAOImpl {





    public void insert()
    {
        try
        {
            System.out.println("ssssssssssssssssssssss");
        }
        catch (Exception ex)
        {
            getSessionContext().setRollbackOnly();
            ex.printStackTrace();
        }




    }


}

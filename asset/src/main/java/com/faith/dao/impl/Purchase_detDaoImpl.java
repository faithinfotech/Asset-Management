package com.faith.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.faith.dao.AbstractDao;
import com.faith.dao.Purchase_detDao;
import com.faith.entity.Purchase_det;


@Repository
public class Purchase_detDaoImpl extends AbstractDao implements Purchase_detDao {

	@SuppressWarnings("unchecked")
	public List<Purchase_det> getAll() {
		// TODO Auto-generated method stub
		Criteria criteria = getSession().createCriteria(Purchase_det.class);
		return (List<Purchase_det>) criteria.list();
	}

	@Override
	public void save(Purchase_det purchase) {
		// TODO Auto-generated method stub
		System.out.println("@daoimp :"+purchase);
		persist(purchase);
	}

	@Override
	public void update(Purchase_det purchase) {
		// TODO Auto-generated method stub
		getSession().update(purchase);
	}

	@Override
	public void delete(int pd_id) {
		// TODO Auto-generated method stub
		Query query = getSession().createSQLQuery("delete from purchase_details where pd_id =:pd_id");
		query.setInteger("pd_id", pd_id);
		query.executeUpdate();
	}

	@Override
	public Purchase_det getById(int pd_id) {
		// TODO Auto-generated method stub
		Criteria criteria = getSession().createCriteria(Purchase_det.class);
		criteria.add(Restrictions.eq("pd_id", pd_id));
		criteria.setMaxResults(1);
		return (Purchase_det) criteria.uniqueResult();
	}

}

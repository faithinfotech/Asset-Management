package com.faith.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.faith.dao.AbstractDao;
import com.faith.dao.VendordetDao;
import com.faith.entity.Assetdet;
import com.faith.entity.Vendordet;

@Repository
public class VendordetDaoImpl extends AbstractDao implements VendordetDao {

	@SuppressWarnings("unchecked")
	public List<Vendordet> getAll() {
		// TODO Auto-generated method stub
		Criteria criteria = getSession().createCriteria(Vendordet.class);
		return (List<Vendordet>) criteria.list();
	}

	@Override
	public void save(Vendordet vendor) {
		// TODO Auto-generated method stub
		persist(vendor);
	}

	@Override
	public void update(Vendordet vendor) {
		// TODO Auto-generated method stub
		getSession().update(vendor);
	}

	@Override
	public void delete(int vd_id) {
		// TODO Auto-generated method stub
		Query query = getSession().createSQLQuery(
				"delete from vendor_details where vd_id =:vd_id");
		query.setInteger("vd_id", vd_id);
		query.executeUpdate();
	}

	@Override
	public Vendordet getById(int vd_id) {
		// TODO Auto-generated method stub
		Criteria criteria = getSession().createCriteria(Vendordet.class);
		criteria.add(Restrictions.eq("vd_id", vd_id));
		criteria.setMaxResults(1);
		return (Vendordet) criteria.uniqueResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Vendordet> getDistinct() {
		// TODO Auto-generated method stub
		Criteria criteria = getSession().createCriteria(Vendordet.class);
		ProjectionList projList = Projections.projectionList();
		projList.add(Projections.property("vd_name"));
		criteria.setProjection(Projections.distinct(projList));
		return (List<Vendordet>) criteria.list();
	
	}

}

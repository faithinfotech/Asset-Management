package com.faith.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.faith.dao.AbstractDao;
import com.faith.dao.AssetdetDao;
import com.faith.dao.AssetdetDao;
import com.faith.entity.Assetdet;
import com.faith.entity.Vendordet;

@Repository
public class AssetdetDaoImpl extends AbstractDao implements AssetdetDao{

	@SuppressWarnings("unchecked")
	public List<Assetdet> getAll() {
		// TODO Auto-generated method stub
		Criteria criteria=getSession().createCriteria(Assetdet.class);
		criteria.addOrder(Order.desc("ad_id"));
		return (List<Assetdet>) criteria.list();
	}


	@Override
	public void save(Assetdet asset) {
		// TODO Auto-generated method stub
		persist(asset);
	}

	@Override
	public void update(Assetdet asset) {
		// TODO Auto-generated method stub
		getSession().update(asset);
	}

	@Override
	public void delete(int ad_id) {
		// TODO Auto-generated method stub
		Query query=getSession().createSQLQuery("delete from asset_details where ad_id =:ad_id");
		query.setInteger("ad_id", ad_id);
		query.executeUpdate();
	}

	@Override
	public Assetdet getById(int ad_id) {
		// TODO Auto-generated method stub
		Criteria criteria=getSession().createCriteria(Assetdet.class);
		criteria.add(Restrictions.eq("ad_id", ad_id));
		criteria.setMaxResults(1);
		return (Assetdet) criteria.uniqueResult();
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Assetdet> getDistinct() {
		// TODO Auto-generated method stub
		Criteria criteria = getSession().createCriteria(Assetdet.class);
		ProjectionList projList = Projections.projectionList();
		projList.add(Projections.property("ad_type"));
		criteria.setProjection(Projections.distinct(projList));
		return (List<Assetdet>) criteria.list();
	
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<Assetdet> getAdname() {
		// TODO Auto-generated method stub
		Criteria criteria = getSession().createCriteria(Assetdet.class);
		ProjectionList projList = Projections.projectionList();
		projList.add(Projections.property("ad_name"));
		criteria.setProjection(Projections.distinct(projList));
		return (List<Assetdet>) criteria.list();
	
	}

}

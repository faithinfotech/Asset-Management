package com.faith.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.faith.dao.AbstractDao;
import com.faith.dao.AssetMasterDao;
import com.faith.entity.AssetMaster;
import com.faith.entity.Assetdet;

@Repository
public class AssetMasterDaoImpl extends AbstractDao implements AssetMasterDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<AssetMaster> getAll() {
		// TODO Auto-generated method stub
		Criteria criteria=getSession().createCriteria(AssetMaster.class);
		return (List<AssetMaster>) criteria.list();
	}

	@Override
	public void save(AssetMaster master) {
		// TODO Auto-generated method stub
		persist(master);
	}

	@Override
	public void update(AssetMaster master) {
		// TODO Auto-generated method stub
		getSession().update(master);
	}

	@Override
	public void delete(int am_id) {
		// TODO Auto-generated method stub
		Query query=getSession().createSQLQuery("delete from AssetMaster where am_id =:am_id");
		query.setInteger("am_id", am_id);
		query.executeUpdate();
	}

	@Override
	public AssetMaster getById(int am_id) {
		// TODO Auto-generated method stub
		Criteria criteria=getSession().createCriteria(AssetMaster.class);
		criteria.add(Restrictions.eq("am_id", am_id));
		criteria.setMaxResults(1);
		return (AssetMaster) criteria.uniqueResult();
	}

	
	
}

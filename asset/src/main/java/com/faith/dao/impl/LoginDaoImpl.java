package com.faith.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.faith.dao.AbstractDao;
import com.faith.dao.LoginDao;
import com.faith.entity.Login;


@Repository
public class LoginDaoImpl extends AbstractDao implements LoginDao {

		@SuppressWarnings("unchecked")
		public Login getAll(String userName,String password) {
			// TODO Auto-generated method stub
			Criteria criteria=getSession().createCriteria(Login.class);
			criteria.add(Restrictions.eq("userName", userName));
			criteria.add(Restrictions.eq("password", password));
			criteria.setMaxResults(1);
			return (Login) criteria.uniqueResult();
		}

		@Override
		public void save(Login login) {
			// TODO Auto-generated method stub
			persist(login);
		}

		/*@Override
		public void update(Login login) {
			// TODO Auto-generated method stub
			getSession().update(login);
		}

		@Override
		public void delete(int userId) {
			// TODO Auto-generated method stub
			Query query=getSession().createSQLQuery("delete from login_details where userId =:userId");
			query.setInteger("userId", userId);
			query.executeUpdate();
		}

		@Override
		public Login getById(int userId) {
			// TODO Auto-generated method stub
			Criteria criteria=getSession().createCriteria(Login.class);
			criteria.add(Restrictions.eq("userId", userId));
			criteria.setMaxResults(1);
			return (Login) criteria.uniqueResult();
			
		}*/

}

package org_SSH_03.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class DeptDao extends HibernateDaoSupport {
	@Autowired
	public void setsessionFactory(SessionFactory sf){
		super.setSessionFactory(sf);
	}
	
	public List<?>queryDept(String hql){
		return getHibernateTemplate().find(hql);
	}

}

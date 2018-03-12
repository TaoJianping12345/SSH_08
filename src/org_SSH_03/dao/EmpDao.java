package org_SSH_03.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;


import org_SSH_03.bean.Emp;

@Repository
public class EmpDao extends HibernateDaoSupport {
	
	@Autowired
	public void setsessionFactoty(SessionFactory sf){
		super.setSessionFactory(sf);
	}
	
	public List<?> queryEmp(String hql){
		return getHibernateTemplate().find(hql);
	}
	
	public void deleteEmp(Emp emp){
		getHibernateTemplate().delete(emp);
	}
	
	public void insertEmp(Emp emp){
		getHibernateTemplate().save(emp);
	}
	
	public Emp queryEmpById(Integer id){
		return getHibernateTemplate().get(Emp.class,id);
	}
	
	public void updateEmp(Emp emp){
		getHibernateTemplate().saveOrUpdate(emp);
	}		
}

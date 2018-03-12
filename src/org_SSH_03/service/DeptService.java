package org_SSH_03.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import org_SSH_03.bean.Dept;
import org_SSH_03.dao.DeptDao;

@Service
@Transactional
public class DeptService {
	@Resource
	private DeptDao dd;
	
	@SuppressWarnings("unchecked")
	public List<Dept>queryDept(){
		String hql = "from Dept";
		return (List<Dept>) dd.queryDept(hql);		
	}
}

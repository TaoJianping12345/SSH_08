package org_SSH_03.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import org_SSH_03.bean.Emp;
import org_SSH_03.dao.EmpDao;

@Transactional
@Service
public class EmpService {
	@Resource
	private EmpDao ed;
	
	@SuppressWarnings("unchecked")
	public List<Emp>queryEmp(String name,Integer org_id){
		String hql = "from Emp e where 1=1";
		if (null!=name&&!"".equals(name)) {
			hql += " and e.name like '%"+name+"%'";
		}
		if (null!=org_id&&0!=org_id) {
			hql += " and e.dept.org_id = "+org_id;
		}
		hql += " order by e.update_time desc";
		return (List<Emp>) ed.queryEmp(hql);
	}
	
	public void deleteEmp(Emp emp){
		ed.deleteEmp(emp);
	}
	
	public void insertEmp(Emp emp){
		ed.insertEmp(emp);
	}
	
	public Emp queryEmpById(Integer id){
		return ed.queryEmpById(id);
	}
	
	public void updateEmp(Emp emp){
		ed.updateEmp(emp);
	}
}

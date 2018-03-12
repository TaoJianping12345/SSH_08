package org_SSH_03.web;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import org_SSH_03.bean.Emp;
import org_SSH_03.service.DeptService;
import org_SSH_03.service.EmpService;

@Controller
public class EmpController {
	@Resource
	private EmpService es;
	@Resource
	private DeptService ds;
	
	@RequestMapping("/queryEmp")
	public String queryEmp(String name,Integer org_id,ModelMap map){
		map.put("empList", es.queryEmp(name, org_id));
		map.put("deptList", ds.queryDept());
		return "showEmp";
	}
	
	@RequestMapping("/deleteEmp")
	public String deleteEmp(Emp emp){
		es.deleteEmp(emp);
		return "redirect:queryEmp";
	}
	
	@RequestMapping("/insertEmp")
	public String insertEmp(Emp emp){
		Date update_time = new Date();
		emp.setUpdate_time(update_time);
		es.insertEmp(emp);
		return "redirect:queryEmp";
	}
	
	@RequestMapping("/getObjectEmp")
	public String getObjectEmp(Integer id,ModelMap map){
		map.put("deptList", ds.queryDept());
		map.put("emp", es.queryEmpById(id));
		return "updateEmp";
	}
	
	@RequestMapping("/updateEmp")
	public String updateEmp(Emp emp){
		es.updateEmp(emp);
		return "redirect:queryEmp";
	}
}

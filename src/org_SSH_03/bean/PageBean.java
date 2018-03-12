package org_SSH_03.bean;

public class PageBean {
	private Integer allCount;//数据库总记录数
	private Integer showPage;//每页显示数据条数
	private Integer nowPage;//分页显示的当前
	private Integer allPage;//分页总数
	
	/*默认每页条数是2条*/
	public PageBean() {
		this.setShowPage(2);
	}
	
	/*根据实际需要设置每页显示记录条数*/
	public PageBean(Integer num) {
		this.setShowPage(num);
	}
	
	
	public Integer getAllCount() {
		return allCount;
	}
	public void setAllCount(Integer allCount) {
		this.allCount = allCount;
	}
	public Integer getShowPage() {
		return showPage;
	}
	public void setShowPage(Integer showPage) {
		this.showPage = showPage;
	}
	public Integer getNowPage() {
		return nowPage;
	}
	public void setNowPage(Integer nowPage) {
		this.nowPage = nowPage;
	}
	public Integer getAllPage() {
		return allPage;
	}
	public void setAllPage(Integer allPage) {
		this.allPage = allPage;
	}
}

package org_SSH_03.bean;

public class PageBean {
	private Integer allCount;//���ݿ��ܼ�¼��
	private Integer showPage;//ÿҳ��ʾ��������
	private Integer nowPage;//��ҳ��ʾ�ĵ�ǰ
	private Integer allPage;//��ҳ����
	
	/*Ĭ��ÿҳ������2��*/
	public PageBean() {
		this.setShowPage(2);
	}
	
	/*����ʵ����Ҫ����ÿҳ��ʾ��¼����*/
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

package com.tao.hrm.domain;

import java.io.Serializable;
import java.util.Date;

public interface IDomain<K extends Serializable> {

	public K getId();
	public void setId(K id);
	
	public int getVersion();
	public void setVersion(int version);
	
	public String getCreateBy();
	public void setCreateBy(String createBy);
	
	public Date getCreateDate();
	public void setCreateDate(Date createDate);
	
	public String getUpdateBy();
	public void setUpdateBy(String updateBy);
	
	public Date getUpdateDate();
	public void setUpdateDate(Date updateDate);
}

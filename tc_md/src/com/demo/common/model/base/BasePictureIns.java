package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BasePictureIns<M extends BasePictureIns<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setPicUrl(java.lang.String picUrl) {
		set("pic_url", picUrl);
	}

	public java.lang.String getPicUrl() {
		return get("pic_url");
	}

	public void setInsId(java.lang.Integer insId) {
		set("ins_id", insId);
	}

	public java.lang.Integer getInsId() {
		return get("ins_id");
	}

}

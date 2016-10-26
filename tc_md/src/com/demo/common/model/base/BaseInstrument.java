package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseInstrument<M extends BaseInstrument<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}

	public java.lang.String getName() {
		return get("name");
	}

	public void setPrePrice(java.lang.Integer prePrice) {
		set("pre_price", prePrice);
	}

	public java.lang.Integer getPrePrice() {
		return get("pre_price");
	}

	public void setNowPrice(java.lang.Integer nowPrice) {
		set("now_price", nowPrice);
	}

	public java.lang.Integer getNowPrice() {
		return get("now_price");
	}

	public void setFreight(java.lang.Double freight) {
		set("freight", freight);
	}

	public java.lang.Double getFreight() {
		return get("freight");
	}

	public void setLocation(java.lang.String location) {
		set("location", location);
	}

	public java.lang.String getLocation() {
		return get("location");
	}

}
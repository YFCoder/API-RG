package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseClass<M extends BaseClass<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setClassName(java.lang.String className) {
		set("class_name", className);
	}

	public java.lang.String getClassName() {
		return get("class_name");
	}

	public void setClassPicUrl(java.lang.String classPicUrl) {
		set("class_pic_url", classPicUrl);
	}

	public java.lang.String getClassPicUrl() {
		return get("class_pic_url");
	}

	public void setTeacherName(java.lang.String teacherName) {
		set("teacher_name", teacherName);
	}

	public java.lang.String getTeacherName() {
		return get("teacher_name");
	}

	public void setLevel(java.lang.String level) {
		set("level", level);
	}

	public java.lang.String getLevel() {
		return get("level");
	}

	public void setLocal(java.lang.String local) {
		set("local", local);
	}

	public java.lang.String getLocal() {
		return get("local");
	}

	public void setAvailable(java.lang.String available) {
		set("available", available);
	}

	public java.lang.String getAvailable() {
		return get("available");
	}

	public void setClassPrice(java.lang.Integer classPrice) {
		set("class_price", classPrice);
	}

	public java.lang.Integer getClassPrice() {
		return get("class_price");
	}

	public void setClassNumber(java.lang.Integer classNumber) {
		set("class_number", classNumber);
	}

	public java.lang.Integer getClassNumber() {
		return get("class_number");
	}

	public void setClassTime(java.lang.Integer classTime) {
		set("class_time", classTime);
	}

	public java.lang.Integer getClassTime() {
		return get("class_time");
	}

	public void setClassRemark(java.lang.String classRemark) {
		set("class_remark", classRemark);
	}

	public java.lang.String getClassRemark() {
		return get("class_remark");
	}

	public void setFeedbackNum(java.lang.Integer feedbackNum) {
		set("feedback_num", feedbackNum);
	}

	public java.lang.Integer getFeedbackNum() {
		return get("feedback_num");
	}

	public void setFeecbackPicUrl(java.lang.String feecbackPicUrl) {
		set("feecback_pic_url", feecbackPicUrl);
	}

	public java.lang.String getFeecbackPicUrl() {
		return get("feecback_pic_url");
	}

}

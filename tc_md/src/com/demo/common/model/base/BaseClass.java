package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseClass<M extends BaseClass<M>> extends Model<M> implements IBean {

	public void setClassId(java.lang.Integer classId) {
		set("class_id", classId);
	}

	public java.lang.Integer getClassId() {
		return get("class_id");
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

}
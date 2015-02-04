/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.docs.insult.model.impl;

import com.liferay.docs.insult.model.Insult;
import com.liferay.docs.insult.model.InsultModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Insult service. Represents a row in the &quot;Insult_Insult&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.docs.insult.model.InsultModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link InsultImpl}.
 * </p>
 *
 * @author joebloggs
 * @see InsultImpl
 * @see com.liferay.docs.insult.model.Insult
 * @see com.liferay.docs.insult.model.InsultModel
 * @generated
 */
public class InsultModelImpl extends BaseModelImpl<Insult>
	implements InsultModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a insult model instance should use the {@link com.liferay.docs.insult.model.Insult} interface instead.
	 */
	public static final String TABLE_NAME = "Insult_Insult";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "insultId", Types.BIGINT },
			{ "insultString", Types.VARCHAR },
			{ "userId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table Insult_Insult (uuid_ VARCHAR(75) null,insultId LONG not null primary key,insultString VARCHAR(75) null,userId LONG,groupId LONG,companyId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table Insult_Insult";
	public static final String ORDER_BY_JPQL = " ORDER BY insult.insultId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY Insult_Insult.insultId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.docs.insult.model.Insult"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.docs.insult.model.Insult"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.liferay.docs.insult.model.Insult"),
			true);
	public static long COMPANYID_COLUMN_BITMASK = 1L;
	public static long GROUPID_COLUMN_BITMASK = 2L;
	public static long UUID_COLUMN_BITMASK = 4L;
	public static long INSULTID_COLUMN_BITMASK = 8L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.docs.insult.model.Insult"));

	public InsultModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _insultId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setInsultId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _insultId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Insult.class;
	}

	@Override
	public String getModelClassName() {
		return Insult.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("insultId", getInsultId());
		attributes.put("insultString", getInsultString());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long insultId = (Long)attributes.get("insultId");

		if (insultId != null) {
			setInsultId(insultId);
		}

		String insultString = (String)attributes.get("insultString");

		if (insultString != null) {
			setInsultString(insultString);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	@Override
	public String getUuid() {
		if (_uuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@Override
	public long getInsultId() {
		return _insultId;
	}

	@Override
	public void setInsultId(long insultId) {
		_insultId = insultId;
	}

	@Override
	public String getInsultString() {
		if (_insultString == null) {
			return StringPool.BLANK;
		}
		else {
			return _insultString;
		}
	}

	@Override
	public void setInsultString(String insultString) {
		_insultString = insultString;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				Insult.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Insult.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Insult toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Insult)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		InsultImpl insultImpl = new InsultImpl();

		insultImpl.setUuid(getUuid());
		insultImpl.setInsultId(getInsultId());
		insultImpl.setInsultString(getInsultString());
		insultImpl.setUserId(getUserId());
		insultImpl.setGroupId(getGroupId());
		insultImpl.setCompanyId(getCompanyId());
		insultImpl.setUserName(getUserName());
		insultImpl.setCreateDate(getCreateDate());
		insultImpl.setModifiedDate(getModifiedDate());

		insultImpl.resetOriginalValues();

		return insultImpl;
	}

	@Override
	public int compareTo(Insult insult) {
		long primaryKey = insult.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Insult)) {
			return false;
		}

		Insult insult = (Insult)obj;

		long primaryKey = insult.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		InsultModelImpl insultModelImpl = this;

		insultModelImpl._originalUuid = insultModelImpl._uuid;

		insultModelImpl._originalGroupId = insultModelImpl._groupId;

		insultModelImpl._setOriginalGroupId = false;

		insultModelImpl._originalCompanyId = insultModelImpl._companyId;

		insultModelImpl._setOriginalCompanyId = false;

		insultModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Insult> toCacheModel() {
		InsultCacheModel insultCacheModel = new InsultCacheModel();

		insultCacheModel.uuid = getUuid();

		String uuid = insultCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			insultCacheModel.uuid = null;
		}

		insultCacheModel.insultId = getInsultId();

		insultCacheModel.insultString = getInsultString();

		String insultString = insultCacheModel.insultString;

		if ((insultString != null) && (insultString.length() == 0)) {
			insultCacheModel.insultString = null;
		}

		insultCacheModel.userId = getUserId();

		insultCacheModel.groupId = getGroupId();

		insultCacheModel.companyId = getCompanyId();

		insultCacheModel.userName = getUserName();

		String userName = insultCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			insultCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			insultCacheModel.createDate = createDate.getTime();
		}
		else {
			insultCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			insultCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			insultCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		return insultCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", insultId=");
		sb.append(getInsultId());
		sb.append(", insultString=");
		sb.append(getInsultString());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.liferay.docs.insult.model.Insult");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>insultId</column-name><column-value><![CDATA[");
		sb.append(getInsultId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>insultString</column-name><column-value><![CDATA[");
		sb.append(getInsultString());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Insult.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] { Insult.class };
	private String _uuid;
	private String _originalUuid;
	private long _insultId;
	private String _insultString;
	private long _userId;
	private String _userUuid;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _columnBitmask;
	private Insult _escapedModel;
}
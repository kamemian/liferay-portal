/**
 * Copyright (c) 2000-2009 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.portal.model;

import com.liferay.portal.service.persistence.OrgGroupPermissionPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="OrgGroupPermissionSoap.java.html"><b><i>View Source</i></b></a>
 *
 * <p>
 * ServiceBuilder generated this class. Modifications in this class will be
 * overwritten the next time is generated.
 * </p>
 *
 * <p>
 * This class is used by
 * {@link com.liferay.portal.service.http.OrgGroupPermissionServiceSoap}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see    com.liferay.portal.service.http.OrgGroupPermissionServiceSoap
 * @generated
 */
public class OrgGroupPermissionSoap implements Serializable {
	public static OrgGroupPermissionSoap toSoapModel(OrgGroupPermission model) {
		OrgGroupPermissionSoap soapModel = new OrgGroupPermissionSoap();

		soapModel.setOrganizationId(model.getOrganizationId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setPermissionId(model.getPermissionId());

		return soapModel;
	}

	public static OrgGroupPermissionSoap[] toSoapModels(
		OrgGroupPermission[] models) {
		OrgGroupPermissionSoap[] soapModels = new OrgGroupPermissionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static OrgGroupPermissionSoap[][] toSoapModels(
		OrgGroupPermission[][] models) {
		OrgGroupPermissionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new OrgGroupPermissionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new OrgGroupPermissionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static OrgGroupPermissionSoap[] toSoapModels(
		List<OrgGroupPermission> models) {
		List<OrgGroupPermissionSoap> soapModels = new ArrayList<OrgGroupPermissionSoap>(models.size());

		for (OrgGroupPermission model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new OrgGroupPermissionSoap[soapModels.size()]);
	}

	public OrgGroupPermissionSoap() {
	}

	public OrgGroupPermissionPK getPrimaryKey() {
		return new OrgGroupPermissionPK(_organizationId, _groupId, _permissionId);
	}

	public void setPrimaryKey(OrgGroupPermissionPK pk) {
		setOrganizationId(pk.organizationId);
		setGroupId(pk.groupId);
		setPermissionId(pk.permissionId);
	}

	public long getOrganizationId() {
		return _organizationId;
	}

	public void setOrganizationId(long organizationId) {
		_organizationId = organizationId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getPermissionId() {
		return _permissionId;
	}

	public void setPermissionId(long permissionId) {
		_permissionId = permissionId;
	}

	private long _organizationId;
	private long _groupId;
	private long _permissionId;
}
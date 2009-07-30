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

package com.liferay.portal.service;


/**
 * <a href="ListTypeServiceUtil.java.html"><b><i>View Source</i></b></a>
 *
 * <p>
 * ServiceBuilder generated this class. Modifications in this class will be
 * overwritten the next time is generated.
 * </p>
 *
 * <p>
 * This class provides static methods for the
 * {@link ListTypeService} bean. The static methods of
 * this class calls the same methods of the bean instance. It's convenient to be
 * able to just write one line to call a method on a bean instead of writing a
 * lookup call and a method call.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see    ListTypeService
 * @generated
 */
public class ListTypeServiceUtil {
	public static com.liferay.portal.model.ListType getListType(int listTypeId)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		return getService().getListType(listTypeId);
	}

	public static java.util.List<com.liferay.portal.model.ListType> getListTypes(
		java.lang.String type) throws com.liferay.portal.SystemException {
		return getService().getListTypes(type);
	}

	public static void validate(int listTypeId, java.lang.String type)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		getService().validate(listTypeId, type);
	}

	public static void validate(int listTypeId, long classNameId,
		java.lang.String type)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		getService().validate(listTypeId, classNameId, type);
	}

	public static ListTypeService getService() {
		if (_service == null) {
			throw new RuntimeException("ListTypeService is not set");
		}

		return _service;
	}

	public void setService(ListTypeService service) {
		_service = service;
	}

	private static ListTypeService _service;
}
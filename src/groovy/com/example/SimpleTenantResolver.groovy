package com.example

import grails.plugin.multitenant.core.resolve.TenantResolver

import javax.servlet.http.HttpServletRequest

/**
 *
 * @author Savillians
 */
class SimpleTenantResolver implements TenantResolver {

	@Override
	public Integer resolve(HttpServletRequest request) {
		return 1;
	}

}
package com.example

import grails.plugin.multitenant.core.Tenant

/**
 *
 * @author Savillians
 */
class Customer implements Tenant {
	String name

	@Override
	Integer tenantId() {
		return this.id
	}
}

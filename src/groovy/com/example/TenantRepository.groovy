package com.example

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

import grails.plugin.multitenant.core.CurrentTenant
import grails.plugin.multitenant.core.CurrentTenantAwareRepository
import grails.plugin.multitenant.core.Tenant

import org.codehaus.groovy.grails.commons.GrailsApplication

/**
 * Dummy implementation of TenantRepository
 *
 * @author Kim A. Betti
 * @author Steve Ronderos
 */
public class TenantRepository implements CurrentTenantAwareRepository {
	private static final Log log = LogFactory.getLog(this)

	CurrentTenant currentTenant // will be injected
	GrailsApplication grailsApplication

	@Override
	Tenant getCurrentTenant() {
		Tenant tenantInstance = null
		Integer currentTenantId = currentTenant.get()
		if (currentTenantId != null) {
			tenantInstance = findByTenantId(currentTenantId)
		}

		tenantInstance
	}

	@Override
	Tenant findByTenantId(Integer tenantId) {
		return Customer.get(tenantId)
	}
}

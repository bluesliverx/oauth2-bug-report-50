package com.example

import grails.plugin.multitenant.core.annotation.MultiTenant

/**
 *
 * @author Savillians
 */
@MultiTenant
class Book {
	String author
	String title
}

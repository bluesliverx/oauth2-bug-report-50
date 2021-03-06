package com.example

import grails.plugin.multitenant.core.annotation.MultiTenant

@MultiTenant
class AccessToken {

    String authenticationKey
    byte[] authentication

    String username
    String clientId

    String value
    String tokenType

    Date expiration

    static hasOne = [refreshToken: String]
    static hasMany = [scope: String]

    static constraints = {
        username nullable: true
        clientId nullable: false, blank: false
        value nullable: false, blank: false, unique: 'tenantId'
        tokenType nullable: false, blank: false
        expiration nullable: false
        scope nullable: false
        refreshToken nullable: true
        authenticationKey nullable: false, blank: false, unique: 'tenantId'
        authentication nullable: false, minSize: 1, maxSize: 1024 * 4
    }

    static mapping = {
        version false
        scope lazy: false
    }
}

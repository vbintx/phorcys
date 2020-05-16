/*
 * This file is generated by jOOQ.
 */
package io.hikari.jooq.domain;


import io.hikari.jooq.domain.tables.OauthAccessToken;
import io.hikari.jooq.domain.tables.OauthClientDetails;
import io.hikari.jooq.domain.tables.OauthClientToken;
import io.hikari.jooq.domain.tables.SysRole;
import io.hikari.jooq.domain.tables.SysUser;
import io.hikari.jooq.domain.tables.SysUserRole;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>hikari</code> schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index OAUTH_ACCESS_TOKEN_PRIMARY = Indexes0.OAUTH_ACCESS_TOKEN_PRIMARY;
    public static final Index OAUTH_CLIENT_DETAILS_PRIMARY = Indexes0.OAUTH_CLIENT_DETAILS_PRIMARY;
    public static final Index OAUTH_CLIENT_TOKEN_PRIMARY = Indexes0.OAUTH_CLIENT_TOKEN_PRIMARY;
    public static final Index SYS_ROLE_PRIMARY = Indexes0.SYS_ROLE_PRIMARY;
    public static final Index SYS_USER_PRIMARY = Indexes0.SYS_USER_PRIMARY;
    public static final Index SYS_USER_ROLE_PRIMARY = Indexes0.SYS_USER_ROLE_PRIMARY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index OAUTH_ACCESS_TOKEN_PRIMARY = Internal.createIndex("PRIMARY", OauthAccessToken.OAUTH_ACCESS_TOKEN, new OrderField[] { OauthAccessToken.OAUTH_ACCESS_TOKEN.AUTHENTICATION_ID }, true);
        public static Index OAUTH_CLIENT_DETAILS_PRIMARY = Internal.createIndex("PRIMARY", OauthClientDetails.OAUTH_CLIENT_DETAILS, new OrderField[] { OauthClientDetails.OAUTH_CLIENT_DETAILS.CLIENT_ID }, true);
        public static Index OAUTH_CLIENT_TOKEN_PRIMARY = Internal.createIndex("PRIMARY", OauthClientToken.OAUTH_CLIENT_TOKEN, new OrderField[] { OauthClientToken.OAUTH_CLIENT_TOKEN.AUTHENTICATION_ID }, true);
        public static Index SYS_ROLE_PRIMARY = Internal.createIndex("PRIMARY", SysRole.SYS_ROLE, new OrderField[] { SysRole.SYS_ROLE.ID }, true);
        public static Index SYS_USER_PRIMARY = Internal.createIndex("PRIMARY", SysUser.SYS_USER, new OrderField[] { SysUser.SYS_USER.ID }, true);
        public static Index SYS_USER_ROLE_PRIMARY = Internal.createIndex("PRIMARY", SysUserRole.SYS_USER_ROLE, new OrderField[] { SysUserRole.SYS_USER_ROLE.ID }, true);
    }
}
package com.trl.vertx_postgresql.config;

import io.vertx.pgclient.PgConnectOptions;

public final class PostgreSqlConfig {

  private PostgreSqlConfig() {
  }

  public static PgConnectOptions pgConnectOpts() {
    return new PgConnectOptions()
      .setHost("localhost")
      .setPort(5432)
      .setDatabase("vertx-postgresql-maven-db")
      .setUser("developer")
      .setPassword("123");
  }
}

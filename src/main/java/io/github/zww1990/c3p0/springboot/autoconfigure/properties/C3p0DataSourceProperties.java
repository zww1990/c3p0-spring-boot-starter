package io.github.zww1990.c3p0.springboot.autoconfigure.properties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * C3p0 Data Source Properties
 * @author zww1990
 * @since 2023-10-31 21:15:25
 */
@ConfigurationProperties(prefix = "spring.datasource.c3p0")
@Getter
@Setter
@ToString
public class C3p0DataSourceProperties {
    private Integer acquireIncrement;
    private Integer acquireRetryAttempts;
    private Integer acquireRetryDelay;
    private Boolean autoCommitOnClose;
    private String automaticTestTable;
    private Boolean breakAfterAcquireFailure;
    private Integer checkoutTimeout;
    private String connectionCustomizerClassName;
    private String connectionTesterClassName;
    private String contextClassLoaderSource;
    private Boolean debugUnreturnedConnectionStackTraces;
    private String description;
    /**
     * Fully qualified name of the JDBC driver.
     */
    private String driverClass;
    private Boolean forceIgnoreUnresolvedTransactions;
    private Boolean forceSynchronousCheckins;
    private Boolean forceUseNamedDriverClass;
    private Integer idleConnectionTestPeriod;
    private Integer initialPoolSize;
    /**
     * JDBC URL of the database.
     */
    private String jdbcUrl;
    private Integer maxAdministrativeTaskTime;
    private Integer maxConnectionAge;
    private Integer maxIdleTime;
    private Integer maxIdleTimeExcessConnections;
    private Integer maxPoolSize;
    private Integer maxStatements;
    private Integer maxStatementsPerConnection;
    private Integer minPoolSize;
    private String overrideDefaultPassword;
    private String overrideDefaultUser;
    /**
     * Login password of the database.
     */
    private String password;
    private String preferredTestQuery;
    private Boolean privilegeSpawnedThreads;
    private Integer propertyCycle;
    private Integer statementCacheNumDeferredCloseThreads;
    private Boolean testConnectionOnCheckin;
    private Boolean testConnectionOnCheckout;
    private Integer unreturnedConnectionTimeout;
    /**
     * Login username of the database.
     */
    private String user;
    private String userOverridesAsString;
    private Boolean usesTraditionalReflectiveProxies;
}

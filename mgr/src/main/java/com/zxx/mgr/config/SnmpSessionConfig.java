package com.zxx.mgr.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ufiredong
 * @Title:
 * @Package
 * @Description:
 * @date 2021/4/1914:56
 */
@Configuration
public class SnmpSessionConfig {
    @Value("${snmp.hostIp}")
    private String hostIp;
    @Value("${snmp.port}")
    private String port;
    @Value("${snmp.community}")
    private String community;
    @Value("${snmp.version}")
    private String version;

    @Bean("session")
    public com.wyh.util.getSnmp.SNMPSessionUtil getSNMPSessionUtil() {
        com.wyh.util.getSnmp.SNMPSessionUtil snmpSessionUtil = new com.wyh.util.getSnmp.SNMPSessionUtil(hostIp, port, community, version);
        return snmpSessionUtil;
    }
}
package com.jv.lab.stockmarketsimulator;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "sms")
public class StockMarketSimulatorProperties {



}

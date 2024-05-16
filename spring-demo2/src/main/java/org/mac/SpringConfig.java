package org.mac;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/**
 * 代替配置文件xml
 */

@Configuration
@ComponentScan({"com", "org"})
public class SpringConfig {
}

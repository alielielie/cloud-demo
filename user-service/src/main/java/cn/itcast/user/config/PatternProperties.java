package cn.itcast.user.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @BelongsProject: cloud-demo
 * @BelongsPackage: cn.itcast.user.config
 * @Author: zt
 * @CreateTime: 2023-05-18  11:46
 * @Description:
 */

@Data
@Component
@ConfigurationProperties(prefix = "pattern")
public class PatternProperties {

    private String dateformat;

    private String envSharedValue;

    private String name;

}

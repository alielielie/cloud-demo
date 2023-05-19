package cn.itcast.feign.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;



/**
 * @BelongsProject: cloud-demo
 * @BelongsPackage: cn.itcast.order.config
 * @Author: zt
 * @CreateTime: 2023-05-19  13:44
 * @Description:
 */

public class DefaultFeignConfiguration {
    @Bean
    public Logger.Level logLevel(){
        return Logger.Level.BASIC;
    }
}

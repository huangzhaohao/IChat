package net.hzh.web.ichat.push;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import net.hzh.web.ichat.push.service.AccountService;
import org.glassfish.jersey.server.ResourceConfig;

import java.util.logging.Logger;

/**
 * @author hzh
 */
public class Application extends ResourceConfig {
    public Application(){
        // 注册逻辑处理的包
        //packages("net.hzh.web.ichat.push.service");
        packages(AccountService.class.getPackage().getName());

        // 注册Json解析器
        register(JacksonJsonProvider.class);

        // 注册日志打印输出
        register(Logger.class);
    }
}

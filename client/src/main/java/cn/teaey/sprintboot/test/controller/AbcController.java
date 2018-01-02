package cn.teaey.sprintboot.test.controller;

import cn.teaey.sprintboot.test.EchoService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther loongs
 * @date 2018/1/2  15:25
 */
@RestController
public class AbcController {

    @Reference(version = "1.0.0")
    public EchoService echoService;

    @RequestMapping("/test")
    public String test(){
        return echoService.echo("水钊");
    }
}

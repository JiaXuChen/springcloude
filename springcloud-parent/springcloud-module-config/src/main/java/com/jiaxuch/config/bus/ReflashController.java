package com.jiaxuch.config.bus;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RefreshScope
public class ReflashController {
    @PostMapping("/ref")
    private Object reflash(){
        Map map = new HashMap();
        map.put("code", "0000");
        return map;
    }
}

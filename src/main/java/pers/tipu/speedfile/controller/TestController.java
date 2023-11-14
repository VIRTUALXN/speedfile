package pers.tipu.speedfile.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tipu
 * {@code @date} 2023/11/13 18:48
 */
@Slf4j
@RestController
public class TestController {
    @GetMapping("/test")
    public String test() {
        log.info("日志测试");
        return "日志测试";
    }
}

package com.annotation.test.springannotation.controller;

import com.annotation.test.springannotation.annotation.AutoTest;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URL;

/**
 * @author 张钟
 * @date 2018/2/5
 */
@RestController
public class CaseController {

    /**
     * 第一个测试用例
     * @return
     */
    @RequestMapping(value = "/test_case1")
    @AutoTest(name = "test_case1")
    public String test_case1() throws Exception{
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName", "Android Emulator");
            capabilities.setCapability("automationName", "Appium");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "5.0.2");
            capabilities.setCapability("appPackage", "com.hanma56.driver.hanmadriver");
            capabilities.setCapability("appActivity", "MainActivity");

            AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),
                    capabilities);

            driver.closeApp();
            Thread.sleep(2000);

            driver.quit();
        }catch(Exception e){
            e.printStackTrace();
            return "执行case1失败";
        }
        return "成功执行case1";
    }

    /**
     * 第一个测试用例
     * @return
     */
    @RequestMapping(value = "/test_case2")
    @AutoTest(name = "test_case2")
    public String test_case2() {
        return "执行case2失败";
    }
}

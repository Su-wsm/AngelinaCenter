package top.strelitzia.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.strelitzia.models.LoginInfo;
import top.strelitzia.service.LoginService;
import top.strelitzia.vo.JsonResult;


/**
 * @author strelitzia
 * @Date 2022/12/12
 * Web前端主页登录用接口
 **/
@RequestMapping("login")
@RestController
@Slf4j
public class LoginController {

    @Autowired
    private LoginService loginService;

    /**
     * 使用密码登录的方法
     * @param loginInfo 登录信息
     * @return 登录人信息
     */
    @PostMapping("pwd")
    public JsonResult<LoginInfo> pwdLogin(@RequestBody UserInfo userInfo) {
        return JsonResult.success(loginService.pwdLogin(userInfo));
    }

    /**
     * 检查验证码是否通过
     * @param loginInfo 登录信息
     * @return 登录人信息
     */
    @PostMapping("captcha")
    public JsonResult<LoginInfo> captchaLogin(@RequestBody UserInfo userInfo) {
        return JsonResult.success();
    }

    /**
     * 创建一个随机验证码
     * @param loginInfo 登录信息
     * @return 验证码字符串
     */
    @PostMapping("creatCaptcha")
    public JsonResult<String> creatCaptcha(@RequestBody LoginInfo loginInfo) {
        return JsonResult.success();
    }

    /**
     * 注册信息
     * @param loginInfo 注册信息
     * @return 注册成功的个人信息
     */
    @PostMapping("register")
    public JsonResult<LoginInfo> register(@RequestBody LoginInfo loginInfo) {
        return JsonResult.success();
    }
    
    /**
     * 获取一个RSA公钥
     * @return 公钥字符串，公钥编号
     */
    @GetMapping("getRSAPublicKey")
    public JsonResult<LoginInfo> getRSAPublicKey() {
        return JsonResult.success();
    }
    
    /**
     * 判断id是否重复
     * @return true/false
     */
    @GetMapping("idRepeats")
    public JsonResult<LoginInfo> idRepeats(@RequestParam String id) {
        return JsonResult.success();
    }
}

package com.xxx.server.utils;

        import com.xxx.server.pojo.Admin;
        import org.springframework.security.core.context.SecurityContextHolder;

/** 操作员工具类 - 获取当前登录用户
 * @author xinfan  @create 2023/1/17-下午4:43
 */
public class AdminUtils {

    public static Admin getCurrentAdmin(){
        return (Admin) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}

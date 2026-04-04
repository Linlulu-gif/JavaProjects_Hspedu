package servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author 林露露
 * @version 1.0
 */
public class CatServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        //初始化，在Tomcat 调用时仅仅启动一次
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
        //返回配置信息
    }

    /**
     * 核心内容，
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        //redeploy 和 Tomcat启动时被调用，用于销毁 Servlet实例
    }
}

package com.myjava.hello;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

/**
 * Servlet implementation class HelloHttp
 * 本实例是演示怎么操作链接 jdbc 数据库  并读取数据返回给前端
 */
@WebServlet("/JDBCServlet")
public class JDBCServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    // JDBC 驱动名及数据库 URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/RUNOOB";

    // 数据库的用户名与密码，需要根据自己的设置
    static final String USER = "root";
    static final String PASS = "123456";

    /**
     * @see HttpServlet#HttpServlet()
     */
    public JDBCServlet() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Connection conn = null;
        Statement stmt = null;
        // 设置响应内容类型
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
        // 设置响应内容类型
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String title = "Servlet Mysql 测试 -JDBC 数据库连接";
        String docType = "<!DOCTYPE html>\n";
        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + title + "</h1>\n");
        try {
            // 注册 JDBC 驱动器
            Class.forName("com.mysql.jdbc.Driver");
            // 打开一个连接
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            // 执行 SQL 查询
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT id, name, url FROM websites";
            ResultSet rs = stmt.executeQuery(sql);
            //循环遍历数据库
            while (rs.next()) {
                // 通过字段检索
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String url = rs.getString("url");
                // 输出数据
                out.println("ID: " + id);
                out.println(", 站点名称: " + name);
                out.println(", 站点 URL: " + url);
                out.println("<br />");
                out.println("</body></html>");
            }
            // 完成后关闭
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            // 处理 Class.forName 错误
            e.printStackTrace();
        } finally {
            // 最后是用于关闭资源的块
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException ignored) {
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    /**
     * sql 数据库插入
     * 紧供参考
     */
    private void sqlInsert() {
//        PreparedStatement ps= new PreparedStatement();
//        //编写预处理 SQL 语句
//        String sql = "INSERT INTO websites1 VALUES(?,?,?,?,?)";
//
////实例化 PreparedStatement
//        ps = conn.prepareStatement(sql);
//
////传入参数，这里的参数来自于一个带有表单的jsp文件，很容易实现
//        ps.setString(1, request.getParameter("id"));
//        ps.setString(2, request.getParameter("name"));
//        ps.setString(3, request.getParameter("url"));
//        ps.setString(4, request.getParameter("alexa"));
//        ps.setString(5, request.getParameter("country"));
//
////执行数据库更新操作，不需要SQL语句
//        ps.executeUpdate();
//        sql = "SELECT id, name, url FROM websites1";
//        ps = conn.prepareStatement(sql);
//
////获取查询结果
//        ResultSet rs = ps.executeQuery();
    }

}

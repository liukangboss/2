package com.imp;

import com.configuration.Config;
import com.dao.UserDao;
import com.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by LiuKang on 2016/3/4.
 */
@Repository
public class UserDaoImp {
    private static ApplicationContext context;
    private static SqlSessionFactory sqlSessionFactory;
    private static SqlSession sqlSession;
    private UserDao userDao;
    static {
        context = new AnnotationConfigApplicationContext(Config.class);
        sqlSessionFactory = context.getBean(SqlSessionFactory.class);
        sqlSession = sqlSessionFactory.openSession();
    }
    public List<User> getUsers(){
        List<User> userList = null;
        try {
            userDao = sqlSession.getMapper(UserDao.class);
            userList = userDao.selectUser();
            sqlSession.commit();
        }catch (Exception e){
            sqlSession.rollback();
        }finally {
//            sqlSession.close();
            System.out.println("别关会出事");
        }
        return userList;
    }
}

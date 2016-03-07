package com.imp;

import com.configuration.Config;
import com.dao.UserDao;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Repository;

/**
 * Created by LiuKang on 2016/3/4.
 */
@Repository
public class UserDaoImp {
    private static ApplicationContext context;
    private static SqlSessionFactory sqlSessionFactory;
    private static SqlSession sqlSession;
    static {
        context = new AnnotationConfigApplicationContext(Config.class);
        sqlSessionFactory = context.getBean(SqlSessionFactory.class);
        sqlSession = sqlSessionFactory.openSession();
    }
    public UserDao getUserDao(){
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        return userDao;
    }
}

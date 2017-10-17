package com.goldou.movie.greendao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.goldou.movie.bean.MovieWant;

import com.goldou.movie.greendao.MovieWantDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig movieWantDaoConfig;

    private final MovieWantDao movieWantDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        movieWantDaoConfig = daoConfigMap.get(MovieWantDao.class).clone();
        movieWantDaoConfig.initIdentityScope(type);

        movieWantDao = new MovieWantDao(movieWantDaoConfig, this);

        registerDao(MovieWant.class, movieWantDao);
    }
    
    public void clear() {
        movieWantDaoConfig.clearIdentityScope();
    }

    public MovieWantDao getMovieWantDao() {
        return movieWantDao;
    }

}
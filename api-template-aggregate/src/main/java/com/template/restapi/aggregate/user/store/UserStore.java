package com.template.restapi.aggregate.user.store;

import com.template.restapi.aggregate.user.domain.entity.UserDto;
import com.template.restapi.aggregate.user.store.repository.UserRepository;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class UserStore {
    private final SqlSessionTemplate sqlSessionTemplate;

    public UserStore(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    public List<UserDto> findUserInfo() {
        return sqlSessionTemplate
                .getMapper(UserRepository.class)
                .selectUserInfo();


    }
}

package com.milu.vote.mapper;

import com.milu.vote.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;

import java.util.List;

@Mapper
public interface UserMapper {

    Boolean save(User user);

    Boolean delete(@Param("id") String id);

    Boolean update(User user);

    List<User> list(User user);

    User query(@Param("id") String id);
}	

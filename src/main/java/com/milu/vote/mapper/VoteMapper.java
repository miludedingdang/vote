package com.milu.vote.mapper;

import com.milu.vote.bean.Vote;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;

import java.util.List;

@Mapper
public interface VoteMapper {

    Boolean save(Vote vote);

    Boolean delete(@Param("id") String id);

    Boolean update(Vote vote);

    List<Vote> list(Vote vote);

    Vote query(@Param("id") String id);
}	
